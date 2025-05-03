import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.sql.*;
import java.awt.Insets;

class NewUser extends JDialog implements ActionListener,FocusListener
{
   
   	JLabel luser,lpwd1,lpwd2;
   	JTextField t1;
	JPasswordField t2,t3;
   	JButton b,b1;
   	GridBagConstraints gc;
   public NewUser()
{
   	 super(new JFrame(),"",true);
 	setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
  	Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
    	setLocation(d.width/4,d.height/4);
	setSize(d.width/2,d.height/2);
BackgroundPanel panel = new BackgroundPanel("D:\\secure.jpg"); // Add your image path here
        panel.setLayout(new GridBagLayout());
       	gc=new GridBagConstraints();
  	gc.insets = new Insets(5,5,5,5);

    	setUndecorated(true);
   	luser=new JLabel("User ID");
    	lpwd1=new JLabel("Password");
    	lpwd2=new JLabel("Confirm Pwd");
    	t1=new JTextField(10);
    	t2=new JPasswordField(10);
	t3=new JPasswordField(10);
    	b=new JButton("Create");
    	b1=new JButton("Cancel");

    	addc(panel,luser,1,1,1,1);
   	addc(panel,t1,1,2,1,1);
   	addc(panel,lpwd1,2,1,1,1);
   	addc(panel,t2,2,2,1,1);
   	addc(panel,lpwd2,3,1,1,1);
   	addc(panel,t3,3,2,1,1);
  	 addc(panel,b,4,1,1,1);
  	 addc(panel,b1,4,2,1,1);

	add(panel);

   
	luser.setFont(new Font("Arial",Font.PLAIN,18));
	lpwd1.setFont(new Font("Arial",Font.PLAIN,18));
	lpwd2.setFont(new Font("Arial",Font.PLAIN,18));
	t1.setFont(new Font("Arial",Font.PLAIN,18));
	t2.setFont(new Font("Arial",Font.PLAIN,18));
	t3.setFont(new Font("Arial",Font.PLAIN,18));
	b.setFont(new Font("Arial",Font.PLAIN,18));
	b1.setFont(new Font("Arial",Font.PLAIN,18));
	luser.setForeground(Color.white);
	lpwd1.setForeground(Color.white);
	lpwd2.setForeground(Color.white);


   	b.addActionListener(this);
   	b.setMnemonic(KeyEvent.VK_C);
   	b1.addActionListener(this);
   	b1.setMnemonic(KeyEvent.VK_N); 
	t1.addFocusListener(this);
    	t2.addFocusListener(this);
    	t3.addFocusListener(this);

  	setVisible(true);
}
 	public void addc(JPanel panel, Component cc, int r, int c, int w, int h) 
	{
        gc.gridx = c;
        gc.gridy = r;
        gc.gridwidth = w;
        gc.gridheight = h;
        gc.fill = GridBagConstraints.BOTH;
        panel.add(cc, gc);
    }

public void actionPerformed(ActionEvent e)
{
  if(e.getSource()==b)
	{
	 String s1;
	 s1=t1.getText();
    	char[] s2=t2.getPassword();
    	char[] s3=t3.getPassword();
	 String password = new String(s2);
        String confirmPassword = new String(s3);
   	if(confirmPassword .equals(password))
    	{
  		try{ 

  		PreparedStatement pst=DataCon.con.prepareStatement("insert into myusers values(?,?)");
  		pst.setString(1,s1);
 		 pst.setString(2,password);
  		pst.executeUpdate();
  		DataCon.con.commit();


 		dispose();
  	}catch(Exception ee)
  		{
JOptionPane.showMessageDialog(null,"Data Not Updated in DB","Information",JOptionPane.INFORMATION_MESSAGE);
 		}
   }
    else
	{
JOptionPane.showMessageDialog(null,"Confirm Password WRONG","Information",JOptionPane.INFORMATION_MESSAGE);
                 t2.setText("");
                 t3.setText("");
                 t2.requestFocus();
	}
   }
if(e.getSource()==b1)
	{
		dispose();
	}
	


}// action close
 public void focusLost(FocusEvent e)
  		{
  		}
  		public void focusGained(FocusEvent e)
  		{
    			if(e.getSource()==t1)
      			t1.selectAll();
    			if(e.getSource()==t2)
      			t2.selectAll();
			if(e.getSource()==t3)
      			t3.selectAll();

  		}
  class BackgroundPanel extends JPanel {
        private Image backgroundImage;

        public BackgroundPanel(String filePath) {
            try {
                backgroundImage = new ImageIcon(filePath).getImage();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }

}


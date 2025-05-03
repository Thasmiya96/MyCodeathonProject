import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.event.*;
import java.util.*;
import java.awt.Insets;


class Login extends JDialog implements ActionListener,FocusListener
{
	JLabel luser,lpwd;
   	JTextField t1;
	JPasswordField t2;
	JButton b1,b2,b3,b4;
   	GridBagConstraints gc;
   	Connection con; 
   	CMS m;
 public Login(CMS m)
{
    	super(new JFrame(),"",true);
	setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    	this.m=m;
    	Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
    	setLocation(d.width/4,d.height/4);
    	setUndecorated(true);
    	setSize(d.width/2,d.height/2);
	
BackgroundPanel panel = new BackgroundPanel("D:\\LOGO.jpg"); 
        panel.setLayout(new GridBagLayout());
       	gc=new GridBagConstraints();
  	gc.insets = new Insets(5,5,5,5);

    	luser=new JLabel("User ID");
    	lpwd=new JLabel("Password");
    	t1=new JTextField(10);
	t2=new JPasswordField(10);
    	b1=new JButton("Login");
    	b2=new JButton("Reset");
    	b3=new JButton("Close");
    	b4=new JButton("New User");

   	addC(panel, luser, 1, 1, 1, 1);
        addC(panel, t1, 1, 2, 1, 1);
        addC(panel, lpwd, 2, 1, 1, 1);
        addC(panel, t2, 2, 2, 1, 1);
        addC(panel, b1, 3, 1, 1, 1);
        addC(panel, b2, 3, 2, 1, 1);
        addC(panel, b3, 4, 1, 1, 1);
        addC(panel, b4, 4, 2, 1, 1);
	add(panel);

	b1.addActionListener(this);
   	b2.addActionListener(this);
   	b3.addActionListener(this);
   	b4.addActionListener(this);

	b1.setMnemonic(KeyEvent.VK_L);
	b2.setMnemonic(KeyEvent.VK_R);
	b3.setMnemonic(KeyEvent.VK_C);
	b4.setMnemonic(KeyEvent.VK_N);

	luser.setFont(new Font("Arial",Font.PLAIN,18));
	lpwd.setFont(new Font("Arial",Font.PLAIN,18)); 
	t1.setFont(new Font("Arial",Font.PLAIN,18));
	t2.setFont(new Font("Arial",Font.PLAIN,18));
	b1.setFont(new Font("Arial",Font.PLAIN,18));
	b2.setFont(new Font("Arial",Font.PLAIN,18));
	b3.setFont(new Font("Arial",Font.PLAIN,18));
	b4.setFont(new Font("Arial",Font.PLAIN,18));
	luser.setForeground(Color.black);
	lpwd.setForeground(Color.black);
	b1.setEnabled(false);
	t1.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                checkFields();
            }    public void removeUpdate(DocumentEvent e) {
                checkFields();
            }public void insertUpdate(DocumentEvent e) {
                checkFields();
            }
        });
	t2.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                checkFields();
            }  public void removeUpdate(DocumentEvent e) {
                checkFields();
            }public void insertUpdate(DocumentEvent e) {
                checkFields();
            }
        });
    	t1.addFocusListener(this);
    	t2.addFocusListener(this);
	setVisible(true);
}
 public void addC(JPanel panel, Component cc, int r, int c, int w, int h) 
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
    	if(e.getSource()==b4)
     	{
        	new NewUser();
         	dispose();
     	} 
    	if(e.getSource()==b2)
      {
      	  	t1.setText("");
        	t2.setText("");
      	 	t1.requestFocus();
      }
   	if(e.getSource()==b3)
 	{
      		dispose();
   	} 
 	 if(e.getSource()==b1)
   	{
     	try
     	{
     		String un=t1.getText();
		  char[] pw1=t2.getPassword();
    	 PreparedStatement st=DataCon.con.prepareStatement("select pwd from myusers where userid=?");
		st.setString(1,un);
   		ResultSet rs=st.executeQuery();
    		 rs.next();
		String pw2=rs.getString(1);
     		if(String.valueOf(pw1).equals(pw2))
	    	{
       		m.lot.setEnabled(true);
       		m.dat.setEnabled(true);
		m.lib.setEnabled(true);
		m.fee.setEnabled(true);
		m.result.setEnabled(true);
       		m.lin.setEnabled(false);
       		m.xit.setEnabled(false);
       		dispose();
     	}
     	else
     	{
JOptionPane.showMessageDialog(null,"password WRONG","ERROR",JOptionPane.INFORMATION_MESSAGE);
    	 }
     }catch(Exception ee)
     	{
JOptionPane.showMessageDialog(null,"User NOT Found","Error",JOptionPane.ERROR_MESSAGE);
	}//try close
     
   	}
}//action close
 private void checkFields() {
        if (t1.getText().length() > 1&& t2.getPassword().length > 1) {
            b1.setEnabled(true);
        } else {
            b1.setEnabled(false);
        }
    }
 		 public void focusLost(FocusEvent e)
  		{
  		}
  		public void focusGained(FocusEvent e)
  		{
    			if(e.getSource()==t1)
      			t1.selectAll();
    			if(e.getSource()==t2)
      			t2.selectAll();
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




















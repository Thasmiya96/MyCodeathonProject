import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

class pro extends JFrame implements ActionListener
{
		JLabel lsel,lupd;
		JComboBox<String> jcb;		
		JTextField upd;
		GridBagConstraints gc;
		JButton prom;
		BackgroundPanel panel; 
	pro()
	{
	setSize(750,500);
	setLocation(350,220);
    	setUndecorated(true);
	JLabel tit=new JLabel("Student Promotion");
	lsel=new JLabel("Student Studying Year:");
	lupd=new JLabel("Promoting To: ");
	String[] options = {"3", "2", "1"};
	jcb = new JComboBox<String>(options);
	upd=new JTextField(20);
	prom=new JButton("Promote");
	
	 panel = new BackgroundPanel("D:\\bg.jpg"); 
        panel.setLayout(new GridBagLayout());
       	gc=new GridBagConstraints();
  	gc.insets = new Insets(5,5,5,5);
      
	tit.setForeground(new Color(52,187,172));
	tit.setFont(new Font("Arial",Font.BOLD,24));
      	lsel.setForeground(Color.white);
	lsel.setFont(new Font("Arial",Font.BOLD,20));
     	lupd.setForeground(Color.white);
	lupd.setFont(new Font("Arial",Font.BOLD,19));
	prom.setForeground(Color.yellow);
	prom.setBackground(Color.black);

	add(panel);
	addC(panel, tit, 1, 1, 1, 1);
	addC(panel,lsel,2,1,1,1);
	addC(panel,jcb,2,2,1,1);	
	addC(panel,lupd,2,3,1,1);
	addC(panel,upd,2,4,1,1);
	addC(panel,prom,4,4,1,1);

	prom.addActionListener(this);
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
	public static void main(String a[])
	{
	new pro();
	}
	public void actionPerformed(ActionEvent e)	{
	 	
int yr = Integer.parseInt((String) jcb.getSelectedItem());
	
	 if(e.getSource()==prom)
		{
		if(yr==3)
	{
	try{
	PreparedStatement pst=DataCon.con.prepareStatement("update student set styear=? where styear=?");
	pst.setInt(1,Integer.parseInt(upd.getText()));
	pst.setInt(2,yr);
	pst.executeUpdate();
	DataCon.con.commit();
	remove(jcb);
	}catch(Exception cp){System.out.print(cp);}
	 String[] newOptions = {"", "2", "1"};
                jcb.setModel(new DefaultComboBoxModel<>(newOptions));
                upd.setText("");	
	}
	if(yr==2)
	{
	try{
	PreparedStatement pst=DataCon.con.prepareStatement("update student set styear=? where styear=?");
	pst.setInt(1,Integer.parseInt(upd.getText()));
	pst.setInt(2,yr);
	pst.executeUpdate();
	DataCon.con.commit();
	}catch(Exception cp){System.out.print(cp);}
	 String[] newOptions = {"", "2", "1"};
                jcb.setModel(new DefaultComboBoxModel<>(newOptions));
	upd.setText("");
	}
	if(yr==1)
	{
	try{
	PreparedStatement pst=DataCon.con.prepareStatement("update student set styear=? where styear=?");
	pst.setInt(1,Integer.parseInt(upd.getText()));
	pst.setInt(2,yr);
	pst.executeUpdate();
	DataCon.con.commit();
	}catch(Exception cp){System.out.print(cp);}
	remove(jcb);
	dispose();
	}
	panel.revalidate();
         panel.repaint();

	}

	}//action cls
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

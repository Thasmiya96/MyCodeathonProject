import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.awt.Insets;

class ABO extends JFrame implements ActionListener
{
        
	JLabel lcms,ldev,lgro;
        JTextField cms,dev,gro;
	JButton ba;
	GridBagConstraints gc;
	ABO()
	{
	setSize(500,500);
  	setLayout(new GridBagLayout());
  	setLocation(350,220);
	getContentPane().setBackground(new Color(217,217,217));
	setLayout(new GridBagLayout());
	gc=new GridBagConstraints();
	gc.insets = new Insets(5,5,5,5);
	setTitle("ABOUT");
	
	lcms=new JLabel("COLLEGE MANAGEMENT SYSTEM");
	ldev=new JLabel("DEVELOPED BY: Thasmiya , Bhagyasree ");
	lgro=new JLabel("GROUP:2nd BCA-AI");
	
	cms=new JTextField(10);	
	dev=new JTextField(40);
	gro=new JTextField(10);
	ba=new JButton("Back");

	addC(lcms,1,1,2,1);
	addC(new JLabel(" "),2,1,1,1);
	addC(ldev,3,1,2,1);
	addC(lgro,4,1,2,1);
	addC(ba,5,2,1,1);
		
	lcms.setForeground(Color.black);
	ldev.setForeground(Color.black);
	lgro.setForeground(Color.black); 
	

	lcms.setFont(new Font("Arial",Font.BOLD,20)); 
	ldev.setFont(new Font("Arial",Font.BOLD,16));
	lgro.setFont(new Font("Arial",Font.BOLD,16));
	ba.setFont(new Font("Arial",Font.BOLD,16));
	ba.addActionListener(this);
	setVisible(true);

	}
	public void addC(Component cc, int r,int c,int w,int h)
	{
	gc.gridx=c;
	gc.gridy=r;
	gc.gridwidth=w;
	gc.gridheight=h;
	gc.fill=gc.BOTH;
	add(cc,gc);
	}
       public static void main(String a[])
       {
          new ABO();
       }
       public void actionPerformed(ActionEvent e)
       {
	if(e.getSource()==ba)
		dispose();
       }
       }

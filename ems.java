import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.awt.Insets;


class EMS extends JFrame implements ActionListener
{
        
	JLabel lems,lern,les,lem,lstyear,lname;
	JTextField ern,styear,s1,s2,s3,s4,s5,s6,s7,s8,m9,m10,m11,m12,m13,m14,m15,m16,name;
	GridBagConstraints gc;
	JButton sub,can;
	EMS()
	{
	setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
	getContentPane().setBackground(Color.WHITE);
	setSize(d.width,d.height);
	setLayout(new GridBagLayout());
	gc=new GridBagConstraints();
	gc.insets = new Insets(5,5,3,3);

	lems=new JLabel("ENTER MARKS OF STUDENT:");
	lern=new JLabel("ENTER ROLL NUMBER");
	les=new JLabel("ENTER SUBJECTS");
	lem=new JLabel("ENTER MARKS");
	lstyear=new JLabel("YEAR");	
	lname=new JLabel("NAME");

  	ern=new JTextField(10);	
	name=new JTextField(40);
	styear=new JTextField(10);
	s1=new JTextField(40);	
	s2=new JTextField(40);	
	s3=new JTextField(40);	
	s4=new JTextField(40);	
	s5=new JTextField(40);	
	s6=new JTextField(40);	
	s7=new JTextField(40);	
	s8=new JTextField(40);	
	m9=new JTextField(10);	
	m10=new JTextField(10);	
	m11=new JTextField(10);	
	m12=new JTextField(10);	
	m13=new JTextField(10);	
	m14=new JTextField(10);	
	m15=new JTextField(10);	
	m16=new JTextField(10);	

	sub=new JButton("Submit");
	can=new JButton("Cancel");
	addC(lems,1,1,1,1);
	addC(lern,2,1,1,1);
	addC(ern,2,2,1,1);
	addC(lstyear,2,3,1,1);
	addC(styear,2,4,1,1);
	addC(lname,3,1,1,1);
	addC(name,3,2,1,1);
	addC(new JLabel(" "),4,1,1,1);
	addC(les,5,1,1,1);
	addC(lem,5,2,1,1);
	addC(s1,6,1,1,1);
	addC(s2,7,1,1,1);
	addC(s3,8,1,1,1);
	addC(s4,9,1,1,1);
	addC(s5,10,1,1,1);
	addC(s6,11,1,1,1);
	addC(s7,12,1,1,1);
	addC(s8,13,1,1,1);
	addC(m9,6,2,1,1);
	addC(m10,7,2,1,1);
	addC(m11,8,2,1,1);
	addC(m12,9,2,1,1);
	addC(m13,10,2,1,1);
	addC(m14,11,2,1,1);
	addC(m15,12,2,1,1);
	addC(m16,13,2,1,1);
	addC(sub,15,1,1,1);
	addC(can,15,3,1,1);

	lems.setFont(new Font("Arial",Font.BOLD,20)); 
	lern.setFont(new Font("Arial",Font.BOLD,16));
	lstyear.setFont(new Font("Arial",Font.BOLD,16));
	les.setFont(new Font("Arial",Font.BOLD,16));
	lem.setFont(new Font("Arial",Font.BOLD,16));
	lname.setFont(new Font("Arial",Font.BOLD,16));

	sub .setFont(new Font("Arial",Font.PLAIN,16)); 
	can.setFont(new Font("Arial",Font.PLAIN,16));
	
	lems.setForeground(Color.black); 
	lern.setForeground(Color.black);
	lstyear.setForeground(Color.black);
	sub.setBackground(Color.black);
	can.setBackground(Color.black);

	sub.setForeground(Color.white);
	sub.setMnemonic(KeyEvent.VK_S);
	can.setForeground(Color.white);
	can.setMnemonic(KeyEvent.VK_C);

	sub.addActionListener(this);
	can.addActionListener(this);

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
          new EMS();
       }
       public void actionPerformed(ActionEvent e)
       {
		if(e.getSource()==sub)
		{
		try{
		PreparedStatement pst=DataCon.con.prepareStatement("insert into subject values(?,?,?,?,?,?,?,?,?,?,?)");
		pst.setInt(1,Integer.parseInt(ern.getText()));
		pst.setString(2,name.getText());
		pst.setString(3,s1.getText());
		pst.setString(4,s2.getText());
		pst.setString(5,s3.getText());
		pst.setString(6,s4.getText());
		pst.setString(7,s5.getText());
		pst.setString(8,s6.getText());
		pst.setString(9,s7.getText());
		pst.setString(10,s8.getText());
		pst.setInt(11,Integer.parseInt(styear.getText()));
		pst.executeUpdate();
		DataCon.con.commit();

		pst.setInt(11,Integer.parseInt(styear.getText()));
		PreparedStatement pst1=DataCon.con.prepareStatement("insert into marks values(?,?,?,?,?,?,?,?,?)");
		pst1.setInt(1,Integer.parseInt(ern.getText()));
		pst1.setString(2,m9.getText());
		pst1.setString(3,m10.getText());
		pst1.setString(4,m11.getText());
		pst1.setString(5,m12.getText());
		pst1.setString(6,m13.getText());
		pst1.setString(7,m14.getText());
		pst1.setString(8,m15.getText());
		pst1.setString(9,m16.getText());
		pst1.executeUpdate();
		DataCon.con.commit();
	ern.setText("");	
	name.setText("");
	styear.setText("");
	s1.setText("");	
	s2.setText("");	
	s3.setText("");	
	s4.setText("");	
	s5.setText("");	
	s6.setText("");	
	s7.setText("");	
	s8.setText("");	
	m9.setText("");	
	m10.setText("");	
	m11.setText("");	
	m12.setText("");	
	m13.setText("");	
	m14.setText("");	
	m15.setText("");	
	m16.setText("");	

		}catch(Exception ep){System.out.println(ep);}
		
		}//if cls
	if(e.getSource()==can)
		dispose();
	
	
       }
}//class cls

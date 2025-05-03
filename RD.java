import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.awt.Insets;

class RD extends JFrame implements ActionListener
{
        
	JLabel lad,lhn,lname,lgro,ltm,lmd,lsn,lmar,lgra;
        JTextField ad,hn,name,gro,tm,gra,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21;
	GridBagConstraints gc;
	JButton ba,ser;
	RD()
	{
	setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
	getContentPane().setBackground(new Color(82,194,192));
	setSize(d.width,d.height);
	
	setLayout(new GridBagLayout());
	gc=new GridBagConstraints();
	gc.insets = new Insets(5,5,5,5);

	lad=new JLabel("AGGREGATE DETAILS:");
	lhn=new JLabel("HTNO");
	lname=new JLabel("NAME");
	lgro=new JLabel("GROUP");
	ltm=new JLabel("TOTAL MARKS");
	lmd=new JLabel("MARKS DETAILS");
	lsn=new JLabel("SUBNAME");
	lmar=new JLabel("                                     MARKS");
	lgra=new JLabel("GRADE");
	ba=new JButton("Back");
	ser=new JButton("Search");
	
	hn=new JTextField(10);	
	name=new JTextField(40);
	gro=new JTextField(10);
	tm=new JTextField(10);
	gra=new JTextField(10);
	t1=new JTextField(10);	
	t2=new JTextField(10);	
	t3=new JTextField(10);	
	t4=new JTextField(10);	
	t5=new JTextField(10);	
	t6=new JTextField(10);	
	t7=new JTextField(10);
	t8=new JTextField(10);	
	t9=new JTextField(10);	
	t10=new JTextField(10);	
	t11=new JTextField(10);	
	t12=new JTextField(10);	
	t13=new JTextField(10);	
	t14=new JTextField(10);
	t15=new JTextField(10);	
	t16=new JTextField(10);	
	t17=new JTextField(10);	
	t18=new JTextField(10);	
	t19=new JTextField(10);	
	t20=new JTextField(10);	
	t21=new JTextField(10);

	addC(lad,1,3,2,1);
	addC(lhn,2,1,2,1);
	addC(hn,2,3,2,1);
	addC(ser,2,5,1,1);
	addC(lname,3,1,2,1);
	addC(name,3,3,2,1);
	addC(lgro,4,1,2,1);
	addC(gro,4,3,2,1);
        addC(ltm,5,1,2,1);
	addC(tm,5,3,2,1);
	addC(new JLabel(" "),6,1,1,1);
	addC(lsn,7,1,2,1);
	addC(lmar,7,3,2,1);
	addC(lgra,7,5,2,1);
	
	addC(new JLabel(" "),8,1,1,1);
	addC(t1,9,1,2,1);
	addC(new JLabel(" "),10,1,1,1);
	addC(t2,11,1,2,1);
	addC(new JLabel(" "),12,1,1,1);
	addC(t3,13,1,2,1);
	addC(new JLabel(" "),14,1,1,1);
	addC(t4,15,1,2,1);
	addC(new JLabel(" "),16,1,1,1);
	addC(t5,17,1,2,1);
	addC(new JLabel(" "),18,1,1,1);
	addC(t6,19,1,2,1);
	addC(new JLabel(" "),20,1,1,1);
	addC(t7,21,1,2,1);
	
	addC(t8,9,3,2,1);
	addC(new JLabel(" "),10,1,1,1);
	addC(t9,11,3,2,1);
	addC(new JLabel(" "),12,1,1,1);
	addC(t10,13,3,2,1);
	addC(new JLabel(" "),14,1,1,1);
	addC(t11,15,3,2,1);
	addC(new JLabel(" "),16,1,1,1);
	addC(t12,17,3,2,1);
	addC(new JLabel(" "),18,1,1,1);
	addC(t13,19,3,2,1);
	addC(new JLabel(" "),20,1,1,1);
	addC(t14,21,3,2,1);
	
	addC(t15,9,5,2,1);
	addC(new JLabel(" "),10,1,1,1);
	addC(t16,11,5,2,1);
	addC(new JLabel(" "),12,1,1,1);
	addC(t17,13,5,2,1);
	addC(new JLabel(" "),14,1,1,1);
	addC(t18,15,5,2,1);
	addC(new JLabel(" "),16,1,1,1);
	addC(t19,17,5,2,1);
	addC(new JLabel(" "),18,1,1,1);
	addC(t20,19,5,2,1);
	addC(new JLabel(" "),20,1,1,1);
	addC(t21,21,5,2,1);
	addC(ba,22,1,1,1);


	lad.setFont(new Font("Arial",Font.BOLD,25)); 
	lhn.setFont(new Font("Arial",Font.BOLD,16));
	lname.setFont(new Font("Arial",Font.BOLD,16));
	lgro.setFont(new Font("Arial",Font.BOLD,16));
	ltm.setFont(new Font("Arial",Font.BOLD,16));
	lmd.setFont(new Font("Arial",Font.BOLD,25));
	lsn.setFont(new Font("Arial",Font.BOLD,16));
	lmar.setFont(new Font("Arial",Font.BOLD,16));
	lgra.setFont(new Font("Arial",Font.BOLD,16));
	ser.setBackground(Color.black);
	ba.setBackground(Color.black);

	ser.setForeground(Color.white);
	ser.setMnemonic(KeyEvent.VK_S);
	ba.setForeground(Color.white);
	ba.setMnemonic(KeyEvent.VK_B);

	ser.addActionListener(this);
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
          new RD();
       }
       public void actionPerformed(ActionEvent e)
       {
		if(e.getSource()==ba)
			dispose();
		if(e.getSource()==ser)
		{
			Integer m1,m2,m3,m4,m5,m6,m7,tot=0,temp=0;

		try{
	PreparedStatement pst=DataCon.con.prepareStatement("select s1,s2,s3,s4,s5,s6,s7 from subject where rollno=?");
		pst.setInt(1,Integer.parseInt(hn.getText()));
	ResultSet rs=pst.executeQuery();
		rs.next();
		t1.setText(rs.getString(1));
		t2.setText(rs.getString(2));
		t3.setText(rs.getString(3));
		t4.setText(rs.getString(4));
		t5.setText(rs.getString(5));
		t6.setText(rs.getString(6));
		t7.setText(rs.getString(7));	
	PreparedStatement pst1=DataCon.con.prepareStatement(" select  name,cname AS Course from student,Course where rid=? and student.groupname = Course.cid");
		pst1.setInt(1,Integer.parseInt(hn.getText()));
	ResultSet rs1=pst1.executeQuery();
		rs1.next();
		name.setText(rs1.getString(1));
		gro.setText(rs1.getString(2));
	PreparedStatement pst2=DataCon.con.prepareStatement("select m1,m2,m3,m4,m5,m6,m7 from marks where rollno=?");
		pst2.setInt(1,Integer.parseInt(hn.getText()));
	ResultSet rs2=pst2.executeQuery();
		rs2.next();
		t8.setText(rs2.getString(1));
		t9.setText(rs2.getString(2));
		t10.setText(rs2.getString(3));
		t11.setText(rs2.getString(4));
		t12.setText(rs2.getString(5));
		t13.setText(rs2.getString(6));
		t14.setText(rs2.getString(7));

		m1=Integer.parseInt(rs2.getString(1));
		m2=Integer.parseInt(rs2.getString(2));
		m3=Integer.parseInt(rs2.getString(3));
		m4=Integer.parseInt(rs2.getString(4));
		m5=Integer.parseInt(rs2.getString(5));
		m6=Integer.parseInt(rs2.getString(6));

 	t15.setText(m1 >= 28 ? "Pass" : "Fail");
 	t16.setText(m2 >= 28 ? "Pass" : "Fail");
    	t17.setText(m3 >= 28 ? "Pass" : "Fail");
    	t18.setText(m4 >= 28 ? "Pass" : "Fail");
    	t19.setText(m5 >= 22 ? "Pass" : "Fail");
    	t20.setText(m6 >= 22 ? "Pass" : "Fail");
	
	 if (rs2.getString(7) != null) 
	{
        m7 = Integer.parseInt(rs2.getString(7));
        t21.setText(m7 >= 22 ? "Pass" : "Fail");
		if(m7>=22)
			temp=m7;
    	}
       
if(m1>=28 && m2>=28 && m3>=28 && m4>=28 && m5>=22 && m6>=22 )
{
    tot = m1 + m2 + m3 + m4 + m5 + m6+temp;
          tm.setText(Integer.toString(tot));
}	

	}catch(Exception ep){
JOptionPane.showMessageDialog(null,"NO  data Found","Information",JOptionPane.INFORMATION_MESSAGE);
}

		}
       }
}

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.awt.Insets;

class RGSTU extends JFrame implements ActionListener
{
        
	JLabel
lsrg,lsname,ldn,lmn,ldob,ladd,lmobn,lemail,lgroup,lsschn,lsch,lclg,liht,ltm,lsl,lans,lanm,land,lcas,laccs,laccm,lifsc,lrf;
	JTextField srg,sname,dn,mn,dob,add,mobn,email,sschn,sch,clg,iht,tm,ans,anm,and,cas,accs,accm,ifsc;	
	GridBagConstraints gc;
	JButton sub,can,nw;
	JComboBox<String> jcb,jcb1; 

	RGSTU()
	{
	setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
	getContentPane().setBackground(new Color(65,148,83));
	setSize(d.width,d.height);
	setLayout(new GridBagLayout());
    	setUndecorated(true);
	gc=new GridBagConstraints();
	gc.insets = new Insets(5,5,5,5);
	

	lrf=new JLabel(       "REGISTERATION FORM ");
	lsrg=new JLabel("Registeration ID");
	lsname=new JLabel("STUDENT NAME");
	ldn=new JLabel("FATHER NAME");
	lmn=new JLabel("MOTHER NAME");
	ldob=new JLabel("DATE OF BIRTH");
	ladd=new JLabel("ADDRESS");
	lmobn=new JLabel("MOBILE NUMBER");
	lemail=new JLabel("EMAIL ID");
	lgroup=new JLabel("GROUP");
	lsschn=new JLabel("SSC HALL TICKET NO");
	lsch=new JLabel("SCHOOL STUDIED");
	lclg=new JLabel("COLLEGE STUDIED");
	liht=new JLabel("INTERMEDIATE HALL TICKET NO");
	ltm=new JLabel("TOTAL MARKS");
	lsl=new JLabel("SECOND LANGUAGE");
	lans=new JLabel("AADHAR NO OF STUDENT");
	lanm=new JLabel("AADHAR NO OF MOTHER");
	land=new JLabel("AADHAR NO OF FATHER");
	lcas=new JLabel("CASTE");
	laccs=new JLabel("ACCOUNT NO OF STUDENT");
	laccm=new JLabel("ACCOUNT NO OF MOTHER");
	lifsc=new JLabel("IFSC NO OF MOTHER");
	
	srg=new JTextField(40);
	sname=new JTextField(40);	
	dn=new JTextField(40);
	mn=new JTextField(40);
	dob=new JTextField(40);
	add=new JTextField(40);
	mobn=new JTextField(40);
	email=new JTextField(40);
	jcb = new JComboBox<String>();
	sschn=new JTextField(40);	
	sch=new JTextField(40);
	clg=new JTextField(40);
	iht=new JTextField(40);
	tm=new JTextField(40);
	jcb1 = new JComboBox<String>();
	ans=new JTextField(40);
	anm=new JTextField(40);
	and=new JTextField(40);
	cas=new JTextField(40);
	accs=new JTextField(40);
	accm=new JTextField(40);
	ifsc=new JTextField(40);

	
	sub=new JButton("Submit");
	can=new JButton("Cancel");
	nw=new JButton("New");
	
	addC(lrf,1,3,1,1);
	addC(lsrg,2,1,1,1);
	addC(srg,2,3,1,1);
	addC(lsname,3,1,2,1);
	addC(sname,3,3,2,1);
        addC(ldn,4,1,2,1);
	addC(dn,4,3,2,1);
	addC(lmn,5,1,2,1);
	addC(mn,5,3,2,1);
	addC(ldob,6,1,2,1);
	addC(dob,6,3,2,1);
	addC(ladd,7,1,2,1);
	addC(add,7,3,2,1);
	addC(lmobn,8,1,2,1);
	addC(mobn,8,3,2,1);
	addC(lemail,9,1,2,1);
	addC(email,9,3,2,1);
	addC(lgroup,10,1,2,1);
	addC(jcb,10,3,2,1);	
	addC(lsschn,11,1,2,1);
	addC(sschn,11,3,2,1);
	addC(lsch,12,1,2,1);
	addC(sch,12,3,2,1);
	addC(lclg,13,1,2,1);
	addC(clg,13,3,2,1);
	addC(liht,14,1,2,1);
	addC(iht,14,3,2,1);
	addC(ltm,15,1,2,1);
	addC(tm,15,3,2,1);
	addC(lsl,16,1,2,1);
	addC(jcb1,16,3,2,1);
	addC(lans,17,1,2,1);
	addC(ans,17,3,2,1);
	addC(lanm,18,1,2,1);
	addC(anm,18,3,2,1);
	addC(land,19,1,2,1);
	addC(and,19,3,2,1);
	addC(lcas,20,1,2,1);
	addC(cas,20,3,2,1);
	addC(laccs,21,1,2,1);
	addC(accs,21,3,2,1);
	addC(laccm,22,1,2,1);
	addC(accm,22,3,2,1);
	addC(lifsc,23,1,2,1);
	addC(ifsc,23,3,2,1);
	addC(new JLabel(" "),24,1,1,1);
	addC(new JLabel(" "),25,1,1,1);
	addC(can,26,1,1,1);
	addC(sub,26,3,1,1);
	addC(nw,26,5,1,1);

	try{
		Statement st2=DataCon.con.createStatement();
		ResultSet rs2=st2.executeQuery("select cname from Course");
		while(rs2.next())
			jcb.addItem(rs2.getString(1));
		
		Statement st3=DataCon.con.createStatement();
		ResultSet rs3=st3.executeQuery("select subname from Secondlanguage");
		while(rs3.next())
			jcb1.addItem(rs3.getString(1));	
		}catch(Exception e){}
	
	lrf.setFont(new Font("Arial",Font.PLAIN,20)); 
	lsrg.setFont(new Font("Arial",Font.PLAIN,16)); 
	lsname.setFont(new Font("Arial",Font.PLAIN,16)); 
	ldn.setFont(new Font("Arial",Font.PLAIN,16));
	lmn.setFont(new Font("Arial",Font.PLAIN,16));
	ldob.setFont(new Font("Arial",Font.PLAIN,16));
	ladd.setFont(new Font("Arial",Font.PLAIN,16));
	lmobn.setFont(new Font("Arial",Font.PLAIN,16));
	lemail.setFont(new Font("Arial",Font.PLAIN,16));
	lgroup.setFont(new Font("Arial",Font.PLAIN,16));
	lsschn.setFont(new Font("Arial",Font.PLAIN,16));
	lsch.setFont(new Font("Arial",Font.PLAIN,16));
	lclg.setFont(new Font("Arial",Font.PLAIN,16));
	liht.setFont(new Font("Arial",Font.PLAIN,16));
	ltm.setFont(new Font("Arial",Font.PLAIN,16));
	lsl.setFont(new Font("Arial",Font.PLAIN,16));
	lans.setFont(new Font("Arial",Font.PLAIN,16));
	lanm.setFont(new Font("Arial",Font.PLAIN,16));
	land.setFont(new Font("Arial",Font.PLAIN,16));
	lcas.setFont(new Font("Arial",Font.PLAIN,16));
	laccs.setFont(new Font("Arial",Font.PLAIN,16));
	laccm.setFont(new Font("Arial",Font.PLAIN,16));
	lifsc.setFont(new Font("Arial",Font.PLAIN,16));

 	
	sub .setFont(new Font("Arial",Font.PLAIN,16)); 
	can .setFont(new Font("Arial",Font.PLAIN,16));
	nw .setFont(new Font("Arial",Font.PLAIN,16));

	lrf.setForeground(Color.white); 
	lsrg.setForeground(Color.black); 
	lsname.setForeground(Color.black); 
	ldn.setForeground(Color.black);
	lmn.setForeground(Color.black);
	ldob.setForeground(Color.black);
	ladd.setForeground(Color.black);
	lmobn.setForeground(Color.black);
	lemail.setForeground(Color.black);
	lgroup.setForeground(Color.black);
	lsschn.setForeground(Color.black);
	lsch.setForeground(Color.black);
	lclg.setForeground(Color.black);
	liht.setForeground(Color.black);
	ltm.setForeground(Color.black);
	lsl.setForeground(Color.black);
	lans.setForeground(Color.black);
	lanm.setForeground(Color.black);
	land.setForeground(Color.black);
	lcas.setForeground(Color.black);
	laccs.setForeground(Color.black);
	laccm.setForeground(Color.black);
	lifsc.setForeground(Color.black);
	


	sub.setForeground(Color.black);
	can.setForeground(Color.black);
	nw.setForeground(Color.black);
	sub.setMnemonic(KeyEvent.VK_S);
	can.setMnemonic(KeyEvent.VK_C);
	sub.addActionListener(this);
	can.addActionListener(this);
	nw.setMnemonic(KeyEvent.VK_N);
	nw.addActionListener(this);
try{
		Statement st1=DataCon.con.createStatement();
		ResultSet rs1=st1.executeQuery("select max(rid) from student where styear=1");
		rs1.next();
		int id=rs1.getInt(1);
		id++;
		srg.setText(Integer.toString(id));
	}catch(Exception ep){System.out.println(ep);}

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
	new RGSTU();
}

public void setData()
{
	sname.setText("");	
	dn.setText("");
	mn.setText("");
	dob.setText("");
	add.setText("");
	mobn.setText("");
	email.setText("");
	sschn.setText("");	
	sch.setText("");
	clg.setText("");
	iht.setText("");
	tm.setText("");
	ans.setText("");
	anm.setText("");
	and.setText("");
	cas.setText("");
	accs.setText("");
	accm.setText("");
	ifsc.setText("");
}
       public void actionPerformed(ActionEvent e)
       {
	if(e.getSource()==can)
	{
		dispose();
	}
	if(e.getSource()==sub)
	{

		try{
		          PreparedStatement pst1=DataCon.con.prepareStatement("select cid from Course where cname=?");
		pst1.setString(1,jcb.getSelectedItem().toString());
		ResultSet rs1=pst1.executeQuery();
		rs1.next();
		int cid=rs1.getInt(1);

	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","thasmiya");
	PreparedStatement pst=con.prepareStatement("insert into Student (rid,name,dad,mom,dob,addr,phno,email,groupname,sscht,school,clg,intht,totm,seclang,adnost,adnomom,adnodad,caste,acnost,acnomom,ifscnomom) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		
	pst.setInt(1,Integer.parseInt(srg.getText()));
	pst.setString(2,sname.getText());
	pst.setString(3,dn.getText());
	pst.setString(4,mn.getText());
	pst.setString(5,dob.getText());
	pst.setString(6,add.getText());
	pst.setLong(7,Long.parseLong(mobn.getText()));
	pst.setString(8,email.getText());
	pst.setInt(9,cid);
	pst.setString(10,sschn.getText());
	pst.setString(11,sch.getText());
	pst.setString(12,clg.getText());
	pst.setString(13,iht.getText());
	pst.setString(14,tm.getText());
	pst.setString(15,jcb1.getSelectedItem().toString());
	pst.setString(16,ans.getText());
	pst.setString(17,anm.getText());
	pst.setString(18,and.getText());
	pst.setString(19,cas.getText());
	pst.setString(20,accs.getText());
	pst.setString(21,accm.getText());
	pst.setString(22,ifsc.getText());
	pst.executeUpdate();
	con.commit();
			
	}catch(Exception ee){System.out.print(ee);}
	}
	if(e.getSource()==nw)
	{
		try{
		Statement st1=DataCon.con.createStatement();
		ResultSet rs1=st1.executeQuery("select max(rid) from student where styear=1");
		rs1.next();
		int id=rs1.getInt(1);
		id++;
		srg.setText(Integer.toString(id));
	}catch(Exception ep){System.out.println(ep);}
	srg.setEditable(false);
	setData();
	
	}//if cls

       }
}

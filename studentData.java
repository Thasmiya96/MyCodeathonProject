import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel; 
import java.sql.*;
import java.awt.Color;
import java.awt.Insets;


class studentData extends JFrame implements ActionListener
{
	JLabel lrg;
	JTextField rg; 
	JButton can ,ok;
	GridBagConstraints gc;
	studentData()
	{
	setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
	getContentPane().setBackground(new Color(229,229,131));
	setSize(d.width/2,d.height/2);
	setLocation(d.width/4,d.height/4);
      
	setLayout(new GridBagLayout());
	gc=new GridBagConstraints();
	lrg=new JLabel("Register ID");
	rg=new JTextField (20);
	can=new JButton("Cancel");
	ok=new JButton("OK");
	can.setBackground(new Color(48,124,235));
	ok.setBackground(new Color(48,124,235));
	addC(lrg,1,1,1,1);
	addC(rg,1,2,1,1);
	addC(new JLabel(""),2,1,1,1);
	addC(new JLabel(""),3,1,1,1);
	addC(can,4,1,1,1);
	addC(ok,4,3,1,1);

	lrg.setFont(new Font("Arial",Font.PLAIN,16)); 
	rg.setFont(new Font("Arial",Font.PLAIN,16)); 
	ok.setFont(new Font("Arial",Font.PLAIN,16)); 
	can.setFont(new Font("Arial",Font.PLAIN,16)); 
	can .setMnemonic(KeyEvent.VK_C);
	ok.setMnemonic(KeyEvent.VK_O);


	can.addActionListener(this);
	ok.addActionListener(this);	
	setVisible(true);  	 
	}
	public static void main(String a[])
	{
	new studentData();
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

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==can)
			dispose();
		if(e.getSource()==ok)
		{
			int id=Integer.parseInt(rg.getText());
			new STUDE(id);
			dispose();
		}
	}//act cls
}

class STUDE extends JFrame implements ActionListener
{
        
	JLabel lsname,ldn,lmn,ldob,laddr,lmobn,lemail,lgroup,lsschn,lsch,lclg,liht,ltm,lsl,lans,lanm,land,lcas,laccs,laccm,lifsc,lsd,lstyear;
	JTextField sname,dn,mn,dob,addr,mobn,email,group,sschn,sch,clg,iht,tm,sl,ans,anm,and,cas,accs,accm,ifsc,styear;
	GridBagConstraints gc;
	JButton can;
	STUDE(int rg)
	{
	setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
	getContentPane().setBackground(new Color(65,148,83));
	setSize(d.width,d.height);
      
	setLayout(new GridBagLayout());
	gc=new GridBagConstraints();
	gc.insets = new Insets(5,5,5,5);

	lsname=new JLabel("STUDENT NAME");
	ldn=new JLabel("FATHER NAME");
	lmn=new JLabel("MOTHER NAME");
	ldob=new JLabel("DATE OF BIRTH");
	laddr=new JLabel("ADDRESS");
	lmobn=new JLabel("MOBILE No.");
	lemail=new JLabel("EMAIL ID");
	lgroup=new JLabel("GROUP");
	lsschn=new JLabel("SSC HT NO");
	lsch=new JLabel("SCHOOL NAME");
	lclg=new JLabel("COLLEGE STUDIED");
	liht=new JLabel("INTER HT.NO");
	ltm=new JLabel("TOTAL MARKS");
	lsl=new JLabel("SECOND LANG");
	lans=new JLabel("AadhaarSTUDENT");
	lanm=new JLabel("AadhaarMOTHER");
	land=new JLabel("AadhaarFATHER");
	lcas=new JLabel("CASTE");
	laccs=new JLabel("A/c no.STUDENT");
	laccm=new JLabel("A/c no.MOTHER");
	lifsc=new JLabel("IFSC NO.MOTHER");
	lstyear=new JLabel("Year");
	lsd=new JLabel("             STUDENT DETAILS");

	sname=new JTextField(40);	
	dn=new JTextField(40);
	mn=new JTextField(40);
	dob=new JTextField(40);
	addr=new JTextField(40);
	mobn=new JTextField(40);
	email=new JTextField(40);
	group=new JTextField(40);
	sschn=new JTextField(40);	
	sch=new JTextField(40);
	clg=new JTextField(40);
	iht=new JTextField(40);
	tm=new JTextField(40);
	sl=new JTextField(40);
	ans=new JTextField(40);
	anm=new JTextField(40);
	and=new JTextField(40);
	cas=new JTextField(40);
	accs=new JTextField(40);
	accm=new JTextField(40);
	ifsc=new JTextField(40);
	styear=new JTextField(40);
	

	can=new JButton("Cancel");

	addC(lsd,1,5,2,1);
	addC(lsname,3,1,2,1);
	addC(sname,3,3,2,1);
        addC(ldn,3,7,1,1);
	addC(dn,3,8,2,1);
	addC(lmn,5,1,2,1);
	addC(mn,5,3,2,1);
	addC(ldob,5,7,2,1);
	addC(dob,5,8,2,1);
	addC(laddr,7,1,2,1);
	addC(addr,7,3,2,1);
	addC(lmobn,7,7,2,1);
	addC(mobn,7,8,2,1);
	addC(lemail,9,1,2,1);
	addC(email,9,3,2,1);
	addC(lgroup,9,7,2,1);
	addC(group,9,8,2,1);
	addC(lsschn,11,1,2,1);
	addC(sschn,11,3,2,1);
	addC(lsch,11,7,2,1);
	addC(sch,11,8,2,1);
	addC(lclg,13,1,2,1);
	addC(clg,13,3,2,1);
	addC(liht,13,7,2,1);
	addC(iht,13,8,2,1);
	addC(ltm,15,1,2,1);
	addC(tm,15,3,2,1);
	addC(lsl,15,7,2,1);
	addC(sl,15,8,2,1);
	addC(lans,17,1,2,1);
	addC(ans,17,3,2,1);
	addC(lanm,17,7,2,1);
	addC(anm,17,8,2,1);
	addC(land,19,1,2,1);
	addC(and,19,3,2,1);
	addC(lcas,19,7,2,1);
	addC(cas,19,8,2,1);
	addC(laccs,20,1,2,1);
	addC(accs,20,3,2,1);
	addC(laccm,20,7,2,1);
	addC(accm,20,8,2,1);
	addC(lifsc,21,1,2,1);
	addC(ifsc,21,3,2,1);
	addC(lstyear,21,7,2,1);
	addC(styear,21,8,2,1);
	addC(new JLabel(" "),23,1,1,1);
  	can.setBackground(Color.black);
	addC(can,24,10,1,1);
	
	lsname.setFont(new Font("Arial",Font.PLAIN,14)); 
	ldn.setFont(new Font("Arial",Font.PLAIN,14));
	lmn.setFont(new Font("Arial",Font.PLAIN,14));
	ldob.setFont(new Font("Arial",Font.PLAIN,14));
	laddr.setFont(new Font("Arial",Font.PLAIN,14));
	lmobn.setFont(new Font("Arial",Font.PLAIN,14));
	lemail.setFont(new Font("Arial",Font.PLAIN,14));
	lgroup.setFont(new Font("Arial",Font.PLAIN,14));
	lsschn.setFont(new Font("Arial",Font.PLAIN,14));
	lsch.setFont(new Font("Arial",Font.PLAIN,14));
	lclg.setFont(new Font("Arial",Font.PLAIN,14));
	liht.setFont(new Font("Arial",Font.PLAIN,14));
	ltm.setFont(new Font("Arial",Font.PLAIN,14));
	lsl.setFont(new Font("Arial",Font.PLAIN,14));
	lans.setFont(new Font("Arial",Font.PLAIN,14));
	lanm.setFont(new Font("Arial",Font.PLAIN,14));
	land.setFont(new Font("Arial",Font.PLAIN,14));
	lcas.setFont(new Font("Arial",Font.PLAIN,14));
	laccs.setFont(new Font("Arial",Font.PLAIN,14));
	laccm.setFont(new Font("Arial",Font.PLAIN,14));
	lifsc.setFont(new Font("Arial",Font.PLAIN,14));
	lsd.setFont(new Font("Arial",Font.BOLD,16));

	can .setFont(new Font("Arial",Font.PLAIN,16));

	lsname.setForeground(Color.black); 
	ldn.setForeground(Color.black);
	lmn.setForeground(Color.black);
	ldob.setForeground(Color.black);
	laddr.setForeground(Color.black);
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
	lsd.setForeground(Color.yellow);
	can.setForeground(Color.white);
	can.setMnemonic(KeyEvent.VK_C);

		try{
	PreparedStatement pst1=DataCon.con.prepareStatement("SELECT  name, dad, mom, dob, addr, phno, email,cname AS Course, sscht, school, clg, intht, totm,subname AS Secondlanguage, adnost, adnomom, adnodad,caste,acnost, acnomom, ifscnomom, styear FROM Student,Course,Secondlanguage WHERE Student.groupname = Course.cid AND Student.seclang=Secondlanguage.subname AND  rid=?");
		pst1.setInt(1,rg);
		ResultSet rs=pst1.executeQuery();
		rs.next();
				sname.setText(rs.getString(1));
				dn.setText(rs.getString(2));
				mn.setText(rs.getString(3));
				dob.setText(rs.getString(4));
				addr.setText(rs.getString(5));
				mobn.setText(Long.toString(rs.getLong(6)));
				email.setText(rs.getString(7));
				group.setText(rs.getString(8));
				sschn.setText(Long.toString(rs.getLong(9)));				
				sch.setText(rs.getString(10));
				clg.setText(rs.getString(11));
				iht.setText(Long.toString(rs.getLong(12)));
				tm.setText(Long.toString(rs.getLong(13)));
				sl.setText(rs.getString(14));
				ans.setText(Long.toString(rs.getLong(15)));
				anm.setText(Long.toString(rs.getLong(16)));
				and.setText(Long.toString(rs.getLong(17)));
				cas.setText(rs.getString(18));
				accs.setText(Long.toString(rs.getLong(19)));
				accm.setText(Long.toString(rs.getLong(20)));
				ifsc.setText(rs.getString(21));
				styear.setText(Integer.toString(rs.getInt(22)));
		}catch(Exception ep){System.out.println(ep);}
	sname.setEditable(false);	
	dn.setEditable(false);
	mn.setEditable(false);
	dob.setEditable(false);
	addr.setEditable(false);
	mobn.setEditable(false);
	email.setEditable(false);
	group.setEditable(false);
	sschn.setEditable(false);	
	sch.setEditable(false);
	clg.setEditable(false);
	iht.setEditable(false);
	tm.setEditable(false);
	sl.setEditable(false);
	ans.setEditable(false);
	anm.setEditable(false);
	and.setEditable(false);
	cas.setEditable(false);
	accs.setEditable(false);
	accm.setEditable(false);
	ifsc.setEditable(false);
	styear.setEditable(false);



	
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
       /*public static void main(String a[])
       {
          new STUDE();
       }*/
       public void actionPerformed(ActionEvent e)
       {
		if(e.getSource()==can)
		{  
			dispose();
		}

       }
}//class cls

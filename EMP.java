import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.awt.Insets;

class EMP extends JDialog  implements ActionListener
{
        Statement st;
	ResultSet rs;
	JLabel leid,lename,lemail,lqua,ljd,lrd,ldep,lsal;
	JTextField eid,ename,email,qua,jd,rd,dep,sal;
	GridBagConstraints gc;
	JButton frt,nxt,pre,lst,mo,ne,del,xt;
	JComboBox<String> jcb,jcb1; 

	public EMP()
	{
	super(new JFrame(),"",true);
	  try{
		st=DataCon.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);                               
		rs=st.executeQuery("SELECT eid,ename,email,qualify,joindt,resigndt, sal,dname AS department FROM Employee,department where employee.did =department.did");
		}catch(Exception e){}

	setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
	getContentPane().setBackground(new Color(130,133,191));
	setSize(d.width/2,d.height/2);
	setLocation(d.width/4,d.height/4);
      
	setLayout(new GridBagLayout());
	gc=new GridBagConstraints();
	gc.insets = new Insets(5,5,5,5);

	setUndecorated(true);
		jcb=new JComboBox<String>();
		jcb1=new JComboBox<String>();
		jcb1.setFont(new Font("comic sans ms",Font.PLAIN,16)); 	
		jcb1.setForeground(Color.black);
		jcb.setFont(new Font("comic sans ms",Font.PLAIN,16)); 	
		jcb.setForeground(Color.black);


	leid=new JLabel("EMPLOYEE-ID:");
	lename=new JLabel("NAME :");
	lemail=new JLabel("E-MAIL :");
	lqua=new JLabel("QUALIFICATION:");
	ljd=new JLabel("JOINING DATE:");
	lrd=new JLabel("RESIGN DATE:");
	lsal=new JLabel("SALARY");
	ldep=new JLabel("DEPARTMENT:");

	eid=new JTextField();
	ename=new JTextField();	
	email=new JTextField();
	qua=new JTextField();
	jd=new JTextField();
	rd=new JTextField();
	sal=new JTextField();
	dep=new JTextField();

	frt=new JButton("First");
	nxt=new JButton("Next");
	pre=new JButton("Previous");
	lst=new JButton("Last");
	mo=new JButton("Modify");
	xt=new JButton("Exit");
	ne=new JButton("New");
	del=new JButton("Delete");

	addC(leid,1,1,2,1);
	addC(eid,1,3,2,1);
	addC(lename,2,1,2,1);
	addC(ename,2,3,2,1);
	addC(lemail,3,1,2,1);
	addC(email,3,3,2,1);
	addC(lqua,4,1,2,1);	
	addC(qua,4,3,2,1);
	addC(ljd,5,1,2,1);	
	addC(jd,5,3,2,1);
	addC(lrd,6,1,2,1);	
	addC(rd,6,3,2,1);
	addC(lsal,7,1,2,1);
	addC(sal,7,3,2,1);
	addC(ldep,8,1,2,1);	
	addC(dep,8,3,2,1);
        addC(frt,9,1,1,1);
	addC(nxt,9,2,1,1);
	addC(pre,9,3,1,1);
	addC(lst,9,4,1,1);
	addC(mo,10,1,1,1);
	addC(ne,10,2,1,1);
	addC(xt,10,3,1,1);
	addC(del,10,4,1,1);


	leid .setFont(new Font("Arial",Font.PLAIN,18)); 
	lename .setFont(new Font("Arial",Font.PLAIN,18));
	lemail .setFont(new Font("Arial",Font.PLAIN,18)); 	
	lqua.setFont(new Font("Arial",Font.PLAIN,18)); 
	ljd.setFont(new Font("Arial",Font.PLAIN,18)); 
	lrd.setFont(new Font("Arial",Font.PLAIN,18)); 
	lsal.setFont(new Font("Arial",Font.PLAIN,18));
	ldep.setFont(new Font("Arial",Font.PLAIN,18)); 
	eid .setFont(new Font("Arial",Font.PLAIN,16)); 	
	ename .setFont(new Font("Arial",Font.PLAIN,16)); 
	email.setFont(new Font("Arial",Font.PLAIN,16));
	qua.setFont(new Font("Arial",Font.PLAIN,16));
	jd .setFont(new Font("Arial",Font.PLAIN,16));
	rd .setFont(new Font("Arial",Font.PLAIN,16));
	sal.setFont(new Font("Arial",Font.PLAIN,16));
	dep .setFont(new Font("Arial",Font.PLAIN,16));
	frt .setFont(new Font("Arial",Font.PLAIN,16)); 
	nxt .setFont(new Font("Arial",Font.PLAIN,16));
	pre .setFont(new Font("Arial",Font.PLAIN,16)); 
	lst .setFont(new Font("Arial",Font.PLAIN,16)); 
	mo .setFont(new Font("Arial",Font.PLAIN,16)); 
	xt .setFont(new Font("Arial",Font.PLAIN,16));
	del .setFont(new Font("Arial",Font.PLAIN,16)); 
	ne.setFont(new Font("Arial",Font.PLAIN,16)); 


	leid  .setForeground(Color.red);
	lename  .setForeground(Color.black);
	lemail .setForeground(Color.black);
	lqua .setForeground(Color.black);
	ljd.setForeground(Color.black);
	lrd .setForeground(Color.black);
	ldep .setForeground(Color.black);
	lsal .setForeground(Color.black);

	eid .setForeground(Color.black);
	ename  .setForeground(Color.black);
	email .setForeground(Color.black);
	qua.setForeground(Color.black);
	jd  .setForeground(Color.black);
	rd  .setForeground(Color.black);
	dep  .setForeground(Color.black);	
	sal .setForeground(Color.black);

	frt  .setForeground(Color.black);
	nxt  .setForeground(Color.black);
	pre  .setForeground(Color.black);
	lst  .setForeground(Color.black);
	mo  .setForeground(Color.black);
	xt .setForeground(Color.black);
	ne .setForeground(Color.black);
	del .setForeground(Color.black);


	frt .setMnemonic(KeyEvent.VK_F);
	nxt .setMnemonic(KeyEvent.VK_N);
	pre .setMnemonic(KeyEvent.VK_P);
	lst .setMnemonic(KeyEvent.VK_L);
	mo .setMnemonic(KeyEvent.VK_M);
	xt .setMnemonic(KeyEvent.VK_X);
	ne .setMnemonic(KeyEvent.VK_W);
	del .setMnemonic(KeyEvent.VK_D);
	
	frt.addActionListener(this);
	nxt.addActionListener(this);
	pre.addActionListener(this);
	lst.addActionListener(this);
	mo.addActionListener(this);
	xt.addActionListener(this);
	ne.addActionListener(this);
	del.addActionListener(this);

	eid.setEditable(false);
	textEdit(false);
	setVisible(true);

	}
public static void main(String a[])
{
new EMP();
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
		
	public void setData()throws Exception
	{
		eid.setText(Integer.toString(rs.getInt(1)));
		ename.setText(rs.getString(2));
		email.setText(rs.getString(3));
		qua.setText(rs.getString(4));
		jd.setText(rs.getString(5));
		rd.setText(rs.getString(6));
		sal.setText(Integer.toString(rs.getInt(7)));
		dep.setText(rs.getString(8));
	}
	public void textEdit(boolean b)
	{
		ename.setEditable(b);
		email.setEditable(b);
		qua.setEditable(b);
		jd.setEditable(b);
		rd.setEditable(b);
		sal.setEditable(b);
		dep.setEditable(b);

	}
	public void buttonEn(boolean b)
	{
		frt.setEnabled(b);
		nxt.setEnabled(b);
		pre.setEnabled(b);
		lst.setEnabled(b);
		mo.setEnabled(b);
		ne.setEnabled(b);
		del.setEnabled(b);
		xt.setEnabled(b);
	}
	
	public void clearText()
	{
		ename.setText("");
		email.setText("");
		qua.setText("");
		jd.setText("");
		rd.setText("");
		sal.setText("");
	}

       public void actionPerformed(ActionEvent e)
       {
		if(e.getSource()==xt)
		{
	if( JOptionPane.showConfirmDialog(null,"Do you wish to leave?", "confoirm",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
			dispose();
			
		}
	try{
		if(e.getSource()==nxt)
		{
			rs.next();
			setData();
		}
		if(e.getSource()==frt)
		{
			rs.first();
			setData();
		}
		if(e.getSource()==pre)
		{
			rs.previous();
			setData();
		}
		if(e.getSource()==lst)
		{
			rs.last();
			setData();
		}
	}catch(Exception ee){
JOptionPane.showMessageDialog(null,"NO More data Found","Information",JOptionPane.INFORMATION_MESSAGE);
	}//try cls
	
		if(e.getSource()==del)
	{	
		if(JOptionPane.showConfirmDialog(null,"Are you sure , Do you want to Delete This Data ??","confirm",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
		try{
	PreparedStatement pstd=DataCon.con.prepareStatement("delete from Employee where eid=?");
	pstd.setInt(1,Integer.parseInt(eid.getText().toString()));
	pstd.executeUpdate();
	DataCon.con.commit();
		rs=st.executeQuery("SELECT eid,ename,email,qualify,joindt,resigndt, sal,dname AS department FROM Employee,department where employee.did =department.did");
		rs.last();
		setData();

	
		}catch(Exception ee){}		
	}
	
	if(e.getActionCommand().equals("New"))
	{
		ne.setText("Save");
		ne.setMnemonic(KeyEvent.VK_S);
		textEdit(true);
		clearText();
		buttonEn(false);
		ne.setEnabled(true);
		xt.setEnabled(true);
		try{
		Statement st1=DataCon.con.createStatement();
		ResultSet rs1=st1.executeQuery("select max(eid) from Employee");
		rs1.next();
		int id=rs1.getInt(1);
		id++;
		eid.setText(Integer.toString(id));

		remove(dep);
		addC(jcb,8,3,2,1);		
		remove(qua);
		addC(jcb1,4,3,2,1);		

		Statement st2=DataCon.con.createStatement();
		ResultSet rs2=st2.executeQuery("select dname from Department");
		while(rs2.next())
			jcb.addItem(rs2.getString(1));	
		Statement st3=DataCon.con.createStatement();
		ResultSet rs3=st3.executeQuery("select kinds from Qualification");
		while(rs3.next())
			jcb1.addItem(rs3.getString(1));	

		}catch(Exception ee){System.out.print(ee);}
	}

	if(e.getActionCommand().equals("Save"))
	{
	try{
		
          PreparedStatement pst1=DataCon.con.prepareStatement("select did from Department where dname=?");
		pst1.setString(1,jcb.getSelectedItem().toString());
		ResultSet rs1=pst1.executeQuery();
		rs1.next();
		int did=rs1.getInt(1);
		PreparedStatement pst=DataCon.con.prepareStatement("insert into Employee values(?,?,?,?,?,?,?,?)");
		pst.setInt(1,Integer.parseInt(eid.getText()));
		pst.setString(2,ename.getText());
		pst.setString(3,email.getText());
		pst.setString(4,jcb1.getSelectedItem().toString());
		pst.setString(5,jd.getText());
		pst.setString(6,rd.getText());
		pst.setInt(7, Integer.parseInt(sal.getText()));
		pst.setInt(8,did);
		pst.executeUpdate();
		DataCon.con.commit();

		rs=st.executeQuery("SELECT eid,ename,email,qualify,joindt,resigndt, sal,dname AS department FROM Employee,department where employee.did =department.did");
		rs.last();	
		remove(jcb);	
		addC(dep,8,3,2,1);
		remove(jcb1);	
		addC(qua,4,3,2,1);
		ne.setText("New");
		ne.setMnemonic(KeyEvent.VK_W);
		buttonEn(true);
		textEdit(false);
		setData();

		}catch(Exception ee){ System.out.println(ee);}
	}
	if(e.getActionCommand().equals("Modify"))
	{
		mo.setText("Update");
		mo .setMnemonic(KeyEvent.VK_U);
		buttonEn(false);
		mo.setEnabled(true);
		ename.setText("");
		email.setText("");
		jd.setText("");
		rd.setText("");
		sal.setText("");
		remove(qua);
		addC(jcb1,4,3,2,1);	
		try{	
		Statement st3=DataCon.con.createStatement();
		ResultSet rs3=st3.executeQuery("select kinds from Qualification");
		while(rs3.next())
			jcb1.addItem(rs3.getString(1));	
		}catch(Exception o){System.out.println(o);}
		textEdit(true);
		dep.setEditable(false);
	}

	if(e.getActionCommand().equals("Update"))
	{
		mo.setText("Modify");
		mo .setMnemonic(KeyEvent.VK_M);
	try{
	PreparedStatement pstd1=DataCon.con.prepareStatement("update Employee set ename=?,email=? ,qualify=?,joindt=?,resigndt=?,sal=?where eid=?");
	pstd1.setString(1,ename.getText());
	pstd1.setString(2,email.getText());
 	pstd1.setString(3,jcb1.getSelectedItem().toString());   	
	pstd1.setString(4,jd.getText());
	pstd1.setString(5,rd.getText());
	pstd1.setInt(6,Integer.parseInt(sal.getText().toString()));
	pstd1.setInt(7,Integer.parseInt(eid.getText().toString()));
	pstd1.executeUpdate();
	DataCon.con.commit();
	rs=st.executeQuery("SELECT eid,ename,email,qualify,joindt,resigndt, sal,dname AS department FROM Employee,department where employee.did =department.did");
		rs.last();
		setData();
		remove(jcb1);	
		addC(qua,4,3,2,1);
	textEdit(false);
	buttonEn(true);

	}catch(Exception ep){System.out.println(ep);}
	}



       }//action cls
}//class cls

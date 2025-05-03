import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.awt.Color;
import java.awt.Insets;

class BS extends JFrame implements ActionListener
{
        Statement st;
	ResultSet rs;
	JLabel lrn,ltit,laut,ledi,lpub,lpu,lda,lsub,lsta,lcop,lbsl;
	JTextField rn,tit,aut,edi,pub,pu,da,sub,sta,cop;
	GridBagConstraints gc;
	JButton frt,nxt,pre,lst,ne,del,xt;
	BS()
{	
	
	setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
	getContentPane().setBackground(new Color(255,210,249));
	setSize(d.width,d.height);
	try{
		st=DataCon.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);                               
		rs=st.executeQuery("select * from Books order by rsno");
		}catch(Exception e){}

      
	setLayout(new GridBagLayout());
	gc=new GridBagConstraints();
	gc.insets = new Insets(5, 5, 10, 10);
	
	lbsl=new JLabel("                 BOOKS STOCK IN LIBRARY:");
	lrn=new JLabel("REGISTER NO:");
	ltit=new JLabel("TITLE :");
	laut=new JLabel("AUTHOR:");
	ledi=new JLabel("EDITION:");
	lpub=new JLabel("PUBLISHER:");
	lpu=new JLabel("PUBLICATION:");
	lda=new JLabel("DATE:");
	lsub=new JLabel("SUBJECT:");
	lsta=new JLabel("STATUS");
	lcop=new JLabel("COPIES:");
	
	rn=new JTextField(10);
	tit=new JTextField(65);
	aut=new JTextField(40);
	edi=new JTextField(40);
	pub=new JTextField(40);
	pu=new JTextField(40);
	da=new JTextField(40);
	sub=new JTextField(40);
	sta=new JTextField(40);
	cop=new JTextField(40);


	
	frt=new JButton("First");
	nxt=new JButton("Next");
	pre=new JButton("Previous");
	lst=new JButton("Last");
	xt=new JButton("Exit");
	ne=new JButton("New Entry");                                          
	del=new JButton("Delete");
	
	frt.setBackground(new Color(48,124,235));
	nxt.setBackground(new Color(48,124,235));
	pre.setBackground(new Color(48,124,235));
	lst.setBackground(new Color(48,124,235));	
	xt.setBackground(new Color(48,124,235));
	ne.setBackground(new Color(48,124,235));
	del.setBackground(new Color(48,124,235));
	
	addC(lbsl,1,1,2,1);
	addC(new JLabel(" "),2,1,1,1);
	addC(lrn,3,1,2,1);
	addC(rn,3,3,2,1);
	addC(ltit,4,1,2,1);
	addC(tit,4,3,2,1);
	addC(laut,5,1,2,1);
	addC(aut,5,3,2,1);
	addC(ledi,6,1,2,1);
	addC(edi,6,3,2,1);
	addC(lpub,7,1,2,1);
	addC(pub,7,3,2,1);
	addC(lpu,8,1,2,1);
	addC(pu,8,3,2,1);
	addC(lda,9,1,2,1);
	addC(da,9,3,2,1);
	addC(lsub,10,1,2,1);
	addC(sub,10,3,2,1);
	addC(lcop,11,1,2,1);
	addC(cop,11,3,2,1);
	addC(lsta,12,1,2,1);
	addC(sta,12,3,2,1);
	addC(new JLabel(" "),13,1,1,1);

	addC(frt,14,1,1,1);
	addC(nxt,14,2,1,1);
	addC(pre,14,3,1,1);
	addC(lst,14,4,1,1);
	addC(new JLabel(" "),15,1,1,1);
	addC(ne,16,1,1,1);
	addC(del,16,2,1,1);
	addC(xt,16,3,1,1);


	lbsl.setFont(new Font("Arial",Font.PLAIN,16)); 
	lrn.setFont(new Font("Arial",Font.PLAIN,16)); 
	ltit .setFont(new Font("Arial",Font.PLAIN,16));
	ledi .setFont(new Font("Arial",Font.PLAIN,16)); 	
	laut .setFont(new Font("Arial",Font.PLAIN,16)); 
	lpub .setFont(new Font("Arial",Font.PLAIN,16)); 
	lpu .setFont(new Font("Arial",Font.PLAIN,16)); 
	lda .setFont(new Font("Arial",Font.PLAIN,16)); 
	lsub .setFont(new Font("Arial",Font.PLAIN,16)); 
	lcop .setFont(new Font("Arial",Font.PLAIN,16)); 
	lsta .setFont(new Font("Arial",Font.PLAIN,16)); 
	
	rn .setFont(new Font("Arial",Font.PLAIN,16)); 	
	tit .setFont(new Font("Arial",Font.PLAIN,16));
	edi.setFont(new Font("Arial",Font.PLAIN,16));
	aut .setFont(new Font("Arial",Font.PLAIN,16));
 	pub .setFont(new Font("Arial",Font.PLAIN,16));
 	pu .setFont(new Font("Arial",Font.PLAIN,16));
 	da .setFont(new Font("Arial",Font.PLAIN,16));
 	sub .setFont(new Font("Arial",Font.PLAIN,16));
 	cop .setFont(new Font("Arial",Font.PLAIN,16));
	sta .setFont(new Font("Arial",Font.PLAIN,16)); 

 
	frt .setFont(new Font("Arial",Font.PLAIN,16)); 
	nxt .setFont(new Font("Arial",Font.PLAIN,16));
	pre .setFont(new Font("Arial",Font.PLAIN,16)); 
	lst .setFont(new Font("Arial",Font.PLAIN,16)); 
	xt .setFont(new Font("Arial",Font.PLAIN,16));
	del .setFont(new Font("Arial",Font.PLAIN,16)); 
	ne.setFont(new Font("Arial",Font.PLAIN,16)); 
	
	lbsl.setForeground(Color.black);
	lrn.setForeground(Color.black);
	ltit.setForeground(Color.black); 
	ledi .setForeground(Color.black);	
	laut .setForeground(Color.black);
	lpub .setForeground(Color.black);
	lpu .setForeground(Color.black);
	lda .setForeground(Color.black);
	lsub .setForeground(Color.black);
	lcop .setForeground(Color.black);
	lsta  .setForeground(Color.black);

 	
	rn .setForeground(Color.black);	
	tit.setForeground(Color.black); 
	edi.setForeground(Color.black);
	aut .setForeground(Color.black);
 	pub .setForeground(Color.black);
 	da .setForeground(Color.black);
 	sub.setForeground(Color.black);
 	pu.setForeground(Color.black);
	cop.setForeground(Color.black);
	sta.setForeground(Color.black);


	frt .setMnemonic(KeyEvent.VK_F);
	nxt .setMnemonic(KeyEvent.VK_N);
	pre .setMnemonic(KeyEvent.VK_P);
	lst .setMnemonic(KeyEvent.VK_L);
	xt .setMnemonic(KeyEvent.VK_X);
	ne .setMnemonic(KeyEvent.VK_W);
	del .setMnemonic(KeyEvent.VK_D);
	
	frt.addActionListener(this);
	nxt.addActionListener(this);
	pre.addActionListener(this);
	lst.addActionListener(this);
	xt.addActionListener(this);
	ne.addActionListener(this);
	del.addActionListener(this);
	
	sta.setText("Available");
	textEdit(false);
	rn.setEditable(false);
	sta.setEditable(false);


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
          new BS();
       }
	public void clearText()
	{
		tit .setText("");
		aut .setText("");
		edi .setText("");
		pub .setText("");
		pu .setText("");
		da .setText("");
		sub .setText("");
		cop .setText("");
	
	}
public void textEdit(boolean b)
	{
		tit.setEditable(b);
		aut.setEditable(b);
		edi.setEditable(b);
		pub.setEditable(b);
		pu.setEditable(b);
		da.setEditable(b);
		sub.setEditable(b);
		cop.setEditable(b);

	}
	public void setData()throws Exception
	{
		rn.setText(Integer.toString(rs.getInt(1)));
		tit.setText(rs.getString(2));
		aut.setText(rs.getString(3));
		edi.setText(rs.getString(4));
		pub.setText(rs.getString(5));
		pu.setText(rs.getString(6));
		da.setText(rs.getString(7));
		sub.setText(rs.getString(8));
		cop.setText(rs.getString(9));

	}
	public void buttonEn(boolean b)
	{
		frt.setEnabled(b);
		nxt.setEnabled(b);
		pre.setEnabled(b);
		lst.setEnabled(b);
		ne.setEnabled(b);
		del.setEnabled(b);
		xt.setEnabled(b);
	}


       public void actionPerformed(ActionEvent e)
       {
	if(e.getSource()==xt)
		dispose();
try{
	if(e.getSource()==frt)
	{
		rs.first();
		setData();

	}
	if(e.getSource()==nxt)
	{
		rs.next();
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
}

		if(e.getSource()==del)
	{	
		if(JOptionPane.showConfirmDialog(null,"Are you sure , Do you want to Delete This Data ??","confirm",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
		try{
	PreparedStatement pstd=DataCon.con.prepareStatement("delete from Books where rsno=?");
	pstd.setInt(1,Integer.parseInt(rn.getText().toString()));
	pstd.executeUpdate();
	DataCon.con.commit();
	rs=st.executeQuery("select * from Books order by rsno");
		rs.last();
		setData();
		}catch(Exception ee){}		
	}

	if(e.getActionCommand().equals("New Entry"))
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
		ResultSet rs1=st1.executeQuery("select max(rsno) from Books");
		rs1.next();
		int rgno=rs1.getInt(1);
		rgno++;
		rn.setText(Integer.toString(rgno));


		}catch(Exception ee){System.out.println(ee);}
	}
	if(e.getActionCommand().equals("Save"))
	{
	try{
		PreparedStatement pst=DataCon.con.prepareStatement("insert into books values(?,?,?,?,?,?,?,?,?)");
		pst.setInt(1,Integer.parseInt(rn.getText()));
		pst.setString(2,tit.getText());
		pst.setString(3,aut.getText());
		pst.setString(4,edi.getText());
		pst.setString(5,pub.getText());
		pst.setString(6,pu.getText());
		pst.setString(7,da.getText());
		pst.setString(8,sub.getText());
		pst.setString(9,cop.getText());
		pst.executeUpdate();
		DataCon.con.commit();
		
		ne.setText("New Entry");
		ne.setMnemonic(KeyEvent.VK_W);
		buttonEn(true);
		textEdit(false);
	rs=st.executeQuery("select * from Books order by rsno");
		rs.last();
		setData();
		}catch(Exception ee){System.out.print(ee);}
	}


       }
}

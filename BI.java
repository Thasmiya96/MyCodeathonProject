import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.awt.Color;
import java.awt.Insets;

class BI extends JFrame implements ActionListener
{
        Statement st;
	ResultSet rs;
	int num;
	String title;
	JLabel lrn,ltit,laut,ledi,lpub,lpu,lda,lsub,lcop,lbi;
	JTextField rn,tit,aut,edi,pub,pu,da,sub,cop;
	GridBagConstraints gc;
	JButton frt,nxt,pre,lst,ca,ib,ser;
	BI()
{	
	
	setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
	getContentPane().setBackground(new Color(229,229,131));
	setSize(d.width,d.height);
      
	setLayout(new GridBagLayout());
	gc=new GridBagConstraints();
	gc.insets = new Insets(2, 2, 2,2);

	  try{
		st=DataCon.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);                               
		rs=st.executeQuery("select * from Books order by rsno");
		}catch(Exception e){}

	
	lbi=new JLabel("                                                      BOOKS ISSUE:");
	lrn=new JLabel("REGISTER NO:");
	ltit=new JLabel("TITLE :");
	laut=new JLabel("AUTHOR:");
	ledi=new JLabel("EDITION:");
	lpub=new JLabel("PUBLISHER:");
	lpu=new JLabel("PUBLICATION:");
	lda=new JLabel("DATE:");
	lsub=new JLabel("SUBJECT:");
	lcop=new JLabel("COPIES:");
	
	rn=new JTextField(10);
	tit=new JTextField(60);
	aut=new JTextField(40);
	edi=new JTextField(40);
	pub=new JTextField(40);
	pu=new JTextField(40);
	da=new JTextField(40);
	sub=new JTextField(40);
	cop=new JTextField(40);


	
	frt=new JButton("First");
	nxt=new JButton("Next");
	pre=new JButton("Previous");
	lst=new JButton("Last");
	ca=new JButton("Cancel");
	ib=new JButton("Issue Book");
	ser=new JButton("Search");

	
	
	frt.setBackground(new Color(48,124,235));
	nxt.setBackground(new Color(48,124,235));
	pre.setBackground(new Color(48,124,235));
	lst.setBackground(new Color(48,124,235));	
	ca.setBackground(new Color(48,124,235));
	ib.setBackground(new Color(48,124,235));
	ser.setBackground(new Color(48,124,235));
	
	addC(lbi,1,3,2,1);
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
	addC(new JLabel(" "),12,1,1,1);

	addC(frt,13,1,1,1);
	addC(nxt,13,2,1,1);
	addC(pre,13,3,1,1);
	addC(lst,13,4,1,1);
	addC(new JLabel(" "),14,1,1,1);
	addC(ca,15,1,1,1);
	addC(ib,15,2,1,1);
	addC(ser,15,3,1,1);


	lbi.setFont(new Font("Arial",Font.PLAIN,16)); 
	lrn.setFont(new Font("Arial",Font.PLAIN,16)); 
	ltit .setFont(new Font("Arial",Font.PLAIN,16));
	ledi .setFont(new Font("Arial",Font.PLAIN,16)); 	
	laut .setFont(new Font("Arial",Font.PLAIN,16)); 
	lpub .setFont(new Font("Arial",Font.PLAIN,16)); 
	lpu .setFont(new Font("Arial",Font.PLAIN,16)); 
	lda .setFont(new Font("Arial",Font.PLAIN,16)); 
	lsub .setFont(new Font("Arial",Font.PLAIN,16)); 
	lcop .setFont(new Font("Arial",Font.PLAIN,16)); 
 	
	rn .setFont(new Font("Arial",Font.PLAIN,16)); 	
	tit .setFont(new Font("Arial",Font.PLAIN,16));
	edi.setFont(new Font("Arial",Font.PLAIN,16));
	aut .setFont(new Font("Arial",Font.PLAIN,16));
 	pub .setFont(new Font("Arial",Font.PLAIN,16));
 	pu .setFont(new Font("Arial",Font.PLAIN,16));
 	da .setFont(new Font("Arial",Font.PLAIN,16));
 	sub .setFont(new Font("Arial",Font.PLAIN,16));
 	cop .setFont(new Font("Arial",Font.PLAIN,16));
 

 
	frt .setFont(new Font("Arial",Font.PLAIN,16)); 
	nxt .setFont(new Font("Arial",Font.PLAIN,16));
	pre .setFont(new Font("Arial",Font.PLAIN,16)); 
	lst .setFont(new Font("Arial",Font.PLAIN,16)); 
	ca .setFont(new Font("Arial",Font.PLAIN,16)); 
	ib .setFont(new Font("Arial",Font.PLAIN,16));
	ser.setFont(new Font("Arial",Font.PLAIN,16));

	
	lbi.setForeground(Color.black);
	lrn.setForeground(Color.black);
	ltit.setForeground(Color.black); 
	ledi .setForeground(Color.black);	
	laut .setForeground(Color.black);
	lpub .setForeground(Color.black);
	lpu .setForeground(Color.black);
	lda .setForeground(Color.black);
	lsub .setForeground(Color.black);
	lcop .setForeground(Color.black);
 	
	rn .setForeground(Color.black);	
	tit.setForeground(Color.black); 
	edi.setForeground(Color.black);
	aut .setForeground(Color.black);
 	pub .setForeground(Color.black);
 	da .setForeground(Color.black);
 	sub.setForeground(Color.black);
 


	frt .setMnemonic(KeyEvent.VK_F);
	nxt .setMnemonic(KeyEvent.VK_N);
	pre .setMnemonic(KeyEvent.VK_P);
	lst .setMnemonic(KeyEvent.VK_L);
	ca .setMnemonic(KeyEvent.VK_C);
	ib .setMnemonic(KeyEvent.VK_I);
	ser.setMnemonic(KeyEvent.VK_S);
	
	
	frt.addActionListener(this);
	nxt.addActionListener(this);
	pre.addActionListener(this);
	lst.addActionListener(this);
	ca.addActionListener(this);
	ib.addActionListener(this);
	ser.addActionListener(this);

	
	rn.setEditable(false);
	textEdit(false);

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
          new BI();
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
	public void buttonEn(boolean b)
	{
		frt.setEnabled(b);
		nxt.setEnabled(b);
		pre.setEnabled(b);
		lst.setEnabled(b);
		ca.setEnabled(b);
		ib.setEnabled(b);

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

       public void actionPerformed(ActionEvent e)
       {
	if(e.getSource()==ib)
	{	try{
		num=Integer.parseInt(rn.getText());
		 title=tit.getText();
			}catch(Exception o){}
		new RIB(num,title); 
	}
	if(e.getSource()==ca)
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
	
	if(e.getActionCommand().equals("Search"))
	{
		ser.setText("OK");
		ser.setMnemonic(KeyEvent.VK_O);
		rn.setEnabled(true);
		rn.setText("");
		rn.requestFocus();
		buttonEn(false);
	}
	if(e.getActionCommand().equals("OK"))
	{
	int id=Integer.parseInt(rn.getText());
		try{ 
		PreparedStatement pst1=DataCon.con.prepareStatement("select * from Books where rsno=?");
		pst1.setInt(1,id);
		ResultSet rs1=pst1.executeQuery();
		rs1.next();
		rn.setText(Integer.toString(rs1.getInt(1)));
		tit.setText(rs1.getString(2));
		aut.setText(rs1.getString(3));
		edi.setText(rs1.getString(4));
		pub.setText(rs1.getString(5));
		pu.setText(rs1.getString(6));
		da.setText(rs1.getString(7));
		sub.setText(rs1.getString(8));
		cop.setText(rs1.getString(9));
		rn.setEnabled(false);
		ser.setText("Search");
		ser.setMnemonic(KeyEvent.VK_S);
		buttonEn(true);
			
		}catch(Exception eee){
JOptionPane.showMessageDialog(null,"Register ID is invalid","Information",JOptionPane.INFORMATION_MESSAGE);

	}
	}
		
       }
}//BI cls




	


	
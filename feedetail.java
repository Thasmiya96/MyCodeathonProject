import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.awt.Insets;

class FD extends JFrame implements ActionListener
{
        
	JLabel lpd,lrn,lname,lcou,lyear,lfm,lfp;
        JTextField rn,name,cou,year,fm,fp;
	GridBagConstraints gc;
	JButton sea,ba;
	FD()
	{
	setSize(400,500);
  	setLayout(new GridBagLayout());
  	setLocation(100,200);
	getContentPane().setBackground(new Color(171,171,171));
	setLayout(new GridBagLayout());
	gc=new GridBagConstraints();
	gc.insets = new Insets(5,5,5,5);
	
	lpd=new JLabel("PAYMENT DETAILS");
	lrn=new JLabel("ROLL NO");
	lname=new JLabel("NAME");
	lcou=new JLabel("COURSE");
	lyear=new JLabel("YEAR");
	lfm=new JLabel("FEE AMOUNT");
	lfp=new JLabel("FEE PAID");

	sea=new JButton("search");
	ba=new JButton("Back");
	
	rn=new JTextField(10);	
	name=new JTextField(40);
	cou=new JTextField(10);
	year=new JTextField(10);
	fm=new JTextField(10);	
	fp=new JTextField(10);	
	

	addC(lpd,1,1,2,1);
	addC(new JLabel(" "),2,1,1,1);
	addC(lrn,3,1,2,1);
	addC(rn,3,5,2,1);
	addC(lname,4,1,2,1);
	addC(name,4,5,2,1);
	addC(lcou,5,1,2,1);
	addC(cou,5,5,2,1);
	addC(lyear,6,1,2,1);
	addC(year,6,5,2,1);
	addC(lfm,7,1,2,1);
	addC(fm,7,5,2,1);
	addC(lfp,8,1,2,1);
	addC(fp,8,5,2,1);
	addC(new JLabel(" "),9,1,2,1);
	addC(sea,10,1,2,1);
	addC(ba,10,5,2,1);
	sea.setBackground(Color.black);
  	ba.setBackground(Color.black);
	sea.setForeground(Color.white);
	ba.setForeground(Color.white);
	sea.setMnemonic(KeyEvent.VK_S);
	ba.setMnemonic(KeyEvent.VK_B);


	lpd.setFont(new Font("Arial",Font.BOLD,20)); 
	lrn.setFont(new Font("Arial",Font.BOLD,16));
	lname.setFont(new Font("Arial",Font.BOLD,16));
	lcou.setFont(new Font("Arial",Font.BOLD,16));
	lyear.setFont(new Font("Arial",Font.BOLD,16));
	lfm.setFont(new Font("Arial",Font.BOLD,16));
	lfp.setFont(new Font("Arial",Font.BOLD,16));
	sea.setFont(new Font("Arial",Font.PLAIN,16)); 
	ba .setFont(new Font("Arial",Font.PLAIN,16));
	
	sea.setMnemonic(KeyEvent.VK_S);
	ba.setMnemonic(KeyEvent.VK_B);

	sea.addActionListener(this);
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
          new FD();
       }
       public void actionPerformed(ActionEvent e)
       { 
	if(e.getSource()==ba)
		dispose();
	if(e.getSource()==sea)
	{
		try{
		        PreparedStatement pst=DataCon.con.prepareStatement("select name,cname As Course,syear,feeamt,fee_paid  from Fee,course where fee.course=Course.cid AND rollno=?"); 
			pst.setInt(1,Integer.parseInt(rn.getText()));
			ResultSet rs=pst.executeQuery();
		rs.next();
		name.setText(rs.getString(1));
		cou.setText(rs.getString(2));
		year.setText(rs.getString(3));
		fm.setText(rs.getString(4));	
		fp.setText(rs.getString(5));	
}catch(Exception ep){
JOptionPane.showMessageDialog(null,"NO data Found","Information",JOptionPane.INFORMATION_MESSAGE);
} 

	}	
       }
}//class cls

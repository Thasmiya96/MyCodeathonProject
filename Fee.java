import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.awt.Insets;

class Fee extends JFrame implements ActionListener
{
        
	JLabel lff,lrn,lname,lcou,lyear,lfm,lfp;
        JTextField rn,name,year,fm,fp;
	GridBagConstraints gc;
	JButton pay,ba;
	JComboBox<String> jcb;	
	Fee()
	{
	setSize(400,500);
  	setLayout(new GridBagLayout());
  	setLocation(100,200);
	getContentPane().setBackground(new Color(191,190,108));
	setLayout(new GridBagLayout());
	gc=new GridBagConstraints();
	gc.insets = new Insets(5,5,5,5);
	
	lff=new JLabel("FEE FORM");
	lrn=new JLabel("ROLL NO");
	lname=new JLabel("NAME");
	lcou=new JLabel("COURSE");
	lyear=new JLabel("YEAR");
	lfm=new JLabel("FEE AMOUNT");
	lfp=new JLabel("FEE PAID");

	pay=new JButton("Pay");
	ba=new JButton("Back");
	
	rn=new JTextField(10);	
	name=new JTextField(40);
	jcb = new JComboBox<String>();
	year=new JTextField(10);
	fm=new JTextField(10);	
	fp=new JTextField(10);	
	

	addC(lff,1,1,2,1);
	addC(new JLabel(" "),2,1,1,1);
	addC(lrn,3,1,2,1);
	addC(rn,3,5,2,1);
	addC(lname,4,1,2,1);
	addC(name,4,5,2,1);
	addC(lcou,5,1,2,1);
	addC(jcb,5,5,2,1);
	addC(lyear,6,1,2,1);
	addC(year,6,5,2,1);
	addC(lfm,7,1,2,1);
	addC(fm,7,5,2,1);
	addC(lfp,8,1,2,1);
	addC(fp,8,5,2,1);
	addC(new JLabel(" "),9,1,2,1);
	addC(pay,10,1,2,1);
	addC(ba,10,5,2,1);
	pay.setBackground(Color.black);
  	ba.setBackground(Color.black);
	pay.setForeground(Color.white);
	ba.setForeground(Color.white);
	pay.setMnemonic(KeyEvent.VK_P);
	ba.setMnemonic(KeyEvent.VK_B);


	lff.setFont(new Font("Arial",Font.BOLD,20)); 
	lrn.setFont(new Font("Arial",Font.BOLD,16));
	lname.setFont(new Font("Arial",Font.BOLD,16));
	lcou.setFont(new Font("Arial",Font.BOLD,16));
	lyear.setFont(new Font("Arial",Font.BOLD,16));
	lfm.setFont(new Font("Arial",Font.BOLD,16));
	lfp.setFont(new Font("Arial",Font.BOLD,16));
	pay.setFont(new Font("Arial",Font.PLAIN,16)); 
	ba .setFont(new Font("Arial",Font.PLAIN,16));
	jcb.setFont(new Font("Arial",Font.PLAIN,16));
	pay.setMnemonic(KeyEvent.VK_P);
	ba.setMnemonic(KeyEvent.VK_B);
try{
		Statement st2=DataCon.con.createStatement();
		ResultSet rs2=st2.executeQuery("select cname from Course");
		while(rs2.next())
			jcb.addItem(rs2.getString(1));
	}catch(Exception ep){System.out.println(ep);}

	pay.addActionListener(this);
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
          new Fee();
       }
       public void actionPerformed(ActionEvent e)
       {
		if(e.getSource()==ba)
		   dispose();
		if(e.getSource()==pay)
		{
			try{
		          PreparedStatement pst=DataCon.con.prepareStatement("select cid from Course where cname=?");
		pst.setString(1,jcb.getSelectedItem().toString());
		ResultSet rs=pst.executeQuery();
		rs.next();
		int cid=rs.getInt(1);	

		PreparedStatement pst1=DataCon.con.prepareStatement("Insert into Fee values(?,?,?,?,?,?)"); 
		pst1.setInt(1,Integer.parseInt(rn.getText()));
		pst1.setString(2,name.getText());
		pst1.setInt(3,cid);
		pst1.setInt(4,Integer.parseInt(year.getText()));
		pst1.setInt(5,Integer.parseInt(fm.getText()));
		pst1.setInt(6,Integer.parseInt(fp.getText()));
		pst1.executeUpdate();
		DataCon.con.commit();
		}catch(Exception ep){
JOptionPane.showMessageDialog(null,"NO data Found","Information",JOptionPane.INFORMATION_MESSAGE);
}

	rn.setText("");	
	name.setText("");
	year.setText("");
	fm.setText("");
	fp.setText("");	

		}//if cls
		
       }
}//class cls

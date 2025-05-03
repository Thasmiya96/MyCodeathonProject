import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.awt.Color;
import java.awt.Insets;

class ISB extends JFrame implements ActionListener
{
	JLabel lrn,lnp,ltb,lid,ldd,lrd,lib;
	JTextField rn,np,tb,id,dd,rd;
	GridBagConstraints gc;
	JButton ca,ok,ser;
	ISB()
{	
	
	setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
	getContentPane().setBackground(new Color(204,115,113));
	setSize(d.width/2,d.height/2);
	setLocation(d.width/4,d.height/4);
      
	setLayout(new GridBagLayout());
	gc=new GridBagConstraints();
	gc.insets = new Insets(5,5,5,5);
	
	lib=new JLabel("                 ISSUED BOOKS:");
	lrn=new JLabel("REGISTER NO:");
	lnp=new JLabel("NAME OF PERSON:");
	ltb=new JLabel("TITLE OF BOOK:");
	lid=new JLabel("ISSUED DATE:");
	ldd=new JLabel("DUE DATE:");
	lrd=new JLabel("RETURN DATE:");
	
	
	rn=new JTextField(10);
	np=new JTextField(20);
	tb=new JTextField(20);
	id=new JTextField(10);
	dd=new JTextField(10);
	rd=new JTextField(10);
	
	ca=new JButton("Cancel");
	ok=new JButton("Ok");
	ser=new JButton("Search");

	ca.setBackground(new Color(48,124,235));
	ok.setBackground(new Color(48,124,235));
	ser.setBackground(new Color(48,124,235));
	
	addC(lib,1,1,2,1);
	addC(new JLabel(" "),2,1,1,1);
	addC(lrn,3,1,2,1);
	addC(rn,3,3,2,1);
	addC(lnp,4,1,2,1);
	addC(np,4,3,2,1);
	addC(ltb,5,1,2,1);
	addC(tb,5,3,2,1);
	addC(lid,6,1,2,1);
	addC(id,6,3,2,1);
	addC(ldd,7,1,2,1);
	addC(dd,7,3,2,1);
	addC(lrd,8,1,2,1);
	addC(rd,8,3,2,1);
	addC(new JLabel(" "),9,1,1,1);
	
	addC(ca,10,1,1,1);
	addC(ser,10,3,1,1);
	addC(ok,10,5,1,2);
	


	lib.setFont(new Font("Arial",Font.PLAIN,16)); 
	lrn.setFont(new Font("Arial",Font.PLAIN,16)); 
	lnp .setFont(new Font("Arial",Font.PLAIN,16));
	ltb .setFont(new Font("Arial",Font.PLAIN,16)); 	
	lid .setFont(new Font("Arial",Font.PLAIN,16)); 
	ldd .setFont(new Font("Arial",Font.PLAIN,16)); 
	lrd .setFont(new Font("Arial",Font.PLAIN,16)); 
	
 	
	rn .setFont(new Font("Arial",Font.PLAIN,16)); 	
	np .setFont(new Font("Arial",Font.PLAIN,16));
	tb.setFont(new Font("Arial",Font.PLAIN,16));
	id .setFont(new Font("Arial",Font.PLAIN,16));
 	dd .setFont(new Font("Arial",Font.PLAIN,16));
 	rd .setFont(new Font("Arial",Font.PLAIN,16));
 	
 	ca .setFont(new Font("Arial",Font.PLAIN,16)); 
	ok .setFont(new Font("Arial",Font.PLAIN,16));
	ser .setFont(new Font("Arial",Font.PLAIN,16));

	
	lib.setForeground(Color.black);
	lrn.setForeground(Color.black);
	lnp.setForeground(Color.black); 
	ltb .setForeground(Color.black);	
	lid .setForeground(Color.black);
	ldd .setForeground(Color.black);
	lrd .setForeground(Color.black);
	
 	
	rn .setForeground(Color.black);	
	np.setForeground(Color.black); 
	tb.setForeground(Color.black);
	id .setForeground(Color.black);
 	dd .setForeground(Color.black);
 	rd .setForeground(Color.black);
 	

	ca .setMnemonic(KeyEvent.VK_C);
	ok .setMnemonic(KeyEvent.VK_O);
	ser.setMnemonic(KeyEvent.VK_S);

	ca.addActionListener(this);
	ok.addActionListener(this);
	ser.addActionListener(this);


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
          new ISB();
       }
       public void actionPerformed(ActionEvent e)
       {
		if(e.getSource()==ser)
		{
			int rid = Integer.parseInt(rn.getText());
					 try{
 PreparedStatement ps = DataCon.con.prepareStatement("SELECT name, title, issusdt, duedt FROM Issused_Detail WHERE rgno = ?");
        ps.setInt(1, rid);                
		 ResultSet rs = ps.executeQuery();
		rs.next();
		np.setText(rs.getString(1));
		tb.setText(rs.getString(2));
		id.setText(rs.getString(3));
		dd.setText(rs.getString(4));
		}catch(Exception ee){
JOptionPane.showMessageDialog(null,"NO Data Found","Information",JOptionPane.INFORMATION_MESSAGE);
}
		}

		if(e.getSource()==ca)
		{
if( JOptionPane.showConfirmDialog(null,"Do you wish to leave?", "confirm",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
			System.exit(0);

		}
		if(e.getSource()==ok)
		{
			try{
	PreparedStatement pstd=DataCon.con.prepareStatement("delete from  Issused_Detail where rgno=?");
	pstd.setInt(1,Integer.parseInt(rn.getText().toString()));
	pstd.executeUpdate();
	DataCon.con.commit();
		 }catch(Exception ep){System.out.println(ep);}
		 dispose();
		}


		
       }//action cls
}//const cls
	

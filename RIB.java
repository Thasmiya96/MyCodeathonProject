import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.awt.Color;
import java.awt.Insets;


class RIB extends JFrame implements ActionListener
{
	 int num;
    	String title;

	JLabel lrn,lnp,ltb,lid,ldd;
	JTextField rn,np,tb,id,dd;
	GridBagConstraints gc;
	JButton can,done;
	RIB(int num,String title)
{	
	 this.num = num;
        this.title = title;	
	setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
	getContentPane().setBackground(new Color(255,131,235));
	setSize(d.width/2,d.height/2);
	setLocation(d.width/4,d.height/4);
      
	setLayout(new GridBagLayout());
	gc=new GridBagConstraints();
	gc.insets = new Insets(10, 10, 10, 10);
	
	lrn=new JLabel("REGISTER NO:");
	lnp=new JLabel("NAME OF PERSON:");
	ltb=new JLabel("TITLE OF BOOK:");
	lid=new JLabel("ISSUED DATE:");
	ldd=new JLabel("DUE DATE:");
	
	rn=new JTextField(10);
	np=new JTextField(10);
	tb=new JTextField(10);
	id=new JTextField(10);
	dd=new JTextField(10);
	
	can=new JButton("Cancel");
	done=new JButton("Done");
	
	can.setBackground(new Color(48,124,235));
	done.setBackground(new Color(48,124,235));
	
	addC(lrn,1,1,2,1);
	addC(rn,1,3,2,1);
	addC(lnp,2,1,2,1);
	addC(np,2,3,2,1);
	addC(ltb,3,1,2,1);
	addC(tb,3,3,2,1);
	addC(lid,4,1,2,1);
	addC(id,4,3,2,1);
	addC(ldd,5,1,2,1);
	addC(dd,5,3,2,1);
	addC(new JLabel(" "),6,1,1,1);
	addC(can,7,1,1,1);
	addC(done,7,5,1,2);
	
	lrn.setFont(new Font("Arial",Font.PLAIN,16)); 
	lnp .setFont(new Font("Arial",Font.PLAIN,16));
	ltb .setFont(new Font("Arial",Font.PLAIN,16)); 	
	lid .setFont(new Font("Arial",Font.PLAIN,16)); 
	ldd .setFont(new Font("Arial",Font.PLAIN,16)); 
	
	
 	rn .setFont(new Font("Arial",Font.PLAIN,16)); 	
	np .setFont(new Font("Arial",Font.PLAIN,16));
	tb.setFont(new Font("Arial",Font.PLAIN,16));
	id .setFont(new Font("Arial",Font.PLAIN,16));
 	dd .setFont(new Font("Arial",Font.PLAIN,16));
 	
 	can .setFont(new Font("Arial",Font.PLAIN,16)); 
	done .setFont(new Font("Arial",Font.PLAIN,16));
	
	lrn.setForeground(Color.black);
	lnp.setForeground(Color.black); 
	ltb .setForeground(Color.black);	
	lid .setForeground(Color.black);
	ldd .setForeground(Color.black);
	
	rn .setForeground(Color.black);	
	np.setForeground(Color.black); 
	tb.setForeground(Color.black);
	id .setForeground(Color.black);
 	dd .setForeground(Color.black);
		
	rn.setText(Integer.toString(num));
	tb.setText(title); 		

 	can.setMnemonic(KeyEvent.VK_C);
	done .setMnemonic(KeyEvent.VK_D);
	
	can.addActionListener(this);
	done.addActionListener(this);
	
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
 /*      public static void main(String a[])
       {
          new RIB();
       }*/
       public void actionPerformed(ActionEvent e)
       {
	if(e.getSource()==done)
	{
		try{
		PreparedStatement pst=DataCon.con.prepareStatement("insert into Issused_Detail(rgno,name,title,issusdt,duedt)values(?,?,?,?,?)");
		pst.setInt(1,Integer.parseInt(rn.getText()));
		pst.setString(2,np.getText());
		pst.setString(3,tb.getText());
		pst.setString(4,id.getText());
		pst.setString(5,dd.getText());
		pst.executeUpdate();
		DataCon.con.commit();
		dispose();
	}catch(Exception ee){}
	}
	if(e.getSource()==can)
		dispose();

       }
}//RIB cls

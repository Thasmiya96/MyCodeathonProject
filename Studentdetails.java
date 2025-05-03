import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel; 
import java.util.ArrayList;

class fstYearData extends JFrame implements ActionListener
{
	JScrollPane pane;
	JButton b;

	fstYearData()
	{
	Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
	setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	setSize(d.width,d.height);
        setLayout(new BorderLayout());
    	setUndecorated(true);
	try{
	Statement st=DataCon.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
	ResultSet rs=st.executeQuery("SELECT rid, name, dad, mom, dob, addr, phno, email,cname AS Course, styear FROM Student,Course WHERE Student.groupname = Course.cid AND  styear=1");
	String[] column={"Register ID","Name of The Student"," Father Name ","Mother Name","D-O-B","Address","Phone No.","Email ID","Group","Year"};
		 ArrayList<Object[]> data = new ArrayList<>();
		while(rs.next())
			{
				Object[] row={
				rs.getInt(1),
				rs.getString(2),
				rs.getString(3),
				rs.getString(4),
				rs.getString(5),
				rs.getString(6),
				rs.getLong(7),
				rs.getString(8),
				rs.getString(9),
				rs.getInt(10)
					
		
		};
			data.add(row);
			}
		
		Object[][]  dataArray=new Object[data.size()][10];
	  	data.toArray(dataArray);
		
		DefaultTableModel model=new DefaultTableModel(dataArray,column);
		JTable tab=new JTable(model);
		pane=new JScrollPane(tab);
		getContentPane().add(pane,BorderLayout.CENTER);		
	}catch (Exception e){System.out.println(e);}
	JPanel  p=new JPanel();
	 b=new JButton("BACK");
	b.setMnemonic(KeyEvent.VK_B);	
	p.add(b);          
        add(pane, BorderLayout.CENTER);  
        add(p, BorderLayout.SOUTH);
	b.addActionListener(this);
	setVisible(true);


	}
	public static void main(String a[])
	{
		new fstYearData();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
			dispose();
	}
}

class sndyearData extends JFrame implements ActionListener
{
	JScrollPane pane;
	JButton b;

	public sndyearData()
	{
	Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
	setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	setSize(d.width,d.height);
        setLayout(new BorderLayout());
    	setUndecorated(true);
	try{
	Statement st=DataCon.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
	ResultSet rs=st.executeQuery("SELECT rid, name, dad, mom, dob, addr, phno, email,cname AS Course, styear FROM Student,Course WHERE Student.groupname = Course.cid AND  styear=2");
	String[] column={"Register ID","Name of The Student"," Father Name ","Mother Name","D-O-B","Address","Phone No.","Email ID","Group","Year"};
		 ArrayList<Object[]> data = new ArrayList<>();
		while(rs.next())
			{
				Object[] row={
				rs.getInt(1),
				rs.getString(2),
				rs.getString(3),
				rs.getString(4),
				rs.getString(5),
				rs.getString(6),
				rs.getLong(7),
				rs.getString(8),
				rs.getString(9),
				rs.getInt(10)
		
		};
			data.add(row);
			}
		
		Object[][]  dataArray=new Object[data.size()][10];
	  	data.toArray(dataArray);
		
		DefaultTableModel model=new DefaultTableModel(dataArray,column);
		JTable tab=new JTable(model);
		pane=new JScrollPane(tab);
		getContentPane().add(pane,BorderLayout.CENTER);		
	}catch (Exception e){System.out.println(e);}
	JPanel  p=new JPanel();
	 b=new JButton("BACK");
	b.setMnemonic(KeyEvent.VK_B);	
	p.add(b);          
        add(pane, BorderLayout.CENTER);  
        add(p, BorderLayout.SOUTH);
	b.addActionListener(this);
	setVisible(true);
	}
	public static void main(String a[])
	{
		new sndyearData();

	}
	public void actionPerformed(ActionEvent e)
	{
			if(e.getSource()==b)
				dispose();
	}
}

 class trdyearData extends JFrame implements ActionListener
{
	JScrollPane pane;
	JButton b;

	public trdyearData()
	{
	Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
	setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	setSize(d.width,d.height);
        setLayout(new BorderLayout());
    	setUndecorated(true);
try{
	Statement st=DataCon.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
	ResultSet rs=st.executeQuery("SELECT rid, name, dad, mom, dob, addr, phno, email,cname AS Course, styear FROM Student,Course WHERE Student.groupname = Course.cid AND  styear=3");
	String[] column={"Register ID","Name of The Student"," Father Name ","Mother Name","D-O-B","Address","Phone No.","Email ID","Group","Year"};
		 ArrayList<Object[]> data = new ArrayList<>();
		while(rs.next())
			{
				Object[] row={
				rs.getInt(1),
				rs.getString(2),
				rs.getString(3),
				rs.getString(4),
				rs.getString(5),
				rs.getString(6),
				rs.getLong(7),
				rs.getString(8),
				rs.getString(9),
				rs.getInt(10)
		
		};
			data.add(row);
			}
		
		Object[][]  dataArray=new Object[data.size()][10];
	  	data.toArray(dataArray);
		
		DefaultTableModel model=new DefaultTableModel(dataArray,column);
		JTable tab=new JTable(model);
		pane=new JScrollPane(tab);
		getContentPane().add(pane,BorderLayout.CENTER);		
	}catch (Exception e){System.out.println(e);}
	JPanel  p=new JPanel();
	 b=new JButton("BACK");
	b.setMnemonic(KeyEvent.VK_B);	
	p.add(b);          
        add(pane, BorderLayout.CENTER);  
        add(p, BorderLayout.SOUTH);
	b.addActionListener(this);
	setVisible(true);
	}
	public static void main(String a[])
	{
		new	trdyearData();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
				dispose();
	}
}

 class passOutData extends JFrame implements ActionListener
{
	JScrollPane pane;
	JButton b;

	public passOutData()
	{
	Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
	setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	setSize(d.width,d.height);
        setLayout(new BorderLayout());
    	setUndecorated(true);
try{
	Statement st=DataCon.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
	ResultSet rs=st.executeQuery(" SELECT rid, name, dad, mom, dob, addr, phno, email,cname AS Course, styear FROM Student,Course WHERE Student.groupname = Course.cid AND styear IN (2021, 2024)");
	String[] column={"Register ID","Name of The Student"," Father Name ","Mother Name","D-O-B","Address","Phone No.","Email ID","Group","Year"};
		 ArrayList<Object[]> data = new ArrayList<>();
		while(rs.next())
			{
				Object[] row={
				rs.getInt(1),
				rs.getString(2),
				rs.getString(3),
				rs.getString(4),
				rs.getString(5),
				rs.getString(6),
				rs.getLong(7),
				rs.getString(8),
				rs.getString(9),
				rs.getInt(10)
		
		};
			data.add(row);
			}
		
		Object[][]  dataArray=new Object[data.size()][10];
	  	data.toArray(dataArray);
		
		DefaultTableModel model=new DefaultTableModel(dataArray,column);
		JTable tab=new JTable(model);
		pane=new JScrollPane(tab);
		getContentPane().add(pane,BorderLayout.CENTER);		
	}catch (Exception e){System.out.println(e);}
	JPanel  p=new JPanel();
	 b=new JButton("BACK");
	b.setMnemonic(KeyEvent.VK_B);	
	p.add(b);          
        add(pane, BorderLayout.CENTER);  
        add(p, BorderLayout.SOUTH);
	b.addActionListener(this);
	setVisible(true);
	}
	public static void main(String a[])
	{
	new passOutData();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
			dispose();
	}//actioncls
}


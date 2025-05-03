import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel; 
import java.sql.*;

class D1 extends JFrame implements ActionListener
{
	JScrollPane pane;
	JButton b;
	D1()
	{
 	Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
    	setSize(d.width/2,d.height/2);
	setLocation(d.width/4,d.height/4);
	setTitle("ENGLISH Department");
   	 setLayout(new BorderLayout());

	try{
	Statement st=DataCon.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
	ResultSet rs=st.executeQuery("SELECT eid,ename,dname AS department FROM Employee,department where employee.did =department.did AND employee.did=101");
	String[] column={"Employee ID","Name of The Lecturer","Department"};
		 ArrayList<Object[]> data = new ArrayList<>();
		while(rs.next())
			{
				Object[] row={
				rs.getInt(1),
				rs.getString(2),
				rs.getString(3)
					
			};
			data.add(row);
			}
		
		Object[][]  dataArray=new Object[data.size()][4];
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
	new D1();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
			dispose();
	}
}//D1 cls
class D2 extends JFrame implements ActionListener
{
   JScrollPane pane;
	JButton b;
	D2()
	{
 	Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
    	setSize(d.width/2,d.height/2);
	setLocation(d.width/4,d.height/4);
	setTitle("Telugu Department");
   	 setLayout(new BorderLayout());

	try{
	Statement st=DataCon.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
	ResultSet rs=st.executeQuery("SELECT eid,ename,dname AS department FROM Employee,department where employee.did =department.did AND employee.did=102");
	String[] column={"Employee ID","Name of The Lecturer","Department"};
		 ArrayList<Object[]> data = new ArrayList<>();
		while(rs.next())
			{
				Object[] row={
				rs.getInt(1),
				rs.getString(2),
				rs.getString(3)
					
			};
			data.add(row);
			}
		
		Object[][]  dataArray=new Object[data.size()][4];
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
	new D2();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
			dispose();
        }
}//D2 cls
class D3 extends JFrame implements ActionListener
{
  	JScrollPane pane;
	JButton b;
	D3()
	{
 	Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
    	setSize(d.width/2,d.height/2);
	setLocation(d.width/4,d.height/4);
	setTitle("Sanskrit Department");
   	 setLayout(new BorderLayout());

	try{
	Statement st=DataCon.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
	ResultSet rs=st.executeQuery("SELECT eid,ename,dname AS department FROM Employee,department where employee.did =department.did AND employee.did=103");
	String[] column={"Employee ID","Name of The Lecturer","Department"};
		 ArrayList<Object[]> data = new ArrayList<>();
		while(rs.next())
			{
				Object[] row={
				rs.getInt(1),
				rs.getString(2),
				rs.getString(3)
					
			};
			data.add(row);
			}
		
		Object[][]  dataArray=new Object[data.size()][4];
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
	new D3();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
			dispose();
        }

}//D3 cls
class D4 extends JFrame implements ActionListener
{
	JScrollPane pane;
	JButton b;
	D4()
	{
 	Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
    	setSize(d.width/2,d.height/2);
	setLocation(d.width/4,d.height/4);
	setTitle("Hindi Department");
   	 setLayout(new BorderLayout());

	try{
	Statement st=DataCon.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
	ResultSet rs=st.executeQuery("SELECT eid,ename,dname AS department FROM Employee,department where employee.did =department.did AND employee.did=104");
	String[] column={"Employee ID","Name of The Lecturer","Department"};
		 ArrayList<Object[]> data = new ArrayList<>();
		while(rs.next())
			{
				Object[] row={
				rs.getInt(1),
				rs.getString(2),
				rs.getString(3)
					
			};
			data.add(row);
			}
		
		Object[][]  dataArray=new Object[data.size()][4];
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
	new D4();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
			dispose();
        }

}//D4 cls
class D5 extends JFrame implements ActionListener
{
	JScrollPane pane;
	JButton b;
	D5()
	{
 	Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
    	setSize(d.width/2,d.height/2);
	setLocation(d.width/4,d.height/4);
	setTitle("Urdu Department");
   	 setLayout(new BorderLayout());

	try{
	Statement st=DataCon.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
	ResultSet rs=st.executeQuery("SELECT eid,ename,dname AS department FROM Employee,department where employee.did =department.did AND employee.did=105");
	String[] column={"Employee ID","Name of The Lecturer","Department"};
		 ArrayList<Object[]> data = new ArrayList<>();
		while(rs.next())
			{
				Object[] row={
				rs.getInt(1),
				rs.getString(2),
				rs.getString(3)
					
			};
			data.add(row);
			}
		
		Object[][]  dataArray=new Object[data.size()][4];
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
	new D5();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
			dispose();
        }

}//D5 cls
class D6 extends JFrame implements ActionListener
{
	JScrollPane pane;
	JButton b;
	D6()
	{
 	Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
    	setSize(d.width/2,d.height/2);
	setLocation(d.width/4,d.height/4);
	setTitle("Computers Department");
   	 setLayout(new BorderLayout());

	try{
	Statement st=DataCon.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
	ResultSet rs=st.executeQuery("SELECT eid,ename,dname AS department FROM Employee,department where employee.did =department.did AND employee.did=106");
	String[] column={"Employee ID","Name of The Lecturer","Department"};
		 ArrayList<Object[]> data = new ArrayList<>();
		while(rs.next())
			{
				Object[] row={
				rs.getInt(1),
				rs.getString(2),
				rs.getString(3)
					
			};
			data.add(row);
			}
		
		Object[][]  dataArray=new Object[data.size()][4];
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
	new D6();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
			dispose();
        }

}//D6 cls

class D7 extends JFrame implements ActionListener
{
	JScrollPane pane;
	JButton b;
	D7()
	{
 	Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
    	setSize(d.width/2,d.height/2);
	setLocation(d.width/4,d.height/4);
	setTitle("Commerce Department");
   	 setLayout(new BorderLayout());

	try{
	Statement st=DataCon.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
	ResultSet rs=st.executeQuery("SELECT eid,ename,dname AS department FROM Employee,department where employee.did =department.did AND employee.did=107");
	String[] column={"Employee ID","Name of The Lecturer","Department"};
		 ArrayList<Object[]> data = new ArrayList<>();
		while(rs.next())
			{
				Object[] row={
				rs.getInt(1),
				rs.getString(2),
				rs.getString(3)
					
			};
			data.add(row);
			}
		
		Object[][]  dataArray=new Object[data.size()][4];
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
	new D7();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
			dispose();
        }

}//D7 cls

class D8 extends JFrame implements ActionListener
{
	JScrollPane pane;
	JButton b;
	D8()
	{
 	Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
    	setSize(d.width/2,d.height/2);
	setLocation(d.width/4,d.height/4);
	setTitle("Management Studies Department");
   	 setLayout(new BorderLayout());

	try{
	Statement st=DataCon.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
	ResultSet rs=st.executeQuery("SELECT eid,ename,dname AS department FROM Employee,department where employee.did =department.did AND employee.did=108");
	String[] column={"Employee ID","Name of The Lecturer","Department"};
		 ArrayList<Object[]> data = new ArrayList<>();
		while(rs.next())
			{
				Object[] row={
				rs.getInt(1),
				rs.getString(2),
				rs.getString(3)
					
			};
			data.add(row);
			}
		
		Object[][]  dataArray=new Object[data.size()][4];
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
	new D8();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
			dispose();
        }

}//D8 cls

class D9 extends JFrame implements ActionListener
{
	JScrollPane pane;
	JButton b;
	D9()
	{
 	Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
    	setSize(d.width/2,d.height/2);
	setLocation(d.width/4,d.height/4);
	setTitle("Bio Technologies Department");
   	 setLayout(new BorderLayout());

	try{
	Statement st=DataCon.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
	ResultSet rs=st.executeQuery("SELECT eid,ename,dname AS department FROM Employee,department where employee.did =department.did AND employee.did=109");
	String[] column={"Employee ID","Name of The Lecturer","Department"};
		 ArrayList<Object[]> data = new ArrayList<>();
		while(rs.next())
			{
				Object[] row={
				rs.getInt(1),
				rs.getString(2),
				rs.getString(3)
					
			};
			data.add(row);
			}
		
		Object[][]  dataArray=new Object[data.size()][4];
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
	new D9();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
			dispose();
        }

}//D9 cls

class D10 extends JFrame implements ActionListener
{
	JScrollPane pane;
	JButton b;
	D10()
	{
 	Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
    	setSize(d.width/2,d.height/2);
	setLocation(d.width/4,d.height/4);
	setTitle("Botany Department");
   	 setLayout(new BorderLayout());

	try{
	Statement st=DataCon.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
	ResultSet rs=st.executeQuery("SELECT eid,ename,dname AS department FROM Employee,department where employee.did =department.did AND employee.did=110");
	String[] column={"Employee ID","Name of The Lecturer","Department"};
		 ArrayList<Object[]> data = new ArrayList<>();
		while(rs.next())
			{
				Object[] row={
				rs.getInt(1),
				rs.getString(2),
				rs.getString(3)
					
			};
			data.add(row);
			}
		
		Object[][]  dataArray=new Object[data.size()][4];
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
	new D10();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
			dispose();
        }

}//D10 cls

class D11 extends JFrame implements ActionListener
{
	JScrollPane pane;
	JButton b;
	D11()
	{
 	Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
    	setSize(d.width/2,d.height/2);
	setLocation(d.width/4,d.height/4);
	setTitle("Mathematics Department");
   	 setLayout(new BorderLayout());

	try{
	Statement st=DataCon.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
	ResultSet rs=st.executeQuery("SELECT eid,ename,dname AS department FROM Employee,department where employee.did =department.did AND employee.did=111");
	String[] column={"Employee ID","Name of The Lecturer","Department"};
		 ArrayList<Object[]> data = new ArrayList<>();
		while(rs.next())
			{
				Object[] row={
				rs.getInt(1),
				rs.getString(2),
				rs.getString(3)
					
			};
			data.add(row);
			}
		
		Object[][]  dataArray=new Object[data.size()][4];
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
	new D11();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
			dispose();
        }

}//D11 cls

class D12 extends JFrame implements ActionListener
{
	JScrollPane pane;
	JButton b;
	D12()
	{
 	Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
    	setSize(d.width/2,d.height/2);
	setLocation(d.width/4,d.height/4);
	setTitle("Electronics Department");
   	 setLayout(new BorderLayout());

	try{
	Statement st=DataCon.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
	ResultSet rs=st.executeQuery("SELECT eid,ename,dname AS department FROM Employee,department where employee.did =department.did AND employee.did=112");
	String[] column={"Employee ID","Name of The Lecturer","Department"};
		 ArrayList<Object[]> data = new ArrayList<>();
		while(rs.next())
			{
				Object[] row={
				rs.getInt(1),
				rs.getString(2),
				rs.getString(3)
					
			};
			data.add(row);
			}
		
		Object[][]  dataArray=new Object[data.size()][4];
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
	new D12();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
			dispose();
        }

}//D12 cls

class D13 extends JFrame implements ActionListener
{
	JScrollPane pane;
	JButton b;
	D13()
	{
 	Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
    	setSize(d.width/2,d.height/2);
	setLocation(d.width/4,d.height/4);
	setTitle("Physics Department");
   	 setLayout(new BorderLayout());

	try{
	Statement st=DataCon.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
	ResultSet rs=st.executeQuery("SELECT eid,ename,dname AS department FROM Employee,department where employee.did =department.did AND employee.did=113");
	String[] column={"Employee ID","Name of The Lecturer","Department"};
		 ArrayList<Object[]> data = new ArrayList<>();
		while(rs.next())
			{
				Object[] row={
				rs.getInt(1),
				rs.getString(2),
				rs.getString(3)
					
			};
			data.add(row);
			}
		
		Object[][]  dataArray=new Object[data.size()][4];
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
	new D13();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
			dispose();
        }

}//D3 cls

class D14 extends JFrame implements ActionListener
{
	JScrollPane pane;
	JButton b;
	D14()
	{
 	Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
    	setSize(d.width/2,d.height/2);
	setLocation(d.width/4,d.height/4);
	setTitle("Staticistic Department");
   	 setLayout(new BorderLayout());

	try{
	Statement st=DataCon.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
	ResultSet rs=st.executeQuery("SELECT eid,ename,dname AS department FROM Employee,department where employee.did =department.did AND employee.did=114");
	String[] column={"Employee ID","Name of The Lecturer","Department"};
		 ArrayList<Object[]> data = new ArrayList<>();
		while(rs.next())
			{
				Object[] row={
				rs.getInt(1),
				rs.getString(2),
				rs.getString(3)
					
			};
			data.add(row);
			}
		
		Object[][]  dataArray=new Object[data.size()][4];
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
	new D14();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
			dispose();
        }

}//D14 cls

class D15 extends JFrame implements ActionListener
{
	JScrollPane pane;
	JButton b;
	D15()
	{
 	Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
    	setSize(d.width/2,d.height/2);
	setLocation(d.width/4,d.height/4);
	setTitle("Non Teaching staff Department");
   	 setLayout(new BorderLayout());

	try{
	Statement st=DataCon.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
	ResultSet rs=st.executeQuery("SELECT eid,ename,dname AS department FROM Employee,department where employee.did =department.did AND employee.did=115");
	String[] column={"Employee ID","Name of The Lecturer","Department"};
		 ArrayList<Object[]> data = new ArrayList<>();
		while(rs.next())
			{
				Object[] row={
				rs.getInt(1),
				rs.getString(2),
				rs.getString(3)
					
			};
			data.add(row);
			}
		
		Object[][]  dataArray=new Object[data.size()][4];
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
	new D15();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
			dispose();
        }

}//D15 cls


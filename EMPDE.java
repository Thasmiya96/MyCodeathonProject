import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel; 
import java.util.ArrayList;

public class EMPDE extends JFrame implements ActionListener
{
JScrollPane pane;
JButton b;
	public EMPDE()
	{
	Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
	setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	setSize(d.width,d.height);
        setLayout(new BorderLayout());
    	setUndecorated(true);
	try{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","thasmiya");
	Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
	ResultSet rs=st.executeQuery("SELECT eid,ename,email,qualify,joindt,resigndt, sal,dname AS department FROM Employee,department where employee.did =department.did");
	String[] column={"Employee id","Name","Email ID","Qualification","Joining Data","Resigning Data","Salary","Department"};
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
				rs.getString(7),
				rs.getString(8),
				
		
		};
			data.add(row);
			}
		
		Object[][]  dataArray=new Object[data.size()][7];
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

	}//constructor clss
public static void main(String a[])
{
	new EMPDE();
}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
			dispose();
	}

}//class cls

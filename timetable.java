import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel; 
import java.util.ArrayList;

class timetable extends JFrame implements ActionListener
{
	JScrollPane pane;
	JButton b;
	timetable()
{
	Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
	setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	setSize(d.width,d.height);
        setLayout(new BorderLayout());
    	setUndecorated(true);
	String[] column={"","1","2","3","4","5","6","7"};
	Object[][] data=new Object[][]{
		{"","9-10","10-11","11.10-12.10","12.10-1.10","2-2.50","2.50-3.40","3.40-4.40"},
		{"I COMP A","II_Lan_Sriramulu/Bharath","Comp_Yaswanth","Grammar Class","Chemistry_Malli Sir","Physics_Raman","English_MK","Maths_Uday"},
		{"I COMP B","II_Lan_Sriramulu/Bharath","Comp_Yaswanth","English_MK","Chemistry_Malli Sir","Physics_Raman","Grammar Class","Maths_Uday"},
		{"I DATA SC","II_Lan_Sriramulu/Bharath","Comp_Yaswanth","Grammar Class","Chemistry_Malli Sir","Physics_Raman","English_Sujatha","Maths_Uday"},
		{"I BCA A","BO_Raju Sir","II_Lan_Sriramulu/Bharath","Commerce_Raju Sir","English_MK","Comp_Rajanikanth","Sanskrit_Bharath","Grammar Class"},
		{"I BCA B","English_Sujatha","II_Lan_Sriramulu/Bharath","Grammar Class","Fund_Com_Jayaram","Comp_Rajanikanth","BO_Raju Sir","Grammar Class"},
		{"I BCA AI","Grammar Class","Commerce_Raju Sir","Grammar Class","BO_Raju Sir","Comp_Raghava","II_Lan_Sriramulu/Bharath","English_MK"},
		{"I BCOM A","Fund_Com_Raji","English_MK","II_Lan_Sriramulu/Bharath","Grammar Class","BO_Chandra Sir","Grammar Class","Comp_Reddeppa"},
		{"I BCOM B","Comp_Harith","Grammar Class","II_Lan_Sriramulu/Bharath","Fund_Com_Raji","English_Sujatha","BO_Chandra Sir","Grammar Class"},
		{"I BCOM C","Grammar Class","Fund_Com_Jayaram","English_Sujatha","BO_JK","Comp_Reddeppa","II_Lan_Sriramulu/Bharath","English_Sujatha"},
		{"I BBA","Grammar Class","English_Sujatha","II_Lan_Sriramulu/Bharath","Grammar Class","BO_Raji","FOC_Jayaram","Comp_Harith"},
		{"I BIO","BIO_Ramay","Grammar Class","Classi Bio_Madhavi","II_Lan_Sriramulu/Bharath","English_MK","BIO_Ramay","Grammar Class"},
		{"I BOTANY","BIO_Ramay","Grammar Class","Classi Bio_Madhavi","II_Lan_Sriramulu/Bharath","English_MK","BIO_Ramay","Grammar Class"},
		{"II COPM A","OS_Mahesh","Comp_Lab","Java_Rajainikanth","HealthHygien_Madhavi","DS_Harith","Monor_M_S_E_P_FM","CO_Raghva"},
		{"II COPM B","OS_Mahesh","Comp_Lab","Java_Rajainikanth","HealthHygien_Madhavi","DS_Harith","Monor_M_S_E_P_FM","CO_Raghva"},
		{"II BSC DS","Stats_Hemasekhar","Java_Rajainikanth","Web_Kavitha","Python_Durga","Datamining_Mahesh","Monor_M_S_E_P_FM","Comp_Lab"},
		{"II BCA A","Java_Rajainikanth","Maths_Uday","SE_Harith","Comp_lab","Python_Durga","Monor_M_S_E_P_FM","DBMS_Mahesh"},
		{"II BCA B","Comp_Lab","Java_Rajainikanth","Maths_Uday","SE_Harith","Python_Durga","Monor_M_S_E_P_FM","DBMS_Mahesh"},
		{"II BCA AI","Maths_Uday","DBMS_Harith","Comp_lab","Java_Rajainikanth","Python_Durga","Monor_M_S_E_P_FM","AI_Durga"},		
		{"II BIOTECH","Comp_Lab","Bio_ramya","Bio_ramya","Imunology_Madhavi","Bio_ramya","e-Commrc_Reddeppa","Bio_ramya"},
		{"II BOTANY","Comp_Lab","Grammar Class","Bio_ramya","Imunology_Madhavi","Botany_Ramesh","e-Commrc_Reddeppa","bio_Ramya"},
		{"III MPCS","Softskills","PHP_Mahesh","Physics_Raghava","Maths_Uday","Maths_Uday","Web_Mahesh","Physics_Ramesh"},
		{"III MSCS","Softskills","PHP_Mahesh","Stats Hemasekar","Maths_Uday","Maths_Uday","Web_Mahesh","Stats Hemasekar"},
		{"III MECS","Electronics_Raghava","PHP_Mahesh","Electronics_Raghava","Maths_Uday","Maths_Uday","Web_Mahesh","Softskills"},
		{"III BIO","Bio_Ramya","R_Lang_Kavitha","Chemistry_Malli Sir","Chemistry_Malli Sir","Bio_Ramya","Python_Kavitha","Softskills"},
		{"III BZC","Bio_Ramya","Zoology_Madhavi","Chemistry_Malli Sir","Chemistry_Malli Sir","Zoology_Madavi","Botany_Ramesh","Softskills"},
		{"II BCOM A","E Commerce_Reddeppa","Income_Tax_Naik","DIgi_Marketing_Chandra","Aptitude_Harish","FM_JK","Comp Lab","Accounts_Venu Sir"},
		{"II BCOM B","Accounts_Venu Sir","E Commerce_Reddeppa","Comp Lab","Aptitude_Harish","Income_Tax_Naik","DIgi_Marketing_raji","FM_JK"},
		{"II BCOM C","Income_Tax_Naik","FM_JK","E Commerce_Reddeppa","Aptitude_Harish","Accounts_Venu Sir","Comp Lab","Accounts_Venu Sir"},
		{"II BCOM D","FM_JK","Comp Lab","Dig-Market_Ramana","Aptitude_Harish","Income_tax_Naik","Dig_market -Raji","FM_JK"},
		{"III BCOM A","Comp Lab","Advt_Chandra","management_raji","Costing_Naik","R_Lang_Kavitha","Python_Rajanikanth","Sales_Ramana"},
		{"III BCOM B","Sales_Ramana","management_raji","Costing_Naik","R_Lang_Kavitha","Comp Lab","Python_Rajanikanth","Advt_Chandra"},
		{"II BBA","BE_Chandra","HealthHygien_madhavi","OB_jayaram","B_Stats_Hemasekar","E_com Reddeppa","B_Law Jayaram","Comp_Lab"},
		{"III BBA","Talent_man_Jayaram","For_Exc_Ramana","Brand_Man_JK","Leardership_Chandra","Export_Ramana","E_payment_haritha","Grammer Class"},
		{"III BCA A","Mobile App_Durga","ML_Durga","IOT_Durga","PC_raghava","Comp Lab","Cyber Security_Durga","Digital Image_Kavitha"},
		{"III BCA B","Mobile App_Durga","ML_Durga","IOT_Durga","PC_raghava","Comp Lab","Cyber Security_Durga","Digital Image_Kavitha"},
		
	};
		DefaultTableModel model=new DefaultTableModel(data,column);
		JTable tab=new JTable(model);
		pane=new JScrollPane(tab);
		getContentPane().add(pane,BorderLayout.CENTER);
	JPanel  p=new JPanel();
	 b=new JButton("BACK");
	b.setMnemonic(KeyEvent.VK_B);	

	p.add(b);          
        add(pane, BorderLayout.CENTER);  
        add(p, BorderLayout.SOUTH);
	b.addActionListener(this);
		
	setVisible(true);

	}
	public void actionPerformed(ActionEvent e)
	{	if(e.getSource()==b)
		dispose();
	}
}
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

class CMS extends JFrame implements ActionListener
{	
        Statement st;
	ResultSet rs;
	JMenuBar mb;	
	JMenu adm,dat,emp,std,mins,depts,cou,lib,fee,result,abo;
	JMenuItem lin,lot,xit,tb,empde,empdata,admis,ftstd,scestd,trdstd,paotstd,bokde,bokis,isdbok,stde,feeform,paymentde,marks,report,prom,about;
	JMenuItem d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12,d13,d14,d15,s1,s2,s3,s4,s5,s6,s7,s8;   
  	CMS()
	{
    	setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    	Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
    	setSize(d.width,d.height);
   	setUndecorated(true);
	getContentPane().setBackground(Color.black);

        ImageIcon i= new ImageIcon("D:\\Projects Files\\codeathon\\img\\clg.jpg");
        Image ii = i.getImage().getScaledInstance(1500, 650, Image.SCALE_DEFAULT);
        ImageIcon iii = new ImageIcon(ii);
        JLabel image1 = new JLabel(iii);
        ImageIcon i1 = new ImageIcon("D:\\Projects Files\\codeathon\\img\\college.jpg");
 	 Image i2 = i1.getImage().getScaledInstance(1500, 150, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);



    	mb=new JMenuBar();
    	mb.setBackground(Color.DARK_GRAY);
   
  
	
    	adm=new JMenu("Admin");
	mins=new JMenu("Adminstration Management");
    	dat=new JMenu("Data Management");
	lib=new JMenu("Library Management");
    	lin=new JMenuItem("Login");
    	lot=new JMenuItem("Log out");
    	xit=new JMenuItem("Exit");
    	emp=new JMenu("Employee");
    	std=new JMenu("Student");
	prom=new JMenuItem("Promotion");
	depts=new JMenu("Departments");
	abo=new JMenu("About");
	about=new JMenuItem("About");
    	tb=new JMenuItem("Time Table");
    	cou=new JMenu("Courses & Subject");
    	empde=new JMenuItem("Employee Details");
    	empdata=new JMenuItem("Employee Data");
	d1=new JMenuItem("English");
	d2=new JMenuItem("Sanskrit");
	d3=new JMenuItem("Telugu");
	d4=new JMenuItem("Hindi");
	d5=new JMenuItem("Urdu");
	d6=new JMenuItem("Computers");
	d7=new JMenuItem("Commerce");
	d8=new JMenuItem("Management Studies");
	d9=new JMenuItem("Bio-Technologies");
	d10=new JMenuItem("Botany");
	d11=new JMenuItem("Mathematics");
	d12=new JMenuItem("Electronics");
	d13=new JMenuItem("Physics");
	d14=new JMenuItem("Staticstics");
	d15=new JMenuItem("Non Teaching Staff");  
	s1= new JMenuItem("BBA");
	s2= new JMenuItem("B.COM(CA)");
	s3= new JMenuItem("BSC(CS)");
	s4= new JMenuItem("BSC(Data Science)");
	s5= new JMenuItem("BSC(Bio-Tech)");
	s6= new JMenuItem("BSC(Botany)");
	s7= new JMenuItem("BCA");
	s8= new JMenuItem("BCA(AI)");
	admis=new JMenuItem("Student Registeration");
	ftstd=new JMenuItem("1year Student Data");
	scestd=new JMenuItem("2year Student Data");
	trdstd=new JMenuItem("3year Student Data");
	paotstd=new JMenuItem("Passout Student Data");
	bokde=new JMenuItem("Books Stock");
	bokis=new JMenuItem("Book Issue");
	isdbok=new JMenuItem("Issued Books");	
	stde=new JMenuItem("Student Data");
	fee=new JMenu("Fee Details");
	result=new JMenu("Result Details");
	feeform=new JMenuItem("Fee Form");
	paymentde=new JMenuItem("Fee Paid Details ");
	marks=new JMenuItem("Marks");
	report=new JMenuItem("Results");

        add(image, BorderLayout.CENTER);  
        add(image1, BorderLayout.SOUTH);
	setJMenuBar(mb);

    mb.add(adm);
    mb.add(dat);
    mb.add(mins);
    mb.add(lib);
    mb.add(fee);
    mb.add(result);
    mb.add(abo);		
    adm.add(lin);
    adm.addSeparator();
    adm.add(lot);
    adm.addSeparator();
    adm.add(xit);
	
abo.setForeground(new Color(235,48,48));
adm.setForeground(new Color(235,48,48));
dat.setForeground(new Color(52,187,172));
mins.setForeground(new Color(235,48,48));
lib.setForeground(new Color(52,187,172));
fee.setForeground(new Color(235,48,48));
result.setForeground(new Color(52,187,172));
prom.setBackground(new Color(79,79,79));
prom.setForeground(Color.white);
ftstd.setBackground(new Color(79,79,79));
ftstd.setForeground(Color.white);
admis.setForeground(Color.white);
admis.setBackground(new Color(79,79,79));
lin.setBackground(new Color(79,79,79));
lin.setForeground(Color.white);
lin.setBackground(new Color(79,79,79));
lin.setForeground(Color.white);
lot.setBackground(new Color(79,79,79));
lot.setForeground(Color.white);
xit.setBackground(new Color(79,79,79));
xit.setForeground(Color.white);
tb.setBackground(new Color(79,79,79));
tb.setForeground(Color.white);
empde.setBackground(new Color(79,79,79));
empde.setForeground(Color.white);
empdata.setBackground(new Color(79,79,79));
empdata.setForeground(Color.white);
scestd.setBackground(new Color(79,79,79));
scestd.setForeground(Color.white);
trdstd.setBackground(new Color(79,79,79));
trdstd.setForeground(Color.white);
paotstd.setBackground(new Color(79,79,79));
paotstd.setForeground(Color.white);
bokde.setBackground(new Color(79,79,79));
bokde.setForeground(Color.white);
bokis.setBackground(new Color(79,79,79));
bokis.setForeground(Color.white);
isdbok.setBackground(new Color(79,79,79));
isdbok.setForeground(Color.white);
stde.setBackground(new Color(79,79,79));
stde.setForeground(Color.white);
feeform.setBackground(new Color(79,79,79));
feeform.setForeground(Color.white);
paymentde.setBackground(new Color(79,79,79));
paymentde.setForeground(Color.white);
marks.setBackground(new Color(79,79,79));
marks.setForeground(Color.white);
report.setBackground(new Color(79,79,79));
report.setForeground(Color.white);
about.setBackground(new Color(79,79,79));
about.setForeground(Color.white);

d1.setBackground(new Color(79,79,79));
d1.setForeground(Color.white);
d2.setBackground(new Color(79,79,79));
d2.setForeground(Color.white);
d3.setBackground(new Color(79,79,79));
d3.setForeground(Color.white);
d4.setBackground(new Color(79,79,79));
d4.setForeground(Color.white);
d5.setBackground(new Color(79,79,79));
d5.setForeground(Color.white);
d6.setBackground(new Color(79,79,79));
d6.setForeground(Color.white);
d7.setBackground(new Color(79,79,79));
d7.setForeground(Color.white);
d8.setBackground(new Color(79,79,79));
d8.setForeground(Color.white);
d9.setBackground(new Color(79,79,79));
d9.setForeground(Color.white);
d10.setBackground(new Color(79,79,79));
d10.setForeground(Color.white);
d11.setBackground(new Color(79,79,79));
d11.setForeground(Color.white);
d12.setBackground(new Color(79,79,79));
d12.setForeground(Color.white);
d13.setBackground(new Color(79,79,79));
d13.setForeground(Color.white);
d14.setBackground(new Color(79,79,79));
d14.setForeground(Color.white);
d15.setBackground(new Color(79,79,79));
d15.setForeground(Color.white);
s1.setBackground(new Color(79,79,79));
s1.setForeground(Color.white);
s2.setBackground(new Color(79,79,79));
s2.setForeground(Color.white);
s3.setBackground(new Color(79,79,79));
s3.setForeground(Color.white);
s4.setBackground(new Color(79,79,79));
s4.setForeground(Color.white);
s5.setBackground(new Color(79,79,79));
s5.setForeground(Color.white);
s6.setBackground(new Color(79,79,79));
s6.setForeground(Color.white);
s7.setBackground(new Color(79,79,79));
s7.setForeground(Color.white);
s8.setBackground(new Color(79,79,79));
s8.setForeground(Color.white);

   dat.add(emp);
    dat.addSeparator();
    dat.add(std);
    mins.add(tb);
    mins.addSeparator();
    mins.add(cou);
    mins.addSeparator();
    emp.add(empde);
    emp.addSeparator();
    emp.add(empdata);
    mins.add(depts);
	depts.add(d1);
	depts.addSeparator();
	depts.add(d2);
	depts.addSeparator();
	depts.add(d3);
	depts.addSeparator();
	depts.add(d4);
	depts.addSeparator();
	depts.add(d5);
	depts.addSeparator();
	depts.add(d6);
	depts.addSeparator();
	depts.add(d7);
	depts.addSeparator();
	depts.add(d8);
	depts.addSeparator();
	depts.add(d9);
	depts.addSeparator();
	depts.add(d10);
	depts.addSeparator();
	depts.add(d11);
	depts.addSeparator();
	depts.add(d12);
	depts.addSeparator();
	depts.add(d13);
	depts.addSeparator();
	depts.add(d14);
	depts.addSeparator();
	depts.add(d15);
	cou.add(s1);
	cou.addSeparator();
	cou.add(s2);
	cou.addSeparator();
	cou.add(s3);
	cou.addSeparator();
	cou.add(s4);
	cou.addSeparator();
	cou.add(s5);
	cou.addSeparator();
	cou.add(s6);
	cou.addSeparator();
	cou.add(s7);
	cou.addSeparator();
	cou.add(s8);

	std.add(admis);
	std.addSeparator();
	std.add(ftstd);
	std.addSeparator();
	std.add(scestd);
	std.addSeparator();
	std.add(trdstd);
	std.addSeparator();
	std.add(paotstd);
	std.addSeparator();
	std.add(stde);
	std.addSeparator();
	std.add(prom);
	lib.add(bokde);
	lib.addSeparator();
	lib.add(bokis);
	lib.addSeparator();
	lib.add(isdbok);	
	fee.add(feeform);
	fee.addSeparator();
	fee.add(paymentde);
	result.add(marks);
	result.addSeparator();
	result.add(report);
	abo.add(about);

        adm .setMnemonic(KeyEvent.VK_A);
	mins.setMnemonic(KeyEvent.VK_M);
	dat .setMnemonic(KeyEvent.VK_D);
	lib.setMnemonic(KeyEvent.VK_L);
	lin .setMnemonic(KeyEvent.VK_L);
	lot .setMnemonic(KeyEvent.VK_O);
	xit.setMnemonic(KeyEvent.VK_X);
	emp .setMnemonic(KeyEvent.VK_E);
	std .setMnemonic(KeyEvent.VK_S);
	tb .setMnemonic(KeyEvent.VK_T);
        cou .setMnemonic(KeyEvent.VK_C);
	empde.setMnemonic(KeyEvent.VK_T);
        empdata.setMnemonic(KeyEvent.VK_D);
	depts.setMnemonic(KeyEvent.VK_D);
	bokde.setMnemonic(KeyEvent.VK_S);
	bokis.setMnemonic(KeyEvent.VK_B);
	isdbok.setMnemonic(KeyEvent.VK_I);	
	fee.setMnemonic(KeyEvent.VK_F);	
	result.setMnemonic(KeyEvent.VK_R);	
	ftstd.setMnemonic(KeyEvent.VK_1);
	scestd.setMnemonic(KeyEvent.VK_2);
	trdstd.setMnemonic(KeyEvent.VK_3);
	paotstd.setMnemonic(KeyEvent.VK_P);	
	prom.setMnemonic(KeyEvent.VK_O);
	admis.setMnemonic(KeyEvent.VK_R);
	stde.setMnemonic(KeyEvent.VK_S);


	abo.setFont(new Font("Arial",Font.BOLD,21));
        adm.setFont(new Font("Arial",Font.BOLD,21));
	mins.setFont(new Font("Arial",Font.BOLD,21));
	dat.setFont(new Font("Arial",Font.BOLD,21));
	lib.setFont(new Font("Arial",Font.BOLD,21));
	fee.setFont(new Font("Arial",Font.BOLD,21));
	result.setFont(new Font("Arial",Font.BOLD,21));
        lin .setFont(new Font("Arial",Font.PLAIN,18));
	lot .setFont(new Font("Arial",Font.PLAIN,18));
	xit .setFont(new Font("Arial",Font.PLAIN,18)); 	
	emp .setFont(new Font("Arial",Font.PLAIN,18)); 
	std .setFont(new Font("Arial",Font.PLAIN,18)); 	
	tb .setFont(new Font("Arial",Font.PLAIN,18)); 
	cou .setFont(new Font("Arial",Font.PLAIN,18)); 
	empde.setFont(new Font("Arial",Font.PLAIN,18)); 
	empdata.setFont(new Font("Arial",Font.PLAIN,18));
	depts.setFont(new Font("Arial",Font.PLAIN,18));
	bokde.setFont(new Font("Arial",Font.PLAIN,18));
	bokis.setFont(new Font("Arial",Font.PLAIN,18));
	isdbok.setFont(new Font("Arial",Font.PLAIN,18));
	admis.setFont(new Font("Arial",Font.PLAIN,16));
	ftstd.setFont(new Font("Arial",Font.PLAIN,16));
	scestd.setFont(new Font("Arial",Font.PLAIN,16));
	trdstd.setFont(new Font("Arial",Font.PLAIN,16));
	prom.setFont(new Font("Arial",Font.PLAIN,16));
	paotstd.setFont(new Font("Arial",Font.PLAIN,16));
	stde.setFont(new Font("Arial",Font.PLAIN,16));
	d1.setFont(new Font("Arial",Font.PLAIN,16));
	d2.setFont(new Font("Arial",Font.PLAIN,16));
	d3.setFont(new Font("Arial",Font.PLAIN,16));
	d4.setFont(new Font("Arial",Font.PLAIN,16));
	d5.setFont(new Font("Arial",Font.PLAIN,16));
	d6.setFont(new Font("Arial",Font.PLAIN,16));
	d7.setFont(new Font("Arial",Font.PLAIN,16));
	d8.setFont(new Font("Arial",Font.PLAIN,16));
	d9.setFont(new Font("Arial",Font.PLAIN,16));
	d10.setFont(new Font("Arial",Font.PLAIN,16));
	d11.setFont(new Font("Arial",Font.PLAIN,16));
	d12.setFont(new Font("Arial",Font.PLAIN,16));
	d13.setFont(new Font("Arial",Font.PLAIN,16));
	d14.setFont(new Font("Arial",Font.PLAIN,16));
	d15.setFont(new Font("Arial",Font.PLAIN,16));  
	s1.setFont(new Font("Arial",Font.PLAIN,16));
	s2.setFont(new Font("Arial",Font.PLAIN,16));
	s3.setFont(new Font("Arial",Font.PLAIN,16));
	s4.setFont(new Font("Arial",Font.PLAIN,16));
	s5.setFont(new Font("Arial",Font.PLAIN,16));
	s6.setFont(new Font("Arial",Font.PLAIN,16));
	s7.setFont(new Font("Arial",Font.PLAIN,16));
	s8.setFont(new Font("Arial",Font.PLAIN,16));
	feeform.setFont(new Font("Arial",Font.PLAIN,16));
	paymentde.setFont(new Font("Arial",Font.PLAIN,16));
	marks.setFont(new Font("Arial",Font.PLAIN,16));
	report.setFont(new Font("Arial",Font.PLAIN,16));


	lin .addActionListener(this);
	lot .addActionListener(this);
	xit.addActionListener(this);
	emp .addActionListener(this);
	std .addActionListener(this);
	tb .addActionListener(this);
        cou .addActionListener(this);
	empde.addActionListener(this);
	empdata.addActionListener(this);
	admis.addActionListener(this);
	ftstd.addActionListener(this);
	scestd.addActionListener(this);
	trdstd.addActionListener(this);
	paotstd.addActionListener(this);
	stde.addActionListener(this);
	bokde.addActionListener(this);
	bokis.addActionListener(this);
	isdbok.addActionListener(this);
	d1.addActionListener(this);
	d2.addActionListener(this);
	d3.addActionListener(this);
	d4.addActionListener(this);
	d5.addActionListener(this);
	d6.addActionListener(this);
	d7.addActionListener(this);
	d8.addActionListener(this);
	d9.addActionListener(this);
	d10.addActionListener(this);
	d11.addActionListener(this);
	d12.addActionListener(this);
	d13.addActionListener(this);
	d14.addActionListener(this);
	d15.addActionListener(this);  
	s1.addActionListener(this);
	s2.addActionListener(this);
	s3.addActionListener(this);
	s4.addActionListener(this);
	s5.addActionListener(this);
	s6.addActionListener(this);
	s7.addActionListener(this);
	s8.addActionListener(this);
	feeform.addActionListener(this);
	paymentde.addActionListener(this);
	marks.addActionListener(this);
	report.addActionListener(this);
	prom.addActionListener(this);	
	about.addActionListener(this);
	dat.setEnabled(false);
	lot.setEnabled(false);
	lib.setEnabled(false);
	fee.setEnabled(false);
	result.setEnabled(false);

       setVisible(true);
}
public static void main(String a[])
{
    new CMS();
}
public void actionPerformed(ActionEvent e)
{
	
	if(e.getSource()==xit)
	{
	if(JOptionPane.showConfirmDialog(null,"Are you sure , Do you want to Exit ??","confirm",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
	  System.exit(0);
	
	}
	if(e.getSource()==lin)
	{
		new Login(this);
		
	}
	if(e.getSource()==lot)
	{
		lin.setEnabled(true);
		xit.setEnabled(true);
		lot.setEnabled(false);
		dat.setEnabled(false);
		lib.setEnabled(false);
		result.setEnabled(false);
		fee.setEnabled(false);
	}
	
	if(e.getSource()==empdata)
		new EMP();
	if(e.getSource()==empde)
		new EMPDE();
	if(e.getSource()==admis)
		new RGSTU();	
	if(e.getSource()==ftstd)
		new fstYearData();
	if(e.getSource()==scestd)
		new sndyearData();
	if(e.getSource()==trdstd)
		new	trdyearData();
	if(e.getSource()==paotstd)
		new passOutData();
	if(e.getSource()==stde)
		new studentData();
	if(e.getSource()==tb)
		new timetable();

	if(e.getSource()==bokde)
		new BS();
	if(e.getSource()==bokis)
		new BI();
	if(e.getSource()==isdbok)
		new ISB();

	if(e.getSource()==s1)
		new BBA();
	if(e.getSource()==s2)
		new BCOM();
	if(e.getSource()==s3)
		new BSC_CS();
	if(e.getSource()==s4)
		new BSC_DS();
	if(e.getSource()==s5)
		new BSC_BT();
	if(e.getSource()==s6)
		new BSC_BO();
	if(e.getSource()==s7)
		new BCA();
	if(e.getSource()==s8)
		new BCA_AI();

	if(e.getSource()==d1)
		new D1();
	if(e.getSource()==d2)
		new D2();
	if(e.getSource()==d3)
		new D3();
	if(e.getSource()==d4)
		new D4();
	if(e.getSource()==d5)
		new D5();
	if(e.getSource()==d6)
		new D6();
	if(e.getSource()==d7)
		new D7();
	if(e.getSource()==d8)
		new D8();
	if(e.getSource()==d9)
		new D9();
	if(e.getSource()==d10)
		new D10();
	if(e.getSource()==d11)
		new D11();
	if(e.getSource()==d12)
		new D12();
	if(e.getSource()==d13)
		new D13();
	if(e.getSource()==d14)
		new D14();
	if(e.getSource()==d15)
		new D15();
	if(e.getSource()==marks)
		new EMS();	
	if(e.getSource()==report)
	          new RD();
	if(e.getSource()==feeform)
		  new Fee();
	if(e.getSource()==paymentde)
		new FD();
	if(e.getSource()==prom)
		new pro();
	if(e.getSource()==about)
		new ABO();

	}//acts
}

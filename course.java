import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class BBA extends JFrame implements ActionListener
{
	JButton b;
	BBA()
	{
 	Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
    	setSize(d.width/2,d.height/2);
	setLocation(d.width/4,d.height/4);
   	setUndecorated(true);
        setLayout(new BorderLayout());
         JTextArea textArea = new JTextArea(20, 70);
        textArea.setEditable(false);  
        String content = "Semester | CourseNo.         | Course Name                                		 | No. of Hrs/Week        | No. of Credits\n"
                       + "-------------------------------------------------------------------------------------------------------------------------\n"
                       + "Semester-I       | 1             		| Fundamentals of Commerce               		 | 4               | 4\n"
                       + "Semester-I       | 2             		| Business Organization                   		 | 4               | 4\n"
                       + "Semester-I       | 3             		| Principles of Management                		 | 4               | 4\n"
                       + "Semester-I       | 4             		| Business Economics                      			 | 4               | 4\n"
                       + "Semester-I       | 5             		| Business Law                            			 | 4               | 4\n"
                       + "Semester-I       | 6             		| Organisational Behaviour              		 | 4               | 4\n"
			+"																			\n"                     
		        + "Semester-II      | 7             		| Business Environment                    		 | 4               | 4\n"
                       + "Semester-II      | 8             		| Business Statistics and Mathematics     	 | 4               | 4\n"
                       + "Semester-II      | 9             		| Marketing Management                   		 | 4               | 4\n"
                    	+"																			\n"                     
			+"Semester-IV     | 10            		| Human Resource Management              	 | 4               | 4\n"
                       + "Semester-IV     | 11            		| Financial Management                   		 | 4               | 4\n"
                       + "Semester-IV     | 12            		| Sales and Distribution (OR) Adv. Mgmt  	 | 4               | 4\n"
                    	+"																			\n"                     
         	       + "Semester-V      | 13            		| Training & Development (OR) Labour Legis. | 4               | 4\n"
                       + "Semester-V      | 14            		| Security Analysis & Portfolio (OR)...   		 | 4               | 4\n"
                       + "Semester-V      | 15            		| Production & Operations Management      	 | 4               | 4\n"
                        +"		                 INTENSHIP									\n"  ;                   

           textArea.setText(content);

         JScrollPane scrollPane = new JScrollPane(textArea);
	add(scrollPane);
	JPanel  p=new JPanel();
	 b=new JButton("BACK");
	b.setMnemonic(KeyEvent.VK_B);	

	p.add(b);          
        add(scrollPane, BorderLayout.CENTER);  
        add(p, BorderLayout.SOUTH);
	b.addActionListener(this);



		setVisible(true);
	}
	public static void main(String a[])
	{
	new BBA();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
			dispose();
	}
}//BBA cls

class BCOM extends JFrame implements ActionListener
{
	JButton b;
	BCOM()
	{
 	Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
    	setSize(d.width/2,d.height/2);
	setLocation(d.width/4,d.height/4);
   	setUndecorated(true);
        setLayout(new BorderLayout());
         JTextArea textArea = new JTextArea(20, 70);
        textArea.setEditable(false);  
        String content = "Year  | Semester | Course  | Title of the Course                                         | No. of Hrs/Week | No. of Credits\n"
                       + "-------------------------------------------------------------------------------------------------------------\n"
                       + "I     | I        | 1      | Fundamentals of Commerce                                   | 4               | 4\n"
                       + "I     | I        | 2      | Business Organisation                                            | 4               | 4\n"
			+"																\n"
                      + "I     | II       | 3      | Financial Accounting                                              | 3               | 3\n"
                       + "I     | II       | 4      | Financial Accounting Practical Course                   | 2               | 1\n"
                       + "I     | II       |         | Office Automation Tools                                        | 3               | 3\n"
                       + "I     | II       |         | Office Automation Tools Practical Course             | 2               | 1\n"
			+"																\n"
                       + "II    | III      | 5      | Advanced Accounting                                           | 3               | 3\n"
                       + "II    | III      |         | Advanced Accounting Practical Course                | 2               | 1\n"
                       + "II    | III      | 6      | Income Tax                                                           | 3               | 3\n"
                       + "II    | III      |         | Income Tax Practical Course                                 | 2               | 1\n"
                       + "II    | III      | 7      | E-Commerce & Web Designing                            | 3               | 3\n"
                       + "II    | III      |         | E-Commerce & Web Designing Practical              | 2               | 1\n"
                       + "II    | III      | 8      | Digital Marketing                                                   | 3               | 3\n"
                       + "II    | III      |         | Digital Marketing Practical Course                        | 2               | 1\n"
			+"																\n"
                   
			+ "III   | IV      | 9      | Corporate Accounting                                           | 3               | 3\n"
                       + "III   | IV      |         | Corporate Accounting Practical Course                 | 2               | 1\n"
                       + "III   | IV      | 10    | Cost & Management Accounting                          | 3               | 3\n"
                       + "III   | IV      |         | Cost & Management Accounting Practical            | 2               | 1\n"
                       + "III   | IV      | 11    | DBMS with Oracle                                                  | 3               | 3\n"
                       + "III   | IV      |         | DBMS with Oracle Practical Course                        | 2               | 1\n"
			+"																\n"
 
                      + "III   | V       | 12    | Advertisement Corporate Accounting (OR) Advertisement and  | 3               | 3\n"
                       + "      |          |         | Media Planning                                           |                 | \n"
                       + "III   | V       |         | Advertisement Corporate Accounting (OR) Advertisement      | 2               | 1\n"
                       + "      |          |         | Media Planning Practical Course                          |                 | \n"
			+"	  |VI			INTENSHIP												\n";
           textArea.setText(content);

         JScrollPane scrollPane = new JScrollPane(textArea);
	add(scrollPane);
	JPanel  p=new JPanel();
	 b=new JButton("BACK");
	b.setMnemonic(KeyEvent.VK_B);	

	p.add(b);          
        add(scrollPane, BorderLayout.CENTER);  
        add(p, BorderLayout.SOUTH);
	b.addActionListener(this);

		setVisible(true);
	}
	public static void main(String a[])
	{
	new BCOM();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
			dispose();
	}
}//BCOM cls

class BSC_CS extends JFrame implements ActionListener
{
	JButton b;
	BSC_CS()
	{
 	Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
    	setSize(d.width/2,d.height/2);
	setLocation(d.width/4,d.height/4);
   	setUndecorated(true);
        setLayout(new BorderLayout());
         JTextArea textArea = new JTextArea(20, 70);
        textArea.setEditable(false);  
String content = "Year  | Semester | Course | Title                                                   | Hrs/Week | Credits\n"
                       + "----------------------------------------------------------------------------------------------------\n"
                       + "I     | I        | 1      | Essentials and Applications of Mathematical, Physical and Chemical Sci. 	| 5       | 4\n"
                       + "I     | I        | 2      | Advances in Mathematical, Physical and Chemical Sciences                 	| 5       | 4\n"
                       + "\n"
                       + "I     | II       | 3      | Problem Solving using C - (T)                                            				| 3       | 3\n"
                       + "I     | II       |         | Problem Solving using C - (P)                                            				| 2       | 1\n"
                       + "I     | II       | 4      | Digital Logic Design - (T)                                               					| 3       | 3\n"
                       + "I     | II       |         | Digital Logic Design - (P)                                               					| 2       | 1\n"
                       + "\n"
                       + "II    | III      | 5      | Object-Oriented Programming using Java - (T)                             		| 3       | 3\n"
                       + "II    | III      |         | Object-Oriented Programming using Java - (P)                             		| 2       | 1\n"
                       + "II    | III      | 6      | Data Structures using C - (T)                                            				| 3       | 3\n"
                       + "II    | III      |         | Data Structures using C - (P)                                            				| 2       | 1\n"
                       + "II    | III      | 7      | Computer Organization - (T)                                              				| 3       | 3\n"
                       + "II    | III      |         | Computer Organization - (P)                                              				| 2       | 1\n"
                       + "II    | III      | 8      | Operating Systems - (T)                                                  				| 3       | 3\n"
                       + "II    | III      |         | Operating Systems - (P)                                                  				| 2       | 1\n"
                       + "II    | III      | 9      | Database Management Systems - (T)                                        			| 3       | 3\n"
                       + "II    | III      |         | Database Management Systems - (P)                                        			| 2       | 1\n"
                       + "\n"
                       + "II    | IV      | 10    | Object-Oriented Software Engineering - (T)                               			| 3       | 3\n"
                       + "II    | IV      |         | Object-Oriented Software Engineering - (P)                               			| 2       | 1\n"
                       + "II    | IV      | 11    | Data Communication & Computer Networks - (T)                             		| 3       | 3\n"
                       + "II    | IV      |         | Data Communication & Computer Networks - (P)                             		| 2       | 1\n"
                       + "\n"
                       + "III   | V       | 12    | Web Interface Designing Technologies - (T)                               			| 3       | 3\n"
                       + "III   | V       |         | Web Interface Designing Technologies - (P)                               			| 2       | 1\n"
                       + "III   | V       | 13    | Web Applications Dev using PHP & MySQL - (T)                             		| 3       | 3\n"
                       + "III   | V       |         | Web Applications Dev using PHP & MySQL - (P)                             		| 2       | 1\n"
                       + "III   | V       | 14A  | Internet of Things (T)                                                   					| 3       | 3\n"
                       + "III   | V       |         | Internet of Things (P)                                                   					| 2       | 1\n"
                       + "III   | V       | 14B  | Foundations of Data Science (T)                                          				| 3       | 3\n"
                       + "III   | V       |         | Foundations of Data Science (P)                                          				| 2       | 1\n"
                       + "        VI                       INTENSHIP                                                                                              \n";
           textArea.setText(content);

         JScrollPane scrollPane = new JScrollPane(textArea);
	add(scrollPane);
	JPanel  p=new JPanel();
	 b=new JButton("BACK");
	b.setMnemonic(KeyEvent.VK_B);	

	p.add(b);          
        add(scrollPane, BorderLayout.CENTER);  
        add(p, BorderLayout.SOUTH);
	b.addActionListener(this);

		setVisible(true);
	}
	public static void main(String a[])
	{
	new BSC_CS();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
			dispose();
	}
}//CS cls

class BSC_DS extends JFrame implements ActionListener
{
	JButton b;
	BSC_DS()
	{
 	Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
    	setSize(d.width/2,d.height/2);
	setLocation(d.width/4,d.height/4);
   	setUndecorated(true);
        setLayout(new BorderLayout());
         JTextArea textArea = new JTextArea(20, 70);
        textArea.setEditable(false); 
String content ="      B.Sc. Data Science\n" 
 		 +"Year | Semester | Course |                Title of the Course             | Hrs/Week           | Credits\n" 
		+"| I        | 1      | Essentials and Applications of Mathematical, Physical, and Chemical Sciences | 3+2 | 4\n" 
		+ "I    | I        | 2      | Advances in Mathematical, Physical and Chemical Sciences | 3+2 | 4\n" 
		+"I    | II       | 3      | Introduction to Data Science and R Programming | 3 | 3\n" 
		+"I    | II       | 4      | Descriptive Statistics | 3 | 3\n"
		+"I    | II       | 5      | Python Programming for Data Analysis | 3 | 3\n" 
		+"II   | III      | 6      | Inferential and Applied Statistics | 3 | 3\n"
		+"II   | III      | 7      | Data Mining Techniques using R | 3 | 3\n" 
		+"II   | III      | 8      | Web Technologies | 3 | 3\n" 
		+"II   | IV       | 9      | Data Visualization using Tableau | 3 | 3\n" 
		+"II   | IV       | 10     | Data Visualization using Python | 3 | 3\n" 
		+"II   | IV       | 11     | Introduction to SQL & Advanced Tableau | 3 | 3\n" 
		+"III  | V        | 12     | Supervised Machine Learning with Python | 3 | 3\n" 
		+"III  | V        | 13     | Unsupervised Machine Learning with Python | 3 | 3\n" 
		+"III  | V        | 14     | Web Scraping with Python | 3 | 3\n"
		+"III   | VI             INTENSHIP                                          \n"; 
		
        textArea.setText(content);

         JScrollPane scrollPane = new JScrollPane(textArea);
	add(scrollPane);
	JPanel  p=new JPanel();
	 b=new JButton("BACK");
	b.setMnemonic(KeyEvent.VK_B);	

	p.add(b);          
        add(scrollPane, BorderLayout.CENTER);  
        add(p, BorderLayout.SOUTH);
	b.addActionListener(this);

		setVisible(true);
	}
	public static void main(String a[])
	{
	new BSC_DS();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
			dispose();
	}
}//DS cls

class BSC_BT extends JFrame implements ActionListener
{
	JButton b;
	BSC_BT()
	{
 	Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
    	setSize(d.width/2,d.height/2);
	setLocation(d.width/4,d.height/4);
   	setUndecorated(true);
        setLayout(new BorderLayout());
         JTextArea textArea = new JTextArea(20, 70);
        textArea.setEditable(false); 
String content =    "B.Sc. Honours in Biotechnology \n" +
      "Year | Semester | Course | Title of the Course | Hrs/Week | Credits\n" +
    "I    | I        | 1      | Introduction to Classical Biology | 5 | 4\n" +
    "I    | I        | 2      | Introduction to Applied Biology | 5 | 4\n" +
    "I    | II       | 3      | Biomolecules and Analytical Techniques (T) | 3 | 3\n" +
    "I    | II       | 3      | Biomolecules and Analytical Techniques (P) | 2 | 1\n" +
    "I    | II       | 4      | Microbiology, Cell Biology (T) | 3 | 3\n" +
    "I    | II       | 4      | Microbiology, Cell Biology (P) | 2 | 1\n" +
    "II   | III      | 5      | Plant and Animal Biotechnology (T) | 3 | 3\n" +
    "II   | III      | 5      | Plant and Animal Biotechnology (P) | 2 | 1\n" +
    "II   | III      | 6      | Molecular Biology (T) | 3 | 3\n" +
    "II   | III      | 6      | Molecular Biology (P) | 2 | 1\n" +
    "II   | III      | 7      | Genetic Engineering (T) | 3 | 3\n" +
    "II   | III      | 7      | Genetic Engineering (P) | 2 | 1\n" +
    "II   | IV       | 8      | Metabolism (T) | 3 | 3\n" +
    "II   | IV       | 8      | Metabolism (P) | 2 | 1\n" +
    "II   | IV       | 9      | Immunology (T) | 3 | 3\n" +
    "II   | IV       | 9      | Immunology (P) | 2 | 1\n" +
    "II   | IV       | 10     | Bioinformatics and Biostatistics (T) | 3 | 3\n" +
    "II   | IV       | 10     | Bioinformatics and Biostatistics (P) | 2 | 1\n" +
    "II   | IV       | 11     | Medical Biotechnology (T) | 3 | 3\n" +
    "II   | IV       | 11     | Medical Biotechnology (P) | 2 | 1\n" +
    "III  | V        | 12     | Industrial Biotechnology (T) | 3 | 3\n" +
    "III  | V        | 12     | Industrial Biotechnology (P) | 2 | 1\n" +
    "III  | V        | 13     | Food & Nutritional Biotechnology (T) | 3 | 3\n" +
    "III  | V        | 13     | Food & Nutritional Biotechnology (P) | 2 | 1\n" +
    "III  | V        | 14     | Gene Biotechnology OR Genomics & Proteomics (T) | 3 | 3\n" +
    "III  | V        | 14     | Gene Biotechnology OR Genomics & Proteomics (P) | 2 | 1\n" +
    "III  | V        | 15     | Nanotechnology & Pharmaceutical Biotechnology OR Applications of Biotechnology (T) | 3 | 3\n" +
    "III  | V        | 15     | Nanotechnology & Pharmaceutical Biotechnology OR Applications of Biotechnology (P) | 2 | 1\n" +
    "IV   | VI       |        | Internship (Credits, duration based on period of internship)";

textArea.setLineWrap(true);  
textArea.setWrapStyleWord(true);  

          
	textArea.setText(content);
         JScrollPane scrollPane = new JScrollPane(textArea);
	add(scrollPane);
	JPanel  p=new JPanel();
	 b=new JButton("BACK");
	b.setMnemonic(KeyEvent.VK_B);	

	p.add(b);          
        add(scrollPane, BorderLayout.CENTER);  
        add(p, BorderLayout.SOUTH);
	b.addActionListener(this);

		setVisible(true);
	}
	public static void main(String a[])
	{
	new BSC_BT();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
			dispose();
	}
}//BT cls

class BSC_BO extends JFrame implements ActionListener
{
	JButton b;
	BSC_BO()
	{
 	Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
    	setSize(d.width/2,d.height/2);
	setLocation(d.width/4,d.height/4);
   	setUndecorated(true);
        setLayout(new BorderLayout());
         JTextArea textArea = new JTextArea(20, 70);
        textArea.setEditable(false); 
	String content ="B.Sc., Honours in BOTANY\n" +
         "Year | Semester | Course | Title | Hrs/Week | Credits\n" +
    "I    | I        | 1      | Introduction to Classical Biology | 5 | 4\n" +
    "I    | I        | 2      | Introduction to Applied Biology | 5 | 4\n" +
    "I    | II       | 3      | Non-vascular Plants (T) | 3 | 3\n" +
    "I    | II       | 3      | Non-vascular Plants (P) | 2 | 1\n" +
    "I    | II       | 4      | Origin of Life and Diversity of Microbes (T) | 3 | 3\n" +
    "I    | II       | 4      | Origin of Life and Diversity of Microbes (P) | 2 | 1\n" +
    "II   | III      | 5      | Vascular Plants (T) | 3 | 3\n" +
    "II   | III      | 5      | Vascular Plants (P) | 2 | 1\n" +
    "II   | III      | 6      | Plant Pathology and Plant Diseases (T) | 3 | 3\n" +
    "II   | III      | 6      | Plant Pathology and Plant Diseases (P) | 2 | 1\n" +
    "II   | III      | 7      | Plant Breeding (T) | 3 | 3\n" +
    "II   | III      | 7      | Plant Breeding (P) | 2 | 1\n" +
    "II   | III      | 8      | Plant Biotechnology (T) | 3 | 3\n" +
    "II   | III      | 8      | Plant Biotechnology (P) | 2 | 1\n" +
    "II   | IV       | 9      | Anatomy and Embryology of Angiosperms (T) | 3 | 3\n" +
    "II   | IV       | 9      | Anatomy and Embryology of Angiosperms (P) | 2 | 1\n" +
    "II   | IV       | 10     | Plant Ecology, Biodiversity, and Phytogeography (T) | 3 | 3\n" +
    "II   | IV       | 10     | Plant Ecology, Biodiversity, and Phytogeography (P) | 2 | 1\n" +
    "II   | IV       | 11     | Plant Resources and Utilization (T) | 3 | 3\n" +
    "II   | IV       | 11     | Plant Resources and Utilization (P) | 2 | 1\n" +
    "II   | IV       | 12     | Cell Biology and Genetics (T) | 3 | 3\n" +
    "II   | IV       | 12     | Cell Biology and Genetics (P) | 2 | 1\n" +
    "II   | IV       | 13     | Plant Physiology and Metabolism (T) | 3 | 3\n" +
    "II   | IV       | 13     | Plant Physiology and Metabolism (P) | 2 | 1\n" +
    "III  | V        | 14 A   | Organic Farming (T) | 3 | 3\n" +
    "III  | V        | 14 A   | Organic Farming (P) | 2 | 1\n" +
    "III  | V        | OR     | Seed Technology (T) | 3 | 3\n" +
    "III  | V        | OR     | Seed Technology (P) | 2 | 1\n" +
    "III  | V        | 15 A   | Mushroom Culture Technology (T) | 3 | 3\n" +
    "III  | V        | 15 A   | Mushroom Culture Technology (P) | 2 | 1\n" +
    "III  | V        | OR     | Plant Propagation Techniques (T) | 3 | 3\n" +
    "III  | V        | OR     | Plant Propagation Techniques (P) | 2 | 1\n"
   +"III | VI                       INTENSHIP";

textArea.setLineWrap(true);  
textArea.setWrapStyleWord(true);  


           textArea.setText(content);

         JScrollPane scrollPane = new JScrollPane(textArea);
	add(scrollPane);
	JPanel  p=new JPanel();
	 b=new JButton("BACK");
	b.setMnemonic(KeyEvent.VK_B);	

	p.add(b);          
        add(scrollPane, BorderLayout.CENTER);  
        add(p, BorderLayout.SOUTH);
	b.addActionListener(this);

		setVisible(true);
	}
	public static void main(String a[])
	{
	new BSC_BO();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
			dispose();
	}
}//BO cls

class BCA extends JFrame implements ActionListener
{
	JButton b;
	BCA()
	{
 	Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
    	setSize(d.width/2,d.height/2);
	setLocation(d.width/4,d.height/4);
   	setUndecorated(true);
        setLayout(new BorderLayout());
         JTextArea textArea = new JTextArea(20, 70);
        textArea.setEditable(false); 

 	String content ="                                                  B.C.A. (HONOURS) Computer Applications (Major)\n" +
    "Year     Semester     Course        Title of the Course                            No. of Hrs/Week   No. of Credits\n" +
    "-------------------------------------------------------------------------------------------------------\n" +
    "I      I          1        Fundamentals of Commerce                       3+2               4\n" +
    "                 2        Business Organization                           3+2               4\n\n" +
    "       II         3        Office Automation Tools                        3                 3\n" +
    "                 4        Office Automation Tools Lab                     2                 1\n" +
    "                 5        Programming in C                                3                 3\n" +
    "                 6        Programming in C Lab                            2                 1\n\n" +
    "II     III        7        Database Management System                     3                 3\n" +
    "                 8        Database Management System Lab                  2                 1\n" +
    "                 9        Data Structures                                 3                 3\n" +
    "                10        Data Structures Lab                             2                 1\n" +
    "                11        Object Oriented Programming Through JAVA        3                 3\n" +
    "                12        Object Oriented Programming Through JAVA Lab    2                 1\n" +
    "                13        Software Engineering                            3                 3\n" +
    "                14        Software Engineering Lab                        2                 1\n\n" +
    "III    IV         15       Python Programming                             3                 3\n" +
    "                16        Python Programming Lab                          2                 1\n" +
    "                17        Operating Systems                               3                 3\n" +
    "                18        Operating Systems Lab                           2                 1\n" +
    "                19        Mobile Application Development using Android    3                 3\n" +
    "                20        Mobile Application Development using Android Lab2                 1\n" +
    "                21        Web Programming                                 3                 3\n" +
    "                22        Web Programming Lab                             2                 1\n\n" +
    "III    V          23       Web Development Using PHP & MySQL              3                 3\n" +
    "                24        Web Development Using PHP & MySQL Lab           2                 1\n" +
    "                25       Cloud Computing (OR) Machine Learning            3                 3\n" +
    "                26       Cloud Computing (OR) Machine Learning Lab        2                 1\n" +
    "                27       Software Testing (OR) Foundations of Data Science3                 3\n" +
    "                28       Software Testing (OR) Foundations of Data Science2                 1\n\n" +
    "     VI         29       Semester Internship/Apprenticeship with 12 Credits\n"
;


           textArea.setText(content);

         JScrollPane scrollPane = new JScrollPane(textArea);
	add(scrollPane);
	JPanel  p=new JPanel();
	 b=new JButton("BACK");
	b.setMnemonic(KeyEvent.VK_B);	

	p.add(b);          
        add(scrollPane, BorderLayout.CENTER);  
        add(p, BorderLayout.SOUTH);
	b.addActionListener(this);

		setVisible(true);
	}
	public static void main(String a[])
	{
	new BCA();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
			dispose();
	}
}//BCA cls

class BCA_AI extends JFrame implements ActionListener
{
	JButton b;
	BCA_AI()
	{
 	Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
    	setSize(d.width/2,d.height/2);
	setLocation(d.width/4,d.height/4);
   	setUndecorated(true);
        setLayout(new BorderLayout());
         JTextArea textArea = new JTextArea(20, 70);
        textArea.setEditable(false); 

String content =    "                                  BCA (Honours) ARTIFICIAL INTELLIGENCE\n\n" +
    "Semester   Paper   Title                                                    Credits   Hours\n" +
    "----------------------------------------------------------------------------------------------\n" +
    "I          1       Fundamental of Commerce                                  4         3+2\n" +
    "           2       Business Organisation                                    4         3+2\n\n" +
    "II         3       Fundamentals of Computers & Basics of AI                 4         3+2\n" +
    "           4       Problem Solving Using C                                  4         3+2\n\n" +
    "III        5       Artificial Intelligence                                  4         3+2\n" +
    "           6       Database Management Systems                              4         3+2\n" +
    "           7       Object Oriented Programming with Java                    4         3+2\n" +
    "           8       Mathematical Foundations                                 4         3+2\n\n" +
    "IV         9       Artificial Intelligence for Games                        4         3+2\n" +
    "           10      Python Programming                                       4         3+2\n" +
    "           11      Statistical Foundations                                  4         3+2\n" +
    "           12      Machine Learning using R                                 4         3+2\n\n" +
    "V          13      Tableau for Data Visualization                           4         3+2\n" +
    "           14      Data Structures using Python                             4         3+2\n" +
    "           15      Software Engineering                                     4         3+2\n\n" +
    "VI         INTERNSHIP\n\n" ;


           textArea.setText(content);

         JScrollPane scrollPane = new JScrollPane(textArea);
	add(scrollPane);
	JPanel  p=new JPanel();
	 b=new JButton("BACK");
	b.setMnemonic(KeyEvent.VK_B);	

	p.add(b);          
        add(scrollPane, BorderLayout.CENTER);  
        add(p, BorderLayout.SOUTH);
	b.addActionListener(this);

		setVisible(true);
	}
	public static void main(String a[])
	{
	new BCA_AI();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
			dispose();
	}
}//AI cls




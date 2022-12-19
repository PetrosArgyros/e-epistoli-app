/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.awt.Color;
import javax.swing.*;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.util.ArrayList;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Stoixeia extends JFrame {

	// String subName_Yp, Name_Yp, Name, subName, Idiotita, panepisthmio, Idryma,
	// h_Ergasia, Thesh, Tmima, University;
    
        public static String idos1 = "";
        public static String ergasiaidos2 = "False";
        public static String ypotrofiaidos2 = "False";
        public static String metaptixiakoidos2 = "False";
        private String Empisteutiko="False";
        private String Idos="False";
         private String fylos="False";
        public static String Ergasia1 = "False";
        public static String Ypotrofia1 = "False";
        public static String Metaptixiako1 = "False";
	public static String Name = "";
	public static String subName_Yp = "";
	public static String Name_Yp = "";
	public static String subName = "";
	public static String Idiotita = "";
        public static String mail = "";
        public static String tel = "";
	public static String panepisthmio = "";
	public static String Idryma = "";
	public static String h_Ergasia = "";
	public static String Thesh = "";
	public static String Tmima = "";
	public static String University = "";
	//public static String trust = "";
	//public static ArrayList<String> stixeia = new ArrayList<String>();
	public JPanel panel;
        public JButton back, next;
        private javax.swing.JMenuBar jMenuBar1;
        private javax.swing.JMenu About;
        private javax.swing.JMenu Help;
        private javax.swing.JMenu File;
        private javax.swing.JMenuItem New;
        private javax.swing.JMenuItem Exit;
        private javax.swing.JRadioButton trust;
        private javax.swing.JRadioButton not_Trust;
        private javax.swing.JRadioButton Ypotrofia;
        private javax.swing.JRadioButton Ergasia;
        private javax.swing.JRadioButton Metaptixiako;
        private javax.swing.JRadioButton men;
         private javax.swing.JRadioButton women;
       
        
    
        
        
        public static String Stoixeia1 = "";
        public static String Idosw = "";
        public static String fylo = "";
       

	
	public Stoixeia(){
            
            
            
		
            
				
		
		
		
				panel = new JPanel();

                                //panel.setBackground(Color.WHITE);
                                panel.setLayout(null);
                                panel.setSize(800, 700);
                                panel.setBounds(20, 20, 150, 50);
                                panel.setLocation(100, 100);

                                //Βήμα 4, προσαρμογή υποδοχέα στο παράθυρο
                                this.setContentPane(panel);
		
		
                                this.setVisible(true);
                                this.setSize(800, 700);
                                this.setLocation(242, 156);
                                this.setResizable(false);
                                this.setTitle("E-pistoli");
                                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                this.setLocationRelativeTo(null);
		
				JButton back = new JButton("Προηγουμενo");
				back.setBounds(540, 613, 120, 23);
                                
				panel.add(back);
		
		
				JButton next = new JButton("Επoμενο");
				next.setBounds(680, 613, 100, 23);
				panel.add(next);
				
                                
                  
                                
				//Forward n= new Forward();
				//next.addActionListener(n);
				
				
				//Backward b= new Backward();
				//back.addActionListener(b);
                                
                                                    back.addActionListener(new java.awt.event.ActionListener() {
                                public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    ProhgoymenoActionPerformed(evt);
                                }
                            });
                                                     next.addActionListener(new java.awt.event.ActionListener() {
                                public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    EpomenoActionPerformed(evt);
                                }
                            });


				
				
				
				
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                jMenuBar1 = new javax.swing.JMenuBar();

                                jMenuBar1.setBorder(null);

                                // Code of sub-components and layout - not shown here

                                setJMenuBar(jMenuBar1);


                                File = new javax.swing.JMenu();

                                File.setBorder(null);

                                File.setText("File");

                                // Code of sub-components and layout - not shown here

                                jMenuBar1.add(File);







                                New = new javax.swing.JMenuItem();

                                New.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));

                                New.setText("New");

                                New.addActionListener(new java.awt.event.ActionListener() {
                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        NewActionPerformed(evt);
                                    }
                                });

                                File.add(New);



                                Exit = new javax.swing.JMenuItem();

                                Exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, java.awt.event.InputEvent.CTRL_MASK));

                                Exit.setText("Exit");

                                Exit.addActionListener(new java.awt.event.ActionListener() {
                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        ExitActionPerformed(evt);
                                    }
                                });

                                File.add(Exit);


                                Help = new javax.swing.JMenu();

                                Help.setBorder(null);

                                Help.setText("Help");

                                Help.addMouseListener(new java.awt.event.MouseAdapter() {
                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                        HelpMouseClicked(evt);
                                    }
                                });

                                // Code of sub-components and layout - not shown here

                                jMenuBar1.add(Help);



                                About = new javax.swing.JMenu();

                                About.setText("About");

                                About.addMouseListener(new java.awt.event.MouseAdapter() {
                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                        AboutMouseClicked(evt);
                                    }
                                });

                                // Code of sub-components and layout - not shown here

                                jMenuBar1.add(About);











                
                
                
                                trust = new javax.swing.JRadioButton("Εμπιστευτικό");
                                not_Trust = new javax.swing.JRadioButton("Μη Εμπιστευτικό");
                                Ergasia = new javax.swing.JRadioButton("Εργασία");
                                Ypotrofia = new javax.swing.JRadioButton("Υποτροφία");
                                Metaptixiako = new javax.swing.JRadioButton("Μεταπτυχιακό");
                                  men = new javax.swing.JRadioButton("Άνδρας");
                                women = new javax.swing.JRadioButton("Γυναίκα");
                                
                                ButtonGroup group = new ButtonGroup();
                                group.add(trust);
                                group.add(not_Trust);
                                
                                
                                
                                ButtonGroup group1 = new ButtonGroup();
                                group1.add(Ergasia);
                                group1.add(Ypotrofia);
                                group1.add(Metaptixiako);

				
				
				ButtonGroup group2 = new ButtonGroup();
                                group2.add(women);
                                group2.add(men);
                                
				
				
				
				
				
				//JCheckBox trust = new JCheckBox("Εμπιστευτικό");
				trust.setBounds(70, 450, 110, 20);
				trust.setBackground(Color.WHITE);
				trust.setToolTipText("Πατηστε για να γινει εμπιστευτικό");
				panel.add(trust);
                                
                                
                                        trust.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        trustActionPerformed(evt);
                    }
                });
				
				
				
				//JCheckBox not_Trust = new JCheckBox("Μη Εμπιστευτικό");
				not_Trust.setBounds(70, 480, 130, 20);
				not_Trust.setBackground(Color.WHITE);
				not_Trust.setToolTipText("Πατηστε για να γινει μη εμπιστευτικό");
				panel.add(not_Trust);
                                
                                

                                            not_Trust.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            not_TrustActionPerformed(evt);
                        }
                    });
				
				//JCheckBox Ergasia = new JCheckBox("Εργασία");
				Ergasia.setBounds(305, 480, 130, 20);
				Ergasia.setBackground(Color.WHITE);
				Ergasia.setToolTipText("Πατηστε για να γινει για την εργασια");
				panel.add(Ergasia);
                                
                                
                                

                                            Ergasia.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            ErgasiaActionPerformed(evt);
                        }
                    });
				
				//JCheckBox Ypotrofia = new JCheckBox("Υποτροφία");
				Ypotrofia.setBounds(305, 450, 130, 20);
				Ypotrofia.setBackground(Color.WHITE);
				Ypotrofia.setToolTipText("Πατηστε για να γινει για Υποτροφια");
				panel.add(Ypotrofia);
                                
                                
                                
                                            Ypotrofia.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            BiographActionPerformed(evt);
                        }
                    });
				
				//JCheckBox Metaptixiako = new JCheckBox("Μεταπτυχιακό");
				Metaptixiako.setBounds(305, 420, 130, 20);
				Metaptixiako.setBackground(Color.WHITE);
				Metaptixiako.setToolTipText("Πατηστε για να γινει για μεταπτυχιακο");
				panel.add(Metaptixiako);
				
                                

                                            Metaptixiako.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            ArxeioActionPerformed(evt);
                        }
                    });
				
                                men.setBounds(70, 520, 110, 20);
				men.setBackground(Color.WHITE);
				//men.setToolTipText("Πατηστε για να γινει εμπιστευτικό");
				panel.add(men);
                                
                                men.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            menActionPerformed(evt);
                        }
                    });
                                
                                women.setBounds(180, 520, 110, 20);
				women.setBackground(Color.WHITE);
				//women.setToolTipText("Πατηστε για να γινει εμπιστευτικό");
				panel.add(women);
				
				women.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            womenActionPerformed(evt);
                        }
                    });
				
				
				
				
				JLabel jLabel1 = new JLabel();
				Font font = new Font("Courier", Font.BOLD, 24 );
			      
				jLabel1.setBounds(340, 70, 130, 50);
				jLabel1.setText("Στοιχεία");
				jLabel1.setFont(font);
			
				panel.add(jLabel1);
				
				JLabel jLabel2 = new JLabel();
				Font font1 = new Font("Courier", Font.BOLD,16);
			      
				jLabel2.setBounds(70, 120, 130, 50);
				jLabel2.setText("Συντάκτης");
				jLabel2.setFont(font1);
				panel.add(jLabel2);
				
				JLabel jLabel3 = new JLabel();
				Font font2 = new Font("Courier", Font.BOLD,16);
			      
				jLabel3.setBounds(305, 120, 130, 50);
				jLabel3.setText("Υποψήφιος");
				jLabel3.setFont(font2);
				panel.add(jLabel3);
				
				JLabel jLabel111 = new JLabel();
				
				jLabel111.setBounds(555, 120, 190, 50);
				jLabel111.setText("Θέση που προορίζεται");
				jLabel111.setFont(font2);
				panel.add(jLabel111);
				
				JLabel jLabel4 = new JLabel();
				jLabel4.setBounds(70, 170, 130, 50);
				jLabel4.setText("Όνομα");
				panel.add(jLabel4);
				
				JLabel jLabel5 = new JLabel();
				jLabel5.setBounds(70, 220, 130, 50);
				jLabel5.setText("Επίθετο");
				panel.add(jLabel5);
				
				JLabel jLabel6 = new JLabel();
				jLabel6.setBounds(70, 270, 130, 50);
				jLabel6.setText("Τμήμα");
				panel.add(jLabel6);
				
                                JLabel jLabel612 = new JLabel();
				jLabel612.setBounds(70, 350, 130, 50);
				jLabel612.setText("Email");
				panel.add(jLabel612);
                                
                                JLabel jLabel62 = new JLabel();
				jLabel62.setBounds(70, 310, 130, 50);
				jLabel62.setText("Πανεπιστήμιο");
				panel.add(jLabel62);
                                
				JLabel jLabel7 = new JLabel();
				jLabel7.setBounds(70, 383, 130, 50);
				jLabel7.setText("Τηλέφωνο");
				panel.add(jLabel7);
				
				JLabel jLabel44 = new JLabel();
				jLabel44.setBounds(550, 170, 130, 50);
				jLabel44.setText("Πανεπιστήμιο");
				panel.add(jLabel44);
				
				JLabel jLabel444 = new JLabel();
				jLabel444.setBounds(550, 370, 130, 50);
				jLabel444.setText("Ίδρυμα");
				panel.add(jLabel444);
				
				JLabel jLabel51 = new JLabel();
				jLabel51.setBounds(550, 220, 130, 50);
				jLabel51.setText("Τμήμα");
				panel.add(jLabel51);
				
				JLabel jLabel61 = new JLabel();
				jLabel61.setBounds(550, 270, 130, 50);
				jLabel61.setText("Χώρος εργασίας");
				panel.add(jLabel61);
				
				JLabel jLabel71 = new JLabel();
				jLabel71.setBounds(550, 320, 130, 50);
				jLabel71.setText("Θέση");
				panel.add(jLabel71);
				
				JLabel jLabel8 = new JLabel();
				jLabel8.setBounds(305, 170, 130, 50);
				jLabel8.setText("Όνομα");
				panel.add(jLabel8);
				
				JLabel jLabel9 = new JLabel();
				jLabel9.setBounds(305, 220, 130, 50);
				jLabel9.setText("Επίθετο");
				panel.add(jLabel9);
				
				
				//subName_Yp, Name_Yp
				
                                
                                
                                jTextField1 = new javax.swing.JTextField();
                                jTextField2 = new javax.swing.JTextField();
                                jTextField3 = new javax.swing.JTextField();
                                jTextField4 = new javax.swing.JTextField();
                                jTextField5 = new javax.swing.JTextField();
                                jTextField6 = new javax.swing.JTextField();
                                jTextField611 = new javax.swing.JTextField();
                                jTextField612 = new javax.swing.JTextField();
                                jTextField7 = new javax.swing.JTextField();
                                jTextField8 = new javax.swing.JTextField();
                                jTextField9 = new javax.swing.JTextField();
                                jTextField11 = new javax.swing.JTextField();
                                jTextField12 = new javax.swing.JTextField();
                                jTextField13 = new javax.swing.JTextField();
                                jTextField14 = new javax.swing.JTextField();
                                jTextField15 = new javax.swing.JTextField();
                                
                                
                                
                             
                                
                                
                                
                                
				
				
				//JTextField jTextField1=new JTextField();
				jTextField1.setBounds(305, 205, 150, 20);
				jTextField1.setBackground(Color.WHITE);
                                //jTextField1.setText("Ανδρεασ");
				panel.add(jTextField1);
				Name_Yp = jTextField1.getText();
                                        
                                        
				//JTextField jTextField3=new JTextField();
				jTextField3.setBounds(305, 255, 150, 20);
				jTextField3.setBackground(Color.WHITE);
                               // jTextField3.setText("Miχος");
				panel.add(jTextField3);
                                subName_Yp = jTextField3.getText();
				
				
				//Name, subName, Idiotita, panepisthmio
				
				
				//JTextField jTextField4=new JTextField();
				jTextField4.setBounds(70, 205, 150, 20);
				jTextField4.setBackground(Color.WHITE);
                               // jTextField4.setText("Αλεξανδρος");
				panel.add(jTextField4);
                                Name = jTextField4.getText();
				
				
				
				//JTextField jTextField5=new JTextField();
				jTextField5.setBounds(70, 253, 150, 20);
				jTextField5.setBackground(Color.WHITE);
                                //jTextField5.setText("Χατζη");
				panel.add(jTextField5);
                                subName = jTextField5.getText();
				
				//JTextField jTextField6=new JTextField();
				jTextField6.setBounds(70, 305, 150, 20);
				jTextField6.setBackground(Color.WHITE);
                                //jTextField6.setText("Ε.Π.");
				panel.add(jTextField6);
                                Idiotita = jTextField6.getText();
                                
                                 // JTextField jTextField6=new JTextField();
				jTextField611.setBounds(70, 382, 150, 20);
				jTextField611.setBackground(Color.WHITE);
                                //jTextField611.setText("ΧΑΤΖ@.κΟΜ");
				panel.add(jTextField611);
                                mail = jTextField611.getText();
                                
                                //JTextField jTextField6=new JTextField();
				jTextField612.setBounds(70, 415, 150, 20);
				jTextField612.setBackground(Color.WHITE);
                               // jTextField612.setText("231000000");
				panel.add(jTextField612);
                                tel = jTextField612.getText();
				
				//JTextField jTextField7=new JTextField();
				jTextField7.setBounds(70, 344, 150, 20);
				jTextField7.setBackground(Color.WHITE);
                                //jTextField7.setText("ΠΑΜΑΚ");
				panel.add(jTextField7);
                                panepisthmio = jTextField7.getText();
				
				
				// Idryma, h_Ergasia, Thesh, Tmima, University, Name, subName, Idiotita, panepisthmio
				
				
                               
                                
				//JTextField jTextField2=new JTextField();
				jTextField2.setBounds(550, 405, 150, 20);
				jTextField2.setBackground(Color.WHITE);
                                //jTextField2.setText("ΑΠθ");
				panel.add(jTextField2);
				
                                Idryma = jTextField2.getText();
                                
				
				//JTextField jTextField8=new JTextField();
				jTextField8.setBounds(550, 305, 150, 20);
				jTextField8.setBackground(Color.WHITE);
                                //jTextField8.setText("τιβουκτου");
				panel.add(jTextField8);
                                h_Ergasia = jTextField8.getText();
				
				//JTextField jTextField9=new JTextField();
				jTextField9.setBounds(550, 355, 150, 20);
				jTextField9.setBackground(Color.WHITE);
                                //jTextField9.setText("Διευθηντης");
				panel.add(jTextField9);
                                Thesh = jTextField9.getText();
				
				//JTextField jTextField11=new JTextField();
				jTextField11.setBounds(550, 205, 150, 20);
				jTextField11.setBackground(Color.WHITE);
                                //jTextField11.setText("Cambrige");
				panel.add(jTextField11);
                                University = jTextField11.getText();
				
				//JTextField jTextField12=new JTextField();
				jTextField12.setBounds(550, 253, 150, 20);
				jTextField12.setBackground(Color.WHITE);
                               // jTextField12.setText("MBA");
				panel.add(jTextField12);
                                Tmima = jTextField12.getText();
				
                                Tmima = jTextField12.getText();
                                University = jTextField11.getText();
                                Thesh = jTextField9.getText();
                                h_Ergasia = jTextField8.getText();
				panepisthmio = jTextField7.getText();
                                Idiotita = jTextField6.getText();
                                subName = jTextField5.getText();
				Name = jTextField4.getText();
				subName_Yp = jTextField3.getText();
                                Idryma = jTextField2.getText();
			
				
	}
        
        public void el(){
            setVisible(false);
            
}
        
        				
	private void year2FocusGained(FocusEvent evt) {
        //       etos2="True";
            }	
				



        private void NewActionPerformed(java.awt.event.ActionEvent evt) {                                    
        Oroi_Xrisis ox = new Oroi_Xrisis();
        ox.setVisible(true);
        setVisible(false);
        dispose();
    }                                   

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {                                     
        System.exit(0);
    }                                    

    private void HelpMouseClicked(java.awt.event.MouseEvent evt) {                                  
        Help help = new Help();
        help.setVisible(true);
    }                                 

    private void AboutMouseClicked(java.awt.event.MouseEvent evt) {                                   
        About about = new About();
        about.setVisible(true);
    }        
    
    private void ProhgoymenoActionPerformed(java.awt.event.ActionEvent evt) {                                            
        Oroi_Xrisis cker = new Oroi_Xrisis();
        cker.setVisible(true);
        setVisible(false);
        dispose();
    }          
    
    private void EpomenoActionPerformed(java.awt.event.ActionEvent evt) {                                            
       
                                Name_Yp = jTextField1.getText();
                                Tmima = jTextField12.getText();
                                University = jTextField11.getText();
                                Thesh = jTextField9.getText();
                                h_Ergasia = jTextField8.getText();
				panepisthmio = jTextField7.getText();
                                Idiotita = jTextField6.getText();
                                subName = jTextField5.getText();
				Name = jTextField4.getText();
				subName_Yp = jTextField3.getText();
                                Idryma = jTextField2.getText();
                                mail = jTextField611.getText();
                                tel = jTextField612.getText();
                                
                                
			
        if(Idos=="True" && Empisteutiko=="True" &&fylos == "True"){                                     
            Proptixiakes_Metaptixiakes cker1 = new Proptixiakes_Metaptixiakes();
            cker1.setVisible(true);
            setVisible(false);
            dispose();
        }
           else if(Idos=="True" && Empisteutiko=="False"&& fylos=="False") {
            JOptionPane.showMessageDialog(null, "Συμπληρώσετε εάν είναι εμπιστευτική η όχι η επιστολή");
        }
           else if(Idos=="False" && Empisteutiko=="False"&& fylos=="False") {
            JOptionPane.showMessageDialog(null, "Συμπληρώσετε εάν είναι εμπιστευτική η όχι η επιστολή");
        }
           else if(Idos=="False" && Empisteutiko=="True"&& fylos=="False") {
            JOptionPane.showMessageDialog(null, "Συμπληρώστε το είδος της επιστολής");
        }
           else if(Idos=="True" && Empisteutiko=="False"&& fylos=="True") {
            JOptionPane.showMessageDialog(null, "Συμπληρώσετε εάν είναι εμπιστευτική η όχι η επιστολή");
        }
           else if(Idos=="False" && Empisteutiko=="True"&& fylos=="True") {
            JOptionPane.showMessageDialog(null, "Συμπληρώστε το είδος της επιστολής");
        }
            else if(Idos=="False" && Empisteutiko=="False" &&fylos=="True") {
            JOptionPane.showMessageDialog(null, "Πρέπει να συμπληρώσετε εάν είναι εμπιστευτική η όχι η επιστολή και το είδος της");
        }
            else if(Idos=="True" && Empisteutiko=="True" && fylos=="False" ) {
            JOptionPane.showMessageDialog(null, "Πρέπει να συμπληρώσετε εάν είστε άνδρας η γυναίκα");
        }
    }  
    
    
    
    private void trustActionPerformed(java.awt.event.ActionEvent evt) {   
        Empisteutiko="True";
        if (trust.isSelected() == true){
        Stoixeia1 ="Αυτή η συστατική επιστολή είναι εμπιστευτική ";
         }
       
    }          
    
    
     private void not_TrustActionPerformed(java.awt.event.ActionEvent evt) {  
         Empisteutiko="True";
        if (not_Trust.isSelected() == true){
        Stoixeia1 = "Αυτή η συστατική επιστολή δεν είναι εμπιστευτική ";
         }
       
    }          
     private void ErgasiaActionPerformed(java.awt.event.ActionEvent evt) {
         Idos="True";
        Ergasia1="True";
        if (Ergasia.isSelected() == true){
        Idosw = "Προορίζεται για Εργασία ";
        idos1="για Εργασία";
        ergasiaidos2="True";
         }
        
    }          
      
      
      
       private void BiographActionPerformed(java.awt.event.ActionEvent evt) {      
         Idos="True";
        Ypotrofia1="True";
        Ergasia1="True";
        if (Ypotrofia.isSelected() == true){
        Idosw = "Προορίζεται για Υποτροφία ";
        idos1="για την υποτροφία";
        ypotrofiaidos2="True";
         }
       

    }          
       
       
       
       
       
        private void ArxeioActionPerformed(java.awt.event.ActionEvent evt) {   
         Idos="True";                                                 
        Metaptixiako1="True";
        if (Metaptixiako.isSelected() == true){
        Idosw = "Προορίζεται για Μεαπτυχιακό ";
        idos1="για το το μεταπτυχιακό";
        metaptixiakoidos2="True";
         }
        
    }          
        
             private void womenActionPerformed(java.awt.event.ActionEvent evt) {   
                 fylos = "True";
        if (women.isSelected() == true){
        fylo = "female";
        idos1="να εργαστέι";
         }
                
    }   
 
         private void menActionPerformed(java.awt.event.ActionEvent evt) {   
             fylos = "True";
        if (men.isSelected() == true){
        fylo = "male";
         }
                
    }
        
 
        
        private javax.swing.JTextField jTextField2;
        private javax.swing.JTextField jTextField1;
        private javax.swing.JTextField jTextField3;
        private javax.swing.JTextField jTextField4;
        private javax.swing.JTextField jTextField5;
        private javax.swing.JTextField jTextField6;
        private javax.swing.JTextField jTextField611;
        private javax.swing.JTextField jTextField612;
        private javax.swing.JTextField jTextField7;
        private javax.swing.JTextField jTextField8;
        private javax.swing.JTextField jTextField9;
        private javax.swing.JTextField jTextField11;
        private javax.swing.JTextField jTextField12;
        private javax.swing.JTextField jTextField13;
        private javax.swing.JTextField jTextField14;
        private javax.swing.JTextField jTextField15;
        
        
        
    
        
     
        
        
        
        

}

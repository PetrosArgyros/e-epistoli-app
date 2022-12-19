/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.awt.Color;

import javax.swing.*;

public class ArxeioSelect extends JFrame {
	
	private JPanel panel;
	private JButton button, button2, back, next;
        private javax.swing.JMenuBar jMenuBar1;
        private javax.swing.JMenu About;
        private javax.swing.JMenu Help;
        private javax.swing.JMenu File;
        private javax.swing.JMenuItem New;
        private javax.swing.JMenuItem Exit;

	
	
	public ArxeioSelect() {
		
		//Βήμα 1, δημιουργία υποδοχέα (σεντονιού)
		panel = new JPanel();
		
		//Βήμα 2, δημιουργία γραφικών συστατικών
		button = new JButton("Προσθήκη Λογότυπου Πανεπιστημίου");
		button.setBounds(270, 220, 250, 40);
		button2 = new JButton("Προσθήκη Ψυφιακής Υπογραφής");
		button2.setBounds(270, 280, 250, 40);
		
		back = new JButton("Προηγουμενο");
		back.setBounds(540, 613, 120, 23);
		
		next = new JButton("Επομενο");
		next.setBounds(680, 613, 100, 23);
		
		//Nex n= new Nex();
		//next.addActionListener(n);
		
		
		//Bak b= new Bak();
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


		//Bήμα 3, προσθήκη συστατικών στον υποδοχέα
		panel.add(button);
		panel.add(button2);
		panel.add(back);
		panel.add(next);
		//panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setSize(800, 700);
		panel.setBounds(20, 20, 150, 50);
		panel.setLocation(242, 156);
		
		//Βήμα 4, προσαρμογή υποδοχέα στο παράθυρο
		this.setContentPane(panel);
		
		
	    this.setVisible(true);
	    this.setSize(800, 700);
            this.setResizable(false);
	    this.setTitle("E-istoli");
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLocationRelativeTo(null);
	    
	    myListener fo=new myListener();
	    
	    button.addActionListener(fo);
            
            myListener2 lo=new myListener2();
	    button2.addActionListener(lo);
	    
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
        if(Stoixeia.Ergasia1=="True"){
            CheckBox_Ergasia.CheckBox_Ergasia.clear();
          CheckBox_Ergasia cker = new CheckBox_Ergasia();
        cker.setVisible(true);
        setVisible(false);
        dispose();   
        }
     else{
        CheckBox_Ekpaideush.CheckBox_Ekpaideush.clear();
         CheckBox_Ekpaideush ckek = new CheckBox_Ekpaideush();
        ckek.setVisible(true);
        setVisible(false);
        dispose();
     }  
    }          
    
    private void EpomenoActionPerformed(java.awt.event.ActionEvent evt) {                                            
        Apothikefsi apot = new Apothikefsi();
        apot.setVisible(true);
        setVisible(false);
        dispose();
    }    
        
      //  public void 

}

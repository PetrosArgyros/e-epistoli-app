/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.FocusEvent;

/**
 *
 * @author Giannhs Manolas
 */
public class Agglika_Sunisto extends javax.swing.JFrame {
 
    public static String Gnosi_Agglikon = "";
    public static String Sinisto = "";
    public static String Gnosi = "False";
    public static String Epipedo = "False";
    public static String Gnosi1 = "";
    public static String Epipedo1 = "";
    /**
     * Creates new form Agglika_Sunisto
     */
    public Agglika_Sunisto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        Gnosi_Agglikon_Group = new javax.swing.ButtonGroup();
        Synisto_Group = new javax.swing.ButtonGroup();
        Gnosis_agglikon = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Aristi = new javax.swing.JRadioButton();
        Kalh = new javax.swing.JRadioButton();
        Katholou = new javax.swing.JRadioButton();
        Metria = new javax.swing.JRadioButton();
        Basiki = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        Alli_glossa = new javax.swing.JLabel();
        Epipedo_gnosis = new javax.swing.JLabel();
        Alli_glossat = new javax.swing.JTextField();
        Epipedo_gnosist = new javax.swing.JTextField();
        Synisto = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Anepifilakta = new javax.swing.JRadioButton();
        Me_epifilaksi = new javax.swing.JRadioButton();
        Den_sinisto = new javax.swing.JRadioButton();
        Aplos_sistino = new javax.swing.JRadioButton();
        Epomeno = new javax.swing.JButton();
        Prohgoymeno = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        New = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();
        Help = new javax.swing.JMenu();
        About = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("e-πιστολή");
        setSize(800, 700);
        setResizable(false);

        Alli_glossat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Alli_glossatFocusGained(evt);
            }
        });
        
        Epipedo_gnosist.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Epipedo_gnosistFocusGained(evt);
            }
        });
        
        Gnosis_agglikon.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Gnosis_agglikon.setText("Γνώσεις Αγγλικών");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Gnosi_Agglikon_Group.add(Aristi);
        Aristi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Aristi.setText("Άριστη");
        Aristi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AristiActionPerformed(evt);
            }
        });

        Gnosi_Agglikon_Group.add(Kalh);
        Kalh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Kalh.setText("Καλή");
        Kalh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KalhActionPerformed(evt);
            }
        });

        Gnosi_Agglikon_Group.add(Katholou);
        Katholou.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Katholou.setText("Καθόλου");
        Katholou.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KatholouActionPerformed(evt);
            }
        });

        Gnosi_Agglikon_Group.add(Metria);
        Metria.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Metria.setText("Μέτρια");
        Metria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MetriaActionPerformed(evt);
            }
        });

        Gnosi_Agglikon_Group.add(Basiki);
        Basiki.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Basiki.setText("Βασική");
        Basiki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BasikiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Aristi)
                    .addComponent(Kalh)
                    .addComponent(Metria)
                    .addComponent(Basiki)
                    .addComponent(Katholou))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Aristi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Kalh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Metria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Basiki)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Katholou)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Alli_glossa.setText("Άλλη Γλώσσα");

        Epipedo_gnosis.setText("Επίπεδο γνώσης");

        
        

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Alli_glossa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Epipedo_gnosis)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Alli_glossat)
                    .addComponent(Epipedo_gnosist, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Alli_glossat, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(Alli_glossa))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Epipedo_gnosist, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Epipedo_gnosis))
                .addContainerGap())
        );

        Synisto.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Synisto.setText("         Συνιστώ");

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Synisto_Group.add(Anepifilakta);
        Anepifilakta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Anepifilakta.setText("Ανεπιφύλακτα");
        Anepifilakta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnepifilaktaActionPerformed(evt);
            }
        });

        Synisto_Group.add(Me_epifilaksi);
        Me_epifilaksi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Me_epifilaksi.setText("Με επιφύλαξη");
        Me_epifilaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Me_epifilaksiActionPerformed(evt);
            }
        });

        Synisto_Group.add(Den_sinisto);
        Den_sinisto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Den_sinisto.setText("Δεν συνιστώ");
        Den_sinisto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Den_sinistoActionPerformed(evt);
            }
        });

        Synisto_Group.add(Aplos_sistino);
        Aplos_sistino.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Aplos_sistino.setText("Απλώς συστήνω");
        Aplos_sistino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Aplos_sistinoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Anepifilakta)
                    .addComponent(Me_epifilaksi)
                    .addComponent(Den_sinisto)
                    .addComponent(Aplos_sistino))
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Anepifilakta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Me_epifilaksi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Aplos_sistino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Den_sinisto)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        Epomeno.setText("Επόμενο");
        Epomeno.setPreferredSize(new java.awt.Dimension(99, 23));
        Epomeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EpomenoActionPerformed(evt);
            }
        });

        Prohgoymeno.setText("Προηγούμενο");
        Prohgoymeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProhgoymenoActionPerformed(evt);
            }
        });

        jMenuBar1.setBorder(null);

        File.setBorder(null);
        File.setText("File");

        New.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        New.setText("New");
        New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewActionPerformed(evt);
            }
        });
        File.add(New);

        Exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, java.awt.event.InputEvent.CTRL_MASK));
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        File.add(Exit);

        jMenuBar1.add(File);

        Help.setBorder(null);
        Help.setText("Help");
        Help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HelpMouseClicked(evt);
            }
        });
        jMenuBar1.add(Help);

        About.setText("About");
        About.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AboutMouseClicked(evt);
            }
        });
        jMenuBar1.add(About);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Prohgoymeno)
                        .addGap(18, 18, 18)
                        .addComponent(Epomeno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Synisto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Gnosis_agglikon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 293, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Gnosis_agglikon)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Synisto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Prohgoymeno, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Epomeno, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void AristiActionPerformed(java.awt.event.ActionEvent evt) {                                       
        Gnosi_Agglikon="Διαθέτει άριστη γνώση αγγλικών.";
    }                                      

    private void AnepifilaktaActionPerformed(java.awt.event.ActionEvent evt) {                                             
        Sinisto="σας συνιστώ ανεπιφύλακτα";
    }                                            

    private void EpomenoActionPerformed(java.awt.event.ActionEvent evt) {    
        if(Gnosi == "True")
        {
            Gnosi1 = Alli_glossat.getText();
        }
        if(Epipedo == "True")
        {
            Epipedo1 = Epipedo_gnosist.getText();
        }
     
     if(Stoixeia.Ergasia1=="True"){
          CheckBox_Ergasia cker = new CheckBox_Ergasia();
        cker.setVisible(true);
        setVisible(false);
        dispose();   
        }
     else if( Stoixeia.Ypotrofia1 == "True" ||Stoixeia.Metaptixiako1 == "True" ){
         CheckBox_Ekpaideush ckek = new CheckBox_Ekpaideush();
        ckek.setVisible(true);
        setVisible(false);
        dispose();
     }
     
    }                                       

    private void ProhgoymenoActionPerformed(java.awt.event.ActionEvent evt) {                                            
        Proyphresia_praktiki pp = new Proyphresia_praktiki();
        pp.setVisible(true);
        setVisible(false);
        dispose();
    }                                           

    private void Me_epifilaksiActionPerformed(java.awt.event.ActionEvent evt) {                                              
        Sinisto="σας συνιστώ με επιφύλαξη";
    }                                             

    private void Aplos_sistinoActionPerformed(java.awt.event.ActionEvent evt) {                                              
        Sinisto="απλώς συστήνω";
    }                                             

    private void Den_sinistoActionPerformed(java.awt.event.ActionEvent evt) {                                            
        Sinisto="δεν συνιστώ";
    }                                           

    private void KalhActionPerformed(java.awt.event.ActionEvent evt) {                                     
        Gnosi_Agglikon="Διαθέτει κάλη γνώση αγγλικών.";
    }                                    

    private void MetriaActionPerformed(java.awt.event.ActionEvent evt) {                                       
        Gnosi_Agglikon="Διαθέτει μέτρια γνώση αγγλικών.";
    }                                      

    private void BasikiActionPerformed(java.awt.event.ActionEvent evt) {                                       
        Gnosi_Agglikon="Διαθέτει βασική γνώση αγγλικών.";
    }                                      

    private void KatholouActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Gnosi_Agglikon="δεν διαθέτει γνώσεις αγγλικών.";
    }                                        
    private void Alli_glossatFocusGained(FocusEvent evt) {
                Gnosi="True";
            }
    private void Epipedo_gnosistFocusGained(FocusEvent evt) {
                Epipedo="True";
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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Agglika_Sunisto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agglika_Sunisto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agglika_Sunisto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agglika_Sunisto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agglika_Sunisto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JMenu About;
    private javax.swing.JLabel Alli_glossa;
    private javax.swing.JTextField Alli_glossat;
    private javax.swing.JRadioButton Anepifilakta;
    private javax.swing.JRadioButton Aplos_sistino;
    private javax.swing.JRadioButton Aristi;
    private javax.swing.JRadioButton Basiki;
    private javax.swing.JRadioButton Den_sinisto;
    private javax.swing.JLabel Epipedo_gnosis;
    private javax.swing.JTextField Epipedo_gnosist;
    private javax.swing.JButton Epomeno;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenu File;
    private javax.swing.ButtonGroup Gnosi_Agglikon_Group;
    private javax.swing.JLabel Gnosis_agglikon;
    private javax.swing.JMenu Help;
    private javax.swing.JRadioButton Kalh;
    private javax.swing.JRadioButton Katholou;
    private javax.swing.JRadioButton Me_epifilaksi;
    private javax.swing.JRadioButton Metria;
    private javax.swing.JMenuItem New;
    private javax.swing.JButton Prohgoymeno;
    private javax.swing.JLabel Synisto;
    private javax.swing.ButtonGroup Synisto_Group;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration                   
}

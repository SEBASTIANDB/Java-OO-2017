/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentatie;

import java.awt.Color;
import java.awt.GraphicsEnvironment;
import logica.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

/**
 *
 * @author Sebastiaan
 * @version javaoo project 2017
 *
 */
public class Beheervenster extends javax.swing.JFrame implements Filters {
    
    private Student student;
    private Curriculum curriculum = new Curriculum();
    private ArrayList<Vak> Fase1;
    private ArrayList<Vak> Fase2;
    private ArrayList<Vak> Fase3;
    private ArrayList<Vak> Fase4;
    private int somFase1 = 0;
    private int somFase2 = 0;
    private int somFase3 = 0;
    private int somFase4 = 0;
    
    public Beheervenster() {
        initComponents();
        buttonEO.setVisible(true);
        ictWEB.setVisible(true);
        ictNET.setVisible(true);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        naamLabel = new javax.swing.JLabel();
        bewaarButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        studiepuntenJaar1 = new javax.swing.JLabel();
        studiepuntenJaar2 = new javax.swing.JLabel();
        studiepuntenJaar3 = new javax.swing.JLabel();
        studiepuntenJaar4 = new javax.swing.JLabel();
        jaar1Naar2 = new javax.swing.JButton();
        jaar2Naar3 = new javax.swing.JButton();
        jaar3Naar4 = new javax.swing.JButton();
        jaar4Naar3 = new javax.swing.JButton();
        jaar2Naar1 = new javax.swing.JButton();
        jaar3Naar2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        buttonEO = new javax.swing.JButton();
        ictWEB = new javax.swing.JButton();
        ictNET = new javax.swing.JButton();
        jErrorLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        naamLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bewaarButton.setText("Bewaar programma");
        bewaarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bewaarButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Jaar 1");

        jLabel2.setText("Jaar 2");

        jLabel3.setText("Jaar 3");

        jLabel4.setText("Jaar 4");

        studiepuntenJaar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        studiepuntenJaar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        studiepuntenJaar3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        studiepuntenJaar4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jaar1Naar2.setText(">>>");
        jaar1Naar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaar1Naar2ActionPerformed(evt);
            }
        });

        jaar2Naar3.setText(">>>");
        jaar2Naar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaar2Naar3ActionPerformed(evt);
            }
        });

        jaar3Naar4.setText(">>>");
        jaar3Naar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaar3Naar4ActionPerformed(evt);
            }
        });

        jaar4Naar3.setText("<<<");
        jaar4Naar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaar4Naar3ActionPerformed(evt);
            }
        });

        jaar2Naar1.setText("<<<");
        jaar2Naar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaar2Naar1ActionPerformed(evt);
            }
        });

        jaar3Naar2.setText("<<<");
        jaar3Naar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaar3Naar2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Voornaam");

        jLabel6.setText("Achternaam");

        buttonEO.setText("Elektronica");
        buttonEO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEOActionPerformed(evt);
            }
        });

        ictWEB.setText("ictWEB");
        ictWEB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ictWEBActionPerformed(evt);
            }
        });

        ictNET.setText("ictNET");
        ictNET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ictNETActionPerformed(evt);
            }
        });

        jErrorLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane1.setViewportView(jList1);

        jList2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane2.setViewportView(jList2);

        jList3.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane3.setViewportView(jList3);

        jList4.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane4.setViewportView(jList4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bewaarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(naamLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(studiepuntenJaar1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jaar2Naar1)
                            .addComponent(jaar1Naar2))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(studiepuntenJaar2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jaar2Naar3)
                            .addComponent(jaar3Naar2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(buttonEO)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ictWEB)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ictNET))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(jLabel3)))
                                .addGap(73, 73, 73))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(studiepuntenJaar3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jaar3Naar4)
                                    .addComponent(jaar4Naar3)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(jTextField1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(studiepuntenJaar4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 1043, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jaar3Naar4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jaar4Naar3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(naamLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(buttonEO)
                                .addComponent(ictWEB)
                                .addComponent(ictNET)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bewaarButton)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(jaar2Naar3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jaar3Naar2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(jaar1Naar2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jaar2Naar1))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(studiepuntenJaar1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(studiepuntenJaar2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(studiepuntenJaar3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(studiepuntenJaar4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bewaarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bewaarButtonActionPerformed
                
        try {
            
            student = new Student(jTextField1.getText(), jTextField2.getText(), curriculum);
            setAndSort();
            applyToFase();
            naamLabel.setText(jTextField1.getText() + " " + jTextField2.getText());
            displayStdp();
            buttonEO.setVisible(true);
            ictWEB.setVisible(true);
            ictNET.setVisible(true);
            
        } catch (Exception e) {
            jErrorLabel.setText(e + "");
            
        }
    }//GEN-LAST:event_bewaarButtonActionPerformed

    private void buttonEOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEOActionPerformed
        //knop om het curriculum te veranderen naar een gewoon elektronica curriculum
        try {
            curriculum = new Curriculum();
            curriculum.setCurriculum(curriculum.toonVakkenElo(curriculum.getVakkenlijst()));
            Collections.sort(curriculum.getVakkenlijst());
            student = new Student(curriculum);
            student.setCurriculum(curriculum);            
            setAndSort();//fases vullen
            applyToFase();
            displayStdp();
        } catch (Exception e) {
            jErrorLabel.setText(e + "");
        }
        

    }//GEN-LAST:event_buttonEOActionPerformed

    private void ictNETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ictNETActionPerformed
        try {//knop om het curriculum te veranderen naar een gewoon ICT_NET curriculum
            curriculum = new Curriculum();
            curriculum.setCurriculum(curriculum.toonVakkenInfrastructuur(curriculum.getVakkenlijst()));            
            Collections.sort(curriculum.getVakkenlijst());
            student = new Student(curriculum);
            student.setCurriculum(curriculum);
            setAndSort();
            applyToFase();
            displayStdp();
            
        } catch (Exception e) {
            jErrorLabel.setText(e + "");
            
        }
    }//GEN-LAST:event_ictNETActionPerformed

    private void ictWEBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ictWEBActionPerformed
        try {//knop om het curriculum te veranderen naar een gewoon ICT_WEB curriculum

            curriculum = new Curriculum();
            curriculum.setCurriculum(curriculum.toonVakkenWeb(curriculum.getVakkenlijst()));
            Collections.sort(curriculum.getVakkenlijst());
            student = new Student(curriculum);
            student.setCurriculum(curriculum);
            setAndSort();
            applyToFase();
            displayStdp();
        } catch (Exception e) {
            jErrorLabel.setText(e + "");
            
        }
    }//GEN-LAST:event_ictWEBActionPerformed

    private void jaar1Naar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaar1Naar2ActionPerformed
        try {//geselecteerde vak verplaatsen van Fase 1 naar Fase 2
            String vaknaam = Fase1.get(jList1.getSelectedIndex()).getNaam();
            String FaseOrigineel = "Fase1";
            String FaseNext = "Fase2";
            veranderFase(vaknaam, FaseOrigineel, FaseNext);
            displayStdp();
        } catch (Exception e) {
            jErrorLabel.setText(e + "");
        }

    }//GEN-LAST:event_jaar1Naar2ActionPerformed

    private void jaar2Naar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaar2Naar1ActionPerformed
        try {//geselecteerde vak verplaatsen van Fase 2 naar Fase 1
            String vaknaam = Fase2.get(jList2.getSelectedIndex()).getNaam();
            String FaseOrigineel = "Fase2";
            String FaseNext = "Fase1";
            veranderFase(vaknaam, FaseOrigineel, FaseNext);
            displayStdp();
        } catch (Exception e) {
            jErrorLabel.setText(e + "");
        }
        

    }//GEN-LAST:event_jaar2Naar1ActionPerformed

    private void jaar2Naar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaar2Naar3ActionPerformed
        try {//geselecteerde vak verplaatsen van Fase 2 naar Fase 3
            String vaknaam = Fase2.get(jList2.getSelectedIndex()).getNaam();
            String FaseOrigineel = "Fase2";
            String FaseNext = "Fase3";
            veranderFase(vaknaam, FaseOrigineel, FaseNext);
            displayStdp();
        } catch (Exception e) {
            jErrorLabel.setText(e + "");
        }

    }//GEN-LAST:event_jaar2Naar3ActionPerformed

    private void jaar3Naar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaar3Naar2ActionPerformed
        try {//geselecteerde vak verplaatsen van Fase 3 naar Fase 2
            String vaknaam = Fase3.get(jList3.getSelectedIndex()).getNaam();
            String FaseOrigineel = "Fase3";
            String FaseNext = "Fase2";
            veranderFase(vaknaam, FaseOrigineel, FaseNext);
            displayStdp();
        } catch (Exception e) {
            jErrorLabel.setText(e + "");
        }

    }//GEN-LAST:event_jaar3Naar2ActionPerformed

    private void jaar3Naar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaar3Naar4ActionPerformed
        try {//geselecteerde vak verplaatsen van Fase 3 naar Fase 4
            String vaknaam = Fase3.get(jList3.getSelectedIndex()).getNaam();
            String FaseOrigineel = "Fase3";
            String FaseNext = "Fase4";
            veranderFase(vaknaam, FaseOrigineel, FaseNext);
            displayStdp();
        } catch (Exception e) {
            jErrorLabel.setText(e + "");
        }
        

    }//GEN-LAST:event_jaar3Naar4ActionPerformed

    private void jaar4Naar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaar4Naar3ActionPerformed
        try {//geselecteerde vak verplaatsen van Fase 4 naar Fase 3
            String vaknaam = Fase4.get(jList4.getSelectedIndex()).getNaam();
            String FaseOrigineel = "Fase4";
            String FaseNext = "Fase3";
            veranderFase(vaknaam, FaseOrigineel, FaseNext);
            displayStdp();
        } catch (Exception e) {
            jErrorLabel.setText(e + "");
        }

    }//GEN-LAST:event_jaar4Naar3ActionPerformed

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
            java.util.logging.Logger.getLogger(Beheervenster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Beheervenster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Beheervenster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Beheervenster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Beheervenster().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bewaarButton;
    private javax.swing.JButton buttonEO;
    private javax.swing.JButton ictNET;
    private javax.swing.JButton ictWEB;
    private javax.swing.JLabel jErrorLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton jaar1Naar2;
    private javax.swing.JButton jaar2Naar1;
    private javax.swing.JButton jaar2Naar3;
    private javax.swing.JButton jaar3Naar2;
    private javax.swing.JButton jaar3Naar4;
    private javax.swing.JButton jaar4Naar3;
    private javax.swing.JLabel naamLabel;
    private javax.swing.JLabel studiepuntenJaar1;
    private javax.swing.JLabel studiepuntenJaar2;
    private javax.swing.JLabel studiepuntenJaar3;
    private javax.swing.JLabel studiepuntenJaar4;
    // End of variables declaration//GEN-END:variables
        public void setAndSort() {//deze methode krijgt de fases van de student en sorteert de fases
        Fase1 = new ArrayList(filterFase(student.getCurriculum().getVakkenlijst(), "Fase1"));
        Collections.sort(Fase1);
        Fase2 = new ArrayList(filterFase(student.getCurriculum().getVakkenlijst(), "Fase2"));
        Collections.sort(Fase2);
        Fase3 = new ArrayList(filterFase(student.getCurriculum().getVakkenlijst(), "Fase3"));
        Collections.sort(Fase3);
        Fase4 = new ArrayList(filterFase(student.getCurriculum().getVakkenlijst(), "Fase4"));
        Collections.sort(Fase4);
    }
    
    public void displayStdp() {//deze methode zorgt ervoor dat de studiepunten per fase indien nodig in het rood staan
        if (somFase1 >= 65) {//FASE 1
            studiepuntenJaar1.setForeground(Color.red);
            studiepuntenJaar1.setText("" + somFase1);
        } else if (!(somFase1 >= 65)) {
            studiepuntenJaar1.setForeground(Color.BLACK);
            studiepuntenJaar1.setText("" + somFase1);
        }
        if (somFase2 >= 65) {//FASE 2
            studiepuntenJaar2.setForeground(Color.red);
            studiepuntenJaar2.setText("" + somFase2);
        } else if (!(somFase2 >= 65)) {
            studiepuntenJaar2.setForeground(Color.BLACK);
            studiepuntenJaar2.setText("" + somFase2);
        }
        if (somFase3 >= 65) {//FASE 3
            studiepuntenJaar3.setForeground(Color.red);
            studiepuntenJaar3.setText("" + somFase3);
        } else if (!(somFase3 >= 65)) {
            studiepuntenJaar3.setForeground(Color.BLACK);
            studiepuntenJaar3.setText("" + somFase3);
        }
        if (somFase4 >= 65) {//FASE 4
            studiepuntenJaar4.setForeground(Color.red);
            studiepuntenJaar4.setText("" + somFase4);
        } else if (!(somFase4 >= 65)) {
            studiepuntenJaar4.setForeground(Color.BLACK);
            studiepuntenJaar4.setText("" + somFase4);
        }
        
    }
    
    private void applyToFase() {// deze methode displayt de listmodels gesorteerd op de jLists
        somFase1 = 0;
        somFase2 = 0;
        somFase3 = 0;
        somFase4 = 0;
        DefaultListModel listModel = new DefaultListModel();// de fases opslaan in listmodels om deze op de jLists te krijgen.
        DefaultListModel listModel2 = new DefaultListModel();
        DefaultListModel listModel3 = new DefaultListModel();
        DefaultListModel listModel4 = new DefaultListModel();
        Collections.sort(Fase1);
        Collections.sort(Fase2);
        Collections.sort(Fase3);
        Collections.sort(Fase4);
        for (Vak v : Fase1) {//de vakken van de fases 
            listModel.addElement(v);
            somFase1 += v.getStdp();
        }
        jList1.setModel(listModel);
        for (Vak v : Fase2) {
            listModel2.addElement(v);
            somFase2 += v.getStdp();
        }
        jList2.setModel(listModel2);
        for (Vak v : Fase3) {
            listModel3.addElement(v);
            somFase3 += v.getStdp();
        }
        jList3.setModel(listModel3);
        for (Vak v : Fase4) {
            listModel4.addElement(v);
            somFase4 += v.getStdp();
        }
        jList4.setModel(listModel4);
        
    }
    
    public void verwijderVak(Vak v) {
        if (v.getFase().equals("Fase1")) {
            Fase1.remove(v);
        }
        if (v.getFase().equals("Fase2")) {
            Fase2.remove(v);
        }
        if (v.getFase().equals("Fase3")) {
            Fase3.remove(v);
        }
        
    }
    
    public void veranderFase(String vaknaam, String FaseOrigineel, String FaseNext) {
        ArrayList<Vak> selectie = new ArrayList();
        if (FaseOrigineel.equals("Fase1")) {
            for (int i = 0; i < Fase1.size(); i++) {
                if (Fase1.get(i).getNaam().equals(vaknaam)) {
                    Fase1.get(i).setFase(FaseNext);
                    Fase2.add(Fase1.get(i));//is sowieso naar fase 2
                    Fase1.remove(Fase1.get(i));
                    
                }
                
            }
        }
        if (FaseOrigineel.equals("Fase2")) {
            for (int i = 0; i < Fase2.size(); i++) {
                if (Fase2.get(i).getNaam().equals(vaknaam)) {
                    Fase2.get(i).setFase(FaseNext);
                    
                    if (FaseNext.equals("Fase1")) {
                        Fase1.add(Fase2.get(i));
                    } else if (FaseNext.equals("Fase3")) {
                        Fase3.add(Fase2.get(i));
                    }
                    Fase2.remove(Fase2.get(i));
                    
                }
                
            }
        }
        if (FaseOrigineel.equals("Fase3")) {
            for (int i = 0; i < Fase3.size(); i++) {
                if (Fase3.get(i).getNaam().equals(vaknaam)) {
                    Fase3.get(i).setFase(FaseNext);
                    if (FaseNext.equals("Fase4")) {
                        Fase4.add(Fase3.get(i));
                    } else if (FaseNext.equals("Fase2")) {
                        Fase2.add(Fase3.get(i));
                    }
                    Fase3.remove(Fase3.get(i));
                }
                
            }
        }
        applyToFase();
        
    }
    
    @Override
    public ArrayList<Vak> filterSemester(ArrayList<Vak> lijst, String semesters) {
        ArrayList<Vak> nieuw = new ArrayList();
        for (Vak vak : lijst) {
            if (vak.getSemester().equals(semesters)) {
                nieuw.add(vak);
                
            }
            
        }
        
        return nieuw;
    }
    
    @Override
    public ArrayList<Vak> filterFase(ArrayList<Vak> lijst, String fase) {
        ArrayList<Vak> nieuw = new ArrayList();
        for (Vak vak : lijst) {
            if (vak.getFase().equals(fase)) {
                nieuw.add(vak);
                //als fase gelijk is, toevoegen

            }
            
        }
        
        return nieuw;
        
    }
    
    @Override
    public void pasFaseToe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

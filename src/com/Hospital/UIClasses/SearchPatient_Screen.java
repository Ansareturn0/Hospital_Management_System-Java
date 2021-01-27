package com.Hospital.UIClasses;

import com.Hospital.Core_Classes.Doctors;
import com.Hospital.Core_Classes.Patient;
import com.Hospital.SearchingAndModiciation_Classes.ModifyEntities;

import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class SearchPatient_Screen extends javax.swing.JFrame {
    private final ModifyEntities modificationFunctions=new ModifyEntities();
    private Patient mapPatients;
    DefaultTableModel model;
    public SearchPatient_Screen() {
        initComponents();
        model=(DefaultTableModel) showPatientTable.getModel();
        Image icon = Toolkit.getDefaultToolkit().getImage("UIComponents\\hos.png");
        this.setIconImage(icon);
        this.setTitle("Lahore General Hospital I.M.S");
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        searchPatient = new javax.swing.JTextField();
        searchPatientButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        showPatientTable = new javax.swing.JTable();
        showPatientNameLable = new javax.swing.JLabel();
        backToWellcomeScreen = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);


        jPanel1.setBackground(new java.awt.Color(171, 183, 183));
        jLabel1.setIcon(new javax.swing.ImageIcon("UIComponents\\logo.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(30, 130, 76));
        jLabel2.setText("Lahore General Hospital Management System");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(30, 130, 76));
        jLabel3.setText("Search Patient's Details");

        jPanel3.setBackground(new java.awt.Color(93, 170, 136));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setText("● Patient ID/Name/Phone");

        searchPatient.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        searchPatient.setForeground(new java.awt.Color(48, 51, 107));
        searchPatient.setToolTipText("Enter Patient ID or Name");


        searchPatientButton.setText("Search    ");
        searchPatientButton.setToolTipText("Search Patient's Details. Note: ID is more effective rather then name.");
        searchPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPatientButtonActionPerformed(evt);
            }
        });

        showPatientTable.setAutoCreateRowSorter(true);
        showPatientTable.setBackground(new java.awt.Color(221, 221, 221));
        showPatientTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        showPatientTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "ID", "Name", "Service", "Age", "Gender", "COVID-19", "Phone", "C.N.I.C", "Address", "Admitted", "Entery Date"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        showPatientTable.setToolTipText("Current Details of Patient");
        showPatientTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane2.setViewportView(showPatientTable);

        showPatientNameLable.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        showPatientNameLable.setText(" ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(showPatientNameLable, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addComponent(searchPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(searchPatientButton)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 859, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(searchPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(searchPatientButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(showPatientNameLable)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(158, 158, 158))
        );

        backToWellcomeScreen.setBackground(new java.awt.Color(171, 183, 183));
        backToWellcomeScreen.setIcon(new javax.swing.ImageIcon("UIComponents\\back.png")); // NOI18N
        backToWellcomeScreen.setText("Back");
        backToWellcomeScreen.setToolTipText("Back to Wellcome Screen");
        backToWellcomeScreen.setBorder(null);
        backToWellcomeScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToWellcomeScreenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(362, 362, 362)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 383, Short.MAX_VALUE)
                                                .addComponent(backToWellcomeScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(backToWellcomeScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(346, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1388, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    //==================================================================================================================
    private void searchPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO Search Patient
        String NameORIdOrPhone=searchPatient.getText();
        mapPatients=modificationFunctions.searchEntities.searchPatientByIdAndPhone(NameORIdOrPhone);
        if( mapPatients!=null)
        {

            showPatientNameLable.setText(mapPatients.getName() + " ( Patient)");
            model.setRowCount(0);
            model.insertRow(0, new Object[]{mapPatients.getId(), mapPatients.getName(),mapPatients.getService(),
            mapPatients.getAge(),mapPatients.getGender(),mapPatients.getCovid(),mapPatients.getPhone(),mapPatients.getCnic(),
            mapPatients.getAddress(),mapPatients.getAdmitted(),mapPatients.getTime()});

        }
        else
        {

            showPatientNameLable.setText("Patient Not Found!");
            model.setRowCount(0);
        }
    }
    //==================================================================================================================
    private void backToWellcomeScreenActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your  Back to Wellcome here
        Welcome_Screen welcomeScreen=new Welcome_Screen();
        this.setVisible(false);
        welcomeScreen.setVisible(true);
    }
    //==================================================================================================================

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SearchPatient_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchPatient_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchPatient_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchPatient_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchPatient_Screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JToggleButton backToWellcomeScreen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField searchPatient;
    private javax.swing.JButton searchPatientButton;
    private javax.swing.JLabel showPatientNameLable;
    private javax.swing.JTable showPatientTable;
    // End of variables declaration
}

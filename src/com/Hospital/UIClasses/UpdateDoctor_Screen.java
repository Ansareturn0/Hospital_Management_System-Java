package com.Hospital.UIClasses;

import com.Hospital.Core_Classes.Doctors;
import com.Hospital.SearchingAndModiciation_Classes.ModifyEntities;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.IOException;
import java.util.Objects;

public class UpdateDoctor_Screen extends javax.swing.JFrame{
    private ModifyEntities modificationFunctions=new ModifyEntities();
    private Doctors mapDoctors;
    DefaultTableModel model;

    public UpdateDoctor_Screen() {
        initComponents();
        UpdateDeatilsButton.setVisible(false);
        EditingPanal.setVisible(false);
        model=(DefaultTableModel) showDoctorsTable.getModel();
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
        searchDoctorName = new javax.swing.JTextField();
        searchDoctorButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        showDoctorsTable = new javax.swing.JTable();
        showDoctorNameLable = new javax.swing.JLabel();
        backToWellcomeScreen = new javax.swing.JToggleButton();
        EditingPanal = new javax.swing.JPanel();
        enableEditingCheckBoxButton = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        updateNameLable = new javax.swing.JLabel();
        NameUpdateTextField = new javax.swing.JTextField();
        updateAddressLable = new javax.swing.JLabel();
        AddressUpdateTextField = new javax.swing.JTextField();
        updateCnicLable = new javax.swing.JLabel();
        CnicUpdateTextField = new javax.swing.JFormattedTextField();
        updateSalaryLable = new javax.swing.JLabel();
        SpecializationUpdateComboBox = new javax.swing.JComboBox<>();
        updateServiceLable = new javax.swing.JLabel();
        ServiceUpdateComboBox = new javax.swing.JComboBox<>();
        updateSpecialiazationLable = new javax.swing.JLabel();
        SalaryUpdateComboBox = new javax.swing.JComboBox<>();
        UpdateDeatilsButton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);



        jPanel1.setBackground(new java.awt.Color(171, 183, 183));


        jLabel1.setIcon(new javax.swing.ImageIcon("UIComponents\\logo.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(30, 130, 76));
        jLabel2.setText("Lahore General Hospital Management System");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(30, 130, 76));
        jLabel3.setText("Update Doctor's Details");

        jPanel3.setBackground(new java.awt.Color(93, 170, 136));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setText("● Doctor ID");

        searchDoctorName.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        searchDoctorName.setForeground(new java.awt.Color(48, 51, 107));
        searchDoctorName.setToolTipText("Enter 4-Digit Doctor ID to change its details");


        searchDoctorButton.setText("Search    ");
        searchDoctorButton.setToolTipText("Search Doctor's Previous Details");
        searchDoctorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchDoctorButtonActionPerformed(evt);
            }
        });

        showDoctorsTable.setAutoCreateRowSorter(true);
        showDoctorsTable.setBackground(new java.awt.Color(221, 221, 221));
        showDoctorsTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        showDoctorsTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "ID", "Name", "Specialization", "Service", "C.N.I.C", "Home Address", "Current Salary"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        showDoctorsTable.setToolTipText("Current Details of Doctor");
        showDoctorsTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane2.setViewportView(showDoctorsTable);

        showDoctorNameLable.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        showDoctorNameLable.setText(" ");

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
                                                        .addComponent(showDoctorNameLable, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addComponent(searchDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(searchDoctorButton)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(searchDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(searchDoctorButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(showDoctorNameLable)
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

        EditingPanal.setBackground(new java.awt.Color(95, 169, 135));

        enableEditingCheckBoxButton.setBackground(new java.awt.Color(93, 170, 135));
        enableEditingCheckBoxButton.setBorder(null);
        enableEditingCheckBoxButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enableEditingCheckBoxButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel5.setText("Enable Editing");

        updateNameLable.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        updateNameLable.setText("● Update Name");

        NameUpdateTextField.setEditable(false);
        NameUpdateTextField.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        NameUpdateTextField.setForeground(new java.awt.Color(0, 204, 204));


        updateAddressLable.setText("● Update Address");

        AddressUpdateTextField.setEditable(false);
        AddressUpdateTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AddressUpdateTextField.setForeground(new java.awt.Color(0, 153, 153));

        updateCnicLable.setText("● Update C.N.I.C");

        CnicUpdateTextField.setEditable(false);
        CnicUpdateTextField.setForeground(new java.awt.Color(0, 204, 204));
        try {
            CnicUpdateTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-#######-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        updateSalaryLable.setText("● Update Salary");

        SpecializationUpdateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MBBS", "Surgeon", "Neurosurgeon", "Gastroleogist", "Cardiologist", "Osteopath", "Immunologist", "Plastic Surgeon", "Dermatologist", "Thoracic Surgeon", "Periodontist", "Vascular Surgeon", "Endocrinologist", "Spinal Cord Injury Specialist" }));

        updateServiceLable.setText("● Update Service");

        ServiceUpdateComboBox.setForeground(new java.awt.Color(0, 153, 204));
        ServiceUpdateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OPD", "Emergency", "Reserved" }));


        updateSpecialiazationLable.setText("● Update Specialization");

        SalaryUpdateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 lac", "2 lac", "3 lac", "4 lac", "5 lac" }));

        UpdateDeatilsButton.setText("Update Details");
        UpdateDeatilsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateDetailsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EditingPanalLayout = new javax.swing.GroupLayout(EditingPanal);
        EditingPanal.setLayout(EditingPanalLayout);
        EditingPanalLayout.setHorizontalGroup(
                EditingPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(EditingPanalLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(EditingPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(CnicUpdateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, EditingPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(AddressUpdateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, EditingPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(NameUpdateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, EditingPanalLayout.createSequentialGroup()
                                                                .addGroup(EditingPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, EditingPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addGroup(EditingPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(updateServiceLable)
                                                                                        .addComponent(updateAddressLable)
                                                                                        .addComponent(updateCnicLable)
                                                                                        .addComponent(updateSpecialiazationLable, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(updateNameLable)
                                                                                        .addGroup(EditingPanalLayout.createSequentialGroup()
                                                                                                .addGap(10, 10, 10)
                                                                                                .addGroup(EditingPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                        .addGroup(EditingPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                                                .addComponent(SalaryUpdateComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                .addComponent(updateSalaryLable, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                        .addComponent(ServiceUpdateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addComponent(SpecializationUpdateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, EditingPanalLayout.createSequentialGroup()
                                                                                        .addGap(27, 27, 27)
                                                                                        .addComponent(jLabel5)
                                                                                        .addGap(18, 18, 18)
                                                                                        .addComponent(enableEditingCheckBoxButton)))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, EditingPanalLayout.createSequentialGroup()
                                                                                .addGap(54, 54, 54)
                                                                                .addComponent(UpdateDeatilsButton)))
                                                                .addGap(5, 5, 5)))))
                                .addContainerGap(78, Short.MAX_VALUE))
        );
        EditingPanalLayout.setVerticalGroup(
                EditingPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(EditingPanalLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(EditingPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5)
                                        .addComponent(enableEditingCheckBoxButton))
                                .addGap(8, 8, 8)
                                .addComponent(updateNameLable)
                                .addGap(4, 4, 4)
                                .addComponent(NameUpdateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(updateAddressLable)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AddressUpdateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(updateCnicLable, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CnicUpdateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(updateSpecialiazationLable)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SpecializationUpdateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(updateServiceLable)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ServiceUpdateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(updateSalaryLable)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SalaryUpdateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(UpdateDeatilsButton)
                                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(362, 362, 362)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 352, Short.MAX_VALUE)
                                                .addComponent(backToWellcomeScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(62, 62, 62)
                                                .addComponent(EditingPanal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(EditingPanal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(277, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1357, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 964, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    private void searchDoctorButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO Search Doctor
        String ID=searchDoctorName.getText();
        mapDoctors=modificationFunctions.searchEntities.searchDoctorByNameAndId(ID);
        if(mapDoctors!=null)
        {
            EditingPanal.setVisible(true);
            assert false;
            showDoctorNameLable.setText(mapDoctors.getName() + " (L.G.S)");
            model.setRowCount(0);
            model.insertRow(0, new Object[]{mapDoctors.getId(), mapDoctors.getName(), mapDoctors.getSpecialization(),
            mapDoctors.getService(), mapDoctors.getCnic(), mapDoctors.getAddress(), mapDoctors.getSalary()});
            NameUpdateTextField.setText(mapDoctors.getName());
            AddressUpdateTextField.setText(mapDoctors.getAddress());
            CnicUpdateTextField.setText(mapDoctors.getCnic());
            SetComboBoxValues();

        }
        else if(mapDoctors==null)
        {
            EditingPanal.setVisible(false);
            showDoctorNameLable.setText("Doctor Not Found!");
            model.setRowCount(0);
        }
    }

    private void SetComboBoxValues()
    {
        //==============================================================================================================
        String[] Specialization=new String[]{"MBBS", "Surgeon", "Neurosurgeon", "Gastroleogist", "Cardiologist", "Osteopath", "Immunologist", "Plastic Surgeon", "Dermatologist", "Thoracic Surgeon", "Periodontist", "Vascular Surgeon", "Endocrinologist", "Spinal Cord Injury Specialist"};
        SpecializationUpdateComboBox.removeAllItems(); // Removing Items to avoid Duplication
        SpecializationUpdateComboBox.addItem(mapDoctors.getSpecialization()); //Adding Current Value
        for (String value : Specialization)
        {
            if (!Objects.requireNonNull(SpecializationUpdateComboBox.getSelectedItem()).toString().equals(value))
            { SpecializationUpdateComboBox.addItem(value); }
        }
        //--------------------------------------------------------------------------------------------------------------
        String[] Salary=new String[]{"1 lac", "2 lac", "3 lac", "4 lac", "5 lac"};
        SalaryUpdateComboBox.removeAllItems(); // Removing Items to avoid Duplication
        SalaryUpdateComboBox.addItem(mapDoctors.getSalary()); //Adding Current Value
        for (String s : Salary)
        {
            if (!Objects.requireNonNull(SalaryUpdateComboBox.getSelectedItem()).toString().equals(s))
            { SalaryUpdateComboBox.addItem(s); }
        }
        //--------------------------------------------------------------------------------------------------------------
        String[] Services=new String[]{"OPD", "Emergency", "Reserved"};
        ServiceUpdateComboBox.removeAllItems(); // Removing Items to avoid Duplication
        ServiceUpdateComboBox.addItem(mapDoctors.getService()); //Adding Current Value
        for (String service : Services)
        {
            if (!Objects.requireNonNull(ServiceUpdateComboBox.getSelectedItem()).toString().equals(service))
            { ServiceUpdateComboBox.addItem(service); }
        }
        //--------------------------------------------------------------------------------------------------------------
    }
    //==================================================================================================================
    private void backToWellcomeScreenActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your Back to Welcome here
        Welcome_Screen welcomeScreen=new Welcome_Screen();
        this.setVisible(false);
        welcomeScreen.setVisible(true);
    }
    //==================================================================================================================

    private void enableEditingCheckBoxButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO set Editable to every TextFiels and ComboBox Here
        if(enableEditingCheckBoxButton.isSelected())
        {
            NameUpdateTextField.setEditable(true);
            AddressUpdateTextField.setEditable(true);
            CnicUpdateTextField.setEditable(true);
            UpdateDeatilsButton.setVisible(true);
        }
        else if(!enableEditingCheckBoxButton.isSelected())
        {
            NameUpdateTextField.setEditable(false);
            AddressUpdateTextField.setEditable(false);
            CnicUpdateTextField.setEditable(false);
            UpdateDeatilsButton.setVisible(false);
        }
    }
    //==================================================================================================================
    private void UpdateDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO : update Doctor Details
        String id=mapDoctors.getId();
        String name=modificationFunctions.formatSetter(NameUpdateTextField.getText());
        String address=modificationFunctions.formatSetter(AddressUpdateTextField.getText());
        String cinc=modificationFunctions.formatSetter(CnicUpdateTextField.getText());
        String specialization=(String) SpecializationUpdateComboBox.getSelectedItem();
        String service=(String) ServiceUpdateComboBox.getSelectedItem();
        String salary=(String) SalaryUpdateComboBox.getSelectedItem();
        boolean flag=modificationFunctions.updateDoctor(id,name,address,cinc,specialization,service,salary);
       if(flag)
       {
           try { modificationFunctions.addDoctors(); } catch (IOException ignored) {  }
           ImageIcon icon = new ImageIcon("UIComponents\\tick.png");
           JOptionPane.showMessageDialog(null, "Doctor Successfully Updated!", "Updated", JOptionPane.ERROR_MESSAGE, icon);
           searchDoctorButtonActionPerformed(evt);
       }
       else
       {
           ImageIcon icon = new ImageIcon("UIComponents\\error.png");
           JOptionPane.showMessageDialog(null, "Doctor Update Failed!", "Error", JOptionPane.ERROR_MESSAGE, icon);
       }
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
            java.util.logging.Logger.getLogger(UpdateDoctor_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateDoctor_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateDoctor_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateDoctor_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateDoctor_Screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JTextField AddressUpdateTextField;
    private javax.swing.JFormattedTextField CnicUpdateTextField;
    private javax.swing.JPanel EditingPanal;
    private javax.swing.JTextField NameUpdateTextField;
    private javax.swing.JComboBox<String> SalaryUpdateComboBox;
    private javax.swing.JComboBox<String> ServiceUpdateComboBox;
    private javax.swing.JComboBox<String> SpecializationUpdateComboBox;
    private javax.swing.JToggleButton UpdateDeatilsButton;
    private javax.swing.JToggleButton backToWellcomeScreen;
    private javax.swing.JCheckBox enableEditingCheckBoxButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton searchDoctorButton;
    private javax.swing.JTextField searchDoctorName;
    private javax.swing.JLabel showDoctorNameLable;
    private javax.swing.JTable showDoctorsTable;
    private javax.swing.JLabel updateAddressLable;
    private javax.swing.JLabel updateCnicLable;
    private javax.swing.JLabel updateNameLable;
    private javax.swing.JLabel updateSalaryLable;
    private javax.swing.JLabel updateServiceLable;
    private javax.swing.JLabel updateSpecialiazationLable;
    // End of variables declaration
}

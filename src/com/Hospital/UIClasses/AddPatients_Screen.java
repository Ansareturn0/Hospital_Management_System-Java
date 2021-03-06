package com.Hospital.UIClasses;

import com.Hospital.Core_Classes.DoctorAssociationWithPatient;
import com.Hospital.Core_Classes.Doctors;
import com.Hospital.Core_Classes.Patient;
import com.Hospital.LinkedList_DSA.LinkedList;
import com.Hospital.SearchingAndModiciation.ModifyEntities;
import com.Hospital.Stack_DSA.Stack;


import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.IOException;

public class AddPatients_Screen extends javax.swing.JFrame{
    private ModifyEntities modificationFunctions=new ModifyEntities();
    private LinkedList<Patient> patientLinkedList=new LinkedList<>();
    private LinkedList<Doctors> doctorLinkedList=new LinkedList<>();
    DefaultTableModel model;
    public AddPatients_Screen() {
        initComponents();
        model=(DefaultTableModel) showPatientsOnTable.getModel();
        showDoctorsList.setVisible(false);
        showDoctorLable.setVisible(false);
        Image icon = Toolkit.getDefaultToolkit().getImage("UIComponents\\hos.png");
        this.setIconImage(icon);
        this.setTitle("Lahore General Hospital IMS");
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
        addPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        addPatientName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        addPatientAddress = new javax.swing.JTextField();
        addpatientLinkedListGender = new javax.swing.JComboBox<>();
        addPatientCOVID = new javax.swing.JComboBox<>();
        addPatientService = new javax.swing.JComboBox<>();
        addPatientAdmit = new javax.swing.JComboBox<>();
        addPatientBUTTON = new javax.swing.JButton();
        addPatientPhone = new javax.swing.JFormattedTextField();
        addPatientCnic = new javax.swing.JFormattedTextField();
        showDoctorLable = new javax.swing.JLabel();
        showDoctorsList = new javax.swing.JComboBox<>();
        addPatientAge = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        backToWellcomeScreen = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        showPatientsOnTable = new javax.swing.JTable();



        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addPanel.setBackground(new java.awt.Color(171, 183, 183));
        addPanel.setPreferredSize(new java.awt.Dimension(1609, 942));

        jLabel1.setIcon(new javax.swing.ImageIcon("UIComponents\\logo.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(30, 130, 76));
        jLabel2.setText("Lahore General Hospital Management System");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(30, 130, 76));
        jLabel3.setText("Add Patient in L.G.H");

        jPanel3.setBackground(new java.awt.Color(93, 170, 136));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setText("● Patient Name");

        addPatientName.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        addPatientName.setForeground(new java.awt.Color(48, 51, 107));
        addPatientName.setToolTipText("Patient Name");
        addPatientName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addPatientNameMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setText("● Gendar");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setText("● Phone Number");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel7.setText("● C.N.I.C");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel8.setText("●  Address");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel9.setText("● Age");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel10.setText("● COVID-19 Status");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel11.setText("● Hospital Service");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel12.setText("● Admit in Hospital");

        addPatientAddress.setForeground(new java.awt.Color(19, 15, 64));
        addPatientAddress.setToolTipText("Address be like, House#.Street.City");


        addpatientLinkedListGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Transgender" }));
        addpatientLinkedListGender.setToolTipText("Choose Gender");


        addPatientCOVID.setForeground(new java.awt.Color(255, 51, 51));
        addPatientCOVID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Positive", "Negative", "Test not Conducted" }));
        addPatientCOVID.setToolTipText("Choose Covid Status");

        addPatientService.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Emergency", "OPD" }));
        addPatientService.setToolTipText("Choose Hospital Service");


        addPatientService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPatientServiceActionPerformed(evt);
            }
        });


        addPatientAdmit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        addPatientAdmit.setToolTipText("Admit in Hospital");

        addPatientBUTTON.setIcon(new javax.swing.ImageIcon("UIComponents\\patient.png")); // NOI18N
        addPatientBUTTON.setText(" Add Patient        ");
        addPatientBUTTON.setToolTipText("Click to Add Patient");
        addPatientBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPatientBUTTONActionPerformed(evt);
            }
        });

        try {
            addPatientPhone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-#######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        addPatientPhone.setToolTipText("Enter Phone Number");


        try {
            addPatientCnic.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-#######-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        addPatientCnic.setToolTipText("Enter C.N.I.C");


        showDoctorLable.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        showDoctorLable.setText("● Approve Doctor");



        try {
            addPatientAge.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        addPatientAge.setToolTipText("Enter Age of Patient");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel7)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(addPatientAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(addPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(addPatientPhone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(addPatientCnic, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel11)
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGap(10, 10, 10)
                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(addpatientLinkedListGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                                .addComponent(addPatientService, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addGap(2, 2, 2)))))
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGap(18, 18, Short.MAX_VALUE)
                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel10)
                                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                                .addGap(10, 10, 10)
                                                                                .addComponent(addPatientCOVID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(23, 23, 23))
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                                .addGap(10, 10, 10)
                                                                                .addComponent(addPatientAdmit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(jLabel12))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addContainerGap(238, Short.MAX_VALUE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(showDoctorLable, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGap(10, 10, 10)
                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(addPatientAge, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(showDoctorsList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                                .addGap(23, 23, 23))))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(addPatientBUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(addPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addpatientLinkedListGender, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addPatientCOVID, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel12))
                                .addGap(3, 3, 3)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(addPatientService, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addPatientPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addPatientAdmit, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(showDoctorLable))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(addPatientCnic, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(showDoctorsList, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(addPatientAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addPatientAge, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addComponent(addPatientBUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(75, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(30, 130, 76));
        jLabel13.setText("Recently Added Patients");

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

        showPatientsOnTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Patient ID", "Name", "Phone", "C.N.I.C", "Service", "Age", "Gender", "COVID-19", "Address    "
                }
        ));
        showPatientsOnTable.setToolTipText("Patient Record in L.G.S");
        jScrollPane2.setViewportView(showPatientsOnTable);

        javax.swing.GroupLayout addPanelLayout = new javax.swing.GroupLayout(addPanel);
        addPanel.setLayout(addPanelLayout);
        addPanelLayout.setHorizontalGroup(
                addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(addPanelLayout.createSequentialGroup()
                                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(addPanelLayout.createSequentialGroup()
                                                .addGap(360, 360, 360)
                                                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(addPanelLayout.createSequentialGroup()
                                                                .addComponent(jLabel1)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(backToWellcomeScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(addPanelLayout.createSequentialGroup()
                                                .addGap(57, 57, 57)
                                                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(24, 24, 24)
                                                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(69, 69, 69)))
                                .addContainerGap(63, Short.MAX_VALUE))
        );
        addPanelLayout.setVerticalGroup(
                addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(addPanelLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPanelLayout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel13)))
                                        .addGroup(addPanelLayout.createSequentialGroup()
                                                .addComponent(backToWellcomeScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(204, 204, 204)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addContainerGap(508, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(addPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1367, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(addPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1163, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    //==================================================================================================================
    private void addPatientServiceActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here: Acation
        String DoctorReserve=(String) addPatientService.getSelectedItem();
        assert DoctorReserve != null;

        if(DoctorReserve.equals("OPD"))
        {
            doctorLinkedList=modificationFunctions.searchEntities.getDoctorLinkedList();
            showDoctorsList.removeAllItems();
            showDoctorLable.setVisible(true);
            showDoctorsList.setVisible(true);
            for(int count=0;count<doctorLinkedList.size();count++)
            {
                showDoctorsList.addItem(doctorLinkedList.get(count).getName()+",  "+doctorLinkedList.get(count).getSpecialization());
            }


        }
        else if(DoctorReserve.equals("Emergency"))
        {
            showDoctorLable.setVisible(false);
            showDoctorsList.setVisible(false);
        }

    }
    //==================================================================================================================
    private void FetchTextFromScreen()
    {
        String name=modificationFunctions.formatSetter(addPatientName.getText());
        String cnic=modificationFunctions.formatSetter(addPatientCnic.getText());
        String address=modificationFunctions.formatSetter(addPatientAddress.getText());
        String phone=modificationFunctions.formatSetter(addPatientPhone.getText());
        String gender= (String) addpatientLinkedListGender.getSelectedItem();
        String covid= (String) addPatientCOVID.getSelectedItem();
        String service= (String) addPatientService.getSelectedItem();
        String admit= (String) addPatientAdmit.getSelectedItem();
        String age= addPatientAge.getText();
        String time=modificationFunctions.addTimeRecord();
        String patientId= String.valueOf(modificationFunctions.generatePatientId());
        modificationFunctions.searchEntities.loadData.patientLinkedList.add(new Patient(patientId,name,cnic,phone,address,covid,admit,service,gender,age,time));
        try { modificationFunctions.addPatients(); } catch (IOException ignored) { }
        String doctor=(String) showDoctorsList.getSelectedItem();
        if(doctor!=null)
        {
            String[] doctorID = doctor.split(",");
            String Id = modificationFunctions.searchEntities.searchDoctorByNameAndId(doctorID[0]).getId();
            modificationFunctions.searchEntities.loadData.doctorAssociationWithPatientLinkedList.add(new DoctorAssociationWithPatient(patientId,Id));
            try { modificationFunctions.addAssociatedPatients(); } catch (IOException ignored) { }
        }
    }
    //==================================================================================================================
    private void ShowAllPatientsAndSortOPDAndEmergency()
    {
        try { modificationFunctions.addOPDPatients(); } catch (IOException ignored) { }
        try { modificationFunctions.addEmergencyPatients(); } catch (IOException ignored) { }
    }
    //==================================================================================================================
    private void ShowPatientOnTable()
    {
        Stack<Patient> patientStack=modificationFunctions.searchEntities.getPatientStack();
        Patient patient;
        model.setRowCount(0);
        while(!patientStack.empty())
        {
            patient=patientStack.pop();
            System.out.println(patient.getId());
            model.addRow(new Object[]{patient.getId(),patient.getName(),patient.getPhone(),
                    patient.getCnic(),patient.getService(),patient.getAge(),patient.getGender(),
                    patient.getCovid(),patient.getAddress()});
        }
    }
    //==================================================================================================================
    private void addPatientBUTTONActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your Add Patient Button and all patient related entites
        FetchTextFromScreen();
        ShowAllPatientsAndSortOPDAndEmergency();
        ShowPatientOnTable();
    }
    //==================================================================================================================
    private void backToWellcomeScreenActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your Back to Wellcome here
        Welcome_Screen welcome_screen=new Welcome_Screen();
        addPanel.setLayout(new java.awt.BorderLayout());
        addPanel.removeAll();
        addPanel.add(welcome_screen.MainPanel);
        addPanel.validate();
    }
    //==================================================================================================================
    private void addPatientNameMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add click show Patients
        ShowPatientOnTable();
    }
    //==================================================================================================================

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Windows".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(AddPatients_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AddPatients_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AddPatients_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AddPatients_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AddPatients_Screen().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify
    private javax.swing.JTextField addPatientAddress;
    private javax.swing.JComboBox<String> addPatientAdmit;
    private javax.swing.JFormattedTextField addPatientAge;
    private javax.swing.JButton addPatientBUTTON;
    private javax.swing.JComboBox<String> addPatientCOVID;
    private javax.swing.JFormattedTextField addPatientCnic;
    private javax.swing.JTextField addPatientName;
    private javax.swing.JFormattedTextField addPatientPhone;
    private javax.swing.JComboBox<String> addPatientService;
    private javax.swing.JComboBox<String> addpatientLinkedListGender;
    private javax.swing.JToggleButton backToWellcomeScreen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel addPanel;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel showDoctorLable;
    private javax.swing.JComboBox<String> showDoctorsList;
    private javax.swing.JTable showPatientsOnTable;
    // End of variables declaration
}

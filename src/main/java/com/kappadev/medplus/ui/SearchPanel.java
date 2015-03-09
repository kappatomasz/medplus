package com.kappadev.medplus.ui;

import com.kappadev.medplus.ui.patientLog.PatientLogPanel;
import com.kappadev.medplus.ui.patient.models.PatientTableModel;
import com.kappadev.medplus.ui.patient.PatientPanel;
import java.util.List;
import com.kappadev.medplus.data.DB.states.entity.States;
import com.kappadev.medplus.data.DB.states.service.StatesService;
import com.kappadev.medplus.data.Patient.entity.Patient;
import com.kappadev.medplus.data.Patient.service.PatientService;
import com.kappadev.medplus.data.PatientLog.entity.PatientLog;
import com.kappadev.medplus.data.PatientLog.service.PatientLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Tomasz
 */
@Component
public class SearchPanel extends javax.swing.JFrame {

    /**
     * Creates new form SearchPanel
     */
    private List<States> states;
    private List<Patient> patientListValues;
    private List<Patient> selectedPatients;
    private List<PatientLog> selectedPatientLogs;
    private MessagePopUp popUp;

    @Autowired
    private StatesService statesService;

    @Autowired
    private PatientService patientService;

    @Autowired
    private PatientLogService patientLogService;
    
    public SearchPanel(){
        
    }
    
    public SearchPanel(boolean init) {
        initComponents();
        infoLbl.setText("");
        clearFields();
//        states = statesService.getAllStates();
//        patientListValues = patientService.getAllPatients();
      
        stateComboBox.removeAllItems();
//        DefaultComboBoxModel<States> comboBoxModel = new DefaultComboBoxModel<>();
//        for (States state : states) {
//            comboBoxModel.addElement(state);
//        }
//        stateComboBox.setModel(comboBoxModel);
        deleteBtn.setEnabled(false);
//        patientList.setModel(new PatientTableModel(patientListValues));
        popUp = new MessagePopUp();
//        removeColumnsFromTable();

//        AutoSuggest surnameTxtFldAutoSuggest = new AutoSuggest(surnameTxtFld, this, null,
//                Color.WHITE.brighter(), Color.BLUE, Color.RED, 1.0f) {
//                    @Override
//                    boolean wordTyped(String typedWord) {
//                        Set<String> dict = new HashSet<>();
//                        for (Patient patient : patientListValues) {
//                            dict.add(patient.getSurname());
//                        }
//                        setDictionary(new ArrayList<>(dict));
//                        return super.wordTyped(typedWord);
//                    }
//                };
//        AutoSuggest streetTxtFldAutoSuggest = new AutoSuggest(streetTxtFld, this, null, Color.WHITE.brighter(),
//                Color.BLUE, Color.RED, 1.0f) {
//                    @Override
//                    boolean wordTyped(String typedWord) {
//                        Set<String> dict = new HashSet<>();
//                        for (Patient patient : patientListValues) {
//                            dict.add(patient.getStreet());
//                        }
//                        setDictionary(new ArrayList<>(dict));
//                        return super.wordTyped(typedWord);
//                    }
//                };
//
//        AutoSuggest cityAutoSuggest = new AutoSuggest(cityTxtFld, this,
//                null, Color.WHITE.brighter(), Color.BLUE, Color.RED, 1.0f) {
//                    @Override
//                    boolean wordTyped(String typedWord) {
//                        Set<String> dict = new HashSet<>();
//                        for (Patient patient : patientListValues) {
//                            dict.add(patient.getCity());
//                        }
//                        setDictionary(new ArrayList<>(dict));
//                        return super.wordTyped(typedWord);
//                    }
//                };
//
//        AutoSuggest postCodeAutoSuggest = new AutoSuggest(postCodeTxtFld, this,
//                null, Color.WHITE.brighter(), Color.BLUE, Color.RED, 1.0f) {
//                    @Override
//                    boolean wordTyped(String typedWord) {
//                        Set<String> dict = new HashSet<>();
//                        for (Patient patient : patientListValues) {
//                            dict.add(patient.getPostCode());
//                        }
//                        setDictionary(new ArrayList<>(dict));
//                        return super.wordTyped(typedWord);
//                    }
//                };

        openBtn.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        patientList = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        infoLbl = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        clearBtn = new javax.swing.JButton();
        findBtn = new javax.swing.JButton();
        addNewPatientBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        stateComboBox = new javax.swing.JComboBox();
        phoneTxtFld = new javax.swing.JTextField();
        postCodeTxtFld = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        phoneLbl = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cityTxtFld = new javax.swing.JTextField();
        flatNoTxtFld = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        streetTxtFld = new javax.swing.JTextField();
        houseNoTxtFld = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        peselTxtFld = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        surnameTxtFld = new javax.swing.JTextField();
        secondNameTxtFld = new javax.swing.JTextField();
        nameTxtFld = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        openBtn = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel1.setText("Med Plus v0.3");

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 0, 15)); // NOI18N
        jLabel2.setText("Lista odnalezionych pacjentów");

        patientList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        patientList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patientListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(patientList);

        infoLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        infoLbl.setText("jLabel14");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(infoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(infoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        infoLbl.getAccessibleContext().setAccessibleName("infoLbl");

        clearBtn.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        clearBtn.setText("Wyczyść");
        clearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearBtnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearBtnMouseEntered(evt);
            }
        });
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        findBtn.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        findBtn.setText("Wyszukaj");
        findBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                findBtnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                findBtnMouseEntered(evt);
            }
        });
        findBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findBtnActionPerformed(evt);
            }
        });

        addNewPatientBtn.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        addNewPatientBtn.setText("Dodaj");
        addNewPatientBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addNewPatientBtnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addNewPatientBtnMouseEntered(evt);
            }
        });
        addNewPatientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewPatientBtnActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        backBtn.setText("Powrót");
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backBtnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backBtnMouseEntered(evt);
            }
        });
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addComponent(findBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(addNewPatientBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(findBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addNewPatientBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel10.setText("województwo");

        stateComboBox.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        stateComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        stateComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateComboBoxActionPerformed(evt);
            }
        });

        phoneTxtFld.setFont(new java.awt.Font("DejaVu Sans", 0, 13)); // NOI18N
        phoneTxtFld.setText("jTextField1");

        postCodeTxtFld.setFont(new java.awt.Font("DejaVu Sans", 0, 13)); // NOI18N
        postCodeTxtFld.setText("jTextField1");

        jLabel12.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel12.setText("kod pocztowy");

        phoneLbl.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        phoneLbl.setText("telefon");

        jLabel9.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel9.setText("miejscowość");

        cityTxtFld.setFont(new java.awt.Font("DejaVu Sans", 0, 13)); // NOI18N
        cityTxtFld.setText("jTextField7");

        flatNoTxtFld.setFont(new java.awt.Font("DejaVu Sans", 0, 13)); // NOI18N
        flatNoTxtFld.setText("jTextField6");

        jLabel8.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel8.setText("nr lokalu");

        streetTxtFld.setFont(new java.awt.Font("DejaVu Sans", 0, 13)); // NOI18N
        streetTxtFld.setText("jTextField4");

        houseNoTxtFld.setFont(new java.awt.Font("DejaVu Sans", 0, 13)); // NOI18N
        houseNoTxtFld.setText("jTextField5");
        houseNoTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                houseNoTxtFldActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel7.setText("nr domu");

        jLabel6.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel6.setText("ulica");

        peselTxtFld.setFont(new java.awt.Font("DejaVu Sans", 0, 13)); // NOI18N
        peselTxtFld.setText("jTextField3");

        jLabel5.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel5.setText("PESEL");

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel4.setText("nazwisko");

        surnameTxtFld.setFont(new java.awt.Font("DejaVu Sans", 0, 13)); // NOI18N
        surnameTxtFld.setText("jTextField2");

        secondNameTxtFld.setFont(new java.awt.Font("DejaVu Sans", 0, 13)); // NOI18N
        secondNameTxtFld.setText("jTextField1");

        nameTxtFld.setFont(new java.awt.Font("DejaVu Sans", 0, 13)); // NOI18N
        nameTxtFld.setText("jTextField1");

        jLabel13.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel13.setText("drugie imię");

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel3.setText("imię");

        jLabel11.setFont(new java.awt.Font("DejaVu Sans", 0, 15)); // NOI18N
        jLabel11.setText("kryteria przeszukiwania rejestru");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(stateComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(phoneLbl)
                                .addGap(84, 84, 84)
                                .addComponent(phoneTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(132, 132, 132)
                                    .addComponent(postCodeTxtFld, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
                                .addComponent(jLabel12))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGap(74, 74, 74)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(streetTxtFld, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                    .addComponent(houseNoTxtFld)
                                    .addComponent(flatNoTxtFld, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cityTxtFld, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(secondNameTxtFld)
                                    .addComponent(nameTxtFld)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(68, 68, 68)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(surnameTxtFld)
                                    .addComponent(peselTxtFld))))
                        .addGap(38, 38, 38))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(secondNameTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(surnameTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(peselTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(streetTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(houseNoTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(flatNoTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel12))
                    .addComponent(postCodeTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLbl)
                    .addComponent(phoneTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(38, 38, 38))
        );

        openBtn.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        openBtn.setText("Otwórz");
        openBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                openBtnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                openBtnMouseEntered(evt);
            }
        });
        openBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openBtnActionPerformed(evt);
            }
        });

        editButton.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        editButton.setText("Edytuj");
        editButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editButtonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editButtonMouseEntered(evt);
            }
        });
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        deleteBtn.setText("Usuń");
        deleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteBtnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteBtnMouseEntered(evt);
            }
        });
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(openBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 170, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(openBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        RegistryPanel rp = new RegistryPanel();
        rp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        PatientTableModel model = (PatientTableModel) patientList.getModel();
        
        int[] selectedRows = patientList.getSelectedRows();

        selectedPatients = model.getSelectedPatientList(selectedRows);
        selectedPatientLogs = model.getSelectedPatientPatiemtLogs(selectedRows);
        String popUpMsg = "";
        if (selectedPatients.size() == 1) {
            popUpMsg = "Czy aby napewno chcesz usunąć "
                    + "tego pacjenta i jego historię choroby ?";

        } else if (selectedPatients.size() > 1) {
            popUpMsg = "Czy aby napewno chcesz usunąć "
                    + "zaznaczonych pacjentów i ich historię choroby ?";
        }
        popUp.setText(popUpMsg);
        popUp.pack();
        popUp.setVisible(true);
        boolean confirmed = popUp.getStateResult();
        if (confirmed) {
            patientLogService.removePatientLogList(selectedPatientLogs);
            patientService.removePatientList(selectedPatients);
            patientListValues = patientService.getAllPatients();
            patientList.setModel(new PatientTableModel(patientListValues));
            removeColumnsFromTable();

        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void addNewPatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewPatientBtnActionPerformed
        PatientPanel plp = new PatientPanel(true);
        plp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addNewPatientBtnActionPerformed

    private void openBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openBtnActionPerformed
        Patient selectedPatient = getSelectedPatient();
        PatientLogPanel plp = new PatientLogPanel(selectedPatient);
        plp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_openBtnActionPerformed

    private void patientListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientListMouseClicked
        Patient selectedPatient = getSelectedPatient();
        if (selectedPatient.isSelected()) {
            openBtn.setEnabled(true);
            deleteBtn.setEnabled(true);
        } else {
            openBtn.setEnabled(false);
            deleteBtn.setEnabled(false);
        }

    }//GEN-LAST:event_patientListMouseClicked

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        Patient selectedPatient = getSelectedPatient();
        PatientPanel pp = new PatientPanel(selectedPatient);
        pp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_editButtonActionPerformed

    private void addNewPatientBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addNewPatientBtnMouseEntered
        infoLbl.setText(String.format("<html><div style=\"width:300px;\">%s</div><html>", "Dodaj pacjenta do bazy"));
    }//GEN-LAST:event_addNewPatientBtnMouseEntered

    private void addNewPatientBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addNewPatientBtnMouseExited
        infoLbl.setText("");
    }//GEN-LAST:event_addNewPatientBtnMouseExited

    private void backBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseEntered
        infoLbl.setText(String.format("<html><div style=\"width:300px;\">%s</div><html>", "Powrót do poprzedniego ekranu"));
    }//GEN-LAST:event_backBtnMouseEntered

    private void backBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseExited
        infoLbl.setText("");
    }//GEN-LAST:event_backBtnMouseExited

    private void openBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openBtnMouseEntered
        infoLbl.setText(String.format("<html><div style=\"width:300px;\">%s</div><html>", "Otwórz historię zaznaczonego pacjenta"));
    }//GEN-LAST:event_openBtnMouseEntered

    private void openBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openBtnMouseExited
        infoLbl.setText("");
    }//GEN-LAST:event_openBtnMouseExited

    private void editButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButtonMouseEntered
        infoLbl.setText(String.format("<html><div style=\"width:300px;\">%s</div><html>", "Edytuj dane osobowe pacjenta"));
    }//GEN-LAST:event_editButtonMouseEntered

    private void editButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButtonMouseExited
        infoLbl.setText("");
    }//GEN-LAST:event_editButtonMouseExited

    private void deleteBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnMouseEntered
        infoLbl.setText(String.format("<html><div style=\"width:300px;\">%s</div><html>", "Usuń pacjenta z bazy danych"));
    }//GEN-LAST:event_deleteBtnMouseEntered

    private void deleteBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnMouseExited
        infoLbl.setText("");
    }//GEN-LAST:event_deleteBtnMouseExited

    private void findBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findBtnActionPerformed
        Patient patient = new Patient();
        if (!cityTxtFld.getText().equals("")) {
            patient.setCity(cityTxtFld.getText());
        }
        if (!flatNoTxtFld.getText().equals("")) {
            patient.setFlat(flatNoTxtFld.getText());
        } else {
            patient.setFlat("");
        }
        if (!houseNoTxtFld.getText().equals("")) {
            patient.setHouseNo(houseNoTxtFld.getText());
        } else {
            patient.setHouseNo("");
        }
        if (!nameTxtFld.getText().equals("")) {
            patient.setName(nameTxtFld.getText());
        } else {
            patient.setName("");
        }
        if (!secondNameTxtFld.getText().equals("")) {
            patient.setSecondName(secondNameTxtFld.getText());
        } else {
            patient.setSecondName("");
        }
        if (null != (States) stateComboBox.getSelectedItem()) {
            patient.setState(((States) stateComboBox.getSelectedItem()));
        }
        if (!streetTxtFld.getText().equals("")) {
            patient.setStreet(streetTxtFld.getText());
        } else {
            patient.setStreet("");
        }
        if (!surnameTxtFld.getText().equals("")) {
            patient.setSurname(surnameTxtFld.getText());
        } else {
            patient.setSurname("");
        }
        if (!peselTxtFld.getText().equals("")) {
            patient.setId(Long.valueOf(peselTxtFld.getText()));
        }
        if (!phoneTxtFld.getText().equals("")) {
            patient.setPhone(phoneTxtFld.getText());
        } else {
            patient.setPhone("");
        }
        if (!postCodeTxtFld.getText().equals("")) {
            patient.setPostCode(postCodeTxtFld.getText().replace("-", ""));
        } else {
            patient.setPostCode("");
        }
        
        patientListValues = patientService.getFilteredPatients(patient);
        patientList.removeAll();
        patientList.setModel(new PatientTableModel(patientListValues));
        removeColumnsFromTable();
    }//GEN-LAST:event_findBtnActionPerformed

    private void findBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_findBtnMouseEntered
        infoLbl.setText(String.format("<html><div style=\"width:300px;\">%s</div><html>", "Wyszukaj wyniki w bazie"));
    }//GEN-LAST:event_findBtnMouseEntered

    private void findBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_findBtnMouseExited
        infoLbl.setText("");
    }//GEN-LAST:event_findBtnMouseExited

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        clearFields();
    }//GEN-LAST:event_clearBtnActionPerformed

    private void clearBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBtnMouseEntered
        infoLbl.setText(String.format("<html><div style=\"width:300px;\">%s</div><html>", "Wyczyść pola kryteriów wyszukiwania"));
    }//GEN-LAST:event_clearBtnMouseEntered

    private void clearBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBtnMouseExited
        infoLbl.setText("");
    }//GEN-LAST:event_clearBtnMouseExited

    private void stateComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stateComboBoxActionPerformed

    private void houseNoTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_houseNoTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_houseNoTxtFldActionPerformed

    private void removeColumnsFromTable() {
        patientList.removeColumn(patientList.getColumnModel().getColumn(3));
        patientList.removeColumn(patientList.getColumnModel().getColumn(4));
        patientList.removeColumn(patientList.getColumnModel().getColumn(4));
        patientList.removeColumn(patientList.getColumnModel().getColumn(4));
        patientList.removeColumn(patientList.getColumnModel().getColumn(5));
        patientList.removeColumn(patientList.getColumnModel().getColumn(5));
        patientList.validate();
        patientList.repaint();
    }

    private void clearFields() {
        nameTxtFld.setText("");
        secondNameTxtFld.setText("");
        surnameTxtFld.setText("");
        streetTxtFld.setText("");
        houseNoTxtFld.setText("");
        flatNoTxtFld.setText("");
        cityTxtFld.setText("");
        postCodeTxtFld.setText("");
        phoneTxtFld.setText("");
        peselTxtFld.setText("");
    }

    private Patient getSelectedPatient() {
        PatientTableModel model = (PatientTableModel) patientList.getModel();
        int selectedRow = patientList.getSelectedRow();
        int convertedRowIndex = patientList.convertRowIndexToModel(selectedRow);
        Patient selectedPatient = model.getSelectedPatient(convertedRowIndex);
        return selectedPatient;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewPatientBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField cityTxtFld;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editButton;
    private javax.swing.JButton findBtn;
    private javax.swing.JTextField flatNoTxtFld;
    private javax.swing.JTextField houseNoTxtFld;
    private javax.swing.JLabel infoLbl;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nameTxtFld;
    private javax.swing.JButton openBtn;
    private javax.swing.JTable patientList;
    private javax.swing.JTextField peselTxtFld;
    private javax.swing.JLabel phoneLbl;
    private javax.swing.JTextField phoneTxtFld;
    private javax.swing.JTextField postCodeTxtFld;
    private javax.swing.JTextField secondNameTxtFld;
    private javax.swing.JComboBox stateComboBox;
    private javax.swing.JTextField streetTxtFld;
    private javax.swing.JTextField surnameTxtFld;
    // End of variables declaration//GEN-END:variables
}

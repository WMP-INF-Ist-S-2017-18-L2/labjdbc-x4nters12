package lab2_db_connect;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class DbAccess extends javax.swing.JFrame {
    public DbAccess() {
        initComponents();
        this.setVisible(true);
        this.setTitle("LAB2_JDBC -> dk");

        /////////////////////////////////////////////////////////////////////////////////////////////////
        // ZADANIE 4
        zad4itemstableModel = new DefaultTableModel(tableDATA,tableCOLNAMES);
        zad4itemstable.setModel(zad4itemstableModel);
        zad4itemstable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        zad4searchRadioShowall.setSelected(true);
        zad4searchRadioGroup = new ButtonGroup();
        zad4searchRadioGroup.add(zad4searchRadioShowall);
        zad4searchRadioGroup.add(zad4searchRadioShowfound);
        zad4searchRadioShowall.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(zad4searchRadioShowall.isSelected()) zad4itemstable.setModel(zad4itemstableModel); 
                if(zad4searchRadioShowfound.isSelected()) zad4itemstable.setModel(zad4itemstableModelFound); 
            }
        });
        zad4searchRadioShowfound.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(zad4searchRadioShowall.isSelected()) zad4itemstable.setModel(zad4itemstableModel); 
                if(zad4searchRadioShowfound.isSelected()) zad4itemstable.setModel(zad4itemstableModelFound); 
            }
        });
        zad4statusText.setText("[ OK ] Gotowy.");
        
        /////////////////////////////////////////////////////////////////////////////////////////////////
        // ZADANIE 5
        zad5itemstableOsobaModel = new DefaultTableModel(zad5itOsobaDATA,zad5itOsobaCOLNAMES);
        zad5itemstableOsoba.setModel(zad5itemstableOsobaModel);
        zad5itemstableOsoba.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        zad5itemstableKodpocztowyModel = new DefaultTableModel(zad5itKodpocztowyDATA,zad5itKodpocztowyCOLNAMES);
        zad5itemstableKodpocztowy.setModel(zad5itemstableKodpocztowyModel);
        zad5itemstableKodpocztowy.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        zad5itemstableMiejscowoscModel = new DefaultTableModel(zad5itMiejscowoscDATA,zad5itMiejscowoscCOLNAMES);
        zad5itemstableMiejscowosc.setModel(zad5itemstableMiejscowoscModel);
        zad5itemstableMiejscowosc.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        zad5itemstableWojewodztwoModel = new DefaultTableModel(zad5itWojewodztwoDATA,zad5itWojewodztwoCOLNAMES);
        zad5itemstableWojewodztwo.setModel(zad5itemstableWojewodztwoModel);
        zad5itemstableWojewodztwo.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        zad5updateDATA();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        zad4connectionsConnect = new javax.swing.JButton();
        zad4connectionsDisconnect = new javax.swing.JButton();
        zad4connectionsUpdatedata = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        zad4searchNameValue = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        zad4searchValueValue = new javax.swing.JTextField();
        zad4searchName = new javax.swing.JButton();
        zad4searchValue = new javax.swing.JButton();
        zad4searchRadioShowall = new javax.swing.JRadioButton();
        zad4searchRadioShowfound = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        zad4addNameValue = new javax.swing.JTextField();
        zad4addValueValue = new javax.swing.JTextField();
        zad4addAddrecord = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        zad4updateNameValue = new javax.swing.JTextField();
        zad4updateValueValue = new javax.swing.JTextField();
        zad4updateUpdaterecord = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        zad4removeBynameValue = new javax.swing.JTextField();
        zad4removeByname = new javax.swing.JButton();
        zad4removeSelected = new javax.swing.JButton();
        zad4statusText = new javax.swing.JLabel();
        zad4connectState = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        zad4itemstable = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        zad5osobaAddImieLabel = new javax.swing.JLabel();
        zad5osobaAddImieValue = new javax.swing.JTextField();
        zad5osobaAddNazwiskoLabel = new javax.swing.JLabel();
        zad5osobaAddNazwiskoValue = new javax.swing.JTextField();
        zad5osobaAddUlicaLabel = new javax.swing.JLabel();
        zad5osobaAddUlicaValue = new javax.swing.JTextField();
        zad5osobaAddNrlokaluLabel = new javax.swing.JLabel();
        zad5osobaAddNrlokaluValue = new javax.swing.JTextField();
        zad5osobaAddPlecLabel = new javax.swing.JLabel();
        zad5osobaAddPlecCombo = new javax.swing.JComboBox<>();
        zad5osobaAddKodpocztowyLabel = new javax.swing.JLabel();
        zad5osobaAddKodpocztowyCombo = new javax.swing.JComboBox<>();
        zad5osobaAddExecute = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        zad5itemstableOsoba = new javax.swing.JTable();
        zad5osobaEdit = new javax.swing.JButton();
        zad5osobaRemove = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        zad5kodpocztowyAddKodLabel = new javax.swing.JLabel();
        zad5kodpocztowyAddKodValue = new javax.swing.JTextField();
        zad5kodpocztowyAddMiejscowoscLabel = new javax.swing.JLabel();
        zad5kodpocztowyAddMiejscowoscCombo = new javax.swing.JComboBox<>();
        zad5kodpocztowyAddExecute = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        zad5itemstableKodpocztowy = new javax.swing.JTable();
        zad5kodpocztowyEdit = new javax.swing.JButton();
        zad5kodpocztowyRemove = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        zad5mmiejscowoscAddMiejscowoscLabel = new javax.swing.JLabel();
        zad5miejscowoscAddMiejscowoscValue = new javax.swing.JTextField();
        zad5mmiejscowoscAddWojewodztwoLabel = new javax.swing.JLabel();
        zad5miejscowoscAddWojewodztwoCombo = new javax.swing.JComboBox<>();
        zad5miejscowoscAddExecute = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        zad5itemstableMiejscowosc = new javax.swing.JTable();
        zad5miejscowoscEdit = new javax.swing.JButton();
        zad5miejscowoscRemove = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        zad5wojewodztwoAddWojewodztwoLabel = new javax.swing.JLabel();
        zad5wojewodztwoAddWojewodztwoValue = new javax.swing.JTextField();
        zad5wojewodztwoAddExecute = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        zad5itemstableWojewodztwo = new javax.swing.JTable();
        zad5wojewodztwoEdit = new javax.swing.JButton();
        zad5wojewodztwoRemove = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        zad5statusText = new javax.swing.JLabel();
        zad5updateDATA = new javax.swing.JButton();
        zad5connectStatus = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel18 = new javax.swing.JPanel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel24 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jPanel26 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel19 = new javax.swing.JPanel();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jPanel23 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jPanel27 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jPanel28 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jTabbedPane7 = new javax.swing.JTabbedPane();
        jPanel29 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jPanel30 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jPanel31 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jTabbedPane8 = new javax.swing.JTabbedPane();
        jPanel32 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jPanel33 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();
        jPanel34 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        zad6statusText = new javax.swing.JLabel();
        zad6connectStatus = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        zad6disconnect = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        zad4connectionsConnect.setText("Połącz z bazą danych");
        zad4connectionsConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zad4connectionsConnectActionPerformed(evt);
            }
        });

        zad4connectionsDisconnect.setText("Rozłącz z bazą danych");
        zad4connectionsDisconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zad4connectionsDisconnectActionPerformed(evt);
            }
        });

        zad4connectionsUpdatedata.setText("Aktualizuj listę");
        zad4connectionsUpdatedata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zad4connectionsUpdatedataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(zad4connectionsConnect, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(zad4connectionsDisconnect, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(zad4connectionsUpdatedata, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(zad4connectionsConnect, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(zad4connectionsDisconnect, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(zad4connectionsUpdatedata, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Połączenia", jPanel6);

        jLabel1.setText("Nazwa");

        jLabel2.setText("Cena");

        zad4searchName.setText("Szukaj po nazwie produktu");
        zad4searchName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zad4searchNameActionPerformed(evt);
            }
        });

        zad4searchValue.setText("Szukaj po cenie produktu");
        zad4searchValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zad4searchValueActionPerformed(evt);
            }
        });

        zad4searchRadioShowall.setText("Pokaż wszystkie rekordy");

        zad4searchRadioShowfound.setText("Pokaż wyniki wyszukiwania");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(zad4searchNameValue, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                    .addComponent(zad4searchValueValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(zad4searchValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(zad4searchName, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(zad4searchRadioShowfound, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(zad4searchRadioShowall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zad4searchName)
                    .addComponent(zad4searchRadioShowall)
                    .addComponent(zad4searchNameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zad4searchValue)
                    .addComponent(zad4searchValueValue, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(zad4searchRadioShowfound))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Szukaj", jPanel2);

        jLabel3.setText("Nazwa");

        jLabel4.setText("Cena");

        zad4addAddrecord.setText("Dodaj rekord");
        zad4addAddrecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zad4addAddrecordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(zad4addNameValue, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                    .addComponent(zad4addValueValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(zad4addAddrecord, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(zad4addAddrecord, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(zad4addNameValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(zad4addValueValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Dodawanie rekordu", jPanel3);

        jLabel6.setText("Nazwa");

        jLabel7.setText("Cena");

        zad4updateUpdaterecord.setText("Aktualizuj zaznaczone");
        zad4updateUpdaterecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zad4updateUpdaterecordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(zad4updateNameValue, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                    .addComponent(zad4updateValueValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(zad4updateUpdaterecord, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(zad4updateUpdaterecord, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(zad4updateNameValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(zad4updateValueValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Aktualizuj rekord", jPanel5);

        jLabel5.setText("Nazwa");

        zad4removeByname.setText("Usuń po nazwie");
        zad4removeByname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zad4removeBynameActionPerformed(evt);
            }
        });

        zad4removeSelected.setText("Usuń zaznaczony");
        zad4removeSelected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zad4removeSelectedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(zad4removeSelected, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                        .addComponent(zad4removeBynameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zad4removeByname, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(zad4removeBynameValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(zad4removeByname)))
                .addComponent(zad4removeSelected)
                .addGap(20, 20, 20))
        );

        jTabbedPane2.addTab("Usuwanie rekordu", jPanel4);

        zad4statusText.setText("[ OK ] Gotowy.");

        zad4connectState.setText("---");

        zad4itemstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produkt", "Cena"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(zad4itemstable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane2)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(zad4statusText, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(zad4connectState)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zad4statusText)
                    .addComponent(zad4connectState))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Zadanie 4", jPanel1);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Dodawanie rekordów"));

        zad5osobaAddImieLabel.setText("Imię");

        zad5osobaAddNazwiskoLabel.setText("Nazwisko");

        zad5osobaAddUlicaLabel.setText("Ulica");

        zad5osobaAddNrlokaluLabel.setText("Nr lokalu");

        zad5osobaAddPlecLabel.setText("Płeć");

        zad5osobaAddKodpocztowyLabel.setText("Kod pocztowy");

        zad5osobaAddExecute.setText("Dodaj");
        zad5osobaAddExecute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zad5osobaAddExecuteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(zad5osobaAddNazwiskoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(zad5osobaAddImieLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(zad5osobaAddImieValue, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zad5osobaAddNazwiskoValue, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(zad5osobaAddUlicaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(zad5osobaAddNrlokaluLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(zad5osobaAddUlicaValue, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zad5osobaAddNrlokaluValue, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(zad5osobaAddKodpocztowyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(zad5osobaAddPlecLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(zad5osobaAddKodpocztowyCombo, 0, 120, Short.MAX_VALUE)
                    .addComponent(zad5osobaAddPlecCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(zad5osobaAddExecute, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(zad5osobaAddExecute, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(zad5osobaAddImieLabel)
                            .addComponent(zad5osobaAddImieValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zad5osobaAddUlicaValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zad5osobaAddPlecLabel)
                            .addComponent(zad5osobaAddPlecCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zad5osobaAddUlicaLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(zad5osobaAddNazwiskoLabel)
                            .addComponent(zad5osobaAddNazwiskoValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zad5osobaAddNrlokaluValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zad5osobaAddKodpocztowyCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zad5osobaAddNrlokaluLabel)
                            .addComponent(zad5osobaAddKodpocztowyLabel))))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        zad5itemstableOsoba.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(zad5itemstableOsoba);

        zad5osobaEdit.setText("Edytuj zaznaczony rekord");
        zad5osobaEdit.setEnabled(false);

        zad5osobaRemove.setText("Usuń zaznaczony rekord");
        zad5osobaRemove.setEnabled(false);
        zad5osobaRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zad5osobaRemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(zad5osobaEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(zad5osobaRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zad5osobaEdit)
                    .addComponent(zad5osobaRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane3.addTab("OSOBA", jPanel9);

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder("Dodawanie rekordów"));

        zad5kodpocztowyAddKodLabel.setText("Kod pocztowy");

        zad5kodpocztowyAddMiejscowoscLabel.setText("Miejscowość");

        zad5kodpocztowyAddExecute.setText("Dodaj");
        zad5kodpocztowyAddExecute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zad5kodpocztowyAddExecuteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(zad5kodpocztowyAddKodLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(zad5kodpocztowyAddKodValue, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(zad5kodpocztowyAddMiejscowoscLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(zad5kodpocztowyAddMiejscowoscCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(zad5kodpocztowyAddExecute)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zad5kodpocztowyAddKodLabel)
                    .addComponent(zad5kodpocztowyAddKodValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zad5kodpocztowyAddMiejscowoscLabel)
                    .addComponent(zad5kodpocztowyAddMiejscowoscCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zad5kodpocztowyAddExecute))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        zad5itemstableKodpocztowy.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(zad5itemstableKodpocztowy);

        zad5kodpocztowyEdit.setText("Edytuj zaznaczony rekord");
        zad5kodpocztowyEdit.setEnabled(false);

        zad5kodpocztowyRemove.setText("Usuń zaznaczony rekord");
        zad5kodpocztowyRemove.setEnabled(false);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(zad5kodpocztowyEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(zad5kodpocztowyRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zad5kodpocztowyEdit)
                    .addComponent(zad5kodpocztowyRemove))
                .addContainerGap())
        );

        jTabbedPane3.addTab("KOD_POCZTOWY", jPanel10);

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder("Dodawanie rekordów"));

        zad5mmiejscowoscAddMiejscowoscLabel.setText("Miejscowość");

        zad5mmiejscowoscAddWojewodztwoLabel.setText("Województwo");

        zad5miejscowoscAddExecute.setText("Dodaj");
        zad5miejscowoscAddExecute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zad5miejscowoscAddExecuteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(zad5mmiejscowoscAddMiejscowoscLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(zad5miejscowoscAddMiejscowoscValue, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(zad5mmiejscowoscAddWojewodztwoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(zad5miejscowoscAddWojewodztwoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(zad5miejscowoscAddExecute)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zad5mmiejscowoscAddMiejscowoscLabel)
                    .addComponent(zad5miejscowoscAddMiejscowoscValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zad5mmiejscowoscAddWojewodztwoLabel)
                    .addComponent(zad5miejscowoscAddWojewodztwoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zad5miejscowoscAddExecute))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        zad5itemstableMiejscowosc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(zad5itemstableMiejscowosc);

        zad5miejscowoscEdit.setText("Edytuj zaznaczony rekord");
        zad5miejscowoscEdit.setEnabled(false);

        zad5miejscowoscRemove.setText("Usuń zaznaczony rekord");
        zad5miejscowoscRemove.setEnabled(false);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(zad5miejscowoscEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(zad5miejscowoscRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zad5miejscowoscEdit)
                    .addComponent(zad5miejscowoscRemove))
                .addContainerGap())
        );

        jTabbedPane3.addTab("MIEJSCOWOŚĆ", jPanel11);

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder("Dodawanie rekordów"));

        zad5wojewodztwoAddWojewodztwoLabel.setText("Województwo");

        zad5wojewodztwoAddExecute.setText("Dodaj");
        zad5wojewodztwoAddExecute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zad5wojewodztwoAddExecuteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(zad5wojewodztwoAddWojewodztwoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(zad5wojewodztwoAddWojewodztwoValue, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(zad5wojewodztwoAddExecute)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zad5wojewodztwoAddWojewodztwoLabel)
                    .addComponent(zad5wojewodztwoAddWojewodztwoValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zad5wojewodztwoAddExecute))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        zad5itemstableWojewodztwo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(zad5itemstableWojewodztwo);

        zad5wojewodztwoEdit.setText("Edytuj zaznaczony rekord");
        zad5wojewodztwoEdit.setEnabled(false);

        zad5wojewodztwoRemove.setText("Usuń zaznaczony rekord");
        zad5wojewodztwoRemove.setEnabled(false);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(zad5wojewodztwoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(zad5wojewodztwoRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zad5wojewodztwoEdit)
                    .addComponent(zad5wojewodztwoRemove))
                .addContainerGap())
        );

        jTabbedPane3.addTab("WOJEWÓDZTWO", jPanel12);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("WSZYSTKIE", jPanel16);

        zad5statusText.setText("[ OK ] Gotowy.");

        zad5updateDATA.setText("Aktualizuj dane");
        zad5updateDATA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zad5updateDATAActionPerformed(evt);
            }
        });

        zad5connectStatus.setText("---");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane3)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(zad5statusText, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(zad5connectStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(zad5updateDATA)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zad5statusText)
                    .addComponent(zad5updateDATA, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zad5connectStatus))
                .addGap(12, 12, 12))
        );

        jTabbedPane1.addTab("Zadanie 5", jPanel7);

        jLabel8.setText("PESEL");

        jLabel9.setText("Telefon");

        jButton3.setText("Dodaj");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, 0, 351, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Dodawanie", jPanel24);

        jLabel10.setText("PESEL");

        jLabel11.setText("Telefon");

        jButton4.setText("Edytuj zaznaczony");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Edycja", jPanel25);

        jButton5.setText("Usuń zaznaczony");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Usuwanie", jPanel26);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane5)
                    .addComponent(jScrollPane6))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane4.addTab("KLIENT", jPanel18);

        jLabel14.setText("Producent");

        jLabel15.setText("Model");

        jLabel16.setText("Cena");

        jButton6.setText("Dodaj");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("Dodawanie", jPanel23);

        jLabel17.setText("Producent");

        jLabel18.setText("Model");

        jLabel19.setText("Cena");

        jButton7.setText("Edytuj zaznaczony");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7)
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("Edycja", jPanel27);

        jButton8.setText("Usuń zaznaczony");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton8)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("Usuwanie", jPanel28);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane7.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane6)
                    .addComponent(jScrollPane7))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane4.addTab("TELEFON", jPanel19);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane8.setViewportView(jTable3);

        jLabel12.setText("Nazwa");

        jButton9.setText("Dodaj");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton9)
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane7.addTab("Dodawanie", jPanel29);

        jLabel13.setText("Nazwa");

        jButton10.setText("Edytuj zaznaczone");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10)
                .addContainerGap())
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane7.addTab("Edycja", jPanel30);

        jButton11.setText("Usuń zaznaczony");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane7.addTab("Usuwanie", jPanel31);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8)
                    .addComponent(jTabbedPane7))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane4.addTab("PRODUCENT", jPanel20);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane9.setViewportView(jTable4);

        jLabel20.setText("Nazwa");

        jButton13.setText("Dodaj");

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton13)
                .addContainerGap())
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTabbedPane8.addTab("Dodawanie", jPanel32);

        jLabel21.setText("Nazwa");

        jButton14.setText("Edycja");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton14)
                .addContainerGap())
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTabbedPane8.addTab("Edycja", jPanel33);

        jButton12.setText("Usuń zaznaczone");

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane8.addTab("Usuwanie", jPanel34);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9)
                    .addComponent(jTabbedPane8))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane4.addTab("MODEL", jPanel21);

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 757, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 423, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("WSZYSTKIE", jPanel22);

        zad6statusText.setText("[ OK ] Gotowy do połączenia z bazą danych.");

        zad6connectStatus.setText("---");

        jButton1.setText("Połącz");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zad6connectActionPerformed(evt);
            }
        });

        zad6disconnect.setText("Rozłącz");
        zad6disconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zad6disconnectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane4)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(zad6statusText, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(zad6connectStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zad6disconnect)))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zad6statusText)
                    .addComponent(zad6connectStatus)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zad6disconnect, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );

        jTabbedPane1.addTab("Zadanie 6", jPanel17);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void zad4connectionsConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zad4connectionsConnectActionPerformed
        try{
            if(connect != null) connect.close();
            
            zad4itemstableModel = new DefaultTableModel(tableDATA,tableCOLNAMES);
            zad4itemstable.setModel(zad4itemstableModel);
            
            Class.forName("org.sqlite.JDBC");
            connect = DriverManager.getConnection("jdbc:sqlite:BAZA_PRODUKTOW.db");
            
            Statement stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM PRODUKTY");
               
            int rsSize = 0;
            while(rs.next()) rsSize++;
            dbIndex = new Object[rsSize];
            
            rs = stmt.executeQuery("SELECT * FROM PRODUKTY");
            
            int i = 0;
            while(rs.next()){
                dbIndex[i] = rs.getInt("idPRODUCT");
                i++;
                Object[] row = {rs.getString("productNAME"),rs.getDouble("productVALUE")};
                zad4itemstableModel.addRow(row);
            }
        }
        catch(ClassNotFoundException e){
            zad4statusText.setText("[ FAILED ] Nie znaleziono klasy sterownika.");
        }
        catch(SQLException e){
            zad4statusText.setText("[ FAILED ] Błącz łączenia z bazą danych.");
        }
        finally{
            zad4statusText.setText("[ OK ] Połączono z bazą danych.");
            zad4connectState.setText("connect: " + connect);
        }
    }//GEN-LAST:event_zad4connectionsConnectActionPerformed

    private void zad4connectionsDisconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zad4connectionsDisconnectActionPerformed
        if (connect != null){
            try{
                connect.close();
                connect = null;
                
                zad4itemstableModel = new DefaultTableModel(tableDATA,tableCOLNAMES);
                zad4itemstable.setModel(zad4itemstableModel);
            }
            catch(SQLException e){
                zad4statusText.setText("[ FAILED ] Błąd przy rozłączaniu z bazą danych.");
            }
            finally{
                zad4statusText.setText("[ OK ] Rozłączono z bazą danych.");
                zad4connectState.setText("---");
            }
        }else zad4statusText.setText("[ FAILED ] Żadne połączenie nie zostało ustalone.");
        
    }//GEN-LAST:event_zad4connectionsDisconnectActionPerformed

    private void zad4connectionsUpdatedataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zad4connectionsUpdatedataActionPerformed
        zad4updateData();
    }//GEN-LAST:event_zad4connectionsUpdatedataActionPerformed

    private void zad4addAddrecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zad4addAddrecordActionPerformed
        if (connect != null){
            if((!zad4addNameValue.getText().equals("")) && (!zad4addValueValue.getText().equals(""))){
            try{
                Statement stmt = connect.createStatement();
                stmt.executeUpdate("INSERT INTO PRODUKTY(productNAME,productVALUE) VALUES(\"" + (Object)zad4addNameValue.getText() + "\"," + (Object)zad4addValueValue.getText() + ");");
                zad4updateData();
                zad4statusText.setText("[ OK ] Wstawiono nowy rekord.");
            }
            catch(SQLException e){}
            }else zad4statusText.setText("[ FAILED ] Nie można dodać rekordu. Pusty formularz.");
        }else zad4statusText.setText("[ FAILED ] Nie można dodać rekordu. Brak połączenia z bazą danych.");
        
    }//GEN-LAST:event_zad4addAddrecordActionPerformed

    private void zad4updateUpdaterecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zad4updateUpdaterecordActionPerformed
        if(connect != null){
            if ((!zad4updateNameValue.getText().equals("")) && (!zad4updateValueValue.getText().equals("")) && (zad4itemstable.getSelectedRow() > -1)){
                try{
                    Statement stmt = connect.createStatement();
                    stmt.executeUpdate("UPDATE PRODUKTY SET productNAME = \'" + zad4updateNameValue.getText() + "\', productVALUE = \'" + zad4updateValueValue.getText() + "\' WHERE idPRODUCT = " + dbIndex[zad4itemstable.getSelectedRow()] + ";");
                    zad4statusText.setText("[ OK ] Zaktualizowano rekord.");
                }
                catch(SQLException e){}
                zad4updateData();
            }else zad4statusText.setText("[ FAILED ] Nie można zaktualizować. Pusty formularz lub brak zaznaczenia.");
        }else zad4statusText.setText("[ FAILED ] Brak połączenia z bazą danych.");
    }//GEN-LAST:event_zad4updateUpdaterecordActionPerformed

    private void zad4removeSelectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zad4removeSelectedActionPerformed
       if(connect != null){
           if(zad4itemstable.getSelectedRow() > -1){
                try{
                    Statement stmt = connect.createStatement();
                    stmt.executeUpdate("DELETE FROM PRODUKTY WHERE idPRODUCT = " + dbIndex[zad4itemstable.getSelectedRow()] + ";");
                    zad4statusText.setText(Integer.toString(zad4itemstable.getSelectedRow()+1));
                    zad4statusText.setText("[ OK ] Usunięto zaznaczony rekord z bazy.");
                }
                catch(SQLException e){}
                zad4updateData();
           }else zad4statusText.setText("[ FAILED ] Żaden rekord nie został zaznaczony.");
       }else zad4statusText.setText("[ FAILED ] Brak połączenia z bazą danych.");
    }//GEN-LAST:event_zad4removeSelectedActionPerformed

    private void zad4removeBynameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zad4removeBynameActionPerformed
        if(connect != null){
            try{
                Statement stmt = connect.createStatement();
                stmt.executeUpdate("DELETE FROM PRODUKTY WHERE productNAME = \'" + zad4removeBynameValue.getText() + "\';");
                zad4updateData();
                zad4statusText.setText("[ OK ] Pomyślnie usunięto rekord(y).");
            }
            catch(SQLException e){}
        }else zad4statusText.setText("[ FAILED ] Brak połączenia z bazą danych.");
    }//GEN-LAST:event_zad4removeBynameActionPerformed

    private void zad4searchNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zad4searchNameActionPerformed
        if(connect != null){
            try{
                zad4itemstableModelFound = new DefaultTableModel(tableDATA,tableCOLNAMES);
            
                Statement stmt = connect.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM PRODUKTY WHERE productNAME = \'" + zad4searchNameValue.getText() + "\';");
            
                while(rs.next()){
                    Object[] row = {rs.getString("productNAME"),rs.getDouble("productVALUE")};
                    zad4itemstableModelFound.addRow(row);
                }
            
                zad4itemstable.setModel(zad4itemstableModelFound);
                zad4searchRadioShowfound.setSelected(true);
                zad4statusText.setText("[ OK ] Wyszukiwanie zakończone.");
            }
            catch(SQLException e){}
        }else zad4statusText.setText("[ FAILED ] Brak połączenia z bazą danych.");
    }//GEN-LAST:event_zad4searchNameActionPerformed

    private void zad4searchValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zad4searchValueActionPerformed
        if(connect != null){
            try{
                zad4itemstableModelFound = new DefaultTableModel(tableDATA,tableCOLNAMES);
            
                Statement stmt = connect.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM PRODUKTY WHERE productVALUE = " + zad4searchValueValue.getText() + ";");
            
                while(rs.next()){
                    Object[] row = {rs.getString("productNAME"),rs.getDouble("productVALUE")};
                    zad4itemstableModelFound.addRow(row);
                }
            
                zad4itemstable.setModel(zad4itemstableModelFound);
                zad4searchRadioShowfound.setSelected(true);
            }
            catch(SQLException e){}
        }else zad4statusText.setText("[ FAILED ] Brak połączenia z bazą danych.");
    }//GEN-LAST:event_zad4searchValueActionPerformed

    private void zad5osobaAddExecuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zad5osobaAddExecuteActionPerformed
        if((!zad5osobaAddImieValue.getText().equals("")) && (!zad5osobaAddNazwiskoValue.getText().equals("")) && (!zad5osobaAddUlicaValue.getText().equals("")) && (!zad5osobaAddNrlokaluValue.getText().equals(""))){
            try{
                Class.forName("org.sqlite.JDBC");
                connect5 = DriverManager.getConnection("jdbc:sqlite:BAZA_OSOB.db");
                Statement stmt = connect5.createStatement();
                zad5connectStatus.setText("connect: " + connect5);
                ResultSet rs = stmt.executeQuery("SELECT id_plci FROM PLEC WHERE plec = \'" + zad5osobaAddPlecCombo.getSelectedItem().toString() + "\';");
                int plec = rs.getInt("id_plci");
                rs = stmt.executeQuery("SELECT id_kodu_pocztowego FROM KOD_POCZTOWY WHERE kod = \'" + zad5osobaAddKodpocztowyCombo.getSelectedItem().toString() + "\';");
                int kodpocztowy = rs.getInt("id_kodu_pocztowego");
                System.out.println(kodpocztowy);
                stmt.executeUpdate("INSERT INTO OSOBA(imie,nazwisko,ulica,nr_lokalu,id_plci,id_kodu_pocztowego) VALUES(\'" + zad5osobaAddImieValue.getText() + "\',\'" + zad5osobaAddNazwiskoValue.getText() + "\',\'" + zad5osobaAddUlicaValue.getText() + "\',\'" + zad5osobaAddNrlokaluValue.getText() + "\'," + plec + "," + kodpocztowy + ");");
                connect5.close();
                zad5statusText.setText("[ OK ] Dodano rekord do tabeli.");
            }
            catch(ClassNotFoundException e){
                zad5statusText.setText("[ FAILED ] Nie znaleziono klasy sterownika.");
            }
            catch(SQLException e){
                zad5statusText.setText("[ FAILED ] SQLException.");
            };
            zad5updateDATA();
        }else zad5statusText.setText("[ FAILED ] Przed dodaniem rekordu wypełnij cały formularz.");
    }//GEN-LAST:event_zad5osobaAddExecuteActionPerformed

    private void zad5kodpocztowyAddExecuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zad5kodpocztowyAddExecuteActionPerformed
        if(!zad5kodpocztowyAddKodValue.getText().equals("") && (zad5kodpocztowyAddMiejscowoscCombo.getItemCount()>0)){
            try{
                Class.forName("org.sqlite.JDBC");
                connect5 = DriverManager.getConnection("jdbc:sqlite:BAZA_OSOB.db");
                Statement stmt = connect5.createStatement();
                zad5connectStatus.setText("connect: " + connect5);
                
                ResultSet rs = stmt.executeQuery("SELECT id_miejscowosci FROM MIEJSCOWOSC WHERE nazwa_miejscowosci = \'" + zad5kodpocztowyAddMiejscowoscCombo.getSelectedItem().toString() + "\';");
                System.out.println(rs.getInt("id_miejscowosci"));
                stmt.executeUpdate("INSERT INTO KOD_POCZTOWY(kod,id_miejscowosci) VALUES(\'" + zad5kodpocztowyAddKodValue.getText() + "\'," + rs.getInt("id_miejscowosci") + ");");
                connect5.close();
                zad5statusText.setText("[ OK ] Dodano rekord do tabeli.");
            }
            catch(ClassNotFoundException e){
                zad5statusText.setText("[ FAILED ] Nie znaleziono klasy sterownika.");
            }
            catch(SQLException e){
                zad5statusText.setText("[ FAILED ] SQLException.");
            };
            zad5updateDATA();
        }else zad5statusText.setText("[ FAILED ] Przed dodaniem rekordu wypełnij cały formularz.");
    }//GEN-LAST:event_zad5kodpocztowyAddExecuteActionPerformed

    private void zad5updateDATAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zad5updateDATAActionPerformed
        zad5updateDATA();
    }//GEN-LAST:event_zad5updateDATAActionPerformed

    private void zad5miejscowoscAddExecuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zad5miejscowoscAddExecuteActionPerformed
        if(!zad5miejscowoscAddMiejscowoscValue.getText().equals("") && (zad5miejscowoscAddWojewodztwoCombo.getItemCount() != 0)){
           try{
                Class.forName("org.sqlite.JDBC");
                connect5 = DriverManager.getConnection("jdbc:sqlite:BAZA_OSOB.db");
                Statement stmt = connect5.createStatement();
                zad5connectStatus.setText("connect: " + connect5);
                ResultSet rs = stmt.executeQuery("SELECT id_wojewodztwa FROM WOJEWODZTWO WHERE nazwa_wojewodztwa = \'" + zad5miejscowoscAddWojewodztwoCombo.getSelectedItem().toString() + "\';");
                
                stmt.executeUpdate("INSERT INTO MIEJSCOWOSC(nazwa_miejscowosci,id_wojewodztwa) VALUES(\'" + zad5miejscowoscAddMiejscowoscValue.getText() + "\'," + rs.getInt("id_wojewodztwa") + ");");
                connect5.close();
                zad5statusText.setText("[ OK ] Dodano rekord do tabeli.");
            }
            catch(ClassNotFoundException e){
                zad5statusText.setText("[ FAILED ] Nie znaleziono klasy sterownika.");
            }
            catch(SQLException e){
                zad5statusText.setText("[ FAILED ] SQLException.");
            };
            
            zad5updateDATA(); 
        }else zad5statusText.setText("[ FAILED ] Przed dodaniem rekordu wypełnij cały formularz.");
    }//GEN-LAST:event_zad5miejscowoscAddExecuteActionPerformed

    private void zad5wojewodztwoAddExecuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zad5wojewodztwoAddExecuteActionPerformed
        if(!zad5wojewodztwoAddWojewodztwoValue.equals("")){
            try{
                Class.forName("org.sqlite.JDBC");
                connect5 = DriverManager.getConnection("jdbc:sqlite:BAZA_OSOB.db");
                Statement stmt = connect5.createStatement();
                zad5connectStatus.setText("connect: " + connect5);
                stmt.executeQuery("INSERT INTO WOJEWODZTWO(nazwa_wojewodztwa) VALUES(\'" + zad5wojewodztwoAddWojewodztwoValue.getText() + "\');");
                connect5.close();
                zad5statusText.setText("[ OK ] Dodano rekord do tabeli.");
            }
            catch(ClassNotFoundException e){
                zad5statusText.setText("[ FAILED ] Nie znaleziono klasy sterownika.");
            }
            catch(SQLException e){
                zad5statusText.setText("[ FAILED ] SQLException.");
            };
            
            zad5updateDATA(); 
        }else zad5statusText.setText("[ FAILED ] Przed dodaniem rekordu wypełnij cały formularz.");
    }//GEN-LAST:event_zad5wojewodztwoAddExecuteActionPerformed

    private void zad5osobaRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zad5osobaRemoveActionPerformed
        //int selectedRowIndex = zad5itemstableOsoba.getSelectedRow();
        try{
            Statement stmt = connect5.createStatement();
        }
        catch(SQLException e){
            zad5statusText.setText("[ FAILED ] SQLException.");
        }
        /*if (selectedRowIndex > -1){
            //try{
                //Statement stmt = connect5.createStatement();
                
                System.out.println(zad5itemstableOsobaModel.getValueAt(selectedRowIndex ,0));
                String imie = zad5itemstableOsobaModel.getValueAt(selectedRowIndex, 0).toString();
                String nazwisko = zad5itemstableOsobaModel.getValueAt(selectedRowIndex, 1).toString();
                String ulica = zad5itemstableOsobaModel.getValueAt(selectedRowIndex, 2).toString();
                String nrlokalu = zad5itemstableOsobaModel.getValueAt(selectedRowIndex, 3).toString();
                int plec = (int)zad5itemstableOsobaModel.getValueAt(selectedRowIndex, 4);
                int kodpocztowy = (int)zad5itemstableOsobaModel.getValueAt(selectedRowIndex, 5);
                System.out.println(imie + nazwisko + ulica + nrlokalu + plec + kodpocztowy);
                
                //ResultSet rs = stmt.executeQuery("SELECT id_osoby FROM OSOBA WHERE imie = \'" + imie + "\' AND nazwisko = \'" + nazwisko + "\' AND ulica = \'" + ulica + "\' AND nr_lokalu = \'" + nrlokalu + "\' AND id_plci = " + plec + " AND id_kodu_pocztowego = " + kodpocztowy + ";");
            
                //while(rs.next()){
                //    System.out.println(rs.getInt("id_osoby"));
                //}
            

                //String[] imie = rs.getString()
            
                //rs = stmt.executeUpdate("DELETE FROM OSOBA WHERE ");
                //connect5.close();
                //zad5statusText.setText("[ OK ] Usunięto pomyślnie rekord.");
                //zad5updateDATA();
            /*}
            catch(SQLException e){
                zad5statusText.setText("[ FAILED ] SQLException.");
            }*//*
        } else zad5statusText.setText("[ FAILED ] Nic nie zaznaczono.");*/
    }//GEN-LAST:event_zad5osobaRemoveActionPerformed

    private void zad6connectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zad6connectActionPerformed
        try{
            if (connect6 != null) connect6.close();
            
            Class.forName("org.sqlite.JDBC");
            connect6 = DriverManager.getConnection("jdbc:sqlite:BAZA6.db");
            
            Statement stmt = connect6.createStatement();
            
            zad6connectStatus.setText("connect: " + connect6);
            zad6statusText.setText("[ OK ] Połączono z bazą danych. Dane zaktualizowane.");
            
        }
        catch(SQLException e){
            zad6statusText.setText("[ FAILED ] SQLException");
        }
        catch(ClassNotFoundException e){
            zad6statusText.setText("[ FAILED ] Nie znaleziono klasy sterownika.");
        }
    }//GEN-LAST:event_zad6connectActionPerformed

    private void zad6disconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zad6disconnectActionPerformed
        if(connect6 != null){
            try{
                connect6.close();
                zad6connectStatus.setText("---");
                zad6statusText.setText("[ OK ] Rozłączono z bazą danych.");
            }
            catch(SQLException e){
                zad6statusText.setText("[ FAILED ] SQLException.");
                zad6connectStatus.setText("---");
            }
        }
    }//GEN-LAST:event_zad6disconnectActionPerformed

    private void zad4updateData(){
        if(connect != null){
            try{
                zad4itemstableModel = new DefaultTableModel(tableDATA,tableCOLNAMES);
                zad4itemstable.setModel(zad4itemstableModel);
                
                Statement stmt = connect.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM PRODUKTY");
               
                int rsSize = 0;
                while(rs.next()) rsSize++;
                dbIndex = new Object[rsSize];
                System.out.println(dbIndex.length);
            
                rs = stmt.executeQuery("SELECT * FROM PRODUKTY");
            
                int i = 0;
                while(rs.next()){
                    dbIndex[i] = rs.getInt("idPRODUCT");
                    i++;
                    Object[] row = {rs.getString("productNAME"),rs.getDouble("productVALUE")};
                    zad4itemstableModel.addRow(row);
                }
            }catch(SQLException e){}
            
            zad4statusText.setText("[ OK ] Baza została zaktualizowana.");
        }else zad4statusText.setText("[ FAILED ] Lista nie może być zaktualizowana. Brak połączenia z bazą danych");
    }  
    
    private void zad5updateDATA(){
        zad5updateDATA.setEnabled(false);
        try{
            zad5itemstableOsobaModel = new DefaultTableModel(zad5itOsobaDATA,zad5itOsobaCOLNAMES);
            zad5itemstableOsoba.setModel(zad5itemstableOsobaModel);
            zad5itemstableOsoba.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
            zad5itemstableKodpocztowyModel = new DefaultTableModel(zad5itKodpocztowyDATA,zad5itKodpocztowyCOLNAMES);
            zad5itemstableKodpocztowy.setModel(zad5itemstableKodpocztowyModel);
            zad5itemstableKodpocztowy.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
            zad5itemstableMiejscowoscModel = new DefaultTableModel(zad5itMiejscowoscDATA,zad5itMiejscowoscCOLNAMES);
            zad5itemstableMiejscowosc.setModel(zad5itemstableMiejscowoscModel);
            zad5itemstableMiejscowosc.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
            zad5itemstableWojewodztwoModel = new DefaultTableModel(zad5itWojewodztwoDATA,zad5itWojewodztwoCOLNAMES);
            zad5itemstableWojewodztwo.setModel(zad5itemstableWojewodztwoModel);
            zad5itemstableWojewodztwo.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
            Class.forName("org.sqlite.JDBC");
            connect5 = DriverManager.getConnection("jdbc:sqlite:BAZA_OSOB.db");
            Statement stmt = connect5.createStatement();
            zad5connectStatus.setText("connect: " + connect5);
            ResultSet rs = stmt.executeQuery("SELECT * FROM OSOBA");
            while(rs.next()){
                Object[] row = {rs.getString("imie"),rs.getString("nazwisko"),rs.getString("ulica"),rs.getString("nr_lokalu"),rs.getInt("id_plci"),rs.getInt("id_kodu_pocztowego")};
                zad5itemstableOsobaModel.addRow(row);
            }
            
            rs = stmt.executeQuery("SELECT * FROM KOD_POCZTOWY");
            while(rs.next()){
                Object[] row = {rs.getString("kod"),rs.getInt("id_miejscowosci")};
                zad5itemstableKodpocztowyModel.addRow(row);
            }
            
            rs = stmt.executeQuery("SELECT * FROM MIEJSCOWOSC");
            while(rs.next()){
                Object[] row = {rs.getString("nazwa_miejscowosci"),rs.getInt("id_wojewodztwa")};
                zad5itemstableMiejscowoscModel.addRow(row);
            }

            rs = stmt.executeQuery("SELECT * FROM WOJEWODZTWO");
            while(rs.next()){
                Object[] row = {rs.getString("nazwa_wojewodztwa")};
                zad5itemstableWojewodztwoModel.addRow(row);
            }
            
            zad5osobaAddPlecCombo.removeAllItems();
            rs = stmt.executeQuery("SELECT * FROM PLEC");
            while(rs.next()){
                zad5osobaAddPlecCombo.addItem(rs.getString("plec"));
            }
            
            zad5osobaAddKodpocztowyCombo.removeAllItems();
            rs = stmt.executeQuery("SELECT * FROM KOD_POCZTOWY");
            while(rs.next()){
                zad5osobaAddKodpocztowyCombo.addItem(rs.getString("kod"));
            }
            
            zad5kodpocztowyAddMiejscowoscCombo.removeAllItems();
            rs = stmt.executeQuery("SELECT * FROM MIEJSCOWOSC");
            while(rs.next()){
                zad5kodpocztowyAddMiejscowoscCombo.addItem(rs.getString("nazwa_miejscowosci"));
            }
            
            zad5miejscowoscAddWojewodztwoCombo.removeAllItems();
            rs = stmt.executeQuery("SELECT * FROM WOJEWODZTWO");
            while(rs.next()){
                zad5miejscowoscAddWojewodztwoCombo.addItem(rs.getString("nazwa_wojewodztwa"));
            }
            
            connect5.close();
            zad5statusText.setText("[ OK ] Zaktualizowano bazę danych.");
        }
        catch(ClassNotFoundException e){
            zad5statusText.setText("[ FAILED ] Nie znaleziono klasy sterownika.");
        }
        catch(SQLException e){};
        zad5updateDATA.setEnabled(true);
    }

    private void zad6updateDATA(){
        
    }
    
    /////////////////////////////////////////////////////////////////////////////////////////////////
    // ZADANIE 4
    Connection connect = null;
    Object[] dbIndex;
    String[] tableCOLNAMES = {"Produkt","Cena"};
    Object[][] tableDATA = {};
    private DefaultTableModel zad4itemstableModel;
    private DefaultTableModel zad4itemstableModelFound;
    int zad4dbSelectedIndex;
    private ButtonGroup zad4searchRadioGroup;
    
    /////////////////////////////////////////////////////////////////////////////////////////////////
    // ZADANIE 5
    Connection connect5 = null;
    
    private DefaultTableModel zad5itemstableOsobaModel;
    String[] zad5itOsobaCOLNAMES = {"Imię","Nazwisko","Ulica","Nr lokalu","Płeć","Kod pocztowy"};
    Object[][] zad5itOsobaDATA = {};
    
    private DefaultTableModel zad5itemstableKodpocztowyModel;
    String[] zad5itKodpocztowyCOLNAMES = {"Kod pocztowy","Miejscowość"};
    Object[][] zad5itKodpocztowyDATA = {};
    
    private DefaultTableModel zad5itemstableMiejscowoscModel;
    String[] zad5itMiejscowoscCOLNAMES = {"Miejscowość","Województwo"};
    Object[][] zad5itMiejscowoscDATA = {};
    
    private DefaultTableModel zad5itemstableWojewodztwoModel;
    String[] zad5itWojewodztwoCOLNAMES = {"Województwo"};
    Object[][] zad5itWojewodztwoDATA = {};
    int[] zad5wojewodztwoID;
    int zad5wojewodztwaIDSIZE;
    
    /////////////////////////////////////////////////////////////////////////////////////////////////
    // ZADANIE 6
    Connection connect6 = null;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JTabbedPane jTabbedPane8;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JButton zad4addAddrecord;
    private javax.swing.JTextField zad4addNameValue;
    private javax.swing.JTextField zad4addValueValue;
    private javax.swing.JLabel zad4connectState;
    private javax.swing.JButton zad4connectionsConnect;
    private javax.swing.JButton zad4connectionsDisconnect;
    private javax.swing.JButton zad4connectionsUpdatedata;
    private javax.swing.JTable zad4itemstable;
    private javax.swing.JButton zad4removeByname;
    private javax.swing.JTextField zad4removeBynameValue;
    private javax.swing.JButton zad4removeSelected;
    private javax.swing.JButton zad4searchName;
    private javax.swing.JTextField zad4searchNameValue;
    private javax.swing.JRadioButton zad4searchRadioShowall;
    private javax.swing.JRadioButton zad4searchRadioShowfound;
    private javax.swing.JButton zad4searchValue;
    private javax.swing.JTextField zad4searchValueValue;
    private javax.swing.JLabel zad4statusText;
    private javax.swing.JTextField zad4updateNameValue;
    private javax.swing.JButton zad4updateUpdaterecord;
    private javax.swing.JTextField zad4updateValueValue;
    private javax.swing.JLabel zad5connectStatus;
    private javax.swing.JTable zad5itemstableKodpocztowy;
    private javax.swing.JTable zad5itemstableMiejscowosc;
    private javax.swing.JTable zad5itemstableOsoba;
    private javax.swing.JTable zad5itemstableWojewodztwo;
    private javax.swing.JButton zad5kodpocztowyAddExecute;
    private javax.swing.JLabel zad5kodpocztowyAddKodLabel;
    private javax.swing.JTextField zad5kodpocztowyAddKodValue;
    private javax.swing.JComboBox<String> zad5kodpocztowyAddMiejscowoscCombo;
    private javax.swing.JLabel zad5kodpocztowyAddMiejscowoscLabel;
    private javax.swing.JButton zad5kodpocztowyEdit;
    private javax.swing.JButton zad5kodpocztowyRemove;
    private javax.swing.JButton zad5miejscowoscAddExecute;
    private javax.swing.JTextField zad5miejscowoscAddMiejscowoscValue;
    private javax.swing.JComboBox<String> zad5miejscowoscAddWojewodztwoCombo;
    private javax.swing.JButton zad5miejscowoscEdit;
    private javax.swing.JButton zad5miejscowoscRemove;
    private javax.swing.JLabel zad5mmiejscowoscAddMiejscowoscLabel;
    private javax.swing.JLabel zad5mmiejscowoscAddWojewodztwoLabel;
    private javax.swing.JButton zad5osobaAddExecute;
    private javax.swing.JLabel zad5osobaAddImieLabel;
    private javax.swing.JTextField zad5osobaAddImieValue;
    private javax.swing.JComboBox<String> zad5osobaAddKodpocztowyCombo;
    private javax.swing.JLabel zad5osobaAddKodpocztowyLabel;
    private javax.swing.JLabel zad5osobaAddNazwiskoLabel;
    private javax.swing.JTextField zad5osobaAddNazwiskoValue;
    private javax.swing.JLabel zad5osobaAddNrlokaluLabel;
    private javax.swing.JTextField zad5osobaAddNrlokaluValue;
    private javax.swing.JComboBox<String> zad5osobaAddPlecCombo;
    private javax.swing.JLabel zad5osobaAddPlecLabel;
    private javax.swing.JLabel zad5osobaAddUlicaLabel;
    private javax.swing.JTextField zad5osobaAddUlicaValue;
    private javax.swing.JButton zad5osobaEdit;
    private javax.swing.JButton zad5osobaRemove;
    private javax.swing.JLabel zad5statusText;
    private javax.swing.JButton zad5updateDATA;
    private javax.swing.JButton zad5wojewodztwoAddExecute;
    private javax.swing.JLabel zad5wojewodztwoAddWojewodztwoLabel;
    private javax.swing.JTextField zad5wojewodztwoAddWojewodztwoValue;
    private javax.swing.JButton zad5wojewodztwoEdit;
    private javax.swing.JButton zad5wojewodztwoRemove;
    private javax.swing.JLabel zad6connectStatus;
    private javax.swing.JButton zad6disconnect;
    private javax.swing.JLabel zad6statusText;
    // End of variables declaration//GEN-END:variables
}

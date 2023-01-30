/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Advocate;

import Database.DatabaseCredentials;
import javax.swing.JTextField;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author taral
 */
public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginJpane = new javax.swing.JPanel();
        LoginJlabel = new javax.swing.JLabel();
        CMSLabel1 = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        usernameText = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        LoginBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        SignUp = new javax.swing.JLabel();
        signupJLabel1 = new javax.swing.JLabel();
        firstNameTxt = new javax.swing.JTextField();
        lastNameTxt = new javax.swing.JTextField();
        EmailTxt = new javax.swing.JTextField();
        newPassTxt = new javax.swing.JPasswordField();
        birthdayLabel = new javax.swing.JLabel();
        selectDate = new javax.swing.JButton();
        selectText = new javax.swing.JTextField();
        GenderLabel = new javax.swing.JLabel();
        birthdateChooser = new com.toedter.calendar.JDateChooser();
        maleRadioBtn = new javax.swing.JRadioButton();
        femaleRadioBtn = new javax.swing.JRadioButton();
        otherRadioBtn = new javax.swing.JRadioButton();
        genderTxt = new javax.swing.JTextField();
        selectBtn2 = new javax.swing.JButton();
        signupPassLabel = new javax.swing.JLabel();
        phoneTxt = new javax.swing.JTextField();
        signupBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        LoginJpane.setBackground(new java.awt.Color(0, 0, 0));

        LoginJlabel.setText("LOG");

        CMSLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 2, 36)); // NOI18N
        CMSLabel1.setForeground(new java.awt.Color(255, 255, 255));
        CMSLabel1.setText("        CMS");
        CMSLabel1.setToolTipText("");

        usernameLabel.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setText("Email or Phone");

        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Password");

        LoginBtn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        LoginBtn.setText("LOG IN");
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        SignUp.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        SignUp.setText("SIGN UP");

        signupJLabel1.setFont(new java.awt.Font("Georgia", 2, 12)); // NOI18N
        signupJLabel1.setText("It's free and always will be");

        firstNameTxt.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        firstNameTxt.setToolTipText("");

        lastNameTxt.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lastNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameTxtActionPerformed(evt);
            }
        });

        EmailTxt.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        EmailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTxtActionPerformed(evt);
            }
        });
        EmailTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EmailTxtKeyPressed(evt);
            }
        });

        newPassTxt.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        newPassTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPassTxtActionPerformed(evt);
            }
        });

        birthdayLabel.setBackground(new java.awt.Color(255, 255, 255));
        birthdayLabel.setFont(new java.awt.Font("Yu Gothic Light", 1, 12)); // NOI18N
        birthdayLabel.setForeground(new java.awt.Color(102, 102, 102));
        birthdayLabel.setText("Birthday");

        selectDate.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        selectDate.setText("SELECT");
        selectDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectDateActionPerformed(evt);
            }
        });

        selectText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectTextActionPerformed(evt);
            }
        });

        GenderLabel.setBackground(new java.awt.Color(255, 255, 255));
        GenderLabel.setFont(new java.awt.Font("Yu Gothic Light", 1, 12)); // NOI18N
        GenderLabel.setForeground(new java.awt.Color(102, 102, 102));
        GenderLabel.setText("Gender");

        birthdateChooser.setDateFormatString("yyyy-MM-dd");

        maleRadioBtn.setText("Male");
        maleRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadioBtnActionPerformed(evt);
            }
        });

        femaleRadioBtn.setText("Female");
        femaleRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRadioBtnActionPerformed(evt);
            }
        });

        otherRadioBtn.setText("Other");
        otherRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherRadioBtnActionPerformed(evt);
            }
        });

        genderTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderTxtActionPerformed(evt);
            }
        });

        selectBtn2.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        selectBtn2.setText("SELECT");
        selectBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectBtn2ActionPerformed(evt);
            }
        });

        signupPassLabel.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        signupPassLabel.setForeground(new java.awt.Color(102, 102, 102));
        signupPassLabel.setText("Password");

        phoneTxt.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        phoneTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTxtActionPerformed(evt);
            }
        });

        signupBtn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        signupBtn.setText("SIGN UP");
        signupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Email");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("First Name");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel3.setText("Last Name");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel4.setText("Phone Number");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(288, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(signupPassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newPassTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(birthdayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(SignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(signupJLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(216, 216, 216))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(282, 282, 282)
                                    .addComponent(selectText))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(signupBtn)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(GenderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(maleRadioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(femaleRadioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(otherRadioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                            .addComponent(selectBtn2))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(genderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(57, 57, 57))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(firstNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(birthdateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(46, 46, 46)
                                                        .addComponent(selectDate))
                                                    .addComponent(EmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(176, 176, 176)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(181, 181, 181)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lastNameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                        .addComponent(phoneTxt)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(36, 36, 36)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(SignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signupJLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(firstNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(signupPassLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newPassTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(birthdayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(selectDate)
                        .addComponent(selectText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(birthdateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(GenderLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maleRadioBtn)
                            .addComponent(femaleRadioBtn)
                            .addComponent(otherRadioBtn)
                            .addComponent(selectBtn2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(signupBtn)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(genderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout LoginJpaneLayout = new javax.swing.GroupLayout(LoginJpane);
        LoginJpane.setLayout(LoginJpaneLayout);
        LoginJpaneLayout.setHorizontalGroup(
            LoginJpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginJpaneLayout.createSequentialGroup()
                .addComponent(CMSLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(LoginJpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginJpaneLayout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(LoginJlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(LoginJpaneLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(LoginJpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(LoginJpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LoginBtn))
                        .addGap(0, 87, Short.MAX_VALUE))))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        LoginJpaneLayout.setVerticalGroup(
            LoginJpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginJpaneLayout.createSequentialGroup()
                .addGroup(LoginJpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(LoginJpaneLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(CMSLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LoginJpaneLayout.createSequentialGroup()
                        .addComponent(LoginJlabel)
                        .addGap(19, 19, 19)
                        .addGroup(LoginJpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameLabel)
                            .addComponent(passwordLabel))
                        .addGap(18, 18, 18)
                        .addGroup(LoginJpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LoginBtn)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginJpane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LoginJpane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    boolean validEmail = false;
    boolean authentication = false;
    Connection connection = null;
    Statement st = null;
    PreparedStatement pst = null;
   
    ResultSet result = null;
    DatabaseCredentials dbc = new DatabaseCredentials();
    String databaseUrl = dbc.getDatabaseUrl();
    String StoredUsername = "";
    String AdminPassword = "123456";
   

    private void selectTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectTextActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_selectTextActionPerformed

    private void selectDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectDateActionPerformed
        // TODO add your handling code here:

        String selectdate = ((JTextField) birthdateChooser.getDateEditor().getUiComponent()).getText();
        selectText.setText(selectdate);
    }//GEN-LAST:event_selectDateActionPerformed

    private void selectBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBtn2ActionPerformed
        // TODO add your handling code here:
        if (maleRadioBtn.isSelected()) {
            genderTxt.setText("Male");
            otherRadioBtn.setSelected(false);
            femaleRadioBtn.setSelected(false);
        } else if (femaleRadioBtn.isSelected()) {
            genderTxt.setText("Female");
            maleRadioBtn.setSelected(false);
            otherRadioBtn.setSelected(false);
        } else {
            genderTxt.setText("Other");
            maleRadioBtn.setSelected(false);
            femaleRadioBtn.setSelected(false);
        }


    }//GEN-LAST:event_selectBtn2ActionPerformed

    private void genderTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderTxtActionPerformed

    public boolean checkNull(ArrayList< String> s) {
        boolean val1 = false;
        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).length() == 0) {
                val1 = true;
                break;
            }
        }
        return val1;
    }

    public boolean uniqueUsername(String user) {
        String searchQuery = "SELECT Email FROM Advocate ";
        boolean unique = false;

        try {

            connection = DriverManager.getConnection(databaseUrl, "sa", AdminPassword);
            pst = connection.prepareStatement(searchQuery);

            result = pst.executeQuery();
            while (result.next()) {
                String retrievedUser = result.getString("LEmail");
                if (retrievedUser.equals(user)) {
                    System.out.println("Find an Unique Username!!");

                } else {
                    System.out.println("Congratulations!");
                    unique = true;

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return unique;
    }
    private void signupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupBtnActionPerformed
        // TODO add your handling code here:
        String insertFirstName = firstNameTxt.getText();
        String insertLastName = lastNameTxt.getText();
        String em = EmailTxt.getText();
        String ph = phoneTxt.getText();
        String pas = newPassTxt.getText();
        String bD = selectText.getText();
        String gnd = genderTxt.getText();
        ArrayList< String> stList = new ArrayList<>();
        stList.add(insertFirstName);
        stList.add(insertLastName);
        stList.add(em);
        stList.add(ph);
        stList.add(pas);
        stList.add(bD);
        stList.add(gnd);
        boolean nullVal = checkNull(stList);
        boolean checkStrong = checkStrongPassword(pas);
        boolean validMob = checkValidPhoneNumber(ph);
        // boolean uniqueUser =uniqueUsername(em);

        int flag = 0;
        String insertSQL = "INSERT into Advocate (FirstName,LastName,Email,PhoneNumber,AdvocatePassword,DateOfBirth,Gender) Values"
                + " ('" + insertFirstName + "','" + insertLastName + "','" + em + "','" + ph + "','" + pas + "','" + bD + "','" + gnd + "' )";

        if (validEmail == true && checkStrong == true && validMob == true && nullVal != true) {
            flag = 1;
        } else if (checkStrong != true) {
            JOptionPane.showMessageDialog(null, "Enter some special character.",
                    "Swing Tester", JOptionPane.WARNING_MESSAGE);
        } else if (validEmail != true) {
            JOptionPane.showMessageDialog(null, "Username is incorrect",
                    "Swing Tester", JOptionPane.WARNING_MESSAGE);
        } else if (validMob != true) {
            JOptionPane.showMessageDialog(null, "Enter a valid phone number.",
                    "Swing Tester", JOptionPane.WARNING_MESSAGE);
        } else if (nullVal == true) {
            JOptionPane.showMessageDialog(null, "Fill up the required fields information.", "Swing Tester", JOptionPane.ERROR_MESSAGE);
        } else {
            System.out.println("NO!");
        }

        try {

            connection = DriverManager.getConnection(databaseUrl, "sa", AdminPassword);
            st = connection.createStatement();

            if (flag == 1) {
                st.executeUpdate(insertSQL);
            }

            //System.out.println("Inserteddd!!");
        } catch (SQLException e) {
            System.out.println("Connection Failed");
            e.printStackTrace();
        }

        maleRadioBtn.setSelected(false);
        femaleRadioBtn.setSelected(false);
        otherRadioBtn.setSelected(false);


    }//GEN-LAST:event_signupBtnActionPerformed

    private void EmailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTxtActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_EmailTxtActionPerformed

    private void lastNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameTxtActionPerformed

    private void EmailTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmailTxtKeyPressed
        // TODO add your handling code here:

        ArrayList<String> emails = new ArrayList<>();
        String inp = EmailTxt.getText();
        emails.add(inp);

        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."
                + "[a-zA-Z0-9_+&*-]+)*@"
                + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
                + "A-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);

        for (String email : emails) {
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                validEmail = true;
            } else {
                validEmail = false;
            }

        }

    }//GEN-LAST:event_EmailTxtKeyPressed

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
        // TODO add your handling code here:
        String query = "SELECT Email,FirstName,AdvocatePassword FROM Advocate WHERE Email = ? ";
       
        String user = usernameText.getText();
        String pass = passwordField.getText();
        MainDashboard objhome = new MainDashboard();
        try {

            connection = DriverManager.getConnection(databaseUrl, "sa", AdminPassword);
            pst = connection.prepareStatement(query);
          
            pst.setString(1, user);

            result = pst.executeQuery();
          
            if (!result.isBeforeFirst()) {
                System.out.println("User Doesn't Exist");
                JOptionPane.showMessageDialog(null, "Username Doesn't Exist!",
                        "Swing Tester", JOptionPane.WARNING_MESSAGE);
            } else {
                while (result.next()) {
                    String retrievedPass = result.getString("AdvocatePassword");
                   
                    if (retrievedPass.equals(pass)) {
                        System.out.println("Password Matched!!");
                        authentication = true;
                        StoredUsername = result.getString("FirstName");
                        MainDashboard phaseObj = new MainDashboard(StoredUsername);
                        
                        
                    } else {
                        System.out.println("Password Didn't match!");
                        JOptionPane.showMessageDialog(null, "Wrong Password!",
                                "Swing Tester", JOptionPane.WARNING_MESSAGE);
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        if (authentication == true) {
            objhome.setVisible(true);
            this.setVisible(false);
                      usernameText.setText("");
            passwordField.setText("");

        }
    }//GEN-LAST:event_LoginBtnActionPerformed

    public boolean checkStrongPassword(String p) {
        boolean checkStrongPass = false;

        String strongPass = newPassTxt.getText();
        if (strongPass.length() < 3) {
            JOptionPane.showMessageDialog(null, "Password is too short!",
                    "Swing Tester", JOptionPane.WARNING_MESSAGE);
        } else if (strongPass.contains("@") || strongPass.contains("#") || strongPass.contains("$") || strongPass.contains("%") || strongPass.contains("&") || strongPass.contains("*")) {
            checkStrongPass = true;
        }
        return checkStrongPass;
    }
    private void newPassTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPassTxtActionPerformed
        // TODO add your handling code here:/


    }//GEN-LAST:event_newPassTxtActionPerformed
    public boolean checkValidPhoneNumber(String ph) {
        String validPh = phoneTxt.getText();
        boolean valid = false;
        if (validPh.length() == 11 && validPh.startsWith("01")) {
            valid = true;
        }
        return valid;
    }
    private void phoneTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTxtActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_phoneTxtActionPerformed

    private void maleRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRadioBtnActionPerformed
        // TODO add your handling code here:
        if (maleRadioBtn.isSelected()) {
            femaleRadioBtn.setSelected(false);
            otherRadioBtn.setSelected(false);
        }
    }//GEN-LAST:event_maleRadioBtnActionPerformed

    private void femaleRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleRadioBtnActionPerformed
        // TODO add your handling code here:
        if (femaleRadioBtn.isSelected()) {
            maleRadioBtn.setSelected(false);
            otherRadioBtn.setSelected(false);
        }

    }//GEN-LAST:event_femaleRadioBtnActionPerformed

    private void otherRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherRadioBtnActionPerformed
        // TODO add your handling code here:
        if (otherRadioBtn.isSelected()) {
            femaleRadioBtn.setSelected(false);
            maleRadioBtn.setSelected(false);
        }
    }//GEN-LAST:event_otherRadioBtnActionPerformed

    public static void main(String args[]) {
              LoginPage loginObj = new LoginPage();
        loginObj.setVisible(true);

        loginObj.selectText.setVisible(false);
        loginObj.genderTxt.setVisible(false);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CMSLabel1;
    private javax.swing.JTextField EmailTxt;
    private javax.swing.JLabel GenderLabel;
    private javax.swing.JButton LoginBtn;
    private javax.swing.JLabel LoginJlabel;
    private javax.swing.JPanel LoginJpane;
    private javax.swing.JLabel SignUp;
    private com.toedter.calendar.JDateChooser birthdateChooser;
    private javax.swing.JLabel birthdayLabel;
    private javax.swing.JRadioButton femaleRadioBtn;
    private javax.swing.JTextField firstNameTxt;
    private javax.swing.JTextField genderTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lastNameTxt;
    private javax.swing.JRadioButton maleRadioBtn;
    private javax.swing.JPasswordField newPassTxt;
    private javax.swing.JRadioButton otherRadioBtn;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JButton selectBtn2;
    private javax.swing.JButton selectDate;
    private javax.swing.JTextField selectText;
    private javax.swing.JButton signupBtn;
    private javax.swing.JLabel signupJLabel1;
    private javax.swing.JLabel signupPassLabel;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameText;
    // End of variables declaration//GEN-END:variables
}

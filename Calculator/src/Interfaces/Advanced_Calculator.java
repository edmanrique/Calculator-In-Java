package Interfaces;

import Operations.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.*;

/*
 *
 * @author Edison Manrique @edmanrique
 */
public class Advanced_Calculator extends javax.swing.JFrame {

    /*
     * Define global variables
     */
    public Pattern pat;
    public Matcher mat;
    public int count;
    public double first_value;
    public double second_value;
    public double result;
    public ACalculator Operations;

    /**
     * Creates new form Advanced_Calculator
     */
    public Advanced_Calculator() {
        initComponents();
        pat = Pattern.compile("[a-zA-Z]{1,}");
        count = 0;
        Operations = new ACalculator();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        JPanel = new javax.swing.JPanel();
        operation_field = new javax.swing.JTextField();
        one_button = new javax.swing.JButton();
        two_button = new javax.swing.JButton();
        three_button = new javax.swing.JButton();
        five_button = new javax.swing.JButton();
        four_button = new javax.swing.JButton();
        zero_button = new javax.swing.JButton();
        seven_button = new javax.swing.JButton();
        eight_button = new javax.swing.JButton();
        six_button = new javax.swing.JButton();
        nine_button = new javax.swing.JButton();
        equals_button = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        AC_Button = new javax.swing.JButton();
        sum_button = new javax.swing.JButton();
        less_button = new javax.swing.JButton();
        divide_button = new javax.swing.JButton();
        mutiply_button = new javax.swing.JButton();
        dot_button = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        factorial_button = new javax.swing.JButton();
        exponent_button = new javax.swing.JButton();
        value_one_label = new javax.swing.JLabel();
        operator_label = new javax.swing.JLabel();
        square_root_button = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        jButton3.setText("1");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pro-Calculator");

        JPanel.setBackground(new java.awt.Color(51, 51, 51));
        JPanel.setForeground(new java.awt.Color(0, 153, 204));

        operation_field.setBackground(new java.awt.Color(23, 23, 23));
        operation_field.setFont(new java.awt.Font("Yet R", 1, 36)); // NOI18N
        operation_field.setForeground(new java.awt.Color(0, 204, 255));
        operation_field.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        operation_field.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        operation_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operation_fieldActionPerformed(evt);
            }
        });
        operation_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                operation_fieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                operation_fieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                operation_fieldKeyTyped(evt);
            }
        });

        one_button.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        one_button.setForeground(new java.awt.Color(0, 153, 204));
        one_button.setText("1");
        one_button.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        one_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                one_buttonActionPerformed(evt);
            }
        });

        two_button.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        two_button.setForeground(new java.awt.Color(0, 153, 204));
        two_button.setText("2");
        two_button.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        two_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                two_buttonActionPerformed(evt);
            }
        });

        three_button.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        three_button.setForeground(new java.awt.Color(0, 153, 204));
        three_button.setText("3");
        three_button.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        three_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                three_buttonActionPerformed(evt);
            }
        });

        five_button.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        five_button.setForeground(new java.awt.Color(0, 153, 204));
        five_button.setText("5");
        five_button.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        five_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                five_buttonActionPerformed(evt);
            }
        });

        four_button.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        four_button.setForeground(new java.awt.Color(0, 153, 204));
        four_button.setText("4");
        four_button.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        four_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                four_buttonActionPerformed(evt);
            }
        });

        zero_button.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        zero_button.setForeground(new java.awt.Color(0, 153, 204));
        zero_button.setText("0");
        zero_button.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        zero_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zero_buttonActionPerformed(evt);
            }
        });

        seven_button.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        seven_button.setForeground(new java.awt.Color(0, 153, 204));
        seven_button.setText("7");
        seven_button.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        seven_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seven_buttonActionPerformed(evt);
            }
        });

        eight_button.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        eight_button.setForeground(new java.awt.Color(0, 153, 204));
        eight_button.setText("8");
        eight_button.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        eight_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eight_buttonActionPerformed(evt);
            }
        });

        six_button.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        six_button.setForeground(new java.awt.Color(0, 153, 204));
        six_button.setText("6");
        six_button.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        six_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                six_buttonActionPerformed(evt);
            }
        });

        nine_button.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        nine_button.setForeground(new java.awt.Color(0, 153, 204));
        nine_button.setText("9");
        nine_button.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        nine_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nine_buttonActionPerformed(evt);
            }
        });

        equals_button.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        equals_button.setForeground(new java.awt.Color(153, 153, 0));
        equals_button.setText("=");
        equals_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equals_buttonActionPerformed(evt);
            }
        });

        jButton14.setText("Basic Mode");

        AC_Button.setText("AC");
        AC_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AC_ButtonActionPerformed(evt);
            }
        });

        sum_button.setText("+");
        sum_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sum_buttonActionPerformed(evt);
            }
        });

        less_button.setText("-");
        less_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                less_buttonActionPerformed(evt);
            }
        });

        divide_button.setText("/");
        divide_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divide_buttonActionPerformed(evt);
            }
        });

        mutiply_button.setText("*");
        mutiply_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mutiply_buttonActionPerformed(evt);
            }
        });

        dot_button.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        dot_button.setForeground(new java.awt.Color(0, 153, 0));
        dot_button.setText(".");

        jButton23.setText("%");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        factorial_button.setText("X !");
        factorial_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factorial_buttonActionPerformed(evt);
            }
        });

        exponent_button.setText("^");
        exponent_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exponent_buttonActionPerformed(evt);
            }
        });

        value_one_label.setBackground(new java.awt.Color(51, 204, 0));
        value_one_label.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        value_one_label.setForeground(new java.awt.Color(51, 204, 0));
        value_one_label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        operator_label.setBackground(new java.awt.Color(51, 204, 0));
        operator_label.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        operator_label.setForeground(new java.awt.Color(51, 204, 0));
        operator_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        square_root_button.setText("√");
        square_root_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                square_root_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanelLayout = new javax.swing.GroupLayout(JPanel);
        JPanel.setLayout(JPanelLayout);
        JPanelLayout.setHorizontalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addComponent(value_one_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(operator_label, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(operation_field)
                    .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(JPanelLayout.createSequentialGroup()
                                    .addComponent(one_button, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(two_button, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanelLayout.createSequentialGroup()
                                    .addComponent(four_button, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(five_button, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(JPanelLayout.createSequentialGroup()
                                    .addComponent(seven_button, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(eight_button, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(JPanelLayout.createSequentialGroup()
                                .addComponent(zero_button, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dot_button, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(JPanelLayout.createSequentialGroup()
                                .addComponent(equals_button, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mutiply_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(JPanelLayout.createSequentialGroup()
                                .addComponent(nine_button, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(divide_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(JPanelLayout.createSequentialGroup()
                                .addComponent(six_button, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(less_button, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPanelLayout.createSequentialGroup()
                                .addComponent(three_button, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sum_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(factorial_button, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(exponent_button, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(square_root_button, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(AC_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
        JPanelLayout.setVerticalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(operation_field, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(value_one_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(operator_label, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(one_button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(two_button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(three_button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sum_button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exponent_button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(four_button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(five_button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(six_button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(less_button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(factorial_button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(eight_button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nine_button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(divide_button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(seven_button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(equals_button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(mutiply_button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(square_root_button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(zero_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dot_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(AC_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void two_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_two_buttonActionPerformed
        operation_field.setText(operation_field.getText() + "2");
    }//GEN-LAST:event_two_buttonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void three_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_three_buttonActionPerformed
        operation_field.setText(operation_field.getText() + "3");
    }//GEN-LAST:event_three_buttonActionPerformed

    private void four_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_four_buttonActionPerformed
        operation_field.setText(operation_field.getText() + "4");
    }//GEN-LAST:event_four_buttonActionPerformed

    private void seven_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seven_buttonActionPerformed
        operation_field.setText(operation_field.getText() + "7");
    }//GEN-LAST:event_seven_buttonActionPerformed

    private void six_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_six_buttonActionPerformed
        operation_field.setText(operation_field.getText() + "6");
    }//GEN-LAST:event_six_buttonActionPerformed

    private void nine_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nine_buttonActionPerformed
        operation_field.setText(operation_field.getText() + "9");
    }//GEN-LAST:event_nine_buttonActionPerformed

    private void equals_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equals_buttonActionPerformed

        try {
            if (operation_field.getText() == null || operation_field.getText().equals("")) {

            } else if (!operation_field.getText().contains("(") || !operation_field.getText().contains(")")) {
                switch (operator_label.getText().charAt(1)) {
                    case '+':

                        if (value_one_label.getText() == null || value_one_label.getText().equals("")) {

                        } else {
                            second_value = Double.parseDouble(operation_field.getText());
                            operation_field.setText(String.valueOf(Operations.add(first_value, second_value)));
                            value_one_label.setText("");
                            operator_label.setText("");
                            count--;
                        }
                        break;

                    case '-':
                        if (value_one_label.getText() == null || value_one_label.getText().equals("")) {

                        } else {
                            second_value = Double.parseDouble(operation_field.getText());
                            operation_field.setText(String.valueOf(Operations.substract(first_value, second_value)));
                            value_one_label.setText("");
                            operator_label.setText("");
                            count--;
                        }
                        break;

                    case '*':
                        if (value_one_label.getText() == null || value_one_label.getText().equals("")) {

                        } else {
                            second_value = Double.parseDouble(operation_field.getText());
                            operation_field.setText(String.valueOf(Operations.multiplication(first_value, second_value)));
                            value_one_label.setText("");
                            operator_label.setText("");
                            count--;
                        }
                        break;

                    case '/':
                        if (value_one_label.getText() == null || value_one_label.getText().equals("")) {

                        } else {
                            second_value = Double.parseDouble(operation_field.getText());
                            operation_field.setText(String.valueOf(Operations.division(first_value, second_value)));
                            value_one_label.setText("");
                            operator_label.setText("");
                            count--;
                        }
                        break;

                    case '^':
                        if (value_one_label.getText() == null || value_one_label.getText().equals("")) {

                        } else {
                            second_value = Double.parseDouble(operation_field.getText());
                            operation_field.setText(String.valueOf(Operations.exponent(first_value, second_value)));
                            value_one_label.setText("");
                            operator_label.setText("");
                            count--;
                        }
                        break;

                    default:
                        operation_field.setText("Syntax Error");
                        break;
                }
            } else {

            }

        } catch (java.lang.StringIndexOutOfBoundsException e) {

        }
    }//GEN-LAST:event_equals_buttonActionPerformed

    private void AC_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AC_ButtonActionPerformed
        operation_field.setText("");
        operator_label.setText("");
        value_one_label.setText("");
    }//GEN-LAST:event_AC_ButtonActionPerformed

    private void sum_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sum_buttonActionPerformed
        if (operation_field.getText() == null || operation_field.getText().equals("")) {

        } else {
            if (count == 0) {
                first_value = Double.parseDouble(operation_field.getText());
                value_one_label.setText(first_value + "");
                operator_label.setText(" + ");
                operation_field.setText("");
                count++;
            } else {
                first_value = Double.parseDouble(value_one_label.getText());
                second_value = Double.parseDouble(operation_field.getText());
                result = Operations.add(first_value, second_value);
                operation_field.setText("");
                value_one_label.setText(result + "");
            }

        }
    }//GEN-LAST:event_sum_buttonActionPerformed

    private void less_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_less_buttonActionPerformed
        if (operation_field.getText() == null || operation_field.getText().equals("")) {

        } else {
            if (count == 0) {
                first_value = Double.parseDouble(operation_field.getText());
                value_one_label.setText(first_value + "");
                operator_label.setText(" - ");
                operation_field.setText("");
                count++;
            } else {
                first_value = Double.parseDouble(value_one_label.getText());
                second_value = Double.parseDouble(operation_field.getText());
                result = Operations.substract(first_value, second_value);
                operation_field.setText("");
                value_one_label.setText(result + "");
            }

        }
    }//GEN-LAST:event_less_buttonActionPerformed

    private void divide_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divide_buttonActionPerformed
        if (operation_field.getText() == null || operation_field.getText().equals("")) {

        } else {
            if (count == 0) {
                first_value = Double.parseDouble(operation_field.getText());
                value_one_label.setText(first_value + "");
                operator_label.setText(" / ");
                operation_field.setText("");
                count++;
            } else {
                first_value = Double.parseDouble(value_one_label.getText());
                second_value = Double.parseDouble(operation_field.getText());
                result = Operations.division(first_value, second_value);
                operation_field.setText("");
                value_one_label.setText(result + "");
            }

        }
    }//GEN-LAST:event_divide_buttonActionPerformed

    private void mutiply_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mutiply_buttonActionPerformed
        if (operation_field.getText() == null || operation_field.getText().equals("")) {

        } else {
            if (count == 0) {
                first_value = Double.parseDouble(operation_field.getText());
                value_one_label.setText(first_value + "");
                operator_label.setText(" * ");
                operation_field.setText("");
                count++;
            } else {
                first_value = Double.parseDouble(value_one_label.getText());
                second_value = Double.parseDouble(operation_field.getText());
                result = Operations.multiplication(first_value, second_value);
                operation_field.setText("");
                value_one_label.setText(result + "");
            }

        }
    }//GEN-LAST:event_mutiply_buttonActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    private void factorial_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factorial_buttonActionPerformed
        if (operation_field.getText() == null || operation_field.getText().equals("")) {

        } else {
            first_value = Double.parseDouble(operation_field.getText());
            operation_field.setText(String.valueOf(Operations.factorial(first_value)));
        }
    }//GEN-LAST:event_factorial_buttonActionPerformed

    private void exponent_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exponent_buttonActionPerformed
        if (operation_field.getText() == null || operation_field.getText().equals("")) {

        } else {
            if (count == 0) {
                first_value = Double.parseDouble(operation_field.getText());
                value_one_label.setText(first_value + "");
                operator_label.setText(" ^ ");
                operation_field.setText("");
                count++;
            } else {
                first_value = Double.parseDouble(value_one_label.getText());
                second_value = Double.parseDouble(operation_field.getText());
                result = Operations.exponent(first_value, second_value);
                operation_field.setText("");
                value_one_label.setText(result + "");
            }

        }
    }//GEN-LAST:event_exponent_buttonActionPerformed

    private void one_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_one_buttonActionPerformed
        operation_field.setText(operation_field.getText() + "1");
    }//GEN-LAST:event_one_buttonActionPerformed

    private void zero_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zero_buttonActionPerformed
        operation_field.setText(operation_field.getText() + "0");
    }//GEN-LAST:event_zero_buttonActionPerformed

    private void five_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_five_buttonActionPerformed
        operation_field.setText(operation_field.getText() + "5");
    }//GEN-LAST:event_five_buttonActionPerformed

    private void eight_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eight_buttonActionPerformed
        operation_field.setText(operation_field.getText() + "8");
    }//GEN-LAST:event_eight_buttonActionPerformed

    private void operation_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operation_fieldActionPerformed

    }//GEN-LAST:event_operation_fieldActionPerformed

    private void operation_fieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_operation_fieldKeyTyped

    }//GEN-LAST:event_operation_fieldKeyTyped

    private void operation_fieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_operation_fieldKeyPressed


    }//GEN-LAST:event_operation_fieldKeyPressed

    private void operation_fieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_operation_fieldKeyReleased
        pat = Pattern.compile("[a-zA-Z]{1,}");
        mat = pat.matcher(operation_field.getText());

        if (mat.find()) {
            operation_field.setText("Syntax Error");
        }
    }//GEN-LAST:event_operation_fieldKeyReleased

    private void square_root_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_square_root_buttonActionPerformed
        if (operation_field.getText() == null || operation_field.getText().equals("")) {

        } else {
            double op = Operations.square_root(Double.parseDouble(operation_field.getText()));
            operation_field.setText(String.valueOf(op));
        }
    }//GEN-LAST:event_square_root_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(Advanced_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Advanced_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Advanced_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Advanced_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Advanced_Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AC_Button;
    private javax.swing.JPanel JPanel;
    private javax.swing.JButton divide_button;
    private javax.swing.JButton dot_button;
    private javax.swing.JButton eight_button;
    private javax.swing.JButton equals_button;
    private javax.swing.JButton exponent_button;
    private javax.swing.JButton factorial_button;
    private javax.swing.JButton five_button;
    private javax.swing.JButton four_button;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton less_button;
    private javax.swing.JButton mutiply_button;
    private javax.swing.JButton nine_button;
    private javax.swing.JButton one_button;
    private javax.swing.JTextField operation_field;
    private javax.swing.JLabel operator_label;
    private javax.swing.JButton seven_button;
    private javax.swing.JButton six_button;
    private javax.swing.JButton square_root_button;
    private javax.swing.JButton sum_button;
    private javax.swing.JButton three_button;
    private javax.swing.JButton two_button;
    private javax.swing.JLabel value_one_label;
    private javax.swing.JButton zero_button;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.poly.lab2;


/**
 *
 * @author MINH THAI
 */

public class CalculatorForm extends javax.swing.JFrame {
   
    
    
      String operand1 = "";
      String operator = "";
      // nhan vao dau = se ra ket qua va nhap lai se khai bao bien nay
      boolean isEqualsPress = false; 
      boolean isNewCalculator = true;
      

    /**
     * Creates new form CalculatorForm
     */
    public CalculatorForm() {
        initComponents();
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtResult = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnNumber1 = new javax.swing.JButton();
        btnNumber2 = new javax.swing.JButton();
        btnNumber3 = new javax.swing.JButton();
        btnDivide = new javax.swing.JButton();
        btnSquareRoot = new javax.swing.JButton();
        btnNumber4 = new javax.swing.JButton();
        btnNumber5 = new javax.swing.JButton();
        btnNumber6 = new javax.swing.JButton();
        btnMultiply = new javax.swing.JButton();
        btnPercentage = new javax.swing.JButton();
        btnNumber7 = new javax.swing.JButton();
        btnNumber8 = new javax.swing.JButton();
        btnNumber9 = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnFraction = new javax.swing.JButton();
        btnNumber0 = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnSubtract = new javax.swing.JButton();
        btnEquals = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("CASIO");

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtResult.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtResult.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtResult)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setLayout(new java.awt.GridLayout(4, 5, 5, 5));

        btnNumber1.setText("1");
        btnNumber1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnNumber1);

        btnNumber2.setText("2");
        btnNumber2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnNumber2);

        btnNumber3.setText("3");
        btnNumber3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnNumber3);

        btnDivide.setText("/");
        btnDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplyActionPerformed(evt);
            }
        });
        jPanel2.add(btnDivide);

        btnSquareRoot.setText("sqrt");
        btnSquareRoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPercentageActionPerformed(evt);
            }
        });
        jPanel2.add(btnSquareRoot);

        btnNumber4.setText("4");
        btnNumber4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnNumber4);

        btnNumber5.setText("5");
        btnNumber5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnNumber5);

        btnNumber6.setText("6");
        btnNumber6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnNumber6);

        btnMultiply.setText("*");
        btnMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplyActionPerformed(evt);
            }
        });
        jPanel2.add(btnMultiply);

        btnPercentage.setText("%");
        btnPercentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPercentageActionPerformed(evt);
            }
        });
        jPanel2.add(btnPercentage);

        btnNumber7.setText("7");
        btnNumber7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnNumber7);

        btnNumber8.setText("8");
        btnNumber8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnNumber8);

        btnNumber9.setText("9");
        btnNumber9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnNumber9);

        btnAdd.setText("+");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplyActionPerformed(evt);
            }
        });
        jPanel2.add(btnAdd);

        btnFraction.setText("1/x");
        btnFraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPercentageActionPerformed(evt);
            }
        });
        jPanel2.add(btnFraction);

        btnNumber0.setText("0");
        btnNumber0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnNumber0);

        btnPlus.setText("+/-");
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });
        jPanel2.add(btnPlus);

        btnClear.setText("C");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel2.add(btnClear);

        btnSubtract.setText("-");
        btnSubtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplyActionPerformed(evt);
            }
        });
        jPanel2.add(btnSubtract);

        btnEquals.setBackground(new java.awt.Color(153, 0, 102));
        btnEquals.setText("=");
        btnEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualsActionPerformed(evt);
            }
        });
        jPanel2.add(btnEquals);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumber1ActionPerformed
        //và khi xử lí dữ kiện cho phím số sẽ cho kt isEqualsPress nếu bằng True sẽ cho bằng false và sẽ xóa trắng gtri hiển thị
        if (isEqualsPress){
            isEqualsPress = false;
             txtResult.setText("");
    }
        
        String cmd = evt.getActionCommand();
         
         txtResult.setText(txtResult.getText() + cmd );
  
    }//GEN-LAST:event_btnNumber1ActionPerformed

    private void btnMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplyActionPerformed
    String cmd = evt.getActionCommand();
      
      if(!isNewCalculator) {
         btnEquals.doClick();
     }
      operator = cmd;
      operand1 = txtResult.getText();
      isNewCalculator = false;
      
      txtResult.setText("");

                 
    
//    
    }//GEN-LAST:event_btnMultiplyActionPerformed

    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusActionPerformed

        try{
            double value = Double.parseDouble( txtResult.getText());
            value = -value;

            txtResult.setText("" +value);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnPlusActionPerformed

    private void btnEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualsActionPerformed
       if (txtResult.getText().equals("")|| operand1.equals("")){
           return;
       }
       try {
           double oprand1 = Double.parseDouble(operand1);
           double oprand2 = Double.parseDouble(txtResult.getText());
           double result = 0;
           if (operator.equals("+")){
               result = oprand1 + oprand2;
           }else
           if (operator.equals("-")){
               result = oprand1 - oprand2;
           }else
           if (operator.equals("*")){
               result = oprand1 *oprand2;
           }else
           if (operator.equals("/")){
               result = oprand1 / oprand2;
           }
           txtResult.setText("" + result);
           isEqualsPress = true;
           isNewCalculator = true;
       }catch (Exception e) {
           e.printStackTrace();
       }

//                 if (txtResult.getText().equals("") || operand1.equals("") || operator.equals("")) {
//        return;
//    }
//    
//    try {
//        double operand2 = Double.parseDouble(txtResult.getText());
//        double result = 0;
//        double numericOperand1 = Double.parseDouble(operand1); // Chuyển đổi operand1 sang kiểu double
//        
//        switch (operator) {
//            case "+":
//                result = numericOperand1 + operand2;
//                break;
//            case "-":
//                result = numericOperand1 - operand2;
//                break;
//            case "*":
//                result = numericOperand1 * operand2;
//                break;
//            case "/":
//                if (operand2 != 0) {
//                    result = numericOperand1 / operand2;
//                } else {
//                    // Xử lý chia cho 0 nếu cần
//                    // Có thể hiển thị thông báo hoặc thực hiện các hành động khác tùy thuộc vào yêu cầu của bạn.
//                    System.out.println("Cannot divide by zero");
//                    return;
//                }
//                break;
//            case "%":
//                result = numericOperand1 % operand2;
//                break;
//            default:
//                System.out.println("Invalid operator");
//                return;
//        }
//        
//        txtResult.setText(String.valueOf(result));
//        operand1 = "";
//        operator = "";
//        isEqualsPress = true;
//    } catch (NumberFormatException e) {
//        System.out.println("Invalid number format");
//    }
   
    }//GEN-LAST:event_btnEqualsActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        
        //Nút dữ kiện C khi ấn vào sẽ xóa trắng kq được hiển thị và xóa  operand1 operator
        
        txtResult.setText("");
        operand1 = "";
        operator = "";
        isEqualsPress = false;
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnPercentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPercentageActionPerformed
       if (txtResult.getText(). equals("")){
        return;
    }
       String cmd = evt.getActionCommand();
       try {
           double value = Double.parseDouble(txtResult.getText());
           
           if(cmd.equals("sqrt")){
               value = Math.sqrt(value);
           }else
           if(cmd.equals("%")){
               value = value * 100;
           }
           if(cmd.equals("1/x")){
               value = 1/ value;
           }
           txtResult.setText("" + value);
           isEqualsPress = true;
       }catch (Exception e) {
           e.printStackTrace();
       }
    }//GEN-LAST:event_btnPercentageActionPerformed

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
            java.util.logging.Logger.getLogger(CalculatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorForm().setVisible(true);
            }
        });
    }
 
 
   
         

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDivide;
    private javax.swing.JButton btnEquals;
    private javax.swing.JButton btnFraction;
    private javax.swing.JButton btnMultiply;
    private javax.swing.JButton btnNumber0;
    private javax.swing.JButton btnNumber1;
    private javax.swing.JButton btnNumber2;
    private javax.swing.JButton btnNumber3;
    private javax.swing.JButton btnNumber4;
    private javax.swing.JButton btnNumber5;
    private javax.swing.JButton btnNumber6;
    private javax.swing.JButton btnNumber7;
    private javax.swing.JButton btnNumber8;
    private javax.swing.JButton btnNumber9;
    private javax.swing.JButton btnPercentage;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnSquareRoot;
    private javax.swing.JButton btnSubtract;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtResult;
    // End of variables declaration//GEN-END:variables
}

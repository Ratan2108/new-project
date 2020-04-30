public class BillingSystem extends javax.swing.JFrame 
{ 
  public BillingSystem() 
  {
       initComponents();
  }
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        txtDisplay = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setToolTipText("0");
        jPanel2.setPreferredSize(new java.awt.Dimension(930, 370));
        jPanel2.setLayout(null);

        jCheckBox1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jCheckBox1.setText("BISCUITS");
        jCheckBox1.setPreferredSize(new java.awt.Dimension(130, 49));
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox1);
        jCheckBox1.setBounds(30, 280, 170, 49);

        jCheckBox2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jCheckBox2.setText("FRUITS");
        jCheckBox2.setPreferredSize(new java.awt.Dimension(130, 49));
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox2);
        jCheckBox2.setBounds(30, 30, 140, 49);

        jCheckBox3.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jCheckBox3.setText("VEGES");
        jCheckBox3.setPreferredSize(new java.awt.Dimension(130, 49));
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox3);
        jCheckBox3.setBounds(30, 90, 130, 49);

        jCheckBox4.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jCheckBox4.setText("PIZZA");
        jCheckBox4.setPreferredSize(new java.awt.Dimension(130, 49));
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox4);
        jCheckBox4.setBounds(30, 150, 130, 49);

        jCheckBox5.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jCheckBox5.setText("WAFERS");
        jCheckBox5.setPreferredSize(new java.awt.Dimension(130, 49));
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox5);
        jCheckBox5.setBounds(30, 210, 160, 49);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("0");
        jTextField1.setToolTipText("");
        jPanel2.add(jTextField1);
        jTextField1.setBounds(200, 290, 90, 30);

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("0");
        jTextField2.setToolTipText("");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField2);
        jTextField2.setBounds(200, 40, 90, 30);

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("0");
        jTextField3.setToolTipText("");
        jPanel2.add(jTextField3);
        jTextField3.setBounds(200, 160, 90, 30);

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("0");
        jTextField4.setToolTipText("");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField4);
        jTextField4.setBounds(200, 220, 90, 30);

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("0");
        jTextField5.setToolTipText("");
        jPanel2.add(jTextField5);
        jTextField5.setBounds(200, 100, 90, 30);
        jPanel2.add(jPanel3);
        jPanel3.setBounds(360, 50, 10, 10);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel4.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("Total delivery charges");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(20, 70, 340, 50);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setText("Total cost of items");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(20, 20, 340, 40);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setText("Total cost of milage");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(20, 130, 340, 30);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel4.setText("CGST");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(20, 180, 340, 40);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel6.setText("SGST");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(20, 230, 340, 30);

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("0");
        jPanel4.add(jTextField6);
        jTextField6.setBounds(440, 72, 130, 30);

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("0");
        jPanel4.add(jTextField7);
        jTextField7.setBounds(440, 22, 130, 30);

        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setText("0");
        jPanel4.add(jTextField8);
        jTextField8.setBounds(440, 230, 130, 30);

        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("0");
        jPanel4.add(jTextField9);
        jTextField9.setBounds(440, 122, 130, 30);

        jTextField10.setEditable(false);
        jTextField10.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setText("0");
        jPanel4.add(jTextField10);
        jTextField10.setBounds(440, 162, 130, 30);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(370, 30, 630, 290);
        jPanel2.add(txtDisplay);
        txtDisplay.setBounds(350, 52, 10, 0);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(40, 30, 1140, 370);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel5.setPreferredSize(new java.awt.Dimension(1250, 110));
        jPanel5.setLayout(null);

        jTextField11.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextField11.setText("Total Amount");
        jPanel5.add(jTextField11);
        jTextField11.setBounds(30, 140, 210, 36);

        jTextField12.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextField12.setText("Total Taxes");
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField12);
        jTextField12.setBounds(30, 80, 210, 36);

        jTextField13.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextField13.setText("Sub Total");
        jPanel5.add(jTextField13);
        jTextField13.setBounds(30, 20, 210, 36);

        jTextField14.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField14.setText("Rs.0.0");
        jPanel5.add(jTextField14);
        jTextField14.setBounds(310, 80, 120, 30);

        jTextField15.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField15.setText("Rs.0.0");
        jPanel5.add(jTextField15);
        jTextField15.setBounds(310, 140, 120, 30);

        jTextField16.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField16.setText("Rs.0.0");
        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField16);
        jTextField16.setBounds(310, 20, 120, 30);

        jButton1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jButton1.setText("CALCULATE");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1);
        jButton1.setBounds(760, 110, 230, 50);

        jButton2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jButton2.setText("CLEAR");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2);
        jButton2.setBounds(760, 20, 230, 53);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(40, 430, 1140, 210);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
 if(jCheckBox1.isSelected())
     {
         jTextField1.setEditable(true);
         jTextField1.setText("");
         jTextField1.requestFocus();
         
     }
     else
     {
         jTextField1.setEditable(false);
         jTextField1.setText("");
        
     }        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
 if(jCheckBox4.isSelected())
     {
         jTextField3.setEditable(true);
         jTextField3.setText("");
         jTextField3.requestFocus();
         
     }
     else
     {
         jTextField3.setEditable(false);
         jTextField3.setText("");
        
     }        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       txtDisplay.setText("0");
       jTextField1.setText("0");
       jTextField2.setText("0");
       jTextField3.setText("0");
       jTextField4.setText("0");
       jTextField5.setText("0");
       jTextField6.setText("0");
       jTextField7.setText("0");
       jTextField8.setText("0");
       jTextField9.setText("0");
       jTextField10.setText("0");
       jTextField14.setText("RS.0.0");
       jTextField15.setText("RS0.0");
       jTextField16.setText("RS0.0");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
 if(jCheckBox2.isSelected())
     {
         jTextField2.setEditable(true);
         jTextField2.setText("");
         jTextField2.requestFocus();
         
     }
     else
     {
         jTextField2.setEditable(false);
         jTextField2.setText("");
        
     }    
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
       if(jCheckBox3.isSelected())
     {
         jTextField5.setEditable(true);
         jTextField5.setText("");
         jTextField5.requestFocus();
         
     }
     else
     {
         jTextField5.setEditable(false);
         jTextField5.setText("");
        
     }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
 if(jCheckBox5.isSelected())
     {
         jTextField4.setEditable(true);
         jTextField4.setText("");
         jTextField4.requestFocus();
         
     }
     else
     {
         jTextField4.setEditable(false);
         jTextField4.setText("");
        
     }        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if( (jCheckBox1.isSelected() )|| (jCheckBox2.isSelected() )||(jCheckBox3.isSelected() )||(jCheckBox4.isSelected() )||(jCheckBox5.isSelected() ) )
        {
            double f = Double.parseDouble(jTextField2.getText() )*60;  
             double v = Double.parseDouble(jTextField5.getText() )*50;
              double p = Double.parseDouble(jTextField3.getText() )*20;
               double w = Double.parseDouble(jTextField4.getText() )*160;
                double b = Double.parseDouble(jTextField1.getText() )*80;
                 double totalitems = f+v+p+w+b;
                 double del= totalitems *5/100;
                 double mil= del*50/100;
                 double subtotal=totalitems+del+mil;
                 double cgst= subtotal*9/100;
                     
                         double sgst=subtotal*9/100;
                         double tax=cgst+sgst;
                          double amount=subtotal+tax;
                          
                          String item=String.format("%.2f", totalitems);
                          jTextField7.setText((String)item);
                          
                          String d=String.format("%.2f", del);
                          jTextField6.setText((String)d);
                          
                          String m=String.format("%.2f", mil);
                          jTextField9.setText((String)m);
                          
                          String c=String.format("%.2f", cgst);
                          jTextField10.setText((String)c);
                          
                          String s=String.format("%.2f", sgst);
                          jTextField8.setText((String)s);
                          
                          String sub=String.format("%.2f", subtotal);
                          jTextField16.setText((String)sub);
                          
                          String ta=String.format("%.2f", tax);
                          jTextField14.setText((String)ta);
                          
                          String am=String.format("%.2f", amount);
                          jTextField15.setText((String)am);
                          
        }
        else{
                txtDisplay.setText("enter your choice");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BillingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillingSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField txtDisplay;
    // End of variables declaration//GEN-END:variables
}

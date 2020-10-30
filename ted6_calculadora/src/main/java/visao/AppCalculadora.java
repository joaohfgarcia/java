
package visao;

import modelo.Calculo;

public class AppCalculadora extends javax.swing.JFrame {


    public AppCalculadora() {
        initComponents();
    }
    
    
    double num1, num2;
       
    String operacao;
    
    Calculo calc;
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfDisplay = new javax.swing.JTextField();
        jbN7 = new javax.swing.JButton();
        jbN4 = new javax.swing.JButton();
        jbN1 = new javax.swing.JButton();
        jbN8 = new javax.swing.JButton();
        jbN5 = new javax.swing.JButton();
        jbN2 = new javax.swing.JButton();
        jbN9 = new javax.swing.JButton();
        jbN6 = new javax.swing.JButton();
        jbN3 = new javax.swing.JButton();
        jbSoma = new javax.swing.JButton();
        jbSub = new javax.swing.JButton();
        jbMult = new javax.swing.JButton();
        jbN0 = new javax.swing.JButton();
        jbPonto = new javax.swing.JButton();
        jbTotal = new javax.swing.JButton();
        jbDiv = new javax.swing.JButton();
        jbCE = new javax.swing.JButton();
        jbC = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tfDisplay.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jbN7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbN7.setText("7");
        jbN7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbN7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbN7ActionPerformed(evt);
            }
        });

        jbN4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbN4.setText("4");
        jbN4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbN4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbN4ActionPerformed(evt);
            }
        });

        jbN1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbN1.setText("1");
        jbN1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbN1ActionPerformed(evt);
            }
        });

        jbN8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbN8.setText("8");
        jbN8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbN8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbN8ActionPerformed(evt);
            }
        });

        jbN5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbN5.setText("5");
        jbN5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbN5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbN5ActionPerformed(evt);
            }
        });

        jbN2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbN2.setText("2");
        jbN2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbN2ActionPerformed(evt);
            }
        });

        jbN9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbN9.setText("9");
        jbN9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbN9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbN9ActionPerformed(evt);
            }
        });

        jbN6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbN6.setText("6");
        jbN6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbN6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbN6ActionPerformed(evt);
            }
        });

        jbN3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbN3.setText("3");
        jbN3.setToolTipText("");
        jbN3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbN3ActionPerformed(evt);
            }
        });

        jbSoma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbSoma.setText("+");
        jbSoma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSomaActionPerformed(evt);
            }
        });

        jbSub.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbSub.setText("-");
        jbSub.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSubActionPerformed(evt);
            }
        });

        jbMult.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbMult.setText("x");
        jbMult.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMultActionPerformed(evt);
            }
        });

        jbN0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbN0.setText("0");
        jbN0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbN0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbN0ActionPerformed(evt);
            }
        });

        jbPonto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbPonto.setText(".");
        jbPonto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPontoActionPerformed(evt);
            }
        });

        jbTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbTotal.setText("=");
        jbTotal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTotalActionPerformed(evt);
            }
        });

        jbDiv.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbDiv.setText("/");
        jbDiv.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDivActionPerformed(evt);
            }
        });

        jbCE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbCE.setText("CE");
        jbCE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCEActionPerformed(evt);
            }
        });

        jbC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbC.setText("C");
        jbC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("CALCULADORA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jbN7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jbN4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jbN1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jbN0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addComponent(jbPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jbTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jbCE, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(28, 28, 28)
                                            .addComponent(jbC, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(59, 59, 59)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jbN8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jbN5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jbN2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jbN9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jbN6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jbN3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jbSoma, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jbSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbMult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel1)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(tfDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbN7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbN8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbN9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbN5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbN4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbN6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbN2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbN1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbN3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbC, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbCE, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jbSub, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbMult, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbN0, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbN7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbN7ActionPerformed
            tfDisplay.setText(tfDisplay.getText()+"7");
    }//GEN-LAST:event_jbN7ActionPerformed

    private void jbN4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbN4ActionPerformed
        tfDisplay.setText(tfDisplay.getText()+"4");
    }//GEN-LAST:event_jbN4ActionPerformed

    private void jbN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbN1ActionPerformed
        tfDisplay.setText(tfDisplay.getText()+"1");
    }//GEN-LAST:event_jbN1ActionPerformed

    private void jbN8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbN8ActionPerformed
        tfDisplay.setText(tfDisplay.getText()+"8");
    }//GEN-LAST:event_jbN8ActionPerformed

    private void jbN5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbN5ActionPerformed
        tfDisplay.setText(tfDisplay.getText()+"5");
    }//GEN-LAST:event_jbN5ActionPerformed

    private void jbN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbN2ActionPerformed
        tfDisplay.setText(tfDisplay.getText()+"2");
    }//GEN-LAST:event_jbN2ActionPerformed

    private void jbN9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbN9ActionPerformed
        tfDisplay.setText(tfDisplay.getText()+"9");
    }//GEN-LAST:event_jbN9ActionPerformed

    private void jbN6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbN6ActionPerformed
        tfDisplay.setText(tfDisplay.getText()+"6");
    }//GEN-LAST:event_jbN6ActionPerformed

    private void jbN3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbN3ActionPerformed
        tfDisplay.setText(tfDisplay.getText()+"3");
    }//GEN-LAST:event_jbN3ActionPerformed

    private void jbSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSomaActionPerformed
        num1 = Double.parseDouble(tfDisplay.getText());
        tfDisplay.setText(null);
        operacao = "soma";
    }//GEN-LAST:event_jbSomaActionPerformed

    private void jbSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSubActionPerformed
        num1 = Double.parseDouble(tfDisplay.getText());
        tfDisplay.setText(null);
        operacao = "sub";   
    }//GEN-LAST:event_jbSubActionPerformed

    private void jbMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMultActionPerformed
        num1 = Double.parseDouble(tfDisplay.getText());
        tfDisplay.setText(null);
        operacao = "mult";
    }//GEN-LAST:event_jbMultActionPerformed

    private void jbN0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbN0ActionPerformed
        tfDisplay.setText(tfDisplay.getText()+"0");
    }//GEN-LAST:event_jbN0ActionPerformed

    private void jbPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPontoActionPerformed
        tfDisplay.setText(tfDisplay.getText()+".");
    }//GEN-LAST:event_jbPontoActionPerformed

    private void jbTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTotalActionPerformed
       num2 = Double.parseDouble(tfDisplay.getText());
       calc = new Calculo(num1, num2, operacao);
       tfDisplay.setText(calc.totalizar());
     
    }//GEN-LAST:event_jbTotalActionPerformed

    private void jbDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDivActionPerformed
        num1 = Double.parseDouble(tfDisplay.getText());
        tfDisplay.setText(null);
        operacao = "div";
    }//GEN-LAST:event_jbDivActionPerformed

    private void jbCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCEActionPerformed
        tfDisplay.setText(null);

    }//GEN-LAST:event_jbCEActionPerformed

    private void jbCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCActionPerformed
        num1 = 0;
        num2 = 0;
        tfDisplay.setText(null);

    }//GEN-LAST:event_jbCActionPerformed

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
            java.util.logging.Logger.getLogger(AppCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbC;
    private javax.swing.JButton jbCE;
    private javax.swing.JButton jbDiv;
    private javax.swing.JButton jbMult;
    private javax.swing.JButton jbN0;
    private javax.swing.JButton jbN1;
    private javax.swing.JButton jbN2;
    private javax.swing.JButton jbN3;
    private javax.swing.JButton jbN4;
    private javax.swing.JButton jbN5;
    private javax.swing.JButton jbN6;
    private javax.swing.JButton jbN7;
    private javax.swing.JButton jbN8;
    private javax.swing.JButton jbN9;
    private javax.swing.JButton jbPonto;
    private javax.swing.JButton jbSoma;
    private javax.swing.JButton jbSub;
    private javax.swing.JButton jbTotal;
    private javax.swing.JTextField tfDisplay;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraGUI;

import com.jotavital.calculadora.Operacoes;

/**
 *
 * @author picle
 */
public class MainGUI extends javax.swing.JFrame {

    /**
     * Creates new form MainGUI
     */
    public MainGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtN1 = new javax.swing.JTextField();
        txtN2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSomar = new javax.swing.JButton();
        btnSub = new javax.swing.JButton();
        btnMult = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        lblResult = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora TOP");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Calculadora");

        jLabel1.setText("Número 1");

        jLabel3.setText("Número 2");

        btnSomar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_plus_math_15px.png"))); // NOI18N
        btnSomar.setText("Somar");
        btnSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSomarActionPerformed(evt);
            }
        });
        btnSomar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSomarKeyPressed(evt);
            }
        });

        btnSub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_subtract_15px.png"))); // NOI18N
        btnSub.setText("Subtrair");
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubActionPerformed(evt);
            }
        });

        btnMult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_multiply_15px.png"))); // NOI18N
        btnMult.setText("Multiplicar");
        btnMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultActionPerformed(evt);
            }
        });

        btnDiv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_percentage_15px.png"))); // NOI18N
        btnDiv.setText("Dividir");
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });

        lblResult.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblResult.setText("Resultado =");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtN1, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(txtN2)))
                    .addComponent(lblResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(btnSomar)
                .addGap(18, 18, 18)
                .addComponent(btnSub)
                .addGap(18, 18, 18)
                .addComponent(btnMult)
                .addGap(18, 18, 18)
                .addComponent(btnDiv)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtN1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtN2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(33, 33, 33)
                .addComponent(lblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSomar)
                    .addComponent(btnSub)
                    .addComponent(btnMult)
                    .addComponent(btnDiv))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSomarActionPerformed
        // TODO add your handling code here:
        
        OperacoesGUI op = new OperacoesGUI();
        float num1 = Float.parseFloat(txtN1.getText()), num2 = Float.parseFloat(txtN2.getText());
        float result = op.somar(num1, num2);
        
        String res = String.valueOf(op.somar(num1, num2));
        lblResult.setText("Resultado = " + res);
        
        txtN1.setText("");
        txtN2.setText("");
        txtN1.requestFocus();
    }//GEN-LAST:event_btnSomarActionPerformed

    private void btnSomarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSomarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSomarKeyPressed

    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubActionPerformed
        // TODO add your handling code here:
        OperacoesGUI op = new OperacoesGUI();
        float num1 = Float.parseFloat(txtN1.getText()), num2 = Float.parseFloat(txtN2.getText());
        float result = op.sub(num1, num2);
        
        String res = String.valueOf(op.sub(num1, num2));
        lblResult.setText("Resultado = " + res);
        
        txtN1.setText("");
        txtN2.setText("");
        txtN1.requestFocus();
    }//GEN-LAST:event_btnSubActionPerformed

    private void btnMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultActionPerformed
        // TODO add your handling code here:
        OperacoesGUI op = new OperacoesGUI();
        float num1 = Float.parseFloat(txtN1.getText()), num2 = Float.parseFloat(txtN2.getText());
        float result = op.mult(num1, num2);
        
        String res = String.valueOf(op.mult(num1, num2));
        lblResult.setText("Resultado = " + res);
        
        txtN1.setText("");
        txtN2.setText("");
        txtN1.requestFocus();
    }//GEN-LAST:event_btnMultActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
        // TODO add your handling code here:
        OperacoesGUI op = new OperacoesGUI();
        float num1 = Float.parseFloat(txtN1.getText()), num2 = Float.parseFloat(txtN2.getText());
        float result = op.div(num1, num2);
        
        String res = String.valueOf(op.div(num1, num2));
        lblResult.setText("Resultado = " + res);
        
        txtN1.setText("");
        txtN2.setText("");
        txtN1.requestFocus();
    }//GEN-LAST:event_btnDivActionPerformed

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
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnMult;
    private javax.swing.JButton btnSomar;
    private javax.swing.JButton btnSub;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblResult;
    private javax.swing.JTextField txtN1;
    private javax.swing.JTextField txtN2;
    // End of variables declaration//GEN-END:variables
}

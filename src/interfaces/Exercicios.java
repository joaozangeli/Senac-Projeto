/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author sala18a
 */
public class Exercicios extends javax.swing.JFrame {

    /**
     * Creates new form Exercicios
     */
    public Exercicios() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextTitulo_Exercicios = new javax.swing.JTextField();
        jTextNome_Exercicios = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextQuestao_Exercicios = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextQuestao_Exercicios1 = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Exercicios");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(198, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 760, 120);

        jLabel2.setText("Nome");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 160, 27, 14);

        jLabel3.setText("Titulo");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 210, 50, 14);

        jButton1.setText("ADICIONAR OPCAO");
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 430, 150, 60);

        jTextTitulo_Exercicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTitulo_ExerciciosActionPerformed(evt);
            }
        });
        getContentPane().add(jTextTitulo_Exercicios);
        jTextTitulo_Exercicios.setBounds(90, 210, 140, 20);
        getContentPane().add(jTextNome_Exercicios);
        jTextNome_Exercicios.setBounds(90, 160, 140, 20);

        jLabel4.setText("Questão");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 270, 60, 20);

        jTextQuestao_Exercicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextQuestao_ExerciciosActionPerformed(evt);
            }
        });
        getContentPane().add(jTextQuestao_Exercicios);
        jTextQuestao_Exercicios.setBounds(90, 350, 330, 60);

        jLabel5.setText("Resposta");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 370, 60, 20);

        jTextQuestao_Exercicios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextQuestao_Exercicios1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextQuestao_Exercicios1);
        jTextQuestao_Exercicios1.setBounds(90, 260, 330, 70);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextTitulo_ExerciciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTitulo_ExerciciosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTitulo_ExerciciosActionPerformed

    private void jTextQuestao_ExerciciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextQuestao_ExerciciosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextQuestao_ExerciciosActionPerformed

    private void jTextQuestao_Exercicios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextQuestao_Exercicios1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextQuestao_Exercicios1ActionPerformed

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
            java.util.logging.Logger.getLogger(Exercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exercicios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextNome_Exercicios;
    private javax.swing.JTextField jTextQuestao_Exercicios;
    private javax.swing.JTextField jTextQuestao_Exercicios1;
    private javax.swing.JTextField jTextTitulo_Exercicios;
    // End of variables declaration//GEN-END:variables
}

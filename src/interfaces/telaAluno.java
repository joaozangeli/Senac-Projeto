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
public class telaAluno extends javax.swing.JFrame {

    /**
     * Creates new form telaAluno
     */
    public telaAluno() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jTextNome_alunos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextNome_alunos1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextNome_alunos2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextCod_alunos3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Do Aluno");
        getContentPane().setLayout(null);

        jLabel2.setText("Nome");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 90, 60, 14);

        jTextNome_alunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNome_alunosActionPerformed(evt);
            }
        });
        getContentPane().add(jTextNome_alunos);
        jTextNome_alunos.setBounds(70, 90, 100, 20);

        jLabel3.setText("Série");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 120, 63, 14);

        jLabel4.setText("Matricula");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 150, 60, 14);

        jTextNome_alunos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNome_alunos1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextNome_alunos1);
        jTextNome_alunos1.setBounds(80, 150, 50, 20);

        jLabel5.setText("Turno");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 180, 63, 14);

        jLabel6.setText("Email");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 210, 60, 14);

        jTextNome_alunos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNome_alunos2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextNome_alunos2);
        jTextNome_alunos2.setBounds(70, 210, 170, 20);

        jLabel7.setText("Login");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 240, 63, 14);

        jTextCod_alunos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCod_alunos3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextCod_alunos3);
        jTextCod_alunos3.setBounds(70, 240, 75, 20);

        jLabel8.setText("Senha");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 270, 60, 14);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(80, 120, 31, 20);

        jButton1.setText("Novo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(80, 320, 57, 23);

        jButton2.setText("Salvar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(180, 320, 63, 23);

        jButton3.setText("Excluir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(290, 320, 63, 23);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matutino", "Vespertino", "Noturno", "Integral" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(70, 180, 70, 20);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(70, 270, 80, 20);

        setSize(new java.awt.Dimension(416, 422));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextCod_alunos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCod_alunos3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCod_alunos3ActionPerformed

    private void jTextNome_alunos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNome_alunos2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNome_alunos2ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextNome_alunos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNome_alunos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNome_alunos1ActionPerformed

    private void jTextNome_alunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNome_alunosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNome_alunosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(telaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextCod_alunos3;
    private javax.swing.JTextField jTextNome_alunos;
    private javax.swing.JTextField jTextNome_alunos1;
    private javax.swing.JTextField jTextNome_alunos2;
    // End of variables declaration//GEN-END:variables
}

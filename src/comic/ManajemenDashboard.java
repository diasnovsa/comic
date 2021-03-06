/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comic;

import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Acek
 */
public class ManajemenDashboard extends javax.swing.JFrame {

    /**
     * Creates new form ManajemenDashboard
     */
    public ManajemenDashboard() {
        initComponents();
    }

    
     public int getRowTable() {
        int row = tabelKomik.getSelectedRow();
        return row;
    }
    
    public Object getTableValue(int a, int b) {
        Object value = tabelKomik.getValueAt(a, b);
        return value;
    }
    
    public void setKomikTable(DefaultTableModel model) {
        tabelKomik.setModel(model);
    }
        public void listenerTableKomik(MouseListener x) {
        tabelKomik.addMouseListener(x);
    }

    public void listenerGambar1 (ActionListener x){
        jb1.addActionListener(x);
    }
    public void listenerGambar2 (ActionListener x){
        jb2.addActionListener(x);
    }
    public void listenerGambar3 (ActionListener x){
        jb3.addActionListener(x);
    }
    public void listenerGambar4 (ActionListener x){
        jb4.addActionListener(x);
    }
    public void listenerGambar5 (ActionListener x){
        jb5.addActionListener(x);
    }
    public void listenerGambar6 (ActionListener x){
        jb6.addActionListener(x);
    }
    
    public void listenerReset (ActionListener x){
        jbReset.addActionListener(x);
    }
    
    //set enable
    public void enableTomol1(boolean x){
        jb1.setEnabled(x);
    }
    public void enableTomol2(boolean x){
        jb2.setEnabled(x);
    }
    public void enableTomol3(boolean x){
        jb3.setEnabled(x);
    }
    public void enableTomol4(boolean x){
        jb4.setEnabled(x);
    }
    public void enableTomol5(boolean x){
        jb5.setEnabled(x);
    }
    public void enableTomol6(boolean x){
        jb6.setEnabled(x);
    }

        //untuk exit
     public void listenerExit(ActionListener x) {
        Jbexit.addActionListener(x);
    }
    
    public void listenerLogout(ActionListener x) {
        jbLogout.addActionListener(x);
    }
    
    public void listenerBack(ActionListener x) {
        jbBack.addActionListener(x);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelKomik = new javax.swing.JTable();
        jb1 = new javax.swing.JButton();
        jb2 = new javax.swing.JButton();
        jb3 = new javax.swing.JButton();
        jb4 = new javax.swing.JButton();
        jb5 = new javax.swing.JButton();
        jb6 = new javax.swing.JButton();
        jbReset = new javax.swing.JButton();
        jbBack = new javax.swing.JButton();
        jbLogout = new javax.swing.JButton();
        Jbexit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelKomik.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelKomik);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 400, 540));

        jb1.setText("Gambar 1");
        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb1ActionPerformed(evt);
            }
        });
        getContentPane().add(jb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, -1, -1));

        jb2.setText("Gambar 2");
        getContentPane().add(jb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, -1, -1));

        jb3.setText("Gambar 3");
        getContentPane().add(jb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, -1, -1));

        jb4.setText("Gambar 4");
        getContentPane().add(jb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, -1, -1));

        jb5.setText("Gambar 5");
        getContentPane().add(jb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, -1, -1));

        jb6.setText("Gambar 6");
        getContentPane().add(jb6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, -1, -1));

        jbReset.setText("Reset");
        getContentPane().add(jbReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, 101, 59));

        jbBack.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jbBack.setForeground(new java.awt.Color(255, 255, 255));
        jbBack.setText("Kembali");
        jbBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbBack.setBorderPainted(false);
        jbBack.setContentAreaFilled(false);
        jbBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jbBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, -1, 30));

        jbLogout.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jbLogout.setForeground(new java.awt.Color(255, 255, 255));
        jbLogout.setText("Log out");
        jbLogout.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jbLogout.setBorderPainted(false);
        jbLogout.setContentAreaFilled(false);
        jbLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jbLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, -1, 30));

        Jbexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginAndReg/exit putih.png"))); // NOI18N
        Jbexit.setBorderPainted(false);
        Jbexit.setContentAreaFilled(false);
        Jbexit.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/loginAndReg/exit hitam.png"))); // NOI18N
        getContentPane().add(Jbexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginAndReg/registation.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb1ActionPerformed

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
            java.util.logging.Logger.getLogger(ManajemenDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManajemenDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManajemenDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManajemenDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManajemenDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jbexit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb1;
    private javax.swing.JButton jb2;
    private javax.swing.JButton jb3;
    private javax.swing.JButton jb4;
    private javax.swing.JButton jb5;
    private javax.swing.JButton jb6;
    private javax.swing.JButton jbBack;
    private javax.swing.JButton jbLogout;
    private javax.swing.JButton jbReset;
    private javax.swing.JTable tabelKomik;
    // End of variables declaration//GEN-END:variables
}

package CRUD_Pr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Main_Window extends javax.swing.JFrame {

    public Main_Window() {
        initComponents();
        showTableData();
    }

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtImage = new javax.swing.JTextField();
        txtAddDate = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnChooseImg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1250, 650));
        setMinimumSize(new java.awt.Dimension(1250, 650));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("ID: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 61, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("IMAGE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 292, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("NAME: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 109, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("DATE ADDED");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 206, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("PRICE: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 156, -1, -1));
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 110, 211, 37));
        getContentPane().add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 157, 211, 37));
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 62, 137, 37));
        getContentPane().add(txtImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 256, 211, 174));
        getContentPane().add(txtAddDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 207, 211, 37));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "PRICE", "ADD_DATE"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 711, 449));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 503, 203, 73));

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 503, 203, 73));

        btnPrev.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnPrev.setText("Prev");
        getContentPane().add(btnPrev, new org.netbeans.lib.awtextra.AbsoluteConstraints(702, 503, 203, 73));

        btnNext.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnNext.setText("Next");
        getContentPane().add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(923, 503, 203, 73));

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 503, 203, 73));

        btnChooseImg.setText("choose image");
        getContentPane().add(btnChooseImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 370, 151, 39));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        try {
            String sql = "INSERT INTO productdb"
                    + "(name,price,add_date)"
                    + "values(?,?,?)";
            con = DriverManager.getConnection("jdbc:mysql://localhost/product_db", "root", "");
            pst = con.prepareStatement(sql);
            pst.setString(1, txtName.getText());
            pst.setString(2, txtPrice.getText());
            pst.setString(3, txtAddDate.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data added!");
            txtName.setText("");
            txtPrice.setText("");
            txtAddDate.setText("");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Input Error. No connection" + ex);

        }
        showTableData();
    }//GEN-LAST:event_btnAddActionPerformed

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowDeactivated

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            String sql = "UPDATE productdb SET "
                    + "name=?,price=?,add_date=? "
                    + "WHERE id=?";

            con = DriverManager.getConnection("jdbc:mysql://localhost/product_db", "root", "");
            pst = con.prepareStatement(sql);
            pst.setString(1, txtName.getText());
            pst.setString(2, txtPrice.getText());
            pst.setString(3, txtAddDate.getText());
            pst.setString(4, txtID.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Updated!");
            txtName.setText("");
            txtPrice.setText("");
            txtAddDate.setText("");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Input Error. No connection" + ex);
        }
        showTableData();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            String sql = "DELETE FROM productdb WHERE id=?";
            con = DriverManager.getConnection("jdbc:mysql://localhost/product_db", "root", "");
            pst = con.prepareStatement(sql);
            pst.setString(1, txtID.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Deleted!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Input Error. " + ex);
        }
        showTableData();
    }

    public void showTableData() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/product_db", "root", "");
            String sql = "SELECT * FROM productdb";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Input Error. No connection" + ex);

        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int selectedRowIndex = jTable1.getSelectedRow();
        
        txtID.setText(model.getValueAt(selectedRowIndex, 0).toString());
        txtName.setText(model.getValueAt(selectedRowIndex, 1).toString());
        txtPrice.setText(model.getValueAt(selectedRowIndex, 2).toString());
        txtAddDate.setText(model.getValueAt(selectedRowIndex, 3).toString());
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(Main_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnChooseImg;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtAddDate;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtImage;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TH04;


import TH04.SinhVien;
import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;



/**
 *
 * @author nhut
 */
public class BaiTH04 extends javax.swing.JFrame {

    /**
     * Creates new form BaiTH04
     */
    ArrayList<SinhVien> SV = new ArrayList<>();
    public BaiTH04() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtHT = new javax.swing.JTextField();
        txtNS = new javax.swing.JTextField();
        cbLop = new javax.swing.JComboBox();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnTim = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDS = new javax.swing.JTable();
        txtMSSV = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("MSSV");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 36, -1));

        jLabel2.setText("Họ tên");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 52, -1, 20));

        jLabel3.setText("Năm sinh");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 87, 70, -1));

        jLabel4.setText("Lớp");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 128, 53, -1));

        txtHT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHTActionPerformed(evt);
            }
        });
        getContentPane().add(txtHT, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 113, -1));
        getContentPane().add(txtNS, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 113, -1));

        cbLop.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "56TH1", "56TH2", "57TH1", "57TH2" }));
        cbLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLopActionPerformed(evt);
            }
        });
        getContentPane().add(cbLop, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 125, -1, -1));

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        getContentPane().add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 70, -1));

        btnXoa.setText("Xoá");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        getContentPane().add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 70, -1));

        btnSua.setText("Sửa/ Lưu");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 80, -1));

        btnTim.setText("Tìm kiếm");
        getContentPane().add(btnTim, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, -1));

        btnAdd.setText("...");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 124, -1, -1));

        tbDS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MSSV", "Họ tên", "Năm sinh", "Lớp"
            }
        ));
        tbDS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDSMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDS);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 158, -1, 93));

        txtMSSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMSSVActionPerformed(evt);
            }
        });
        getContentPane().add(txtMSSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 112, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLopActionPerformed
        // TODO add youngr handling code here:
    }//GEN-LAST:event_cbLopActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        String MSSV = txtMSSV.getText();
        String HoTen = txtHT.getText();
        String NamSinh = txtNS.getText();
        String Lop = cbLop.getSelectedItem().toString();
        
        SinhVien Demo = new SinhVien();
        
        Demo.setHoTen(HoTen);
        Demo.setMSSV(MSSV);
        Demo.setNamSinh(NamSinh);
        Demo.setLop(Lop);
        SV.add(Demo);

        DefaultTableModel model = new DefaultTableModel();
        // xac dinh so cot va dat ten
          //  model.setColumnCount(4);
            model.addColumn("MSSV");
            model.addColumn("HoTen");
            model.addColumn("NamSinh");
            model.addColumn("Lop");
        //Duye qua ArrayList
        for(int i=0; i< SV.size();i++)
            {
                SinhVien sv = SV.get(i);
                Vector<String> Dong = new Vector<>();
                Dong.add(sv.getMSSV());
                Dong.add(sv.getHoTen());
                Dong.add(sv.getNamSinh());
                Dong.add(sv.getLop());
                model.addRow(Dong);                
            }
        //Hien ra table
        tbDS.setModel(model);
        
        
       
         
        
        
       
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtHTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHTActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int n = tbDS.getSelectedRow();
       
    }//GEN-LAST:event_btnXoaActionPerformed

    private void txtMSSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMSSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMSSVActionPerformed

    private void tbDSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDSMouseClicked
        // TODO add your handling code here:
        TableModel mData = tbDS.getModel();
        //Láº¥y dÃ²ng Ä‘c chá»�n
        int chon = tbDS.getSelectedRow();
        txtHT.setText( mData.getValueAt(chon, 0).toString());
        txtMSSV.setText( mData.getValueAt(chon, 1).toString());
        txtNS.setText( mData.getValueAt(chon, 2).toString());
        cbLop.setSelectedItem(chon);
    }//GEN-LAST:event_tbDSMouseClicked

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
            java.util.logging.Logger.getLogger(BaiTH04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BaiTH04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BaiTH04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BaiTH04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BaiTH04().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox cbLop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDS;
    private javax.swing.JTextField txtHT;
    private javax.swing.JTextField txtMSSV;
    private javax.swing.JTextField txtNS;
    // End of variables declaration//GEN-END:variables
}
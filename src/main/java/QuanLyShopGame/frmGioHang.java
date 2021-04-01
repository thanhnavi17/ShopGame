/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyShopGame;

import QuanLyShopGame.NguoiDung.NguoiDung;
import java.awt.Image;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */

public class frmGioHang extends javax.swing.JFrame {

    private static NguoiDung user = null;

    public static NguoiDung getUser() {
        return user;
    }

    public static void setUser(NguoiDung user) {
        frmGioHang.user = user;
    }
    GioHangDao ghDao = new GioHangImpl();
    
    /**
     * Creates new form frmGioHang
     */
    public frmGioHang() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDong = new javax.swing.JButton();
        btnThanhToan = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblValue = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableGioHang = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblTong = new javax.swing.JLabel();
        btnXoa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnDong.setIcon(new javax.swing.ImageIcon("E:\\Java\\HocVien\\macanhthanh\\Project_QuanLyShopGame\\src\\main\\java\\image\\image\\images\\cancel.gif")); // NOI18N
        btnDong.setText("Đóng");
        btnDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongActionPerformed(evt);
            }
        });

        btnThanhToan.setIcon(new javax.swing.ImageIcon("E:\\Java\\ImageIcon\\mini_icon_set\\Mini Icon Set\\PNG\\16x16\\34.png")); // NOI18N
        btnThanhToan.setText("Thanh toán");
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });

        jTableGioHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Hình ảnh", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableGioHang);

        jLabel1.setText("Tổng :");

        lblTong.setText(" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblValue)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTong)
                .addGap(120, 120, 120))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(lblValue))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblTong))
                .addContainerGap())
        );

        btnXoa.setIcon(new javax.swing.ImageIcon("E:\\Java\\HocVien\\macanhthanh\\Project_QuanLyShopGame\\src\\main\\java\\image\\image\\images\\delete.gif")); // NOI18N
        btnXoa.setText("Huỷ");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnXoa)
                .addGap(18, 18, 18)
                .addComponent(btnThanhToan)
                .addGap(18, 18, 18)
                .addComponent(btnDong)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDong)
                    .addComponent(btnThanhToan)
                    .addComponent(btnXoa))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.setTitle("Giỏ hàng");
        hienThiDanhSach();
    }//GEN-LAST:event_formWindowOpened

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed
        // TODO add your handling code here:
        frmThanhToan tt = new frmThanhToan();
        tt.setVisible(true);
        frmThanhToan.setUser(user);
        pVi.setUser(user);
    }//GEN-LAST:event_btnThanhToanActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int ketQua = JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc chắn muốn xoá?", "Thông báo",
            JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (ketQua == JOptionPane.YES_OPTION) {
            String maSP = "";
            int dongChon = 0;
            dongChon = jTableGioHang.getSelectedRow();
            maSP = "" + jTableGioHang.getValueAt(dongChon, 1);
            
            boolean kq = ghDao.xoa(maSP);
            if (kq) {
                hienThiDanhSach();
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnDongActionPerformed

    public static void hienThiDanhSach()
    {
        //Khai báo các cột tiêu đề
        String tieuDe[] = new String[]{"Hình ảnh","Mã SP","Giá","Số lượng","Thành tiền"};
        //Khai báo đối tượng để hiển thị dữ liệu lên table
        DefaultTableModel model = new DefaultTableModel(tieuDe,0);
        
        //Khai báo 1 đối tượng thuộc lớp
        
        GioHangDao ghDao = new GioHangImpl();
        //Lấy danh sách sản phẩm trong hệ thống
        List<GioHang> lstGioHang = ghDao.timKiemGioHang(user.getMaKH());
        
        DecimalFormat f = new DecimalFormat("###,###.00");
        //Khai báo đối tượng chứa dữ liệu đưa vào model
        Object[][] row = new Object[lstGioHang.size()][5];
        TheModel mod = new TheModel(row,tieuDe);
        for(int i = 0;i<lstGioHang.size();i++)
        {
            if (lstGioHang.get(i).getImg() != null) {
                ImageIcon image = new ImageIcon(new ImageIcon(lstGioHang.get(i).getImg()).getImage()
                        .getScaledInstance(100, 90, Image.SCALE_SMOOTH));
                row[i][0] = image;
            } else {
                row[i][0] = null;
            }
            row[i][1] = lstGioHang.get(i).getMaSP();
            row[i][2] = f.format(lstGioHang.get(i).getGia());
            row[i][3] = lstGioHang.get(i).getSoLuong();
            row[i][4] = (lstGioHang.get(i).getGia()) * (lstGioHang.get(i).getSoLuong());
            
            
            //Thêm vào model
            
        }
        
        jTableGioHang.setModel(mod);
        jTableGioHang.setRowHeight(90);
        jTableGioHang.getColumnModel().getColumn(0).setPreferredWidth(100);
        //Thêm model vào table
        
        lblTong.setText(""+ghDao.tongHoaDon(user.getMaKH()));
    }
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
            java.util.logging.Logger.getLogger(frmGioHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmGioHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmGioHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmGioHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmGioHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDong;
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTableGioHang;
    private static javax.swing.JLabel lblTong;
    private javax.swing.JLabel lblValue;
    // End of variables declaration//GEN-END:variables
}

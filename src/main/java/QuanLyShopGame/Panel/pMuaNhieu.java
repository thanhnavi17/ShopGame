/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyShopGame.Panel;

import QuanLyShopGame.SanPham;
import QuanLyShopGame.SanPhamDao;
import QuanLyShopGame.SanPhamImpl;
import QuanLyShopGame.frmChiTietSP;
import static QuanLyShopGame.frmCuaSoChinh.objSP;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author Admin
 */
public class pMuaNhieu extends javax.swing.JPanel {

    SanPhamDao spDao = new SanPhamImpl();
    public static SanPham objSP;
    /**
     * Creates new form pMuaNhieu
     */
    public pMuaNhieu() {
        initComponents();
        List<SanPham> lstTop4 = spDao.dstop4LuotMua();
        lblTen1.setText(lstTop4.get(0).getTenSP());
        lblGia1.setText(lstTop4.get(0).getGia()+" VND");
        ImageIcon img1 = new ImageIcon(new ImageIcon(lstTop4.get(0).getImg()).getImage()
                        .getScaledInstance(110, 104, Image.SCALE_SMOOTH));
        lblAnh1.setIcon(img1);
        
        lblTen2.setText(lstTop4.get(1).getTenSP());
        lblGia2.setText(lstTop4.get(1).getGia()+" VND");
        ImageIcon img2 = new ImageIcon(new ImageIcon(lstTop4.get(1).getImg()).getImage()
                        .getScaledInstance(110, 104, Image.SCALE_SMOOTH));
        lblAnh2.setIcon(img2);
        
        lblTen3.setText(lstTop4.get(2).getTenSP());
        lblGia3.setText(lstTop4.get(2).getGia()+" VND");
        ImageIcon img3 = new ImageIcon(new ImageIcon(lstTop4.get(2).getImg()).getImage()
                        .getScaledInstance(110, 104, Image.SCALE_SMOOTH));
        lblAnh3.setIcon(img3);
        
        lblTen4.setText(lstTop4.get(3).getTenSP());
        lblGia4.setText(lstTop4.get(3).getGia()+" VND");
        ImageIcon img4 = new ImageIcon(new ImageIcon(lstTop4.get(3).getImg()).getImage()
                        .getScaledInstance(110, 104, Image.SCALE_SMOOTH));
        lblAnh4.setIcon(img4);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pMuaNhieu = new javax.swing.JPanel();
        pMuaNhieu2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblAnh1 = new javax.swing.JLabel();
        lblTen1 = new javax.swing.JLabel();
        lblGia1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lblAnh2 = new javax.swing.JLabel();
        lblTen2 = new javax.swing.JLabel();
        lblGia2 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        lblAnh3 = new javax.swing.JLabel();
        lblTen3 = new javax.swing.JLabel();
        lblGia3 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        lblAnh4 = new javax.swing.JLabel();
        lblTen4 = new javax.swing.JLabel();
        lblGia4 = new javax.swing.JLabel();

        pMuaNhieu.setPreferredSize(new java.awt.Dimension(669, 342));

        lblTen1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTen1.setText("jLabel3");
        lblTen1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTen1MouseClicked(evt);
            }
        });

        lblGia1.setText("jLabel4");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lblAnh1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTen1)
                    .addComponent(lblGia1))
                .addGap(0, 69, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAnh1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(lblTen1)
                .addGap(18, 18, 18)
                .addComponent(lblGia1)
                .addGap(29, 29, 29))
        );

        lblTen2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTen2.setText("jLabel11");
        lblTen2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTen2MouseClicked(evt);
            }
        });

        lblGia2.setText("jLabel12");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(lblAnh2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTen2)
                    .addComponent(lblGia2))
                .addGap(0, 59, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAnh2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblTen2)
                .addGap(18, 18, 18)
                .addComponent(lblGia2)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        lblTen3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTen3.setText("jLabel6");
        lblTen3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTen3MouseClicked(evt);
            }
        });

        lblGia3.setText("jLabel7");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(lblAnh3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTen3)
                    .addComponent(lblGia3))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAnh3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTen3)
                .addGap(18, 18, 18)
                .addComponent(lblGia3)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        lblTen4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTen4.setText("jLabel13");
        lblTen4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTen4MouseClicked(evt);
            }
        });

        lblGia4.setText("jLabel14");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(lblAnh4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTen4)
                    .addComponent(lblGia4))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAnh4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblTen4)
                .addGap(18, 18, 18)
                .addComponent(lblGia4)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pMuaNhieu2Layout = new javax.swing.GroupLayout(pMuaNhieu2);
        pMuaNhieu2.setLayout(pMuaNhieu2Layout);
        pMuaNhieu2Layout.setHorizontalGroup(
            pMuaNhieu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMuaNhieu2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(pMuaNhieu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addGroup(pMuaNhieu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        pMuaNhieu2Layout.setVerticalGroup(
            pMuaNhieu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMuaNhieu2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(pMuaNhieu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(pMuaNhieu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pMuaNhieuLayout = new javax.swing.GroupLayout(pMuaNhieu);
        pMuaNhieu.setLayout(pMuaNhieuLayout);
        pMuaNhieuLayout.setHorizontalGroup(
            pMuaNhieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pMuaNhieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pMuaNhieuLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pMuaNhieu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pMuaNhieuLayout.setVerticalGroup(
            pMuaNhieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 342, Short.MAX_VALUE)
            .addGroup(pMuaNhieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pMuaNhieuLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pMuaNhieu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 669, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(pMuaNhieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 344, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(pMuaNhieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 2, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblTen1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTen1MouseClicked
        // TODO add your handling code here:
        String tenSp = lblTen1.getText();
        objSP = spDao.chiTietSP(tenSp);
        hienThiChiTiet();
    }//GEN-LAST:event_lblTen1MouseClicked

    private void lblTen2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTen2MouseClicked
        // TODO add your handling code here:
        String tenSp = lblTen2.getText();
        objSP = spDao.chiTietSP(tenSp);
        hienThiChiTiet();
    }//GEN-LAST:event_lblTen2MouseClicked

    private void lblTen3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTen3MouseClicked
        // TODO add your handling code here:
        String tenSp = lblTen3.getText();
        objSP = spDao.chiTietSP(tenSp);
        hienThiChiTiet();
    }//GEN-LAST:event_lblTen3MouseClicked

    private void lblTen4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTen4MouseClicked
        // TODO add your handling code here:
        String tenSp = lblTen4.getText();
        objSP = spDao.chiTietSP(tenSp);
        hienThiChiTiet();
    }//GEN-LAST:event_lblTen4MouseClicked

    public static void hienThiChiTiet()
    {
        frmChiTietSP chiTiet = new frmChiTietSP();
        frmChiTietSP.setSp(objSP);
        chiTiet.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblAnh1;
    private javax.swing.JLabel lblAnh2;
    private javax.swing.JLabel lblAnh3;
    private javax.swing.JLabel lblAnh4;
    private javax.swing.JLabel lblGia1;
    private javax.swing.JLabel lblGia2;
    private javax.swing.JLabel lblGia3;
    private javax.swing.JLabel lblGia4;
    private javax.swing.JLabel lblTen1;
    private javax.swing.JLabel lblTen2;
    private javax.swing.JLabel lblTen3;
    private javax.swing.JLabel lblTen4;
    private javax.swing.JPanel pMuaNhieu;
    private javax.swing.JPanel pMuaNhieu2;
    // End of variables declaration//GEN-END:variables
}

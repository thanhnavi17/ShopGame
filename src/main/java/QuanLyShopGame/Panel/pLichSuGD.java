/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyShopGame.Panel;

import QuanLyShopGame.HoaDonBan.HoaDonBan;
import QuanLyShopGame.HoaDonBan.HoaDonBanCT;
import QuanLyShopGame.HoaDonBan.HoaDonBanCTDao;
import QuanLyShopGame.HoaDonBan.HoaDonBanCTImpl;
import QuanLyShopGame.HoaDonBan.HoaDonBanDao;
import QuanLyShopGame.HoaDonBan.HoaDonBanImpl;
import QuanLyShopGame.NguoiDung.NguoiDung;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class pLichSuGD extends javax.swing.JPanel {

    public static NguoiDung getUser() {
        return user;
    }

    public static void setUser(NguoiDung user) {
        pLichSuGD.user = user;
    }

    private static NguoiDung user = null;
    
    /**
     * Creates new form pLichSuGD
     */
    public pLichSuGD() {
        initComponents();
        hienThiLichSuGD();
    }

    public static void hienThiLichSuGD(){
        String tieuDe[] = new String[]{"MaHoaDon","TenHoaDon","NgayBan","TongHoaDon"};
        
        DefaultTableModel model = new DefaultTableModel(tieuDe,0);
        HoaDonBanDao hdDao = new HoaDonBanImpl();
        List<HoaDonBan> lstHoaDon = hdDao.layDanhSach(user.getMaKH());
        Object row[];
        
        for(HoaDonBan hd: lstHoaDon)
        {
            row = new Object[4];
            
            row[0] = hd.getMaHD();
            row[1] = hd.getTenHD();
            row[2] = hd.getNgayBan();
            row[3] = hd.getTongHD();
            
            model.addRow(row);
        }
        
        jTableLS.setModel(model);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLS = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCT = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(765, 370));

        jTableLS.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableLS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableLSMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableLS);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Chi tiết hoá đơn");

        jTableCT.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTableCT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel1)
                        .addContainerGap(121, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTableLSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableLSMouseClicked
        // TODO add your handling code here:
        String maHoaDon = "";
        int dongChon = 0;
        //Lấy thông tin mã hoá đơn trên table
        dongChon = jTableLS.getSelectedRow();
        maHoaDon = "" +jTableLS.getValueAt(dongChon, 0);
        //Hiển thị hoá đơn chi tiết
        String tieuDe1[] = new String[]{"HoaDonID","MaSP","SoLuong","GiaBan"};
        DefaultTableModel model1 = new DefaultTableModel(tieuDe1,0);
        HoaDonBanCTDao ctDao = new HoaDonBanCTImpl();
        List<HoaDonBanCT> lstChiTiet = ctDao.layDanhSach(maHoaDon);
        Object row[];
        for(HoaDonBanCT ct: lstChiTiet){
            row = new Object[4];
            
            row[0] = ct.getMaHD();
            row[1] = ct.getMaSP();
            row[2] = ct.getSoLuong();
            row[3] = ct.getGiaBan();
            
            model1.addRow(row);
        }
        jTableCT.setModel(model1);
    }//GEN-LAST:event_jTableLSMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCT;
    private static javax.swing.JTable jTableLS;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyShopGame;

import QuanLyShopGame.NguoiDung.NguoiDung;
import java.awt.Image;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Collections;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class frmDanhSachSanPham extends javax.swing.JFrame {
    
    public static int soLuongSP,soTrang,trang;
    SanPhamDao spDao = new SanPhamImpl();
    private static NguoiDung user = null;

    public static NguoiDung getUser() {
        return user;
    }

    public static void setUser(NguoiDung user) {
        frmDanhSachSanPham.user = user;
    }
    
    /**
     * Creates new form frmDanhSachSanPham
     */
    public frmDanhSachSanPham() {
        initComponents();
        this.setTitle("Danh sách sản phẩm");
        hienThiDanhSach(1);
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTuKhoa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cboLoai = new javax.swing.JComboBox<>();
        btnTimKiem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDS = new javax.swing.JTable();
        btnDong = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        rbtnTen = new javax.swing.JRadioButton();
        rbtnGia = new javax.swing.JRadioButton();
        btnChiTiet = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnDau = new javax.swing.JButton();
        lblTrang = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        btnCuoi = new javax.swing.JButton();
        lblSoTrang = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nhập thông tin tìm kiếm"));

        jLabel1.setText("Nhập từ khoá");

        jLabel2.setText("Loại sản phẩm");

        cboLoai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnTimKiem.setIcon(new javax.swing.ImageIcon("E:\\Java\\ImageIcon\\mini_icon_set\\Mini Icon Set\\PNG\\16x16\\11.png")); // NOI18N
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtTuKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboLoai, 0, 135, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTimKiem)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTuKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cboLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTableDS.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableDS);

        btnDong.setIcon(new javax.swing.ImageIcon("E:\\Java\\HocVien\\macanhthanh\\Project_QuanLyShopGame\\src\\main\\java\\image\\image\\images\\cancel.gif")); // NOI18N
        btnDong.setText("Đóng");
        btnDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongActionPerformed(evt);
            }
        });

        btnXoa.setIcon(new javax.swing.ImageIcon("E:\\Java\\HocVien\\macanhthanh\\Project_QuanLyShopGame\\src\\main\\java\\image\\image\\images\\delete.gif")); // NOI18N
        btnXoa.setText("Xoá");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setIcon(new javax.swing.ImageIcon("E:\\Java\\HocVien\\macanhthanh\\Project_QuanLyShopGame\\src\\main\\java\\image\\image\\images\\book_edit.png")); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnThem.setIcon(new javax.swing.ImageIcon("E:\\Java\\HocVien\\macanhthanh\\Project_QuanLyShopGame\\src\\main\\java\\image\\image\\images\\plus_16.png")); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnTen);
        rbtnTen.setText("Sắp xếp theo tên");
        rbtnTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnTenActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnGia);
        rbtnGia.setText("Sắp xếp theo giá");
        rbtnGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnGiaActionPerformed(evt);
            }
        });

        btnChiTiet.setText("Chi tiết");
        btnChiTiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiTietActionPerformed(evt);
            }
        });

        btnBack.setText("<");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnDau.setText("<<");
        btnDau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDauActionPerformed(evt);
            }
        });

        lblTrang.setText("jLabel3");

        btnNext.setText(">");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnCuoi.setText(">>");
        btnCuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuoiActionPerformed(evt);
            }
        });

        lblSoTrang.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(rbtnTen)
                .addGap(41, 41, 41)
                .addComponent(rbtnGia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnChiTiet)
                .addGap(18, 18, 18)
                .addComponent(btnThem)
                .addGap(18, 18, 18)
                .addComponent(btnSua)
                .addGap(18, 18, 18)
                .addComponent(btnXoa)
                .addGap(18, 18, 18)
                .addComponent(btnDong)
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(btnDau)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTrang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNext)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCuoi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSoTrang)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnDau)
                    .addComponent(lblTrang)
                    .addComponent(btnNext)
                    .addComponent(btnCuoi)
                    .addComponent(lblSoTrang))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDong)
                    .addComponent(btnXoa)
                    .addComponent(btnSua)
                    .addComponent(btnThem)
                    .addComponent(rbtnTen)
                    .addComponent(rbtnGia)
                    .addComponent(btnChiTiet))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        //Chia trang
        soLuongSP = spDao.soLuongSP();
        if(soLuongSP%5==0){
            soTrang = soLuongSP/5;
        }else{
            soTrang = soLuongSP/5+1;
        }
        lblTrang.setText("1/"+soTrang);
        lblSoTrang.setText("1");
        hienThiDanhSachLoaiSP();
        //Phân quyền cho admin và người dùng
        if(user.getVaiTroID() == 1)
        {
            btnThem.setVisible(true);
            btnSua.setVisible(true);
            btnXoa.setVisible(true);
        }else{
            btnThem.setVisible(false);
            btnSua.setVisible(false);
            btnXoa.setVisible(false);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        //Khai báo 1 đối tượng
        
        frmSanPhamAdd frmThemMoi = new frmSanPhamAdd();

        //Hiển thị form
        frmThemMoi.setVisible(true);
        
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        // Khai báo biến
        String maSP = "";
        int dongChon = 0;
        //Lấy thông tin mã sản phẩm chọn trên jTable
        dongChon = jTableDS.getSelectedRow();

        maSP = "" + jTableDS.getValueAt(dongChon, 1);
        
        frmSanPhamAdd frmSua = new frmSanPhamAdd();

        //Gửi giá trị mã sản phẩm lên form sửa
        frmSua.setMaSanPham(maSP);
        //Hiển thị form
        frmSua.setVisible(true);
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int ketQua = JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc chắn muốn xoá?", "Thông báo",
            JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (ketQua == JOptionPane.YES_OPTION) {
            String maSP = "";
            int dongChon = 0;
            dongChon = jTableDS.getSelectedRow();
            maSP = "" + jTableDS.getValueAt(dongChon, 1);

            boolean kq = spDao.xoa(maSP);
            if (kq==false) {
                hienThiDanhSach(trang);
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnDongActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        hienThiDanhSachTimKiem();
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void rbtnTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnTenActionPerformed
        // TODO add your handling code here:
        hienThiDanhSachTimKiem();
    }//GEN-LAST:event_rbtnTenActionPerformed

    private void rbtnGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnGiaActionPerformed
        // TODO add your handling code here:
        hienThiDanhSachTimKiem();
    }//GEN-LAST:event_rbtnGiaActionPerformed

    private void btnChiTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChiTietActionPerformed
        // TODO add your handling code here:
        String maSP;
        int dongChon = 0;
        dongChon = jTableDS.getSelectedRow();
        maSP = "" + jTableDS.getValueAt(dongChon, 1);
        SanPham objSP = new SanPham();
        objSP = spDao.layChiTiet(maSP);
        frmChiTietSP chiTiet = new frmChiTietSP();
        frmChiTietSP.setSp(objSP);
        frmChiTietSP.setUser(user);
        chiTiet.setVisible(true);
    }//GEN-LAST:event_btnChiTietActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        if(trang<soTrang){
            trang++;
            hienThiDanhSach(trang);
            lblTrang.setText(""+trang);
            lblSoTrang.setText(trang+"/"+soTrang);
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        if(trang>1){
            trang--;
            hienThiDanhSach(trang);
            lblTrang.setText(""+trang);
            lblSoTrang.setText(trang+"/"+soTrang);
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuoiActionPerformed
        trang = soTrang;
        hienThiDanhSach(soTrang);
        lblTrang.setText(""+soTrang);
        lblSoTrang.setText(soTrang+"/"+soTrang);
    }//GEN-LAST:event_btnCuoiActionPerformed

    private void btnDauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDauActionPerformed
        trang = 1;
        hienThiDanhSach(1);
        lblTrang.setText("1");
        lblSoTrang.setText("1/"+soTrang);
    }//GEN-LAST:event_btnDauActionPerformed

    
    public static void hienThiDanhSachTimKiem()
    {
        //Khai báo từ khoá
        String tuKhoa = txtTuKhoa.getText().trim();
        String maLoai = "";
        LoaiSP objLoai = (LoaiSP)cboLoai.getSelectedItem();
        if(objLoai!=null)
        {
            maLoai = objLoai.getMaLoai();
        }
        //Khai báo các cột tiêu đề
        String tieuDe[] = new String[]{"Hình ảnh","Mã SP","Tên SP","Giá","Số lượng","Mã NPH","Ghi chú","Mã loại"};
        //Khai báo đối tượng để hiển thị dữ liệu lên table
        DefaultTableModel model = new DefaultTableModel(tieuDe,0);
        
        //Khai báo 1 đối tượng thuộc lớp
        SanPhamDao spDao = new SanPhamImpl();
        //Lấy danh sách sản phẩm trong hệ thống
        List<SanPham> lstSanPham = spDao.timKiemSanPham(tuKhoa, maLoai);
        //Khai báo đối tượng chứa dữ liệu đưa vào model
        Object[][] row = new Object[lstSanPham.size()][8];
        TheModel mod = new TheModel(row,tieuDe);
        if(rbtnTen.isSelected()){
            Collections.sort(lstSanPham, new SortByName());
        }
        if(rbtnGia.isSelected()){
            Collections.sort(lstSanPham, new SortByPrice());
        }
        DecimalFormat f = new DecimalFormat("###,###.00");
        
        for(int i = 0;i<lstSanPham.size();i++)
        {
            if (lstSanPham.get(i).getImg() != null) {
                ImageIcon image = new ImageIcon(new ImageIcon(lstSanPham.get(i).getImg()).getImage()
                        .getScaledInstance(110, 100, Image.SCALE_SMOOTH));
                row[i][0] = image;
            } else {
                row[i][0] = null;
            }
            row[i][1] = lstSanPham.get(i).getMaSP();
            row[i][2] = lstSanPham.get(i).getTenSP();
            row[i][3] = lstSanPham.get(i).getGia();
            row[i][4] = lstSanPham.get(i).getSoLuong();
            row[i][5] = lstSanPham.get(i).getMaNPH();
            row[i][6] = lstSanPham.get(i).getGhiChu();
            row[i][7] = lstSanPham.get(i).getMaLoai();
        }
        
        //Thêm model vào table
        jTableDS.setModel(mod);
        //Set chiều cao 1 ô trong table
        jTableDS.setRowHeight(100);
        jTableDS.getColumnModel().getColumn(0).setPreferredWidth(110);
    }
    
    public static void hienThiDanhSachTimKiem(String maLoai)
    {
        //Khai báo từ khoá
        //Khai báo các cột tiêu đề
        String tieuDe[] = new String[]{"Hình ảnh","Mã SP","Tên SP","Giá","Số lượng","Mã NPH","Ghi chú","Mã loại"};
        //Khai báo đối tượng để hiển thị dữ liệu lên table
        DefaultTableModel model = new DefaultTableModel(tieuDe,0);
        //Khai báo 1 đối tượng thuộc lớp
        SanPhamDao spDao = new SanPhamImpl();
        //Lấy danh sách sản phẩm trong hệ thống
        List<SanPham> lstSanPham = spDao.timKiemSanPham(maLoai);
        //Sắp xếp
        if(rbtnTen.isSelected()){
            Collections.sort(lstSanPham, new SortByName());
        }
        if(rbtnGia.isSelected()){
            Collections.sort(lstSanPham, new SortByPrice());
        }
        //Khai báo đối tượng chứa dữ liệu đưa vào model
        Object[][] row = new Object[lstSanPham.size()][8];
        TheModel mod = new TheModel(row,tieuDe);
        DecimalFormat f = new DecimalFormat("###,###.00");
        //Khai báo đối tượng chứa dữ liệu đưa vào model
        for(int i = 0;i<lstSanPham.size();i++)
        {
            if (lstSanPham.get(i).getImg() != null) {
                ImageIcon image = new ImageIcon(new ImageIcon(lstSanPham.get(i).getImg()).getImage()
                        .getScaledInstance(110, 100, Image.SCALE_SMOOTH));
                row[i][0] = image;
            } else {
                row[i][0] = null;
            }
            row[i][1] = lstSanPham.get(i).getMaSP();
            row[i][2] = lstSanPham.get(i).getTenSP();
            row[i][3] = lstSanPham.get(i).getGia();
            row[i][4] = lstSanPham.get(i).getSoLuong();
            row[i][5] = lstSanPham.get(i).getMaNPH();
            row[i][6] = lstSanPham.get(i).getGhiChu();
            row[i][7] = lstSanPham.get(i).getMaLoai();
        }
        
        //Thêm model vào table
        jTableDS.setModel(mod);
        jTableDS.setRowHeight(100);
        jTableDS.getColumnModel().getColumn(0).setPreferredWidth(110);
    }
    public static void hienThiDanhSachLoaiSP()
    {
        LoaiSPDao loaiDao = new LoaiSPImpl();
        List<LoaiSP> lstLoaiSP = loaiDao.layDanhSach();
        LoaiSP root = new LoaiSP();
        root.setMaLoai("");
        root.setLoaiSP("--Chọn loại sản phẩm--");
        lstLoaiSP.add(0,root);
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for(LoaiSP objLoai : lstLoaiSP)
        {
            model.addElement(objLoai);
        }
        cboLoai.setModel(model);
        cboLoai.setRenderer(new LoaiSPRender());
    }
    
    public static void hienThiDanhSach(int trang){
        //Khai báo các cột tiêu đề
        String tieuDe[] = new String[]{"Hình ảnh","Mã SP","Tên SP","Giá","Số lượng","Mã NPH","Ghi chú","Mã loại"};
        //Khai báo đối tượng để hiển thị dữ liệu lên table
        DefaultTableModel model = new DefaultTableModel(tieuDe,0);
        //Khai báo 1 đối tượng thuộc lớp
        SanPhamDao spDao = new SanPhamImpl();
        //Lấy danh sách sản phẩm trong hệ thống
        List<SanPham> lstSanPham = spDao.layDanhSach(trang);
        //Khai báo đối tượng chứa dữ liệu đưa vào model
        Object[][] row = new Object[lstSanPham.size()][8];
        TheModel mod = new TheModel(row,tieuDe);
        if(rbtnTen.isSelected()){
            Collections.sort(lstSanPham, new SortByName());
        }
        if(rbtnGia.isSelected()){
            Collections.sort(lstSanPham, new SortByPrice());
        }
        DecimalFormat f = new DecimalFormat("###,###.00");
        //Khai báo đối tượng chứa dữ liệu đưa vào model
        for(int i = 0;i<lstSanPham.size();i++)
        {
            if (lstSanPham.get(i).getImg() != null) {
                ImageIcon image = new ImageIcon(new ImageIcon(lstSanPham.get(i).getImg()).getImage()
                        .getScaledInstance(110, 100, Image.SCALE_SMOOTH));
                row[i][0] = image;
            } else {
                row[i][0] = null;
            }
            row[i][1] = lstSanPham.get(i).getMaSP();
            row[i][2] = lstSanPham.get(i).getTenSP();
            row[i][3] = lstSanPham.get(i).getGia();
            row[i][4] = lstSanPham.get(i).getSoLuong();
            row[i][5] = lstSanPham.get(i).getMaNPH();
            row[i][6] = lstSanPham.get(i).getGhiChu();
            row[i][7] = lstSanPham.get(i).getMaLoai();
        }
        
        //Thêm model vào table
        jTableDS.setModel(mod);
        jTableDS.setRowHeight(100);
        jTableDS.getColumnModel().getColumn(0).setPreferredWidth(110);
        
        
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
            java.util.logging.Logger.getLogger(frmDanhSachSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDanhSachSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDanhSachSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDanhSachSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDanhSachSanPham().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnChiTiet;
    private javax.swing.JButton btnCuoi;
    private javax.swing.JButton btnDau;
    private javax.swing.JButton btnDong;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private static javax.swing.JComboBox<String> cboLoai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTableDS;
    private javax.swing.JLabel lblSoTrang;
    private javax.swing.JLabel lblTrang;
    private static javax.swing.JRadioButton rbtnGia;
    private static javax.swing.JRadioButton rbtnTen;
    private static javax.swing.JTextField txtTuKhoa;
    // End of variables declaration//GEN-END:variables
}

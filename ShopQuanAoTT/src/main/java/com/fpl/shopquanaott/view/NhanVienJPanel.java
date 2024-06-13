/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.fpl.shopquanaott.view;

import com.fpl.shopquanaott.helper.NhanVienHelp;
import com.fpl.shopquanaott.model.NhanVien;
import com.fpl.shopquanaott.repository.NhanVienRepo;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author admin
 */
public class NhanVienJPanel extends javax.swing.JPanel {
private NhanVienRepo nvrp = new NhanVienRepo();
    /**
     * Creates new form NhanVienJPanel
     */
    public NhanVienJPanel() {
        initComponents();
        loadTableNV();
        rdoNam.setSelected(true);
        rdoQuanLy.setSelected(true);
        
        if(!NhanVienHelp.isQuanLy()){
        btnThem.setEnabled(false);
        btnXoa.setEnabled(false);
        jButton3.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void loadTableNV(){
        DefaultTableModel dtm = (DefaultTableModel) tblNhanVien.getModel();
        dtm.setRowCount(0);
        for (NhanVien nv : nvrp.getAll()) {
            dtm.addRow(new Object[] {
            nv.getMaNV(),
            nv.getChucVu() == 1 ? "Quản lý" : "Nhân viên",
            nv.getHoTen(),
            nv.getEmail(),
            nv.getSdt(),
            nv.getDiaChi(),
            nv.getGioiTinh() == 1 ? "Nam" : "Nữ",
            nv.getTrangThai() == 1 ? "Còn làm" : "Đã nghỉ"
        });
            
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        txtTenNV = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        tpwMK = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        rdoQuanLy = new javax.swing.JRadioButton();
        rdoNV = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnTiepTuc = new javax.swing.JButton();
        btnNghi = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        btnTK = new javax.swing.JButton();
        cbbChucVu = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Quản lý nhân viên");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Mã nhân viên :");

        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã nhân viên", "Chức vụ", "Họ và tên", "Email", "SĐT", "Địa chỉ", "Giới tính", "Trạng thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNhanVien);

        txtTenNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenNVActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Tên nhân viên :");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Địa chỉ :");

        txtDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaChiActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Email :");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Số điện thoại :");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Mật khẩu :");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Chức vụ :");

        buttonGroup1.add(rdoQuanLy);
        rdoQuanLy.setText("Quản lý");

        buttonGroup1.add(rdoNV);
        rdoNV.setText("Nhân viên");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Giới tính :");

        buttonGroup2.add(rdoNam);
        rdoNam.setText("Nam");
        rdoNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNamActionPerformed(evt);
            }
        });

        buttonGroup2.add(rdoNu);
        rdoNu.setText("Nữ");
        rdoNu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNuActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemMouseClicked(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaMouseClicked(evt);
            }
        });

        jButton3.setText("Sửa");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setText("Clear");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        btnTiepTuc.setText("Tiếp tục làm");
        btnTiepTuc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTiepTucMouseClicked(evt);
            }
        });

        btnNghi.setText("Nghỉ làm");
        btnNghi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNghiMouseClicked(evt);
            }
        });

        btnTK.setText("Tìm kiếm");
        btnTK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTKMouseClicked(evt);
            }
        });

        cbbChucVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Quản lý", "Nhân viên" }));
        cbbChucVu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbChucVuItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(498, 498, 498))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(txtSDT, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(tpwMK)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnTiepTuc, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNghi, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbbChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdoQuanLy))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdoNam)))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdoNu)
                            .addComponent(rdoNV)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTK, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(rdoQuanLy)
                    .addComponent(rdoNV))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(rdoNam)
                    .addComponent(rdoNu))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(tpwMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(btnTiepTuc)
                    .addComponent(btnNghi)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTK)
                    .addComponent(cbbChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTenNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenNVActionPerformed

    private void txtDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaChiActionPerformed

    private void rdoNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoNamActionPerformed

    private void rdoNuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoNuActionPerformed

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
    if(checkData()){
    return;
    }
    NhanVien nv = getData();
    
    nvrp.insert(nv);
    JOptionPane.showMessageDialog(this,"Thêm thành công");
    loadTableNV();
    }//GEN-LAST:event_btnThemMouseClicked

    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseClicked
      int row = tblNhanVien.getSelectedRow();
      if(row == -1){
      JOptionPane.showMessageDialog(this,"Hãy chọn 1 dòng");    
      return;
      }
      String manv = tblNhanVien.getValueAt(row, 0).toString();
      nvrp.delete(manv);
      JOptionPane.showMessageDialog(this,"Xóa thành công");
      loadTableNV();
    }//GEN-LAST:event_btnXoaMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
      int row = tblNhanVien.getSelectedRow();
      if(row == -1){
      JOptionPane.showMessageDialog(this,"Hãy chọn 1 dòng");    
      return;
      }
      
      String manvTable = tblNhanVien.getValueAt(row,0).toString();
      if(!manvTable.equalsIgnoreCase(txtMaNV.getText())){
      JOptionPane.showMessageDialog(this,"Mã nhân viên không khớp so với ban đầu");    
      return;
      }
      
      if(checkDataSua(tblNhanVien.getValueAt(row,0).toString())){
        return;
      }
      
      NhanVien nv = getData();
      nv.setMaNV(tblNhanVien.getValueAt(row, 0).toString());
      nvrp.update(nv);
       JOptionPane.showMessageDialog(this,"Sửa thành công");
      loadTableNV();
    }//GEN-LAST:event_jButton3MouseClicked

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
    int row = tblNhanVien.getSelectedRow();
      if(row == -1){
      return;
      }
      
      txtMaNV.setText(tblNhanVien.getValueAt(row,0).toString());
      txtTenNV.setText(tblNhanVien.getValueAt(row,2).toString());
      txtDiaChi.setText(tblNhanVien.getValueAt(row,5).toString());
      txtEmail.setText(tblNhanVien.getValueAt(row,3).toString());
      txtSDT.setText(tblNhanVien.getValueAt(row,4).toString());
      
      String gt = tblNhanVien.getValueAt(row,6).toString();
      String cv = tblNhanVien.getValueAt(row,1).toString();
      
      if(cv.equalsIgnoreCase("Quản lý")){
      rdoQuanLy.setSelected(true);
      }
      else{
      rdoNV.setSelected(true);
      }
      
      if(gt.equalsIgnoreCase("Nam")){
      rdoNam.setSelected(true);
      }
      else{
      rdoNu.setSelected(true);
      }
      
      
    }//GEN-LAST:event_tblNhanVienMouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
      txtMaNV.setText("");
      txtTenNV.setText("");
      txtDiaChi.setText("");
      txtEmail.setText("");
      txtSDT.setText("");
      tpwMK.setText("");
      loadTableNV();
    }//GEN-LAST:event_jButton4MouseClicked

    private void btnTiepTucMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiepTucMouseClicked
        int row = tblNhanVien.getSelectedRow();
        if(row == -1){
        JOptionPane.showMessageDialog(this,"Hãy chọn 1 nhân viên");
        return;
        }
        
        String maNV = tblNhanVien.getValueAt(row,0).toString();
        nvrp.update_tinhtrang(maNV,1);
        loadTableNV();
         JOptionPane.showMessageDialog(this,"Đã cập nhật");
    }//GEN-LAST:event_btnTiepTucMouseClicked

    private void btnNghiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNghiMouseClicked
         int row = tblNhanVien.getSelectedRow();
        if(row == -1){
        JOptionPane.showMessageDialog(this,"Hãy chọn 1 nhân viên");
        return;
        }
        
        String maNV = tblNhanVien.getValueAt(row,0).toString();
        nvrp.update_tinhtrang(maNV,0);
        loadTableNV();
        JOptionPane.showMessageDialog(this,"Đã cập nhật");
    }//GEN-LAST:event_btnNghiMouseClicked

    private void btnTKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTKMouseClicked
       String tkNV = txtTimKiem.getText();
       if(tkNV.isBlank()){
       JOptionPane.showMessageDialog(this,"Hãy nhập thông tin");
       return;
       }
        List<NhanVien> listNV = nvrp.findByMaOrSDT(tkNV);
        if(listNV.size() == 0){
        JOptionPane.showMessageDialog(this,"Không tìm thấy nhân viên");
        return;
        }
        else{
         DefaultTableModel dtm = (DefaultTableModel) tblNhanVien.getModel();
        dtm.setRowCount(0);
        for (NhanVien nv : listNV) {
            dtm.addRow(new Object[] {
            nv.getMaNV(),
            nv.getChucVu() == 1 ? "Quản lý" : "Nhân viên",
            nv.getHoTen(),
            nv.getEmail(),
            nv.getSdt(),
            nv.getDiaChi(),
            nv.getGioiTinh() == 1 ? "Nam" : "Nữ",
            nv.getTrangThai() == 1 ? "Còn làm" : "Đã nghỉ"
        });
        }
        }
    }//GEN-LAST:event_btnTKMouseClicked

    private void cbbChucVuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbChucVuItemStateChanged
    String cv = cbbChucVu.getSelectedItem().toString();
    DefaultTableModel dtm = (DefaultTableModel) tblNhanVien.getModel();
    TableRowSorter<DefaultTableModel> a = new TableRowSorter<>(dtm);
    tblNhanVien.setRowSorter(a);
    if(cv.equalsIgnoreCase("All")){
    a.setRowFilter(RowFilter.regexFilter(""));
    }
    else{
     
    a.setRowFilter(RowFilter.regexFilter(cv));
    }
    }//GEN-LAST:event_cbbChucVuItemStateChanged
    public boolean  checkData(){
     String mk = new String(tpwMK.getPassword());    
    if(txtMaNV.getText().isBlank() || txtTenNV.getText().isBlank() || txtEmail.getText().isBlank() ||
       txtSDT.getText().isBlank() || txtDiaChi.getText().isBlank() || mk.isBlank()){
        JOptionPane.showMessageDialog(this,"Hãy nhập đủ dữ liệu");
    return true;
    }
    
     boolean ktSDT = false;
    ktSDT = txtSDT.getText().matches("^[0][0-9]{9}$");
    if(ktSDT == false){
    JOptionPane.showMessageDialog(this,"Sai định dạng số điện thoại");
     return true;
    }
    
    for(NhanVien nv : nvrp.getAll()){
    if(nv.getMaNV().equalsIgnoreCase(txtMaNV.getText())){
    JOptionPane.showMessageDialog(this,"Đã tồn tại mã nhân viên");
    return true;
    }    
        
    if(nv.getSdt().equalsIgnoreCase(txtSDT.getText()) || nv.getEmail().equalsIgnoreCase(txtEmail.getText())){
    JOptionPane.showMessageDialog(this,"Đã có nhân viên khác sử dụng email hoặc sđt này");
     return true;
    }
    
    }
    
    return false;
    }
    
       public boolean  checkDataSua(String manv){
    if(txtMaNV.getText().isBlank() || txtTenNV.getText().isBlank() || txtEmail.getText().isBlank() ||
       txtSDT.getText().isBlank() || txtDiaChi.getText().isBlank()){
        JOptionPane.showMessageDialog(this,"Hãy nhập đủ dữ liệu");
    return true;
    }
    
     boolean ktSDT = false;
    ktSDT = txtSDT.getText().matches("^[0][0-9]{9}$");
    if(ktSDT == false){
    JOptionPane.showMessageDialog(this,"Sai định dạng số điện thoại");
     return true;
    }
    
    for(NhanVien nv : nvrp.getAll()){
    if(nv.getSdt().equalsIgnoreCase(txtSDT.getText()) || nv.getEmail().equalsIgnoreCase(txtEmail.getText())){
    if(!nv.getMaNV().equalsIgnoreCase(manv)){
    JOptionPane.showMessageDialog(this,"Đã có nhân viên khác sử dụng email hoặc sđt này");
     return true;
    }
    }
    
    }
    
    return false;
    }
    
    public NhanVien getData(){
    String mk = new String(tpwMK.getPassword());
    int gioiTinh = 1;
    int chucVu =1;
    
    if(rdoQuanLy.isSelected()){
    chucVu = 1;
    }
    else{
    chucVu = 2;
    }
    
    if(rdoNam.isSelected()){
    gioiTinh = 1;
    }
    else{
    gioiTinh = 0;
    }
    
    NhanVien nv = new NhanVien();
    nv.setMaNV(txtMaNV.getText());
    nv.setHoTen(txtTenNV.getText());
    nv.setEmail(txtEmail.getText());
    nv.setDiaChi(txtDiaChi.getText());
    nv.setSdt(txtSDT.getText());
    nv.setTrangThai(1);
    nv.setMatKhau(mk);
    nv.setChucVu(chucVu);
    nv.setGioiTinh(gioiTinh);
    return nv;
    
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNghi;
    private javax.swing.JButton btnTK;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTiepTuc;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbbChucVu;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoNV;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JRadioButton rdoQuanLy;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JPasswordField tpwMK;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenNV;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}

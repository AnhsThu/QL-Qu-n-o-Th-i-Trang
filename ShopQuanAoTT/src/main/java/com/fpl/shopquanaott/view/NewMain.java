/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.fpl.shopquanaott.view;

import com.fpl.shopquanaott.helper.InHoaDon;
import com.fpl.shopquanaott.helper.XuatExcel;
import com.fpl.shopquanaott.model.MauSac;
import com.fpl.shopquanaott.model.SPCT;
import com.fpl.shopquanaott.model.SanPham;
import com.fpl.shopquanaott.repository.MauSacRepo;
import com.fpl.shopquanaott.repository.SanPhamRepo;
import com.fpl.shopquanaott.service.SanPhamService;
import com.fpl.shopquanaott.service.impl.SanPhamServiceImpl;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SanPhamService spSer = new SanPhamServiceImpl();
        MauSacRepo msrp = new MauSacRepo();
        SanPhamRepo tenrp = new SanPhamRepo();
//        List<SanPham> sp = spSer.getAll();
//        for (SanPham t : tenrp.getAll()) {
//            System.out.println(t.getTenSP());
 //       }
//        MauSac ms = msrp.findByMa(5);
//        System.out.println(ms.getTen());
//        System.out.println(ms.getMa());
//  float a =(float) 20/100;
//        System.out.println(a);
//   float b = 10;     
//        System.out.println(b-b*a);

//        InHoaDon ihd = new InHoaDon();
//        ihd.inHoaDonPDF("");
        XuatExcel ex = new XuatExcel();
        ex.xuatFileExcel();
    }
    
}

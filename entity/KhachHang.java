/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bmtcs.entity;

/**
 *
 * @author huyhu
 */
public class KhachHang {
    private String kh_MAKH;
    private String kh_SDT;
    private String kh_HOTEN;
    private boolean kh_GIOITINH;

    public KhachHang(String kh_MAKH, String kh_SDT, String kh_HOTEN, boolean kh_GIOITINH) {
        this.kh_MAKH = kh_MAKH;
        this.kh_SDT = kh_SDT;
        this.kh_HOTEN = kh_HOTEN;
        this.kh_GIOITINH = kh_GIOITINH;
    }

    public String getKh_MAKH() {
        return kh_MAKH;
    }

    public void setKh_MAKH(String kh_MAKH) {
        this.kh_MAKH = kh_MAKH;
    }

    public String getKh_SDT() {
        return kh_SDT;
    }

    public void setKh_SDT(String kh_SDT) {
        this.kh_SDT = kh_SDT;
    }

    public String getKh_HOTEN() {
        return kh_HOTEN;
    }

    public void setKh_HOTEN(String kh_HOTEN) {
        this.kh_HOTEN = kh_HOTEN;
    }

    public boolean isKh_GIOITINH() {
        return kh_GIOITINH;
    }

    public void setKh_GIOITINH(boolean kh_GIOITINH) {
        this.kh_GIOITINH = kh_GIOITINH;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bmtcs.entity;

/**
 *
 * @author huyhu
 */
public class NhanVien {

    private String nv_MANV;
    private String nv_SDT;
    private String nv_HOTEN;
    private String nv_MATKHAU;
    private String nv_EMAIL;
    private boolean nv_TTLAMVIEC;
    private boolean nv_VAITRO;

    public NhanVien(String nv_MANV, String nv_SDT, String nv_HOTEN, String nv_MATKHAU, String nv_EMAIL, boolean nv_TTLAMVIEC, boolean nv_VAITRO) {
        this.nv_MANV = nv_MANV;
        this.nv_SDT = nv_SDT;
        this.nv_HOTEN = nv_HOTEN;
        this.nv_MATKHAU = nv_MATKHAU;
        this.nv_EMAIL = nv_EMAIL;
        this.nv_TTLAMVIEC = nv_TTLAMVIEC;
        this.nv_VAITRO = nv_VAITRO;
    }

    public String getNv_MANV() {
        return nv_MANV;
    }

    public void setNv_MANV(String nv_MANV) {
        this.nv_MANV = nv_MANV;
    }

    public String getNv_SDT() {
        return nv_SDT;
    }

    public void setNv_SDT(String nv_SDT) {
        this.nv_SDT = nv_SDT;
    }

    public String getNv_HOTEN() {
        return nv_HOTEN;
    }

    public void setNv_HOTEN(String nv_HOTEN) {
        this.nv_HOTEN = nv_HOTEN;
    }

    public String getNv_MATKHAU() {
        return nv_MATKHAU;
    }

    public void setNv_MATKHAU(String nv_MATKHAU) {
        this.nv_MATKHAU = nv_MATKHAU;
    }

    public String getNv_EMAIL() {
        return nv_EMAIL;
    }

    public void setNv_EMAIL(String nv_EMAIL) {
        this.nv_EMAIL = nv_EMAIL;
    }

    public boolean isNv_TTLAMVIEC() {
        return nv_TTLAMVIEC;
    }

    public void setNv_TTLAMVIEC(boolean nv_TTLAMVIEC) {
        this.nv_TTLAMVIEC = nv_TTLAMVIEC;
    }

    public boolean isNv_VAITRO() {
        return nv_VAITRO;
    }

    public void setNv_VAITRO(boolean nv_VAITRO) {
        this.nv_VAITRO = nv_VAITRO;
    }

}

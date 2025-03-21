/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bmtcs.entity;

/**
 *
 * @author huyhu
 */
public class SanCauLong {
    private String scl_MAS;
    private double scl_GIATHUE;
    private String scl_TRANGTHAI;

    public SanCauLong(String scl_MAS, double scl_GIATHUE, String scl_TRANGTHAI) {
        this.scl_MAS = scl_MAS;
        this.scl_GIATHUE = scl_GIATHUE;
        this.scl_TRANGTHAI = scl_TRANGTHAI;
    }

    public String getScl_MAS() {
        return scl_MAS;
    }

    public void setScl_MAS(String scl_MAS) {
        this.scl_MAS = scl_MAS;
    }

    public double getScl_GIATHUE() {
        return scl_GIATHUE;
    }

    public void setScl_GIATHUE(double scl_GIATHUE) {
        this.scl_GIATHUE = scl_GIATHUE;
    }

    public String getScl_TRANGTHAI() {
        return scl_TRANGTHAI;
    }

    public void setScl_TRANGTHAI(String scl_TRANGTHAI) {
        this.scl_TRANGTHAI = scl_TRANGTHAI;
    }
    
}

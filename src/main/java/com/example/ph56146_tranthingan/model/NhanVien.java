package com.example.ph56146_tranthingan.model;

public class NhanVien {
    private String maNV;

    private String ten;

    private int tuoi;
    private int luong;

    private float soNamLamViec;

    private String phongBan;


    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public float getSoNamLamViec() {
        return soNamLamViec;
    }

    public void setSoNamLamViec(float soNamLamViec) {
        this.soNamLamViec = soNamLamViec;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public NhanVien() {
    }

    public NhanVien(String maNV, String ten, int tuoi, int luong, float soNamLamViec, String phongBan) {
        this.maNV = maNV;
        this.ten = ten;
        this.tuoi = tuoi;
        this.luong = luong;
        this.soNamLamViec = soNamLamViec;
        this.phongBan = phongBan;
    }
}

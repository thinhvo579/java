/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author nhut
 */
public class ChiTietHDBanDTO {
    private String MaHDBan;
    private String Mahang;
    private int Soluong = 0;
    private int Dongia = 0;
    private int Giamgia = 0;
    private int Thanhtien = 0;

    /**
     * @return the MaHDBan
     */
    public String getMaHDBan() {
        return MaHDBan;
    }

    /**
     * @param MaHDBan the MaHDBan to set
     */
    public void setMaHDBan(String MaHDBan) {
        this.MaHDBan = MaHDBan;
    }

    /**
     * @return the Mahang
     */
    public String getMahang() {
        return Mahang;
    }

    /**
     * @param Mahang the Mahang to set
     */
    public void setMahang(String Mahang) {
        this.Mahang = Mahang;
    }

    /**
     * @return the Soluong
     */
    public int getSoluong() {
        return Soluong;
    }

    /**
     * @param Soluong the Soluong to set
     */
    public void setSoluong(int Soluong) {
        this.Soluong = 0;
    }

    /**
     * @return the Dongia
     */
    public int getDongia() {
        return Dongia;
    }

    /**
     * @param Dongia the Dongia to set
     */
    public void setDongia(String Dongia) {
        this.setDongia(0);
    }

    /**
     * @return the Giamgia
     */
    public int getGiamgia() {
        return Giamgia;
    }

    /**
     * @param Giamgia the Giamgia to set
     */
    public void setGiamgia(String Giamgia) {
        this.setGiamgia(0);
    }

    /**
     * @return the Thanhtien
     */
    public int getThanhtien() {
        return Thanhtien;
    }

    /**
     * @param Thanhtien the Thanhtien to set
     */
    public void setThanhtien(String Thanhtien) {
        this.setThanhtien(Thanhtien);
    }

    /**
     * @param Dongia the Dongia to set
     */
    public void setDongia(int Dongia) {
        this.Dongia = Dongia;
    }

    /**
     * @param Giamgia the Giamgia to set
     */
    public void setGiamgia(int Giamgia) {
        this.Giamgia = Giamgia;
    }

    /**
     * @param Thanhtien the Thanhtien to set
     */
    public void setThanhtien(int Thanhtien) {
        this.Thanhtien = Thanhtien;
    }
}

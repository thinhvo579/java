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
public class NhanVienDTO {
    private String Manhanvien;
    private String Tennhanvien;
    private String Gioitinh;
    private String Diachi;
    private String Dienthoai;

    /**
     * @param Manhanvien
     * @param Tennhanvien
     * @param Gioitinh
     * @param Diachi
     * @param Dienthoai
     */
    public NhanVienDTO(String Manhanvien,String Tennhanvien,String Gioitinh,String Diachi,String Dienthoai )         
    {
        this.Manhanvien = Manhanvien;
        this.Tennhanvien = Tennhanvien;
        this.Diachi = Diachi;
        this.Dienthoai = Dienthoai;
        this.Gioitinh = Gioitinh;
        
        
    }
            
            
    public String getManhanvien() {
        return Manhanvien;
    }

    /**
     * @param Manhanvien the Manhanvien to set
     */
    public void setManhanvien(String Manhanvien) {
        this.Manhanvien = Manhanvien;
    }

    /**
     * @return the Tennhanvien
     */
    public String getTennhanvien() {
        return Tennhanvien;
    }

    /**
     * @param Tennhanvien the Tennhanvien to set
     */
    public void setTennhanvien(String Tennhanvien) {
        this.Tennhanvien = Tennhanvien;
    }

    /**
     * @return the Gioitinh
     */
    public String getGioitinh() {
        return Gioitinh;
    }

    /**
     * @param Gioitinh the Gioitinh to set
     */
    public void setGioitinh(String Gioitinh) {
        this.Gioitinh = Gioitinh;
    }

    /**
     * @return the Diachi
     */
    public String getDiachi() {
        return Diachi;
    }

    /**
     * @param Diachi the Diachi to set
     */
    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    /**
     * @return the Dienthoai
     */
    public String getDienthoai() {
        return Dienthoai;
    }

    /**
     * @param Dienthoai the Dienthoai to set
     */
    public void setDienthoai(String Dienthoai) {
        this.Dienthoai = Dienthoai;
    }

    public String getMaNV() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getHoTen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getGioiTinh() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getDiaChi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

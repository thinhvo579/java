/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.KhachHang;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author nhut
 */
public class KhachHangDAL {
    private static Object Connect;
    public static ArrayList<KhachHang> getAll(){
        Connection con;
        con = Connect();
       if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "select * from KhachHang";
                ResultSet rs = stmt.executeQuery(sql);
                ArrayList<KhachHang> ds = new ArrayList<>();
                while(true){
                    if(!rs.next()) break;
                    String MaKhach = rs.getString("MaKhach");
                    String TenKhach = rs.getString("TenKhach") ;
                    String DienThoai = rs.getString("DienThoai");
                    String DiaChi = rs.getString("DiaChi");                    
                    KhachHang khach;
                    khach = new KhachHang(MaKhach, TenKhach, DienThoai, DiaChi);
                   
                    ds.add(khach);
                }
                con.close();
                return ds;
            }catch(SQLException ex){
                return null;
            }
        }
        return null;
    }
    public static int Insert(String MaKH,String TenKH,String TenCongTy,String DiaChi){
        Connection con;
        con = Connect();
            if(con != null){
            try{
               Statement stmt = con.createStatement();
               String sql = "insert into KHACHHANG(MaKH, TenKH, TenCongTy, DiaChi) values ('"+ MaKH +"',N'"+ TenKH +"','"+ TenCongTy +"','"+ DiaChi +"')";
               int rs = stmt.executeUpdate(sql);
               if(rs < 1){
                   con.close();
                   return 0;
               } else {
                   con.close();
                   return 1;
               }
            } catch (SQLException ex){
                return 0;
            }
        }
        return 0;
    }

    private static Connection Connect() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

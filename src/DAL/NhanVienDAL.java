/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import static DAL.DBConect.dbURL;
import DTO.NhanVienDTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author nhut
 */
public class NhanVienDAL {
    public static List<NhanVienDTO> getAll() throws SQLException
    {
        try (Connection conn = DriverManager.getConnection(dbURL)) {
            Statement stm = conn.createStatement();
            String sqlSelect = "select * from NhanVien";
            ResultSet rs =stm.executeQuery(sqlSelect);
            while (true)
            {
                if (!rs.next()) break;
                //Xu ly
                String MaNhanVien = rs.getString("MaNhanVien");
                String TenNhanVien = rs.getString("TenNhanVien");
                System.out.print(MaNhanVien + "\t" + TenNhanVien + "\n");
            }
        }
        return null;
         
    }
    public static List<NhanVienDTO> getByID(int id)
    {
        return null;
    }

    /**
     *
     * @return
     */
    public static int insert()
     {
        Connection conn = Connect();
        if(conn != null){
           try{
               Statement stmt = conn.createStatement();
               String DiaChi = null;
               String GioiTinh = null;
               String TenNhanVien = null;
               String MaNhanVien = null;
               String DienThoai = null;
               String sql = "insert into NhanVien(MaNhanVien, TenNhanVien, GioiTinh, DiaChi, DienThoai) values ('"+ MaNhanVien +"','"+ TenNhanVien +"','"+ GioiTinh +"','"+ DiaChi +"',','"+ DienThoai +"',')";
               int rs = stmt.executeUpdate(sql);
               if(rs < 1){
                   conn.close();
                   return 0;
               } else {
                   conn.close();
                   return 1;
               }
            } catch (SQLException ex){
                return 0;
            }
        }
        return 0;
    }

    /**
     *
     * @return
     */
    public static int update()
    {
        Connection conn = Connect();
   
        if(conn != null){
           try{
               Statement stmt = conn.createStatement();
               String DiaChi = null;
               String DienThoai = null;
               String GioiTinh = null;
               String MaNhanVien = null;
               String TenNhanVien = null;
               String sql = "update NhanVien set TenNhanVien = '"+ TenNhanVien +"', GioiTinh = '"+ GioiTinh +"',DiaChi = '"+ DiaChi +"',DienThoai = '"+ DienThoai +"' where MaNhanVien = '"+ MaNhanVien +"'";
               int rs = stmt.executeUpdate(sql);
               if(rs < 1){
                   conn.close();
                   return 0;
               } else {
                   conn.close();
                   return 1;
               }
            } catch (SQLException ex){
                return 0;
            }
        }
        return 0;
    }
    public static int delete()
    {
        Connection conn = Connect();
   
        if(conn != null){
           try{
               Statement stmt = conn.createStatement();
               String MaNhanVien;
             String sql;
               sql = "delete NhanVien from where MaNhanVien = = '"+ MaNhanVien +"'";
               int rs = stmt.executeUpdate(sql);
               if(rs < 1){
                   conn.close();
                   return 0;
               } else {
                   conn.close();
                   return 1;
               }
            } catch (SQLException ex){
                return 0;
            }
        }
        return 0;
    }
    public static void main (String[] args)
    {
        List<NhanVienDTO> NV = getALL();
    }

    public static List<NhanVienDTO> getALL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static int Delete(String MaNV) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static int Update(String MaNV, String HoTen, String GioiTinh, String DiaChi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static int Insert(String MaNV, String HoTen, String GioiTinh, String DiaChi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static Connection Connect() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            
            
}


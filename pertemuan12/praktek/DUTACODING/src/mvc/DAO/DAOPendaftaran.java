/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.DAO;

import mvc.Koneksi.koneksi;
import mvc.Model.pendaftaran;
import mvc.DAOInterface.IPendaftaran;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus
 */
public class DAOPendaftaran implements IPendaftaran {
    Connection connection;
    final String update = "UPDATE tbl_pendaftaran set no_ktp=?, nama=?, jenis_kelamin=?, tempat_tinggal=?, usia=?, alasan=? where no_ktp=?;";
    final String delete = "delete from tbl_pendaftaran where no_ktp=?;";
    final String select = "SELECT * FROM tbl_pendaftaran;";
    final String carinama = "SELECT * FROM tbl_pendaftaran where nama like ?";
    final String insert = "insert into tbl_pendaftaran (no_ktp,nama, jenis_kelamin, tempat_tinggal, usia, alasan) values  (?,?, ?, ?, ?, ?);";
    
    public DAOPendaftaran() {
        connection = koneksi.connection();
    }

    @Override
    public void insert(pendaftaran b) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insert);
            statement.setInt(1,b.getNo_ktp());
            statement.setString(2, b.getNama());
            statement.setString(3, b.getJenis_kelamin());
            statement.setString(4, b.getTempat_tinggal());
            statement.setInt(5, b.getUsia());
            statement.setString(6, b.getAlasan());
            statement.execute();
            ResultSet rs = statement.getGeneratedKeys();
            while (rs.next()) {
                b.setNo_ktp(rs.getInt(16));
            }
        } catch (SQLException ex) {
            System.out.println("Berhasil Input");
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                System.out.println("Gagal Input");
            }
        }
    }

    @Override
    public void update(pendaftaran b) {
        
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(update);
            statement.setInt(1,b.getNo_ktp());
            statement.setString(2, b.getNama());
            statement.setString(3, b.getJenis_kelamin());
            statement.setString(4, b.getTempat_tinggal());
            statement.setInt(5, b.getUsia());
            statement.setString(6, b.getAlasan());
            statement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Berhasil Update");
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                System.out.println("Gagal Update");
            }
        }
    }

    @Override
    public void delete(int no_ktp) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(delete);
            statement.setInt(1, no_ktp);
            statement.execute();
        } catch (SQLException ex) {
            System.out.println("Berhasil Delete");
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                System.out.println("Gagal Delete");
            }
        }
    }

    @Override
    public List<pendaftaran> getAll() {
        List<pendaftaran> lb = null;
        try {
            lb = new ArrayList<pendaftaran>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {                
                pendaftaran b = new pendaftaran();
                b.setNo_ktp(rs.getInt("no_ktp"));
                b.setNama(rs.getString("nama"));
                b.setJenis_kelamin(rs.getString("jenis_kelamin"));
                b.setTempat_tinggal(rs.getString("tempat_tinggal"));
                b.setUsia(rs.getInt("usia"));
                b.setAlasan(rs.getString("alasan"));
                lb.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOPendaftaran.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lb;
    }

    @Override
    public List<pendaftaran> getCariNama(String nama) {
        List<pendaftaran> lb = null;
        try {
            lb = new ArrayList<pendaftaran>();
            PreparedStatement st = connection.prepareStatement(carinama);
            st.setString(1, "%" + nama + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {                
                pendaftaran b = new pendaftaran();
                b.setNo_ktp(rs.getInt("no_ktp"));
                b.setNama(rs.getString("nama"));
                b.setJenis_kelamin(rs.getString("jenis_kelamin"));
                b.setTempat_tinggal(rs.getString("tempat_tinggal"));
                b.setUsia(rs.getInt("usia"));
                b.setAlasan(rs.getString("alasan"));
                lb.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOPendaftaran.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lb;
    }
    
}

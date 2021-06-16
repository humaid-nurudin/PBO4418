/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.DAO;
import mvc.Koneksi.Koneksi;
import mvc.Model.Pegawai;
import mvc.DAOInterface.IPegawai;
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
 * @author Hanik Rosi
 */
public class DAOPegawai implements IPegawai {
    Connection connection;
    final String update = "UPDATE tblpegawai set nip=?, nama=?, jk=?, jabatan=? where nip=?;";
    final String delete = "delete from tblpegawai where nip=?;";
    final String select = "SELECT * FROM tblpegawai;";
    final String carinama = "SELECT * FROM tblpegawai where nama like ?";
    
    public DAOPegawai() {
        connection = Koneksi.connection();
    }
    @Override
    public void insert(Pegawai b) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insert);
            statement.setInt(1,b.getNip());
            statement.setString(2, b.getNama());
            statement.setString(3, b.getJk());
            statement.setString(4, b.getJabatan());
            statement.execute();
            ResultSet rs = statement.getGeneratedKeys();
            while (rs.next()) {
                b.setNip(rs.getInt(1));
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
    String insert = "insert into tblpegawai (nip, nama, jk, jabatan) values  (?, ?, ?, ?);";
    @Override
    public void update(Pegawai b) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(update);
            statement.setString(2, b.getNama());
            statement.setString(3, b.getJk());
            statement.setString(4, b.getJabatan());
            statement.setInt(5, b.getNip());
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
    public void delete(int nip) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(delete);
            statement.setInt(1, nip);
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
    
    public List<Pegawai> getAll() {
        List<Pegawai> lb = null;
        try {
            lb = new ArrayList<Pegawai>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {                
                Pegawai b = new Pegawai();
                b.setNip(rs.getInt("id"));
                b.setNama(rs.getString("nama"));
                b.setJk(rs.getString("jk"));
                b.setJabatan(rs.getString("jabatan"));
                lb.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOPegawai.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lb;
    }
    
    public List<Pegawai> getCariNama(String nama) {
        List<Pegawai> lb = null;
        try {
            lb = new ArrayList<Pegawai>();
            PreparedStatement st = connection.prepareStatement(carinama);
            st.setString(1, "%" + nama + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {                
                Pegawai b = new Pegawai();
                b.setNip(rs.getInt("nip"));
                b.setNama(rs.getString("nama"));
                b.setJk(rs.getString("jk"));
                b.setJabatan(rs.getString("jabatan"));
                lb.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOPegawai.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lb;
    }
}

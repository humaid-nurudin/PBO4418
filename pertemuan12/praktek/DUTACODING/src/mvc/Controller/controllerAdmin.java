/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Controller;
import mvc.DAO.DAOPendaftaran;
import mvc.DAOInterface.IPendaftaran;
import mvc.Model.pendaftaran;
import mvc.Model.TabelModelPendaftaran;
import java.util.List;
import javax.swing.JOptionPane;
import mvc.View.ViewAdmin;

/**
 *
 * @author asus
 */
public class controllerAdmin {
    ViewAdmin frame;
    IPendaftaran implPendaftaran;
    List<pendaftaran> lb;

    public controllerAdmin(ViewAdmin aThis) {
        this.frame = frame;
        implPendaftaran = new DAOPendaftaran();
        lb = implPendaftaran.getAll();
    }

    public void isiTable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void update() {
        
    }

    public void reset() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void carinama() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

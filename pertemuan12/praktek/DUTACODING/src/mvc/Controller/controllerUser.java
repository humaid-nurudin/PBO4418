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
import mvc.View.ViewUser;

/**
 *
 * @author asus
 */
public class controllerUser {
    ViewUser frame;
    IPendaftaran implPendaftaran;
    List<pendaftaran> lb;
    
    public controllerUser(ViewUser aThis) {
        this.frame = frame;
        implPendaftaran = new DAOPendaftaran();
        lb = implPendaftaran.getAll();
    }

    public void reset() {
        frame.getTxtNo_ktp().setText("");
        frame.getTxtNama().setText("");
        frame.getTxtJenis_kelamin().setSelectedItem("");
        frame.getTxtTempat_tinggal().setText("");
        frame.getTxtUsia().setText("");
        frame.getTxtAlasan().setText("");
    }

    public void insert() {
        if (!frame.getTxtNo_ktp().getText().trim().isEmpty()& !frame.getTxtNama().getText().trim().isEmpty()) {
            pendaftaran b = new pendaftaran();
            
            b.setNo_ktp(Integer.parseInt(frame.getTxtNo_ktp().getText()));
            b.setNama(frame.getTxtNama().getText());
            b.setJenis_kelamin(frame.getTxtJenis_kelamin().getSelectedItem().toString());
            b.setTempat_tinggal(frame.getTxtTempat_tinggal().getText());
            b.setUsia(Integer.parseInt(frame.getTxtUsia().getText()));
            b.setAlasan(frame.getTxtAlasan().getText());
            implPendaftaran.insert(b);
            JOptionPane.showMessageDialog(null, "Simpan Data Sukses");
        } else { 
            JOptionPane.showMessageDialog(frame, "Data Tidak Boleh Kosong");
        }
    }

    public void isiTable() {
        
    }
    
    public void isiField(int row) {
        frame.getTxtNo_ktp().setText(lb.get(row).getNo_ktp().toString());
        frame.getTxtNama().setText(lb.get(row).getNama());
        frame.getTxtJenis_kelamin().setSelectedItem(lb.get(row).getJenis_kelamin());
        frame.getTxtTempat_tinggal().setText(lb.get(row).getTempat_tinggal());
        frame.getTxtUsia().setText(lb.get(row).getUsia().toString());
        frame.getTxtAlasan().setText(lb.get(row).getAlasan());
    }
}

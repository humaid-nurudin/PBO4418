/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Controller;
import mvc.DAO.DAOPegawai;
import mvc.DAOInterface.IPegawai;
import mvc.Model.Pegawai;
import mvc.Model.TabelModelPegawai;
import mvc.View.FormPegawai;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author Hanik Rosi
 */
public class ControllerPegawai {
    public ControllerPegawai(FormPegawai frame) {
        this.frame = frame;
        implPegawai = new DAOPegawai();
        lb = implPegawai.getAll();
    }
    
    // mengosongkan semua field
    public void reset() {
        frame.getTxtNip().setText("");
        frame.getTxtNama().setText("");
        frame.getTxtJk().setText("");
        frame.getTxtJabatan().setText("");
    }
    
    // menampilkan data ke dalam tabel
    public  void isiTable() {
        lb = implPegawai.getAll();
        TabelModelPegawai tmb = new TabelModelPegawai(lb);
        frame.getTabelData().setModel(tmb);
    }
    
    public void isiField(int row) {
        frame.getTxtNip().setText(lb.get(row).getNip().toString());
        frame.getTxtNama().setText(lb.get(row).getNama());
        frame.getTxtJk().setText(lb.get(row).getJk());
        frame.getTxtJabatan().setText(lb.get(row).getJabatan());
    }
    
    public void insert() {
        if (!frame.getTxtNip().getText().trim().isEmpty()& !frame.getTxtNama().getText().trim().isEmpty()) {
            Pegawai b = new Pegawai();
            
            b.setNip(Integer.parseInt(frame.getTxtNip().getText()));
            b.setNama(frame.getTxtNama().getText());
            b.setJk(frame.getTxtJk().getText());
            b.setJabatan(frame.getTxtJabatan().getText());
            implPegawai.insert(b);
            JOptionPane.showMessageDialog(null, "Simpan Data Sukses");
        } else { 
            JOptionPane.showMessageDialog(frame, "Data Tidak Boleh Kosong");
        }
    }
    FormPegawai frame;
    IPegawai implPegawai;
    List<Pegawai> lb;
    
    public void update() {
        if (!frame.getTxtNip().getText().trim().isEmpty()) {
            Pegawai b = new Pegawai();
            b.setNama(frame.getTxtNama().getText());
            b.setJk(frame.getTxtJk().getText());
            b.setJabatan(frame.getTxtJabatan().getText());
            b.setNip(Integer.parseInt(frame.getTxtNip().getText()));
            implPegawai.update(b);
            JOptionPane.showMessageDialog(null, "Update Data Sukses");
        } else {
            JOptionPane.showMessageDialog(frame, "Pilih Data yang akan diubah");
        }
    }
    
    public void delete() {
        if (!frame.getTxtNip().getText().trim().isEmpty()) {
            int id = Integer.parseInt(frame.getTxtNip().getText());
            implPegawai.delete(id);
            JOptionPane.showMessageDialog(null, "Hapus Data Sukses");
        } else {
            JOptionPane.showMessageDialog(frame, "Pilih Data yang akan dihapus");
        }
    }
    
    public  void isiTableCariNama() {
        lb = implPegawai.getCariNama(frame.getTxtCariNama().getText());
        TabelModelPegawai tmb = new TabelModelPegawai(lb);
        frame.getTabelData().setModel(tmb);
    }
    
    public void carinama() {
        if (!frame.getTxtCariNama().getText().trim().isEmpty()) {
            implPegawai.getCariNama(frame.getTxtCariNama().getText());
            isiTableCariNama();
        } else {
            JOptionPane.showMessageDialog(frame, "Silahkan Pilih Data");
        }
    }
}

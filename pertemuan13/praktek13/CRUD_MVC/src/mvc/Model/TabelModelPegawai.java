/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Model;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Hanik Rosi
 */
public class TabelModelPegawai extends AbstractTableModel {
    List<Pegawai> lb;
    
    public TabelModelPegawai(List<Pegawai> lb) {
        this.lb = lb;
    }
    
    @Override
    public int getColumnCount() {
        return 4;
    }
    
    public int getRowCount() {
        return lb.size();
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "NIP";
            case 1:
                return "Nama";
            case 2:
                return "Kelamin";
            case 3:
                return "Jabatan";
            default:
                return null;
        }
    }
    
    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
            case 0:
                return lb. get(row).getNip();
            case 1:
                return lb. get(row).getNama();
            case 2:
                return lb. get(row).getJk();
            case 3:
                return lb. get(row).getJabatan();
            default:
                return null; 
        }
    }
}

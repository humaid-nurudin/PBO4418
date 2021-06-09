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
 * @author asus
 */
public class TabelModelPendaftaran extends AbstractTableModel {
    List<pendaftaran> lb;
    
    public TabelModelPendaftaran(List<pendaftaran> lb) {
        this.lb = lb;
    }
    
    @Override
    public int getColumnCount() {
        return 6;
    }
    
    public int getRowCount() {
        return lb.size();
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "no_ktp";
            case 1:
                return "nama";
            case 2:
                return "jenis_kelamin";
            case 3:
                return "tempat_tinggal";
            case 4:
                return "usia";
            case 5:
                return "alasan";
            default:
                return null;
        }
    }
    
    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
            case 0:
                return lb. get(row).getNo_ktp();
            case 1:
                return lb. get(row).getNama();
            case 2:
                return lb. get(row).getJenis_kelamin();
            case 3:
                return lb. get(row).getTempat_tinggal();
            case 4:
                return lb. get(row).getUsia();
            case 5:
                return lb. get(row).getAlasan();
            default:
                return null; 
        }
    }
}

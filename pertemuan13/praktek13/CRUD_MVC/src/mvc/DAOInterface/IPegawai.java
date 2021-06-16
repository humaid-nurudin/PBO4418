/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.DAOInterface;
import java.util.List;
import mvc.Model.Pegawai;


/**
 *
 * @author Hanik Rosi
 */
public interface IPegawai {
    public void insert(Pegawai b);
    public void update(Pegawai b);
    public void delete(int nip);
    public List<Pegawai> getAll();
    public List<Pegawai> getCariNama(String nama);

}

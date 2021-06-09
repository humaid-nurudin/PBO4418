/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.DAOInterface;

import java.util.List;
import mvc.Model.pendaftaran;

/**
 *
 * @author asus
 */
public interface IPendaftaran {
    public void insert(pendaftaran b);
    public void update(pendaftaran b);
    public void delete(int no_ktp);
    public List<pendaftaran> getAll();
    public List<pendaftaran> getCariNama(String nama);
}
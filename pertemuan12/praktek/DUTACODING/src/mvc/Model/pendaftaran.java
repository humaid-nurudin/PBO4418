/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Model;

/**
 *
 * @author asus
 */
public class pendaftaran {

    /**
     * @return the no_ktp
     */
    public Integer getNo_ktp() {
        return no_ktp;
    }

    /**
     * @param no_ktp the no_ktp to set
     */
    public void setNo_ktp(Integer no_ktp) {
        this.no_ktp = no_ktp;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the jenis_kelamin
     */
    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    /**
     * @param jenis_kelamin the jenis_kelamin to set
     */
    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    /**
     * @return the tempat_tinggal
     */
    public String getTempat_tinggal() {
        return tempat_tinggal;
    }

    /**
     * @param tempat_tinggal the tempat_tinggal to set
     */
    public void setTempat_tinggal(String tempat_tinggal) {
        this.tempat_tinggal = tempat_tinggal;
    }

    /**
     * @return the usia
     */
    public Integer getUsia() {
        return usia;
    }

    /**
     * @param usia the usia to set
     */
    public void setUsia(Integer usia) {
        this.usia = usia;
    }

    /**
     * @return the alasan
     */
    public String getAlasan() {
        return alasan;
    }

    /**
     * @param alasan the alasan to set
     */
    public void setAlasan(String alasan) {
        this.alasan = alasan;
    }
    private Integer no_ktp;
    private String nama;
    private String jenis_kelamin;
    private String tempat_tinggal;
    private Integer usia;
    private String alasan;
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuvien;

/**
 *
 * @author DELL
 */
public class Thuvien {
    protected String maTaiLieu,ten,nxb;

    public Thuvien(String maTaiLieu, String ten, String nxb) {
        this.maTaiLieu = maTaiLieu;
        this.ten = ten;
        this.nxb = nxb;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    @Override
    public String toString() {
        return "Thuvien{" + "maTaiLieu=" + maTaiLieu + ", ten=" + ten + ", nxb=" + nxb + '}';
    }
    
    
}

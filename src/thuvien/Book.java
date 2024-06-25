/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuvien;

/**
 *
 * @author DELL
 */
public class Book extends Thuvien{
    private int soTrang;
    public Book(String maTaiLieu, String ten, String nxb,int soTrang) {
        super(maTaiLieu, ten, nxb);
        this.soTrang = soTrang;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return super.toString()+"Book{" + "soTrang=" + soTrang + '}';
    }
    
    
}

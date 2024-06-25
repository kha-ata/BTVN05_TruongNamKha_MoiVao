/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuvien;

/**
 *
 * @author DELL
 */
public class Paper extends Thuvien{
    private int taiBan;
    public Paper(String maTaiLieu, String ten, String nxb,int taiBan) {
        super(maTaiLieu, ten, nxb);
        this.taiBan = taiBan;
    }

    public int getTaiBan() {
        return taiBan;
    }

   

    public void setTaiBan(int taiBan) {
        this.taiBan = taiBan;
    }
    
     @Override
    public String toString() {
        return super.toString()+"Paper{" + "taiBan=" + taiBan + '}';
    }
}

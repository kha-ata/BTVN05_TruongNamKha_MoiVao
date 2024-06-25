/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doituong;

/**
 *
 * @author DELL
 */
public class Doituong {
    protected String ma,ten,yob;
    protected boolean gioitinh;

    public Doituong(String ma, String ten, String yob, boolean gioitinh) {
        this.ma = ma;
        this.ten = ten;
        this.yob = yob;
        this.gioitinh = gioitinh;
        
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getYob() {
        return yob;
    }

    public void setYob(String yob) {
        this.yob = yob;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    @Override
    public String toString() {
        return "Doituong{" + "ma=" + ma + ", ten=" + ten + ", yob=" + yob + ", gioitinh=" + gioitinh + " ,";
    }
    
}

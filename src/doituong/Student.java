/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doituong;

/**
 *
 * @author DELL
 */
public class Student extends Doituong{
    private String lop,ban;

    public Student(String ma, String ten, String yob, boolean gioitinh,String lop, String ban) {
        super(ma, ten, yob, gioitinh);
        this.lop = lop;
        this.ban = ban;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getBan() {
        return ban;
    }

    public void setBan(String ban) {
        this.ban = ban;
    }

    @Override
    public String toString() {
        return super.toString()+"Student{" + "lop=" + lop + ", ban=" + ban + '}';
    }
    
}

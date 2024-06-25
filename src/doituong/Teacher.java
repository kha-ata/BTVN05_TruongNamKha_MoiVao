/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doituong;

/**
 *
 * @author DELL
 */
public class Teacher extends Doituong{
    private String monDay,trinhDo;

    public Teacher(String ma, String ten, String yob, boolean gioitinh,String monDay,String trinhDo) {
        super(ma, ten, yob, gioitinh);
        this.monDay=monDay;
        this.trinhDo = trinhDo;
        
    }

    public String getMonDay() {
        return monDay;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    @Override
    public String toString() {
        return super.toString()+"Teacher{" + "monDay=" + monDay + ", trinhDo=" + trinhDo + '}';
    }
    
    
}

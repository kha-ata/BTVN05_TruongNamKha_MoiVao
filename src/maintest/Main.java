/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maintest;
import doituong.Doituong;
import doituong.Student;
import doituong.Teacher;
import thuvien.Book;
import thuvien.Paper;
import thuvien.Thuvien;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Main {
     static ArrayList<Doituong> dt=new ArrayList<>();
     private static ArrayList<Thuvien> tv=new ArrayList<>();
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int x=0;
        do{
           
            System.out.println("0 to end program. 1 to addstd.2 to addTch. 3 to addBook . 4 to addPaper 5 to showListDT. 6 to showListTV ");
            x= Integer.parseInt(sc.nextLine());
            switch (x) {
                case 1:
                    addStd(sc);
                    
                    break;
                case 2:
                    addTch(sc);
                    break;
                case 3:
                    addBook(sc);
                    break;
                case 4:
                    addPP(sc);
                    break;
                case 5:
                    showlistDT();
                    break;
                case 6:
                    showlistTV();
                    break;
                default:
                    throw new AssertionError();
            }
        }while(x!=0);
    }
    
    private static void addStd(Scanner sc){
        System.out.println("ma");
        String ma=sc.nextLine();
        System.out.println("ten");
        String ten=sc.nextLine();
        System.out.println("yob");
        String yob=sc.nextLine();
        System.out.println("gioitinh");
        Boolean gioiTinh= Boolean.parseBoolean(sc.nextLine());
        System.out.println("lop");
        String lop = sc.nextLine();
        System.out.println("ban");
        String ban=sc.nextLine();
        
        Student std=new Student(ma, ten, yob, gioiTinh, lop, ban);
        dt.add(std);
        
    }
    private static void addTch(Scanner sc){
         System.out.println("ma");
        String ma=sc.nextLine();
         System.out.println("ten");
        String ten=sc.nextLine();
         System.out.println("yob");
        String yob=sc.nextLine();
         System.out.println("gioitinh");
        Boolean gioiTinh= Boolean.parseBoolean(sc.nextLine());
         System.out.println("monday");
        String monDay=sc.nextLine();
         System.out.println("trinhdo");
        String trinhDo=sc.nextLine();
        
        Teacher tch=new Teacher(ma, ten, yob, gioiTinh, monDay, trinhDo);
        dt.add(tch);
        
    }
     private static void addBook(Scanner sc){
          System.out.println("ma");
        String ma=sc.nextLine();
         System.out.println("ten");
        String ten=sc.nextLine();
         System.out.println("nxb");
        String nxb=sc.nextLine();
         System.out.println("soTrang");
         int soTrang=Integer.parseInt(sc.nextLine());
         Book b=new Book(ma, ten, nxb, soTrang);
         
         tv.add(b);
     }
      private static void addPP(Scanner sc){
          System.out.println("ma");
        String ma=sc.nextLine();
         System.out.println("ten");
        String ten=sc.nextLine();
         System.out.println("nxb");
        String nxb=sc.nextLine();
         System.out.println("taiBan");
         int taiBan=Integer.parseInt(sc.nextLine());
         Paper p=new Paper(ma, ten, nxb, taiBan);
         
         tv.add(p);
     }
      private static void showlistTV(){
         
         for (Thuvien thuv:tv) {
             System.out.println(thuv.toString());
         }
     }
     private static void showlistDT(){
         
         for (Doituong doituong : dt) {
             System.out.println(doituong.toString());
         }
     }
}

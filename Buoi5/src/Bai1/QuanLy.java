package Bai1;

import java.util.Scanner;

public class QuanLy {
    private static Scanner sc = new Scanner(System.in);
    private String maQL;
    private String hoTen;

    public void input(){
        System.out.print("Nhap ma quan ly: ");
        maQL = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
    }

    public void output(){
        System.out.println("Ma quan ly: "+maQL);
        System.out.println("Ho ten: "+hoTen);
    }
}

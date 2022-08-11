package Bai1;

import java.util.Scanner;

public class PhongMay {
    private static Scanner sc = new Scanner(System.in);
    private String maPhong;
    private String tenPhong;
    private double dienTich;
    private QuanLy QL = new QuanLy();
    private May M = new May();

    public void input(){
        System.out.print("Nhap ma phong: ");
        maPhong = sc.nextLine();
        System.out.print("Nhap ten phong: ");
        tenPhong=sc.nextLine();
        System.out.print("Nhap dien tich: ");
        dienTich = sc.nextDouble();
        sc.nextLine();
        QL.input();
        M.input();
    }

    public void output(){
        System.out.println("Ma phong: "+maPhong);
        System.out.println("Ten phong: "+tenPhong);
        System.out.println("Dien tich: "+dienTich);
        QL.output();
        M.output();
    }

    public static void main(String[] args) {
        PhongMay p = new PhongMay();
        p.input();
        p.output();
    }
}

package Bai2;

import java.util.Scanner;

public class PhuongTien {
    private static Scanner sc = new Scanner(System.in);
    private String tenChuXe;
    private String loaiXe;
    private int dungTich;
    private double trigia;
    private double thue;

    public PhuongTien(){

    }
    public PhuongTien(String tenChuXe,String loaiXe,int dungTich,double trigia,double thue){
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.dungTich = dungTich;
        this.trigia = trigia;
        this.thue = thue;
    }

    public String getTenChuXe() {
        return tenChuXe;
    }

    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public double getTrigia() {
        return trigia;
    }

    public void setTrigia(double trigia) {
        this.trigia = trigia;
    }

    public double getThue() {
        return thue;
    }

    public void setThue(double thue) {
        this.thue = thue;
    }

    public void input(){
        System.out.print("Nhap ten chu xe: ");
        tenChuXe = sc.nextLine();
        System.out.print("Nhap loai xe: ");
        loaiXe = sc.nextLine();
        System.out.print("Nhap dung tich: ");
        dungTich = sc.nextInt();
        System.out.print("Nhap gia tri cua xe: ");
        trigia = sc.nextDouble();
        sc.nextLine();
    }
    public void output(){
        if(dungTich <100) thue =  trigia * 0.02;
        else if(dungTich > 200) thue  = trigia * 0.1;
        else thue = trigia * 0.06;
        System.out.printf("%-15s%-15s%-15d%-15.2f%-15.2f",tenChuXe,loaiXe,dungTich,trigia,thue);
        System.out.println();
    }
}

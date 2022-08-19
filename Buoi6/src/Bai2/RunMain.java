package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<PhuongTien> lists = new ArrayList<PhuongTien>();
        int n;
        while(true){
            System.out.println("--------------MENU--------------");
            System.out.println("1.Nhap thong tin va tao danh sach");
            System.out.println("2.Xuat bang ke khai tien thue truoc ba cua cac xe");
            System.out.println("3.Xuat bang ke khai tien thue truoc ba cua cac xe voi tien thue giam dan");
            System.out.println("4.Xuat bang ke khai tien thue truoc ba cua cac xe voi gia tri tang dan");
            System.out.println("5.Thoat");
            System.out.println("--------------------------------");
            System.out.print("Nhap lua chon: ");
            int lc = sc.nextInt();
            sc.nextLine();
            switch (lc){
                case 1:
                    input(lists);break;
                case 2:
                    output(lists);break;
                case 3:
                    outputGiam(lists);break;
                case 4:
                    outputGiam(lists); break;
                default:return;
            }
        }
    }

    public static void input(ArrayList<PhuongTien> lists){
        System.out.println("Nhap thong tin va tao danh sach xe:");
        System.out.println("Nhap so luong xe can them: ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            PhuongTien p = new PhuongTien();
            p.input();
            lists.add(p);
        }
    }

    public static void output(ArrayList<PhuongTien> lists){
        if(lists.size()<1){
            System.out.println("Danh sach rong");
            return;
        }
        System.out.println("----------Danh Sach Xe----------");
        System.out.printf("%-15s%-15s%-15s%-15s%-15s\n","TenChuXe","LoaiXe","DungTich","GiaTien","Thue");
        for(PhuongTien p: lists){
            p.output();
        }
    }
    public static void outputGiam(ArrayList<PhuongTien> lists){
        if(lists.size()<2){
            output(lists);
            return;
        }
        PhuongTien []p = new PhuongTien[lists.size()];
        for(int i=0;i< lists.size();i++){
            p[i] = new PhuongTien();
        }
        for(int i=0;i<lists.size();i++){
            p[i] = lists.get(i);
            for(int j = i+1;j< lists.size();j++){
                if(p[i].getThue()>lists.get(j).getThue()) p[i] = lists.get(i);
            }
        }
        System.out.println("Danh sach sap xep xe theo thue giam: ");
        System.out.printf("%-15s%-15s%-15s%-15s%-15s\n","TenChuXe","LoaiXe","DungTich","GiaTien","Thue");
        for(int i=0;i<lists.size();i++){
            p[i].output();
        }
    }
    public static void outputTang(ArrayList<PhuongTien> lists){
        if(lists.size()<2){
            output(lists);
            return;
        }
        PhuongTien []p = new PhuongTien[lists.size()];
        for(int i=0;i< lists.size();i++){
            p[i] = new PhuongTien();
        }
        for(int i=0;i<lists.size();i++){
            p[i] = lists.get(i);
            for(int j = i+1;j< lists.size();j++){
                if(p[i].getThue()<lists.get(j).getThue()) p[i] = lists.get(i);
            }
        }
        System.out.println("Danh sach sap xep xe theo thue giam: ");
        System.out.printf("%-15s%-15s%-15s%-15s%-15s\n","TenChuXe","LoaiXe","DungTich","GiaTien","Thue");
        for(int i=0;i<lists.size();i++){
            p[i].output();
        }
    }
}

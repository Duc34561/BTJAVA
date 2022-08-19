package Bai1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class RunMain {
    private static boolean check = false;
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        CanBo c[] = new CanBo[1000];
        while(true){
            System.out.println("--------------MENU--------------");
            System.out.println("1.Add 1 can bo vao list");
            System.out.println("2.Hien thi danh sach cac can bo");
            System.out.println("3.Xoa 1 can bo theo id");
            System.out.println("4.Tim kiem 1 can bo theo id");
            System.out.println("5.Dung chuong trinh");
            System.out.println("--------------------------------");
            System.out.print("Nhap lua chon: ");
            int lc = sc.nextInt();
            sc.nextLine();
            int x = 0;
            int n = 0;
            switch (lc){
                case 1:
                    do{
                        System.out.print("Nhap so luong can bo: ");
                        n = sc.nextInt();
                        if(n<0) System.out.println("Nhap 1 so lon hon 0");
                    }while (n<0);
                    input(c,n,x);
                    break;
                case 2:
                    if(check)
                        output(c,n,x);
                    else System.out.println("Danh Sach Rong");
                    break;
                case 3:
                    if(check){
                        del(c,n);
                        output(c,x,n);
                    }else System.out.println("Danh Sach Rong");
                    break;
                case 4:
                    if(check)
                        search(c,n);
                    else System.out.println("Danh Sach Rong");
                    break;
                case 5: return;
            }
        }
    }
    public static void input(CanBo c[],int n,int x){
        do {
            System.out.println("1.Nhap nhan vien");
            System.out.println("2.Nhap cong nhan");
            System.out.println("3.Nhap ky su");
            System.out.print("Nhap lua chon nhap: ");
            x = sc.nextInt();
            sc.nextLine();
            System.out.println("Nhap thong tin can bo nhan vien: ");
            switch (x){
                case 1:
                       for(int i=0;i<n;i++){
                           c[i] = new NhanVien();
                           System.out.printf("NV%d: \n",i+1);
                           c[i].inputCanBo();
                           check = true;
                       }
                       break;
                case 2:
                    for(int i=0;i<n;i++){
                        c[i] = new CongNhan();
                        System.out.printf("CN%d: \n",i+1);
                        c[i].inputCanBo();
                        check = true;;
                    }
                    break;
                case 3:
                    for(int i=0;i<n;i++){
                        c[i] = new KySu();
                        System.out.printf("KS%d: \n",i+1);
                        c[i].inputCanBo();
                        check = true;;
                    }
                    break;
            }
        }while(x<1 && x>3);
    }
    public static void output(CanBo c[],int n,int x){
            switch (x){
                case 1:
                    System.out.printf("%-15s%-15s%-15s%-15s%-15s", "ID", "HoTen", "NamSinh", "GioiTinh", "DiaChi","CongViec");
                    for (int i = 0; i < n; i++) {
                        c[i].inputCanBo();
                    }
                    break;
                case 2:
                    System.out.printf("%-15s%-15s%-15s%-15s%-15s", "ID", "HoTen", "NamSinh", "GioiTinh", "DiaChi","Bac");
                    for (int i = 0; i < n; i++) {
                        c[i].inputCanBo();
                    }
                    break;
                case 3:
                    System.out.printf("%-15s%-15s%-15s%-15s%-15s", "ID", "HoTen", "NamSinh", "GioiTinh", "DiaChi","NgangDaoTao");
                    for (int i = 0; i < n; i++) {
                        c[i].inputCanBo();
                    }
                    break;
            }
    }
    public static void del(CanBo c[],int n){
        System.out.print("Nhap Id can bo muon xoa: ");
        int id = sc.nextInt();
        for(int i=0;i<n;i++){
            if(c[i].getId() == id){
                for(int j = i;j<n-1;j++){
                    c[j] = c[j+1];
                }
            }
            i--;
            n--;
        }
    }
    public static void search(CanBo c[],int n){
        System.out.println("Nhap id can bo muon tim: ");
        int id = sc.nextInt();
        boolean ok = false;
        for(int i=0;i<n;i++){
            if(c[i].getId() == id){
                System.out.printf("%-15s%-15s%-15s%-15s%-15s","ID","HoTen","NamSinh","GioiTinh","DiaChi");
                c[i].outputCanBo();
                ok = true;
            }
        }
        if(!ok) System.out.println("Khong tim thay can bo theo id: "+id);
    }

}

package Bai2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Address {
    private static Scanner sc = new Scanner(System.in);
    public int id;
    public String district;
    public String province;

    public void input(){
        System.out.print("Nhap Id address: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap district: ");
        district = sc.nextLine();
        System.out.print("Nhap province: ");
        province = sc.nextLine();
    }

    public void output(){
        System.out.printf("%-10d%-10s%-10s",id,district,province);
    }
}

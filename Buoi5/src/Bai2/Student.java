package Bai2;

import java.util.Scanner;


public class Student {
    private static Scanner sc = new Scanner(System.in);
    private int id;
    private String name;
    private int age;
    private Address a = new Address();

    public void input() {
        System.out.print("Nhap id student: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap name: ");
        name = sc.nextLine();
        System.out.print("Nhap age: ");
        age = sc.nextInt();
        sc.nextLine();
        a.input();
    }

    public void output() {
        System.out.printf("%-20d%-20s%-20d",id,name,age);
        a.output();
        System.out.println();
    }
    public static void input(Student[] s){
        for(int i=0;i< s.length;i++){
            s[i] = new Student();
            System.out.printf("SV %d: \n",i+1);
            s[i].input();
        }
    }
    public static void output(Student[] s){
        System.out.printf("%-20s%-20s%-20s%-10s%-10s%-10s\n","Id student","Name", "Age","Id address","District","Province");
        for(int i=0;i< s.length;i++){
            s[i].output();
        }
    }
    public static void search( Student[] s) {
        System.out.print("Nhap Id student can tim: ");
        int a = sc.nextInt();
        System.out.println("Thong tin sinh vien can tim: ");
        int idx = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i].id == a){
                s[i].output();
            }
        }
    }

    public static void fix( Student[] s) {
        System.out.println("_____THONG TIN SINH VIEN SAU KHI SUA_____");
        System.out.printf("%-20s%-20s%-20s%-10s%-10s%-10s\n","Id student","Name", "Age","Id address","District","Province");
        for(int i=0;i<s.length;i++){
            s[i].a.province = s[i].a.province.replace("Thanh Hoa","Hai Phong");
            s[i].output();
        }
    }

    public static void del(Student[] s){
        System.out.print("Nhap Id student can xoa: ");
        int a = sc.nextInt();
        System.out.println("_____THONG TIN SINH VIEN SAU KHI XOA_____");
        System.out.printf("%-20s%-20s%-20s%-10s%-10s%-10s\n","Id student","Name", "Age","Id address","District","Province");
        for (int i = 0; i < s.length; i++) {
            if(s[i].id == a){
                continue;
            }
            s[i].output();
        }
    }
    public static void main(String[] args) {
        System.out.print("Nhap so lượng sinh vien: ");
        int n = sc.nextInt();
        Student s[] = new Student[n];
        while(1>0){
            System.out.println("________________________");
            System.out.println("1.Nhap thong tin sinh sinh vien ");
            System.out.println("2.Hien thi thong tin sinh vien ");
            System.out.println("3.Tim sinh vien");
            System.out.println("4.Sua thong tin");
            System.out.println("5.Xoa sinh vien");
            System.out.println("0.Thoat");
            System.out.println("_________________________");
            System.out.print("Nhap lua chon: ");
            int lc = sc.nextInt();
            sc.nextLine();
            if(lc == 1){
                input(s);
            }else if(lc == 2){
                output(s);
            }else if(lc == 3){
                search(s);
            }else if(lc == 4){
                fix(s);
            }else if(lc == 5){
                del(s);
            }else break;
        }
    }

}

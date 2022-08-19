package Bai1;

import java.util.Scanner;

public class CanBo {
    private static Scanner sc = new Scanner(System.in);
    protected int id;
    protected String hoTen;
    protected int namSinh;
    protected String gioiTinh;
    protected String diaChi;
    private static int tmpid = 0;

    public CanBo(){
        id = tmpid++;
    }
    public CanBo(int id,String hoTen,int namSinh,String gioiTinh,String diaChi){
        id = tmpid++;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public void inputCanBo(){
        System.out.print("Nhap ho ten can bo: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap nam sinh");
        namSinh = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap gioi tinh: ");
        gioiTinh = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = sc.nextLine();
    }
    public void outputCanBo(){
        System.out.printf("%-15s%-15d%-15s%-15d%-15d",id,hoTen,namSinh,gioiTinh,diaChi);
    }
}

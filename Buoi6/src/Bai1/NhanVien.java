package Bai1;

import java.util.Scanner;

public class NhanVien extends CanBo{
    private Scanner sc = new Scanner(System.in);
    private String congViec;

    public NhanVien(){

    }
    public NhanVien(String congViec){
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }
    @Override
    public void inputCanBo(){
        super.inputCanBo();
        System.out.print("Nhap cong viec cua nhan vien: ");
        congViec = sc.nextLine();
    }
    @Override
    public void outputCanBo(){
        super.outputCanBo();
        System.out.printf("%-15s\n",congViec);
    }
}

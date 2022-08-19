package Bai1;

import java.util.Scanner;

public class CongNhan extends CanBo{
    private Scanner sc = new Scanner(System.in);
    private String bac;
    public CongNhan(String bac){
        super();
        this.bac = bac;
    }
    public CongNhan(){
    }

    public String getBac() {
        return bac;
    }

    public void setBac(String bac) {
        this.bac = bac;
    }
    @Override
    public void inputCanBo(){
        super.inputCanBo();
        System.out.println("Nhap bac cua cong nhan: ");
        bac = sc.nextLine();
    }
    @Override
    public void outputCanBo(){
        super.outputCanBo();
        System.out.printf("%-15s\n",bac);
    }
}

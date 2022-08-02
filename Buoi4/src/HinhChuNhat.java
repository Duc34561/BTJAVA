import java.util.Scanner;

public class HinhChuNhat {

    private double chieuDai;
    private double chieuRong;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        chieuDai = sc.nextDouble();
        System.out.print("Nhap chieu rong: ");
        chieuRong = sc.nextDouble();
    }
    public void setChieuDai(double chieuDais){
        chieuDai = chieuDais;
    }
    public double getChieuDai(){
        return chieuDai;
    }
    public void setChieuRong(double chieuRongs){
        chieuRong = chieuRongs;
    }
    public double getChieuRong(){
        return chieuRong;
    }
    public double chuVi(){
        return (chieuDai+chieuRong) * 2;
    }
    public double dienTich(){
        return (chieuDai*chieuRong);
    }
    public void ouput(){
        System.out.printf("%-10s %-10s %-10s %-10s\n", "ChieuDai","ChieuRong","ChuVi","DienTich");
        System.out.printf("%-10.2f %-10.2f %-10.2f %-10.2f\n",chieuDai,chieuRong,chuVi(),dienTich());
    }
    public static void soSanh(HinhChuNhat a, HinhChuNhat b){
        if(a.dienTich() > b.dienTich()) System.out.println("Hinh a co dien tich lon hon\n");
        else System.out.println("Hinh b co dien tich lon hon\n");
    }
    public static void main(String[] args) {
        HinhChuNhat a = new HinhChuNhat();
        HinhChuNhat b = new HinhChuNhat();
//        a.input();
//        a.ouput();
//        b.input();
//        b.ouput();
        a.setChieuDai(3.5);
        a.setChieuRong(3);
        System.out.printf("%-10s %-10s %-10s %-10s\n", "ChieuDai","ChieuRong","ChuVi","DienTich");
        System.out.printf("%-10.2f %-10.2f %-10.2f %-10.2f\n",a.getChieuDai(),a.getChieuRong(),a.chuVi(),a.dienTich());
        b.setChieuDai(4.5);
        b.setChieuRong(2.5);
        System.out.printf("%-10s %-10s %-10s %-10s\n", "ChieuDai","ChieuRong","ChuVi","DienTich");
        System.out.printf("%-10.2f %-10.2f %-10.2f %-10.2f\n",b.getChieuDai(),b.getChieuRong(),b.chuVi(),b.dienTich());
        soSanh(a,b);
    }
}

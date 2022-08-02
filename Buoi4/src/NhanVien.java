import java.util.Scanner;

public class NhanVien {
    private static Scanner sc = new Scanner(System.in);

    private static int maNv = 1;
    private String tenNv;
    private int tuoi;
    private String diaChi;
    private String boPhan;



    public NhanVien() {

    }

    private void input(){
        System.out.print("Nhap ten nhan vien: ");
        tenNv = sc.nextLine();
        System.out.print("Nhap tuoi nhan vien: ");
        tuoi = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap dia chi nhan vien: ");
        diaChi = sc.nextLine();
        System.out.print("Nhap bo phan lam viec: ");
        boPhan = sc.nextLine();
    }
    private void ouput(){
        System.out.printf("%-10d%-20s%-10d%-10s%-10s\n",maNv,tenNv,tuoi,diaChi,boPhan);
    }

    public static void main(String[] args) {
        NhanVien[] NV = new NhanVien[5];
        for(int i=0;i<5;i++){
            System.out.printf("Nhap thong tin nhan vien thu %d:\n",i+1);
            NV[i] = new NhanVien();
            NV[i].input();
        }
        System.out.printf("%-40s\n","THONG TIN CAC NHAN VIEN");
        System.out.printf("%-10s%-15s%-10s %-10s%-10s\n","Manv","Tennv","Tuoi","DiaChi","BoPhan");
        for(int i=0;i<5;i++){
            NV[i].ouput();
            NV[i].maNv++;
        }
    }
}

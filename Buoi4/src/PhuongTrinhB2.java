import java.util.Scanner;

public class PhuongTrinhB2 {
    private static Scanner sc = new Scanner(System.in);

    private double a;
    private double b;
    private double c;

    public void input(){
        System.out.println("Nhap a,b,c: ");
        System.out.print("Nhap a = ");
        a = sc.nextDouble();
        System.out.print("Nhap b = ");
        b = sc.nextDouble();
        System.out.print("Nhap c = ");
        c = sc.nextDouble();
    }

    public void tinhNghiem(){
        double delta = b*b -4*a*c;
        double x1,x2;
        if(delta < 0) System.out.println("Phuong trinh vo nghiem");
        else if(delta == 0){
            x1 = x2 = -b/(2*a);
            System.out.printf("Phuong trinh co nghiem kep x1 = x2 = %.2f",x1);
        }else{
            x1 = (-b - Math.sqrt(delta))/ (2*a);
            x2 = (-b + Math.sqrt(delta))/(2*a);
            System.out.println("Phuong trinh có 2 nghiem phan biet: ");
            System.out.printf("x1 = %.2f\n",x1);
            System.out.printf("x2 = %.2f\n",x2);
        }
    }

    public void ouput(){
        tinhNghiem();
    }

    public static void main(String[] args) {
        PhuongTrinhB2 a = new PhuongTrinhB2();
        a.input();
        a.ouput();
    }
}

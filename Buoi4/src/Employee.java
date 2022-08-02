import java.util.Scanner;

public class Employee {
    private static Scanner sc = new Scanner(System.in);

    private String id;
    private String name;
    private int age;
    private int wordKingsDays;
    private double salary;
    private static int price = 50;

    Employee() {
        this.id = id;
        this.name = name;
        this.age = age;
        this.wordKingsDays = wordKingsDays;
        this.salary = salary;
    }

    public void setId(String ids){
        id = ids;
    }
    public String getId(){
        return id;
    }
    public void setName(String names){
        name = names;
    }
    public String getName(){
        return name;
    }
    public void setAge(int ages){
        age = ages;
    }
    public int getAge(){
        return age;
    }
    public void setWorKingsDays(int wordKingsDays1){
        wordKingsDays = wordKingsDays1;
    }
    public int getWordKingsDays(){
        return wordKingsDays;
    }
    public double getSalary(){
        salary = (double) wordKingsDays*price;
        return salary;
    }
    public void input(){
        System.out.println("Nhap thong tin nhan vien: ");
        System.out.print("Ma nhan vien: ");
        id = sc.nextLine();
        System.out.print("Nhap ten nhan vien: ");
        name = sc.nextLine();
        System.out.print("Nhap tuoi nhan vien: ");
        age = sc.nextInt();
        System.out.print("Nhap so ngay cong: ");
        wordKingsDays = sc.nextInt();
    }
    public void ouput(){
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n","MaNV","HoTen","Tuoi","SoNgayCong","Luong");
        System.out.printf("%-10s%-10s%-10d%-10d%-10.2f\n",id,name,age,wordKingsDays,salary);
    }

    public static void main(String[] args) {
        Employee a = new Employee();
//        a.input();
//        a.getSalary();
//        a.ouput();
        a.setId("001");
        a.setName("Duc");
        a.setAge(20);
        a.setWorKingsDays(29);
        System.out.println("Ma nhan vien: "+a.getId());
        System.out.println("Ten nhan vien: "+a.getName());
        System.out.println("Tuoi nhan vien: "+a.getAge());
        System.out.println("So ngay cong: "+a.getWordKingsDays());
        System.out.println("Luong: "+a.getSalary());
    }
}

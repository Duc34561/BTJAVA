import java.util.Scanner;

public class Aminal {

    //thuoc tinh thi co modier : private
    //..thuoc tinh
    private String name;
    private int age;
    private String gender;
    //modifer : private publid protected default

    //    Aminal(String names , int ages , String genders){
//        name = names;
//        age = ages;
//        gender = genders;
//    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhap ten : ");
        name = scanner.nextLine();
        System.out.println(" Nhap tuoi ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.println(" Nhap gioi tinh ");
        gender = scanner.nextLine();
    }
    public void eat(){
        System.out.println(" An ");
    }
    public void sleep(){
        System.out.println("Ngu ");
    }
    public void play(){
        System.out.println("Di choi ");
    }
    public String getName(){
        return name;
    }
    public void setName(String names){
        name = names;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int ages){
        age = ages;
    }

    public void output(){
        System.out.printf("%-10s%-10s%-10s\n" , "Name" , "Age" , "Gender");
        System.out.printf("%-10s%-10d%-10s" , name , age , gender);
    }
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        //Aminal dog = new Aminal();
        Aminal cat = new Aminal();
        cat.input();
        cat.output();
//        String name = scanner.nextLine();
        //        System.out.println(" Nhap vao ten cua con vat : ");
//        cat.setName(name);
//        System.out.println("Name " + dog.getName());
//        dog.setAge(2);
//        System.out.println("Age : "+dog.getAge());
//        System.out.println("name " + name);

//        tạo một lớp STUDETN có
//        thuộc tính mã sv(String) , tuổi(int) , khóa(int) , ngành(String)

        //Nhập vào bằng 2 cách
//        C1 : Sử dụng getter setter nhập trực tiếp tỏng hàm main
//        C2 : Viết 1 phương thức input và ouput để nhập xuất ra giá trị

    }
}
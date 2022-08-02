public class Student {
    private int msv;
    private int age;
    private String khoa;
    private String nganh;


    public Student(int msvs, int ages, String khoas, String nganhs) {
        msv = msvs;
        age = ages;
        khoa = khoas;
        nganh = nganhs;
    }

    //Sử dụng printf để in dưới dạng bảng
    public void output() {
        System.out.printf("%-10d%-10d%-10s%-10s\n", msv, age, khoa, nganh);
    }

    public static void main(String[] args) {
        Student student1 = new Student(1, 20, "CNTT", "KTMT");
        Student student2 = new Student(2, 21, "CNTT", "KHPM");
        System.out.printf("%-10s%-10s%-10s%-10s\n", "Masv", "Tuoi", "Khoa", "Nganh");
        student1.output();
        student2.output();
    }
}

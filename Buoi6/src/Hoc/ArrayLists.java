package Hoc;
import java.util.ArrayList;
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);

        //Chuyen 1 array list ve Array bang phuong thuc toArray
        Object[] x = a.toArray();
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }
        // Khoi tao 1 mang Array list kieu du lieu String
        ArrayList<String> list = new ArrayList<String>();

        //1.Phuong thuc add theo cac phan tu vao cuoi arrlist
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Python");

        ArrayList<String> listA = new ArrayList<String>();
        listA.addAll(list);// noi chuoi listA vao sau list

        ArrayList<String> listB = new ArrayList<String>();
        listB.add("Java");

        //2.Phuong thuc retainAll: Xoa tat ca cac phan tu khong o list B ra khoi list A
//        listA.retainAll(listB);
//
//        //3.Phuong thuc removeAll: Xoa tat ca cac pan tu o list B ra khoi list A
//        listA.removeAll(listB);

        //4.Phuong thuc remove: Xoa phan tu theo chi so
        System.out.println("Sau khi xoa chi so thu 1");
        listA.remove(1);
        System.out.println(listA);

        //5.Phuong thuc remove: xoa phan tu theo gia tri, xoa ptu dau tien co gia tri do
        System.out.println("Sau khi xoa gia tri trong mang la Java");
        listA.remove("Java");
        System.out.println(listA);

        //6.Phuong thuc contrains: tim kiem 1 gia tri xem xuat hien o trong list hay ko, co thi tra ve true
        int cnt = 0;
        for(int i=0;i<listA.size();i++){
//            if(listA.get(i).compareTo("C++")==0): kieu 1
//            if(listA.get(i).equals("C++")): kieu 2
            if(listA.contains("C#")) cnt++;
        }
        if(cnt>0) System.out.println("Co phan tu ten la C#");
        else System.out.println("Khong co phan tu C#");

        //Khoi tao 1 mang arraylist voi kieu du lieu dau vao laf object
//        ArrayList<SinhVien> listStudent = new ArrayList<SinhVien>();
//        SinhVien st1 = new SinhVien("B",22,"TH");
//        SinhVien st2 = new SinhVien("C",24,"TH");
//        listStudent.add(new SinhVien("D",20,"TH"));// khoi tao truc tiep
//        listStudent.add(st1);
//        listStudent.add(st2);
//        int dem = 0;
//        for(int i=0;i<listStudent.size();i++){
//            if(listStudent.get(i).getTen().equal("B")){
//                dem++;
//                listStudent.remove(i);
//                break;
//            }
//        }
//        for(int i=0;i<listStudent.size();i++){
//            if(listStudent.get(i).getTen().equals("B")){
//                listStudent.get(i).setTen("E");
//                listStudent.remove(i);
//                break;
//            }
//        }
//        System.out.println(listStudent.toString());
    }
}

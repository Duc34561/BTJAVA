package Bai1;

import java.util.Scanner;

public class KySu extends  CanBo{
    private Scanner sc = new Scanner(System.in);
    private String nganhDaoTao;

    public KySu(){

    }
    public KySu(String nganhDaoTao){
        super();
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }
    @Override
    public void inputCanBo(){
        super.inputCanBo();
        System.out.print("Nhap nganh dao tao: ");
        nganhDaoTao =sc.nextLine();
    }
    @Override
    public void outputCanBo(){
        super.outputCanBo();
        System.out.printf("%-15s\n",nganhDaoTao);
    }
}

package Bai3;

public class NapChongPT {
    public static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return n>1;
    }

    public static boolean isPrime(long n){
        for(long i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return n>1;
    }

    public static boolean isPrime(float n){
        for(float i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return n>1;
    }

    public static boolean isPrime(double n){
        for(double i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return n>1;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(13));
        System.out.println(isPrime(15));
        System.out.println(isPrime(17f));
        System.out.println(isPrime(19f));
    }
}

package javakien;
import java.util.Scanner;
public class bai3 {
      public static int IsPrime(int n){
	        if(n < 2) {
	            return 0;
	        }
	        else{
	            for(int i = 2; i*i <= n; i++){
	                if(n % i == 0){
	                    return 0;
	                }
	            }
	        }
	        return 1;
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhap so nguyen duong n: ");
	        int n = scanner.nextInt();
	        if(IsPrime(n) == 1){
	            System.out.println(n+ " la so nguyen to");
	        }
	        else{
	            System.out.println(n + " khong phai la so nguyen to");
	        }
	    }
	}


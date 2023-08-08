package javakien;
import java.util.Scanner;
public class bai2 {
   
		public static long GT(int n){
		       if(n == 1) 
		       return 1;
		       return n*GT(n-1);
		   }
		  
		   public static float B2a(int n){
		       float s = 0;
		       for(int i = 1; i <= n; i++){
		           s += 1.0/i;
		       }
		       return s;
		   }
public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int n;
		        do{
		            System.out.println("Nhap so nguyen duong n= ");
		            n = scanner.nextInt();
		        }
		        while(n < 0);
		        
		        System.out.println("phan a ");
		        System.out.println(" S= " + B2a(n)); 
		        
		        System.out.println("phan b ");
		        int sum = 0;
		        long factorial = 0;
		        
		        for(int i = 1; i <= n; i++){
		            factorial = GT(i);
		            sum += factorial;
		        }
		        System.out.println(" P= " + sum);   
		    }
		}



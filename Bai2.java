package javanhom1;
import java.util.Scanner;
public class Bai2 {
	public static Scanner sc = new Scanner(System.in);

	  static void thempt(int n, int []a){
	      System.out.print("nhap vi tri can them: ");
	      int index = sc.nextInt();
	      if(index >n || index <=0){
	          System.out.println("vi tri can them ko hp le");
	      }
	      else {
	          System.out.print("nhap so can them: ");
	          int x = sc.nextInt();
	          for (int i = n; i > index - 1; i--) {
	              a[i] = a[i - 1];
	          }
	          n++;
	          a[index - 1] = x;
	          System.out.print("mang sau khi them la: ");
	          for (int i = 0; i < n; i++) {
	              System.out.print(a[i] + " ");
	          }
	      }

	    }
	    static void xoapt(int n, int []a){
	        System.out.print("nhap vtri xoa: ");
	        int index = sc.nextInt();
	        if(index >n || index <=0){
	            System.out.println("vtri xoa ko hop le");
	        }
	        else {
	            for (int i = index - 1; i < n - 1; i++) {
	                a[i] = a[i + 1];
	            }
	            n--;
	            System.out.print("mang sau khi xoa la : ");
	            for (int i = 0; i < n; i++) {
	                System.out.print(a[i] + " ");
	            }
	        }
	    }
	    public static void main(String[] args) {
	      System.out.print("nhap so pt: ");
	      int n=sc.nextInt();
	      int [] a =new int[n+5];
	      for(int i=0 ;i<n ;i++){
	          System.out.print("nhap vao pt thu"+(i+1)+" : ");
	          a[i]=sc.nextInt();
	      }
	      thempt(n,a);
	        System.out.print("nhap vao so pt: ");
	        int x=sc.nextInt();
	        int [] b =new int[x+5];
	        for(int i=0 ;i<x ;i++){
	            System.out.print("nhap vao pt thu "+(i+1)+" : ");
	            b[i]=sc.nextInt();
	        }
	      xoapt(x,b);
	    }
}

package javanhom1;
import java.util.Scanner;
public class Bai1 {
	public static Scanner sc = new Scanner(System.in) ;
	static int Dem(int n, int x, int[] a) {
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (x == a[i]) {
                dem++;
            }
        }
        return dem;
    }

    public static void main(String[] args) {
       
        System.out.print("Nhap so luong phan tu trong mang: ");
        int n = sc.nextInt();
        int[] a = new int[100];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap a[" + i + "] = ");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int dem = 0;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    dem++;
                }
            }
            if (dem == 0) {
                System.out.println("So " + a[i] + " xuat hien " + Dem(n, a[i], a) + " lan");
            }
        }
    }
}

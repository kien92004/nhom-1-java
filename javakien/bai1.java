package javakien;
import java.util.Scanner;
public class bai1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai canh cua hinh vuong: ");
        int n = scanner.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.printf("\n");
        }
    }
}
    

	
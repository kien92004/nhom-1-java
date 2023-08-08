package javakien;
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap he so a, b, c: ");
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();
        float k1, k2, k3, k4, m, n;
        if(a == 0 && b == 0 && c == 0){
            System.out.println("Phuong trinh co vo so nghiem");
        }
        else if(a == 0 && b == 0 && c != 0){
            System.out.println("Phuong trinh vo nghiem");
        }
        else{
            float denta = b*b - 4*a*c;
            if(denta < 0){
                System.out.println("Phuong trinh vo nghiem");
            }
            else if(denta == 0){
                m = n = -b/(2*a);
                if(m >= 0){
                    k1 = (float) sqrt(m);
                    k2 = (float) -sqrt(m);
                    System.out.print("Phuong trinh co 2 nghiem la: " + k1 + " " + k2);
                }
                else{
                    System.out.println("Phuong trinh vo nghiem");
                }
            }
            else{
                m = (float) ((-b + sqrt(denta))/(2*a));
                n = (float) ((-b - sqrt(denta))/(2*a));
                if(m < 0 && n > 0){
                    k1 = (float) sqrt(n);
                    k2 = (float) -sqrt(n);
                    System.out.print("Phuong trinh co 2 nghiem la: " + k1 + " " + k2);
                }
                else if(m > 0 && n < 0){
                    k1 = (float) sqrt(m);
                    k2 = (float) -sqrt(m);
                    System.out.print("Phuong trinh co 2 nghiem la: " + k1 + " " + k2);
                }
                else if(m > 0 && n > 0){
                    k1 = (float) sqrt(m);
                    k2 = (float) -sqrt(m);
                    k3 = (float) sqrt(n);
                    k4 = (float) -sqrt(n);
                    System.out.println("Phuong trinh co 4 nghiem phan biet la: " + k1 + " " + k2 + " " + k3 + " " + k4);
                }
                else if((m == 0 && n < 0) || (m < 0 && n == 0)){
                    System.out.println("Phuong trinh co nghiem x = 0");
                }
                else if(m == 0 && n >0){
                    k3 = (float) sqrt(n);
                    k4 = (float) -sqrt(n);
                    System.out.println("Phuong trinh co 3 nghiem la: " + k3 + " " + k4 + " 0");
                }
                else if(m > 0 && n  == 0){
                    k1 = (float) sqrt(m);
                    k2 = (float) -sqrt(m);
                    System.out.println("Phuong trinh co 3 nghiem la: " + k1 + " " + k2 + " 0");
                }
            }
        }
    }
}

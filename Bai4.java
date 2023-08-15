package javanhom1;
import java.util.Scanner;
public class Bai4 { 
	public static Scanner sc = new Scanner(System.in);
	static boolean doiXung(String s){
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.print(" moi nhap chuoi : ");
        String s= sc.nextLine();
        System.out.println(doiXung(s));
    }
}


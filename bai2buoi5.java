package buoi5;
import java.util.Scanner;

	class school{
		private String name;
		private String date;
		
		public school(){
		}
		
		public school(String name, String date) {
			name=name;
			date=date;
		}
		
		public String getname() {
			return name;
		}
		
		public void setname(String name) {
			this.name=name;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}
		
		public void nhap() {
			Scanner sc =new Scanner(System.in);
			System.out.printf("nhap ten truong :");
			name=sc.nextLine();
			System.out.printf("nhap ngay vao truong :");
			date=sc.nextLine();
		}
		
		public void xuat() {
			System.out.printf("\t truong: " + name);
	        System.out.printf("\t ngay vao truong: " + date);
		}
	}
	
	class Faculty{
		private String name;
		private String date;
		private school x;
		
		public Faculty() {
		}
		
		public Faculty(String name, String date, school x) {
			name = name;
			date = date;
			this.x=x;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public school getx() {
			return x;
		}

		public void setx(school x) {
			this.x = x;
		}
		
		public void nhap() {
			Scanner sc1 = new Scanner(System.in);
	        System.out.printf("Nhap ten khoa: ");
	        name = sc1.nextLine();
	        System.out.printf("Nhap ngay vao khoa: ");
	        date = sc1.nextLine();
	        x = new school();
	        x.nhap();
		}
		
		public void xuat(){
	        System.out.printf("\tkhoa: " + name);
	        System.out.printf("\tngay vao khoa: " + date);
	        x.xuat();
	    }
	}
	
	class student{
		private String name;
		private String lop;
		private Double source;
		private Faculty y;
		
		public student() {
		}
		
		public student (String name, String lop, Double source, Faculty y) {
			name = name;
			lop = lop;
			source = source;
			this.y=y;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getlop() {
			return lop;
		}

		public void setlop(String lop) {
			lop = lop;
		}

		public Double getSource() {
			return source;
		}

		public void setSource(Double source) {
			this.source = source;
		}

		public Faculty gety() {
			return y;
		}

		public void sety(Faculty y) {
			this.y = y;
		}
		
		public void nhap(){
	    	Scanner sc2 = new Scanner(System.in);
	        System.out.printf("Nhap ten sv: ");
	        name = sc2.nextLine();
	        System.out.printf("Nhap lop: ");
	        lop = sc2.nextLine();
	        System.out.printf("nhap diem:");
	        source= sc2.nextDouble();
	        y = new Faculty();
	        y.nhap();
	    }
	   
	    public void xuat(){
	        System.out.printf("ten sv: " + name);
	        System.out.printf("\tlop: " + lop);
	        System.out.printf("\tdiem: " + source);
	        y.xuat();
	    }
	}
	public class bai2 {
		public static void main(String[] args) {
	        student a = new student();
	        a.nhap();
	        a.xuat();
	    }
}

package bt6;
import java.util.Scanner;

class animal{
	protected String name;
	protected Byte age;
	protected Float weight;
	
	public animal(){
		
	}
	public animal(String name,Byte age, Float weight ) {
		name = name;
		age = age;
		weight = weight;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Byte getAge() {
		return age;
	}
	public void setAge(Byte age) {
		this.age = age;
	}
	public Float getWeight() {
		return weight;
	}
	public void setWeight(Float weight) {
		this.weight = weight;
	}
	 public void Nhap(){
	        Scanner sc = new Scanner(System.in);
	        System.out.printf("Nhap ten: ");
	        name = sc.nextLine();
	        System.out.printf("Nhap tuoi: ");
	        age = sc.nextByte();
	        System.out.printf("Nhap can nang: ");
	        weight = sc.nextFloat();
	    }
	    
	    public void Xuat(){
	        System.out.printf("ten: " + name);
	        System.out.printf("\ttuoi: " + age);
	        System.out.printf("\tcan nang: " + weight);
	    }
	    
	    public void tiengKeu(){
	    }
}

class cat extends animal{
	private String color;
	private String preferences;
	private String ownerName;
	
	public cat(String name, Byte age, Float weight, String color, String preferences, String ownerName) {
		super(name,age,weight);
		this.color=color;
		this.preferences=preferences;
		this.ownerName=ownerName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPreferences() {
		return preferences;
	}

	public void setPreferences(String preferences) {
		this.preferences = preferences;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	@Override
    public void Nhap(){
        Scanner sc1 = new Scanner(System.in);
        super.Nhap();
        System.out.printf("Nhap mau: ");
        color = sc1.nextLine();
        System.out.printf("Nhap so thich: ");
        preferences = sc1.nextLine();
        System.out.printf("Nhap ten chu: ");
        ownerName = sc1.nextLine();
    }
    @Override
    public void Xuat(){
        super.Xuat();
        System.out.println("mau: " + color);
        System.out.println("so thich: " + preferences);
        System.out.println("chu: " + ownerName);
    }
    @Override
    public void tiengKeu(){
        System.out.println("meo meo ");
    }
}

class Dog extends animal{
    private String character;
    public Dog(){}
    public Dog(String name, Byte age, float weight, String character){
        super(name, age, weight);
        this.character = character;
    }
    public String getCharacter() {
        return character;
    }
    public void setCharacter(String character) {
        this.character = character;
    }
    @Override
    public void Nhap(){
        Scanner sc2 = new Scanner(System.in);
        super.Nhap();
        System.out.printf("Nhap tinh cach: ");
        character = sc2.nextLine();
    }
    @Override
    public void Xuat(){
        super.Xuat();
        System.out.println("tinh cach: " + character);
    }
    @Override
    public void tiengKeu(){
        System.out.println("gauuuu gauuuu");
    }
}
	
	
public class bai1buoi6 {
	 public static void main(String[] args) {
	        Dog a = new Dog();
	        a.Nhap();
	        a.Xuat();
	        a.tiengKeu();
	        cat b = new cat(null,null,null,null,null,null);
	        b.Nhap();
	        b.Xuat();
	        b.tiengKeu();
	    }
}

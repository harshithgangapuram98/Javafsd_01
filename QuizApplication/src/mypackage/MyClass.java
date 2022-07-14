package mypackage;
import java.util.Scanner;

public class MyClass {


	public static void main(String[] args) {
		
		//variable declaration
		String name;
		int score=0,ans;
		Scanner obj = new Scanner(System.in);
		
		//read name from user
		System.out.println("Enter your name:");
		name = obj.nextLine();
		
		System.out.println("******************************");
		System.out.println("Hi" +name+ "Welcome to quiz");
		System.out.println("*******************************");
		System.out.println("Q1. Capital of Australia :");
		System.out.println("1.Englant  2. Canberra   3. Moscow");
		System.out.println("Enter your choice:");
		ans = obj.nextInt();
		if (ans==2)
			score= score+20;
		
		
		System.out.println("Q2. Capital of Russia :");
		System.out.println("1.Englant  2. Canberra   3. Moscow");
		System.out.println("Enter your choice:");
		ans = obj.nextInt();
		if (ans==3)
			score= score+20;
		
		System.out.println("Q3. Capital of England :");
		System.out.println("1.London  2. Canberra   3. Moscow");
		System.out.println("Enter your choice:");
		ans = obj.nextInt();
		if (ans==1)
			score= score+20;
		
		System.out.println("Q4. Capital of srilanka :");
		System.out.println("1.Englant  2. Coloumbo   3. Moscow");
		System.out.println("Enter your choice:");
		ans = obj.nextInt();
		if (ans==2)
			score= score+20;
		
		System.out.println("Q5. Capital of Bangladesh :");
		System.out.println("1.dhaka  2. Canberra   3. Moscow");
		System.out.println("Enter your choice:");
		ans = obj.nextInt();
		if (ans==1)
			score= score+20;
		
		if (score>=60)
			System.out.println("Hi"+ name + "you are pass with" +score);
		else
			System.out.println("Sorry better luck next time");
		
	}

}

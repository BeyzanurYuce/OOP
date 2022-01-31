import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Policeman {
	
	public ArrayList <Person> People;
	public static double probability;
		
		public Policeman() {
			People = new ArrayList<Person>();
			probability = 0;
		}
		public void addPerson(Person p){
			People.add(p);
		}
		
		
	public static void main(String[] args) {
		
		int sum =0, fine;
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose One option");
		System.out.println("(1) Go out");
		System.out.println("(2) Terminate");
		int option = sc.nextInt();
		System.out.println("Enter the probability of going out");
		probability = sc.nextDouble();
		int age = (int) (Math.random()*100);
		double random = (Math.random()*100.0);
		int hour = (int)((Math.random()*11)+1);
		String[] arr = {"am","pm"};
		String part = arr[new Random().nextInt(arr.length)];
		Person p1 = new Person(age, hour, part,probability);
		Policeman p = new Policeman();
		
		while(option!=2 && option==1) {
			p1 = new Person(age, hour, part,probability);
			p.addPerson(p1);
			if(age>=0 && age<=20) {
				if(random<=probability) {
					System.out.println("The Person's age is "+age+". And kid wants to go out at "+hour+" "+part);
					if(part.equals("am") && hour>=1 && hour <=12 || part.equals("pm") &&(hour==1 || hour >=6)) {
						fine = 1000;
						sum +=fine;
				}
					
				}
				else
					System.out.println("The Person's age is "+age+". And kid does not want to go out");
			}
			
			else if (age>20 && age<65) {
				if(random<=probability) {
					System.out.println("The Person's age is "+age+". And parent wants to go out at "+hour+" "+part);
					if(part.equals("am") && (hour<5 || hour ==12) || part.equals("pm") && hour >=7) {
						fine = 2000;
						sum +=fine;
					}
				}
				else
					System.out.println("The Person's age is "+age+". And parent does not want to go out");
				
			}
			
			else if (age>=65) {
				if(random<=probability) {
					System.out.println("The Person's age is "+age+". And parent wants to go out at "+hour+" "+part);
					if(part.equals("am") && hour<10 || part.equals("pm") && hour >=2) {
						fine = 3000;
						sum +=fine;
					}
				}
				else
					System.out.println("The Person's age is "+age+". And elderly does not want to go out");
				
			}
			System.out.println("");
			System.out.println("Choose One option");
			System.out.println("(1) Go out");
			System.out.println("(2) Terminate");
			option = sc.nextInt();
			if(option==2)
				break;
			System.out.println("Enter the probability of going out");
			probability = sc.nextDouble();
			age = (int) (Math.random()*100);
			random = (Math.random()*1.0);
			hour = (int)((Math.random()*11)+1);
			part = arr[new Random().nextInt(arr.length)];
			
		}
		
		System.out.println();
		System.out.println("Terminated");
		System.out.println("The treasury cash: "+ sum+ " Turkish Lira");
	}

}

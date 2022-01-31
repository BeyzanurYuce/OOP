import java.util.Scanner;

public class Student_Test {

	public static void main(String[] args) {
		int option;
		Scanner sc = new Scanner(System.in);
		Students s1 = new Students("Ali",24);
		Students s2 = new Students("Ahmet");
		System.out.print("Choose an option\n(1) "+s1.name+"\n(2) "+s2.name+"\n(3) Terminate\n");
		option = sc.nextInt();
		
		while(option!=3) {
			if(option==1) {
				System.out.print("(1) Add Lecture\n(2) List Lectures\n");
				option=sc.nextInt();
				if(option==1) {
					s1.addLectures();
				}
				else if(option==2) {
					s1.listLectures();
				}
			}
			
			else if(option==2) {
				System.out.print("(1) Add Lecture\n(2) List Lectures\n");
				option=sc.nextInt();
				if(option==1) {
					s2.addLectures();
				}
				else if(option==2) {
					s2.listLectures();
				}
			}
			
			else if(option==3)
				break;
			System.out.print("Choose an option\n(1) "+s1.name+"\n(2) "+s2.name+"\n(3) Terminate\n");
			option = sc.nextInt();
		}
		System.out.println("Terminated");

	}

}

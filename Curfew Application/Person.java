import java.util.Random;
import java.util.Scanner;

public  class Person implements Lockdown {
	protected String name;
	protected String lastName;
	protected static int age;
	private String HEScode;
	public static Scanner sc = new Scanner(System.in);

	public Person(int age, String name, String lastName, String HEScode) {
		this.age=age;
		this.name =name;
		this.lastName = lastName;
		this.HEScode = HEScode;

	}
	

	public Person(int age2, int hour, String part, double probability) {
		// TODO Auto-generated constructor stub
	}


	public void getInfos() {}
	public String getHEScode() {
		String chars = "ABCDEFGHIJKLMNOPRSTUVWXYZ";
		Random rnd = new Random();
		char ch1 = chars.charAt(rnd.nextInt(chars.length()));
		char ch2 = chars.charAt(rnd.nextInt(chars.length()));
		int n1 = rnd.nextInt( 9- 0 + 1) + 0;
		int n2 = rnd.nextInt( 9- 0 + 1) + 0;
		int n3 = rnd.nextInt( 9- 0 + 1) + 0;
		int n4 = rnd.nextInt( 9- 0 + 1) + 0;
		int n5 = rnd.nextInt( 9- 0 + 1) + 0;
		int n6 = rnd.nextInt( 9- 0 + 1) + 0;
		int n7 = rnd.nextInt( 9- 0 + 1) + 0;
		int n8 = rnd.nextInt( 9- 0 + 1) + 0;
		return(ch1+""+n1+""+ch2+""+n2+" - "+n3+""+n4+""+n5+""+n6+" - " +n7+""+n8);
	}
	
	@Override
	public void showFreeHours() {}

	
}

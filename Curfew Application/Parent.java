
public class Parent extends Person{
	private int  numOfKids;
	private String[] kids = new String[numOfKids];
	
	public Parent(String name, String lastName, int age, String HEScode, String[] kids, int numOfKids) {
		super(age, name, lastName, HEScode);
		this.kids = kids;
		this.numOfKids = numOfKids;
	}
	
	public void getInfos() {
		int gCount=0;
		int bCount=0;
		
			System.out.println("Please tell us how many kids the parent has");
			numOfKids = Person.sc.nextInt();
			Kids[] kids = new Kids[numOfKids];
			
			System.out.println("Please enter name, last name and gender information of the parents for "+numOfKids+" kids");
			String gender ="";
			
			for(int i = 1; i<=numOfKids; i++) {
				System.out.println("Please enter name, last name and gender information of the parents for "+i+"th kid");
				
				
				kids[i-1] = new Kids(age,name, lastName, gender);
				kids[i-1].name = Person.sc.next();
				kids[i-1].lastName = Person.sc.next();
				kids[i-1].age = Person.sc.nextInt();
				kids[i-1].gender = Person.sc.next();
	
				
				if(kids[i-1].gender.equals("Female") || kids[i-1].gender.equals("FEMALE")|| kids[i-1].gender.equals("female")) 
					gCount++;
				else if(kids[i-1].gender.equals("Male") || kids[i-1].gender.equals("MALE")|| kids[i-1].gender.equals("male")) 
					bCount++;
			}
			System.out.println("Parent's HES code: " + getHEScode());
			System.out.println("The parent has "+ gCount+" daughters and " + bCount+" sons");
			 
			 
		}
	public void showFreeHours() {
		System.out.println("People will be able to go out between 5 am and 7 pm.");
		
	}
}



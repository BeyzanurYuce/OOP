import java.util.Random;

public class Kids extends Person {
	String gender;
	public Kids(int age, String name, String lastName, String HEScode) {
		super( age, name, lastName, HEScode);
		this.gender = gender;
	}
	
	public void getInfos() {
		
			System.out.println("Please enter the kid's name,last name and gender as Female or Male");
			 name = Person.sc.next();
			 lastName = Person.sc.next();
			 gender = Person.sc.next(); 
			 if(gender.equals("Male")|| gender.equals("MALE") || gender.equals("male"))
				 System.out.println(name+" "+lastName+ " is a "+gender.toLowerCase()+" Kid and HIS Hes code: "+getHEScode());
			 else if(gender.equals("Female")|| gender.equals("FEMALE") || gender.equals("female"))
				 System.out.println(name+" "+lastName+ " is a "+gender.toLowerCase()+" Kid and HER Hes code: "+getHEScode());
		}
	
	
	public void showFreeHours() {
		
		System.out.println("People aged 20 and under will be able to go out between 2 pm and 6 pm.");
		
		}
}

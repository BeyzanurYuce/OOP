
public class Elderly extends Person{
private boolean isVaccinated;
	
	public Elderly(String name, String lastName, int age, String HEScode, boolean isVaccinated) {
		super(age,  name, lastName, HEScode);
		this.isVaccinated = isVaccinated;
		
	}
	public void getInfos() {
		
		System.out.println("Please enter elderly person's name and last name");
		name = Person.sc.next();
		lastName = Person.sc.next(); 
		System.out.println("The person's HES code: "+getHEScode());
				 
	}
	
	public void showFreeHours() {
		System.out.println("People aged 65 and over will be able to go out between 10 am and 2 pm.");
		
	}
}

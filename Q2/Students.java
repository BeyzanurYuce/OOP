import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Students {

	String name;
	int max_credit=33, totalCredit=0, remainingCredit=0;
	Lectures[] lectureList = new Lectures[10];
	ArrayList<Lectures> lc = new ArrayList<Lectures>();
	
	public Students(String name, int max_credit) {
		this.name = name;
		this.max_credit = max_credit;
	}
	
	public Students(String name) {
		this.name=name;
		this.max_credit = 33;
	}
	
	public void addLectures() {
		Lectures l = new Lectures("NNN",0);
		
		String Name=l.Name;
		int credit = l.credit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the lecture:");
		l.Name = sc.nextLine();
		System.out.println("Enter the credit of the lecture:");
		l.credit = sc.nextInt();
		if(l.credit<0) {
			l.credit = 0;
		}
	lc.add(l);
	for(int i=0; i<lc.size();i++) {
		lectureList[i] = lc.get(i);
	}
	}
	
	public void listLectures() {
		Lectures l = new Lectures("NNN",0);
		for(int i=0; i<lc.size(); i++) {
			totalCredit += lc.get(i).credit;
			remainingCredit = max_credit-totalCredit;
			System.out.print((i+1)+" "+lc.get(i).Name+", "+lc.get(i).credit+"\n");
		}

		if(remainingCredit<0) {
			remainingCredit=0;
		}
		System.out.println("Total credit: "+totalCredit);
		System.out.println("Remaining credit: "+remainingCredit);
	}

}

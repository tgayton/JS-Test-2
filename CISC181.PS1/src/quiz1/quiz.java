package quiz1;

import java.util.Scanner;

public class quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Number of Completions");
		double comp = input.nextDouble();
		System.out.println("Number of passing attempts");
		double att = input.nextDouble();
		System.out.println("Passing yards");
		double yds = input.nextDouble();
		System.out.println("Touchdown passes");
		double td = input.nextDouble();
		System.out.println("Interceptions");
		double inte = input.nextDouble();
		double a = ((comp/att-.3)*5);
		double b = ((yds/att-3)*.25);
		double c = ((td/att)*20);
		double d = (2.375-((inte/att)*25));
		double PasserRating = ((a+b+c+d)/6)*100;
		System.out.println(PasserRating);
	}

}

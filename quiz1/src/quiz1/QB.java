package quiz1;
import java.util.Scanner;
public class QB {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter total amount of touch down");
		double TD = input.nextDouble();
		
		System.out.println("Enter total amount of yards");
		double yards = input.nextDouble();
		
		System.out.println("Enter total amount of interception");
		double INT = input.nextDouble();
		
		System.out.println("Enter total amount of completions");
		double comp = input.nextDouble();
		
		System.out.println("Enter total amount of passes attempted");
		double ATT = input.nextDouble();
		
		double a = ((comp/ATT) - .3)*5;
		double b = ((yards/ATT)-3)*.25;
		double c = (TD/ATT)*20;
		double d = 2.375 - ((INT/ATT)*25);
		
		if(a>2.375)
			a = 2.375;
		if(b>2.375)
			b = 2.375;
		if(c>2.375)
			c = 2.375;
		if(d>2.375)
			d = 2.375;
		if(a<0)
			a = 0;
		if(b<0)
			b = 0;
		if(c<0)
			c = 0;
		if(d<0)
			d = 0;
		double PR = ((a+b+c+d)/6)*100;
		System.out.printf("The QB rating is %.2f ", PR);
		input.close();
}
}
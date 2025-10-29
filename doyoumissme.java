import java.util.Scanner;

public class BabyLance{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Do I miss Rain? (true/false)");
	boolean imiss = input.nextBoolean();
	
	System.out.print("Should she skip 1 training session? (true/false)");
	boolean rest = input.nextBoolean();
	
	if (imiss && rest){
		System.out.print("yeyyyy, i miss you more hehi");
	}
	else if (!imiss && !rest){
		System.out.print("awww, you dont love me anymore");
	}
	else if (imiss && !rest){
		System.out.print("awwwpo");
	}
		
	else{
		System.out.print("*****Invalid po baby*****");
	}
	
	
		
			input.close();	
	}
}
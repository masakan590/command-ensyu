import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		double weight = 0;
		double weight2 = 0;
		double height = 0;
		double height2 = 0;
		double answer = 0;
		double answer2 = 0;
		Scanner sc = new Scanner(System.in);
		answer = weight/(height*height);
		answer2 = weight2/(height2*height2);
		System.out.println(String.format("%.2f",answer));
		System.out.println(String.format("%.2f",answer2));
		}
}
				

import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		double weight = 0;
		double height = 0;
		double answer = 0;
		Scanner sc = new Scanner(System.in);
		answer = weight/(height*height);
		System.out.println(String.format("%.2f",answer));
		}
}
				

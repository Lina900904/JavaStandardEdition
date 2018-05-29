import java.util.Scanner;
public class Hello{
	public static void main(String[] args){
		System.out.print("이름머야[    ]");
		Scanner scanner = new Scanner(System.in);
		String neme = scanner.next();
		System.out.print(neme);
	}
}
import java.util.Scanner;
public class RPSGame{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("A: ����R,����S,��P �� �Է��غ�");
		String a = scan.next();

		System.out.println("B: ����R,����S,��P �� �Է��غ�");
		String b = scan.next();


		String result ="";
	
		
		if((a.equals("R") && b.equals("R")) || (a.equals("P") && b.equals("P")) || (a.equals("S") && b.equals("S"))){
			result="���";
		}else if((a.equals("R") && b.equals("P")) || (a.equals("P") && b.equals("S")) || (a.equals("S") && b.equals("R"))){
			result="A �̱�";
		}else {
			result="B�̱�";
		}


		System.out.println(result);
	}
}

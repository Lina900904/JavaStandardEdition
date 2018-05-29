
import java.util.Scanner;
public class Calc03{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("첫번째 번호를 입력하세요");
		 int num1 = scan.nextInt();
		System.out.println("Enter OPCODE");

		System.out.println("두번째 번호를 입력하세요");

		  int num2 = scan.nextInt();
		   

		  System.out.println("입력된값 : " + num1 +"," + num2);
		
		  int num3 = 0;


		  String op="";

		 if(op.equals("+")){
		  	num3 = num1 + num2;
		  
		
		 }else if(op.equals("-")){
		 	num3 = num1 - num2;
		

		 }else if(op.equals("*")){
		 	num3 = num1 * num2;
		  
		 }else if(op.equals("%")){
		 	num3 = num1 % num2;

	   	 }else{
	   	 	num3 = num1 / num2;
	   	 	op="/";
	   	}
		   System.out.println(num1 + op + num2 +"=" +num3);
		
	}
}



import java.util.Scanner;
public class Calc4{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("ù��° ��ȣ�� �Է��ϼ���");
		 int num1 = scan.nextInt();
		System.out.println("Enter OPCODE");

		System.out.println("�ι�° ��ȣ�� �Է��ϼ���");

		  int num2 = scan.nextInt();
		 
		 System.out.println("�����ڸ� �Է��ϼ���");  
		  String op = scan.next();

		
		  int num3 = 0;
		  String result = "";
		  String sp = num1 + op + num2 +"=" +num3;

		  switch(op){
		  	case "+" : num3 = num1 + num2; break;
		  	case "-" : num3 = num1 - num2; break;
		  	case "*" : num3 = num1 * num2; break;
		  	case "%" : num3 = num1 % num2; break;
		  	case "/" : num3 = num1 / num2; break;
		  	default : result="�߸��� ������"; break;  

		  }
		   if((result=="�߸��� ������")){
 				System.out.println(result);
		   
		   }else{
		   System.out.println(sp);

		   }
		  

			
	}
}


import java.util.Scanner;
 public class RPSGame2{
 public static void main(String[] args){

 	Scanner scan = new Scanner(System.in);

 	System.out.println("A�� �ָ�R,����S,��P�� �Է��ϼ���");
 		String a = scan.next();

 	System.out.println("B�� �ָ�R,����S,��P�� �Է��ϼ���");
 		String b= scan.next();

 	String result = "";


 	
 	if((a.equals("R") && b.equals("R") || (a.equals("S") && b.equals("S") || (a.equals("P") && b.equals("P"))){
 		result = "���";
 	}else if((a.equals("R") && b.equals("S") || (a.equals("S") && b.equals("P") || (a.equals("P") && b.equals("S"))){
 		result = "A�̱�";
 	}else{
 		result = "B�̱�";
 	}



System.out.println(result);
 }
 }
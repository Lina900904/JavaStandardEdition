import java.util.Scanner;
 public class RPSGame2{
 public static void main(String[] args){

 	Scanner scan = new Scanner(System.in);

 	System.out.println("A의 주먹R,가위S,보P를 입력하세요");
 		String a = scan.next();

 	System.out.println("B의 주먹R,가위S,보P를 입력하세요");
 		String b= scan.next();

 	String result = "";


 	
 	if((a.equals("R") && b.equals("R") || (a.equals("S") && b.equals("S") || (a.equals("P") && b.equals("P"))){
 		result = "비김";
 	}else if((a.equals("R") && b.equals("S") || (a.equals("S") && b.equals("P") || (a.equals("P") && b.equals("S"))){
 		result = "A이김";
 	}else{
 		result = "B이김";
 	}



System.out.println(result);
 }
 }
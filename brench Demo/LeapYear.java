import java.util.Scanner;
 public class LeapYear{
 	public static void main(String[] args){
 		Scanner scan = new Scanner(System.in);

 		System.out.println("������ �Է��ϼ���");
 			int year = scan.nextInt();

 		 	String result = "";

 		 	if(year/4 ==0){
 		 		result = "����";
 		 	}else if((year/4 ==0) && (year/100 == 0)){
 		 		result = "���";
 		 	}else{
 		 		result = "����";
 		 	}



 			System.out.println(result);
 	}
 }
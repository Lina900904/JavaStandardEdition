import java.util.Scanner;
 public class CheckGender{
 	public static void main(String[] args){
 		Scanner scan = new Scanner(System.in);

 		 			
 		
 		System.out.println("�̸� �Է�");
 			String neme = scan.next();

 		System.out.println("�ֹι�ȣ �Է�");
 			String ssn = scan.next();
 			char ch = ssn.charAt(7);

 			String gender = "";
 		
 		switch(ch){
 			case '1': 
 			case '3': gender = "��";break;
 			case '2':
 			case '4': gender = "��";break;
 			case '5': 
 			case '6': gender = "�ܱ���";break;
 			default : gender ="";
 		}
 		if(gender == ""){
 			System.out.println("�ٽ� �Է��ϼ���");

 		}else{
 			System.out.println(neme + ssn + gender);
 		}
 		

 	}
 }
import java.util.Scanner;
 public class GradReport2{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("�̸�");
			String name = scan.next();
		System.out.println("��������");
			int language = scan.nextInt();
		System.out.println("��������");
		  	int english = scan.nextInt();
		System.out.println("��������");
			int meth = scan.nextInt();

			int a = 3;
			int ever = (language + english + meth) /a;

			

			
			int b= ever/10; 
			String result = "";

			switch(b){
				case 9: result = "90�� �̻� A";break;
				case 8: result = "80�� �̻� B" ;break;
				case 7: result = "70�� �̻� C" ;break;
				case 6: result = "60�� �̻� D" ;break;
				case 5: result = "50�� �̻� E";break;
				default : result = "";
			}
			if(result == ""){
				System.out.println("F");
			}else{
				System.out.println( name +"[���]"+ ever + "[����]" + result);
			}

			

        


}
}


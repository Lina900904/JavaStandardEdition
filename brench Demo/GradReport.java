import java.util.Scanner;
 public class GradReport{
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

			String result= "";
			
        	
			

			if(ever>=90){
				result = "90�� �̻� A";
			}else if(ever>=80){
				result = "80�� �̻� B";
			}else if(ever>=70){
				result = "70�� �̻� C";
			}else if(ever>=60){
				result = "60�� �̻� D";
			}else if(ever>=50){
				result = "60�� �̻� F";
			}else{
				result = "50�� ���� D";
			}

			System.out.println( name +"[���]"+ ever + "[����]" + result);


	/*	if(average>=90){
				System.out.println( name +"[���]"+ avera + "[����]" + "A" );
			}else if(average>=80){
				System.out.println( name +"[���]"+ avera + "[����]" + "B" );
			}else if(average>=70){
				System.out.println( name +"[���]"+ avera + "[����]" + "C" );
			}else if(average>=60){
				System.out.println( name +"[���]"+ avera + "[����]" + "D" );
			}else if(average>=50){
				System.out.println( name +"[���]"+ avera + "[����]" + "E" );
			}else if{
				System.out.println( name +"[���]"+ avera + "[����]" + "F" );
			}				

			if(((100>language && 0<language)) || (100>english && 0<english) || (100>meth && 0<meth)){
				System.out.println("�߸��� ���� �Է�");
			}
	
			*/
}
}


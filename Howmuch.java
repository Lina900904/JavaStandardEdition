import java.util.Scanner;
public class Howmuch{
	public static void main(String[] args){

	Scanner result = new Scanner(System.in);

	System.out.println("�󸶿���");
		int price = result.nextInt();
	System.out.println( price + "�� �Դϴ�.");
	System.out.println("� �帱���");
		 int amount = result.nextInt();
	System.out.println( amount + "�� �ּ���");
		int percent = 0;
		int sum = amount * price;
	System.out.println("�� �ݾ���" + sum +  "���Դϴ�");
	System.out.println("��ο� ����ּ���");
		
	System.out.println("�� �ۼ�Ʈ DC�� �帱���");
		 int discount = result.nextInt();
		 String b = "���Ⱦƿ�";

		 int a = 100;
		 if (discount<=10){
		 	b = (sum*(a-discount)/a + "�Դϴ�");
		
		 }
		 System.out.println(b);

}
}




	





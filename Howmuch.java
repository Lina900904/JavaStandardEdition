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

		 int a = 100;
		 if (discount<=10){
		 	System.out.println((price*(1-discount/a) + "�Դϴ�"));
		 }else{
		 	System.out.println("�� �Ⱦƿ�");
		 }

}
}




	





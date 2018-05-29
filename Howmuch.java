import java.util.Scanner;
public class Howmuch{
	public static void main(String[] args){

	Scanner result = new Scanner(System.in);

	System.out.println("얼마에요");
		int price = result.nextInt();
	System.out.println( price + "원 입니다.");
	System.out.println("몇개 드릴까요");
		 int amount = result.nextInt();
	System.out.println( amount + "개 주세요");
		int percent = 0;
		int sum = amount * price;
	System.out.println("총 금액은" + sum +  "원입니다");
	System.out.println("비싸요 깍아주세요");
	System.out.println("몇 퍼센트 DC해 드릴까요");
		 int discount = result.nextInt();

		 int a = 100;
		 if (discount<=10){
		 	System.out.println((price*(1-discount/a) + "입니다"));
		 }else{
		 	System.out.println("안 팔아요");
		 }

}
}




	





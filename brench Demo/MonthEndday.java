import java.util.Scanner;
public class MonthEndday{
 public static void main(String[] args){
 	Scanner scan = new Scanner(System.in);

 	System.out.println("월을 입력하세요");
 		int m = scan.nextInt();

 	int ans = 0;


 	switch(m){
 		case 1 : ans = 31;break;
 		case 2 : ans = 28;break;
 		case 3 : ans = 31;break;
 		case 4 : ans = 30;break;
 		case 5 : ans = 31;break;
 		case 6 : ans = 30;break;
 		case 7 : ans = 31;break;
 		case 8 : ans = 31;break;
 		case 9 : ans = 30;break;
 		case 10 : ans = 31;break;
 		case 11 : ans = 30;break;
 		case 12 : ans = 31;break;
 	}

 		System.out.println("말일이"+m+"월"+ans+"일 입니다");

 }
}
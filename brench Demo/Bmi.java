import java.util.Scanner;
 public class Bmi{
 	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

 		System.out.println("몸무게를 입력하세요");
 	 		double kg = scan.nextDouble();
 	 	System.out.println("키를 입력하세요");
 	 		int m = scan.nextInt();

 		double dm =m/100;
 		String result = " ";
 		double bmi = (kg / (dm*dm));

 		//BMI = 몸무게 / 키² 로서, 여기서 몸무게는 kg, 키는 m 단위이다. 
 		// 예를 들자면, 몸무게 55kg에 키 1.68m인 사람의 BMI는 55kg/(1.68m)^2 = 19.4이다.

 		if(bmi>=18.5 && bmi<23.0){
 			result = "정상";
 		}else if(bmi>=23 && bmi<25){
 			result = "비만 전단계";
 		}else if(bmi>=25 && bmi<30){
 			result = "비만";
 		}else if(bmi>=30 && bmi<35){
 			result = "1단계 비만";
 		}else if(bmi>=35){
 			result = "3단계 비만";
 		}else{
 			result = "저체중";
 		}

 		System.out.println(result);
 	}
 }
 	
 		


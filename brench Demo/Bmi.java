import java.util.Scanner;
 public class Bmi{
 	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

 		System.out.println("�����Ը� �Է��ϼ���");
 	 		double kg = scan.nextDouble();
 	 	System.out.println("Ű�� �Է��ϼ���");
 	 		int m = scan.nextInt();

 		double dm =m/100;
 		String result = " ";
 		double bmi = (kg / (dm*dm));

 		//BMI = ������ / Ű�� �μ�, ���⼭ �����Դ� kg, Ű�� m �����̴�. 
 		// ���� ���ڸ�, ������ 55kg�� Ű 1.68m�� ����� BMI�� 55kg/(1.68m)^2 = 19.4�̴�.

 		if(bmi>=18.5 && bmi<23.0){
 			result = "����";
 		}else if(bmi>=23 && bmi<25){
 			result = "�� ���ܰ�";
 		}else if(bmi>=25 && bmi<30){
 			result = "��";
 		}else if(bmi>=30 && bmi<35){
 			result = "1�ܰ� ��";
 		}else if(bmi>=35){
 			result = "3�ܰ� ��";
 		}else{
 			result = "��ü��";
 		}

 		System.out.println(result);
 	}
 }
 	
 		


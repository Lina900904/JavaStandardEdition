import java.util.Scanner;
 public class GradReport{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("이름");
			String name = scan.next();
		System.out.println("국어점수");
			int language = scan.nextInt();
		System.out.println("영어점수");
		  	int english = scan.nextInt();
		System.out.println("수학점수");
			int meth = scan.nextInt();

			int a = 3;
			int ever = (language + english + meth) /a;

			String result= "";
			
        	
			

			if(ever>=90){
				result = "90점 이상 A";
			}else if(ever>=80){
				result = "80점 이상 B";
			}else if(ever>=70){
				result = "70점 이상 C";
			}else if(ever>=60){
				result = "60점 이상 D";
			}else if(ever>=50){
				result = "60점 이상 F";
			}else{
				result = "50점 이하 D";
			}

			System.out.println( name +"[평균]"+ ever + "[학점]" + result);


	/*	if(average>=90){
				System.out.println( name +"[평균]"+ avera + "[학점]" + "A" );
			}else if(average>=80){
				System.out.println( name +"[평균]"+ avera + "[학점]" + "B" );
			}else if(average>=70){
				System.out.println( name +"[평균]"+ avera + "[학점]" + "C" );
			}else if(average>=60){
				System.out.println( name +"[평균]"+ avera + "[학점]" + "D" );
			}else if(average>=50){
				System.out.println( name +"[평균]"+ avera + "[학점]" + "E" );
			}else if{
				System.out.println( name +"[평균]"+ avera + "[학점]" + "F" );
			}				

			if(((100>language && 0<language)) || (100>english && 0<english) || (100>meth && 0<meth)){
				System.out.println("잘못된 숫자 입력");
			}
	
			*/
}
}


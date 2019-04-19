package day0419;

// java Add 4 2
//  예외처리를 하고 예외가 발생하거나 그렇지 않거나 반드시 "작업종료"를 출력하도록 합니다.
public class Add {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
		
			int r = a+b;
			System.out.println("결과:"+r);
		}catch(Exception e) {
			System.out.println("두개의 수를 확인하세요!");
		}
		finally {
			System.out.println("작업종료");
		}
	}
}



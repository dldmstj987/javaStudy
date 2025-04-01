package string;

public class StrungMethod {

	public static void main(String[] args) {
		String a1 = ""; //값이 없는 문자열 객체 생성
		/* *
		 * length(): 문자열의 길이(문자의 수)
		 * (ex)"홍 길 동" => 문자 수 5개(띄워쓰기까지)
		 * 
		 */
		int length = a1.length();
		System.out.println(length);
		System.out.println(a1.length()); //0으로 반환 왜? 값을 설정하지 않음.
		System.out.println("".length());//0으로 반환
		
		//String 객체 생성 방법 2가지
		String str1 = "문자열 상수"; //"문자열 상수"로 객체 생성 -> "공유 상수 풀"에 등록 
		String str2 = "문자열 상수";
		
		System.out.println(str1 + "," + str2);
		
		str2 = str2.concat("는 공유 상수 풀에 등록되어있다."); //"문자열 상수" + "는 공유 상수 풀에 등록"
		
		System.out.println(str1 + "," + str2);
	}

}

package java_chapter11_m501;


public class LiabraryTest01_m5 {
	public static void main(String[] args) {
	
		Member member = new Member();
		member.name = "홍길동";
		member.age =27;
		member.memberID = "tiger";
		member.memberPw = "12345";
		
		String str = member.toString();
		
		System.out.println(str);
		
		String name1 ="홍길동";
		String name2 ="홍길동";
		String name3 =new String ("홍길동");
		
		if(name1==name2) {
			System.out.println("두문자열은 같습니다!");
		}else {
			System.out.println("두문자열은 다릅니다!");
		}
		if(name1==name3) {
			System.out.println("두문자열은 같습니다!");
		}else {
			System.out.println("두문자열은 다릅니다!");
		}
		
		String name4 ="korea";
		//String name5 = name4.toUpperCase("korea");
		System.out.println(name4.length());
	}

}

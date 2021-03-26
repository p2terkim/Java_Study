package i_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		
		/*
정규 표현식 : 문자열의 패턴을 검사하는 표현식

^		뒷 문자로 시작
$		앞 문자로 종료
.		임의의 문자(줄바꿈 제외)
*		앞의 문자가 0개 이상
+		앞의 문자가 1개이상
?		앞의 문자가 없거나 1개
[]		문자의 집합이나 범위([a-z] :a부터 zRkwl, [^a-z] :a부터 z가 아닌 것)
{} 		앞문자의 개수({2} : 2개 {2,4} :2개이상 4개 이하)
() 		그룹화
| 		OR연산
\s 		공백, 탭, 줄바꿈
\S 		공백, 탭, 줄바꿈이 아닌 문자
\w	 	알파벳이나 숫자
\W 		알파벳이나 숫자가 아닌 문자
\d		숫자
\D		숫자가 아닌 문자
(?!)	뒷 문자의 대소문자 구분 안함
\ 		정규표현식에서 사용되는 특수문자 표현
		 */
		
//		String str = "abc123AB"; //알파벳 3개 + 숫자 3개
//		String regex = "[a-z]{3}[0-9]{1,3}";//알파벳 3개 + 숫자1~3개
//		String regex = "[a-z0-9]+";
//		String regex = "\\w*";//'\'는 탈출문자이다. '\'을 문자열 안에 넣고 싶으면 두개를 적는다.	 
//		String regex = ".*"; //줄바꿈을 제외한 어떤 문자도 상관없다.
		
		
//		Pattern p = Pattern.compile(regex);
//		Matcher m = p.matcher(str);
//		System.out.println(m.matches());
//		
		
		
		
		//아이디, 전화번호, 이메일주소의 유효성을 검사하는 정규표현식을 만들어주세요
		//아이디 : 5~20자의 영문 소문자, 숫자와 특수기호(_),(-)만 사용 가능합니다.(네이버아이디기준)
		//전화번호 :8~16자 영문 대 소문자, 숫자, 특수문자를 사용하세요.
		//이메일 주소 : 아이디@알파벳이나 숫자 무제한.com
		
//		String regexID = "[a-z0-9\\_\\-]{5,20}";
//		String regexPN = "[0-9]{4}\\-[0-9]{4}";
//		String regexEMail = "^[a-z0-9\\_\\-]{5,20}\\@\\w*..com$";
//		
//		
//		
//		String ID = "adas123";
//		String PN = "1321-4123";
//		String EMail = "abc123@navercom";
//		
//		Pattern id1 = Pattern.compile(regexID);
//		Matcher id2 = id1.matcher(ID);
//		System.out.println(id2.matches());
//		
//		Pattern pn1 = Pattern.compile(regexPN);
//		Matcher pn2 = pn1.matcher(PN);
//		System.out.println(pn2.matches());
//		
//		Pattern em1 = Pattern.compile(regexEMail);
//		Matcher em2 = em1.matcher(EMail);
//		System.out.println(em2.matches());

		String str = "abc123AB"; //알파벳 3개 + 숫자 3개	 
		String regex = ".*";	 //줄바꿈을 제외한 어떤 문자도 상관없다.
		
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		System.out.println(m.matches());
		
		
		
		
		
		
		
		
		
		/*		
		[a-z0-9_-]{5,20}
		^0\\d{1,3}-\\d{3,4}-\\d{4}
		[a-z0-9_-]{5,20}@[a-zA-Z]+\\.(?!)(com|net|org|([a-z]{2}\\.kr))$
		*/
		
	}

}






































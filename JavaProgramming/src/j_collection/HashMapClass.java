package j_collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		/*
		Object put(Object key, Object value) : 지정된 키와 값을 저장한다.
		Object remove(Object key) : 지정된 키로 지정된  값을 제거한다.
		Object get(Object key) : 지정된 키의 값(없으면 null)을 반환한다.
		Set keySet() : 저장된 모든 키를 Set으로 반환한다.
		*/
		
HashMap<String, Object> map = new HashMap<>();//제네릭스도 두 개를 정해줘야한다. *Object : 아무타입이나 가능

//Object put(Object key, Object value) : 지정된 키와 값을 저장한다.

map.put("a", 10); //값(value) : 10 을 a라는 키(key)로 저장
map.put("b", "홍길동"); //값(value) : 홍길동 을 a라는 키(key)로 저장
map.put("c", new Date()); //값(value) : new Date() 을 a라는 키(key)로 저장

System.out.println(map); //결과 : {b=홍길동, c=Thu Mar 18 10:16:24 KST 2021, a=10}

map.put("b", "이순신");

System.out.println(map); //결과 : {b=이순신, c=Thu Mar 18 10:16:24 KST 2021, a=10}

//Object remove(Object key) : 지정된 키로 지정된  값을 제거한다.
map.remove("a");

System.out.println(map); //결과 : {b=이순신, c=Thu Mar 18 10:16:24 KST 2021}

//Object get(Object key) : 지정된 키의 값(없으면 null)을 반환한다.
Object value = map.get("b");
System.out.println(value); //결과 : 이순신

//String 타입으로 반환
String value2 = (String)map.get("b");

//Set keySet() : 저장된 모든 키를 Set으로 반환한다.
Set<String> keys = map.keySet();

//Set은 값을 꺼낼 수 있는 수단이 없다.
//향상된 for문을 사용하기

for(String key : keys){ //keys의 값 전부를 꺼낼 때 까지 반복한다.
	System.out.println(key + " : " + map.get(key));
}
//결과
//b : 이순신
//c : Thu Mar 18 10:29:34 KST 2021


//회원 테이블
//아이디, 비밀번호, 이름, 전화번호
HashMap<String, String> user = new HashMap<>();

user.put("id", "admin");
user.put("password", "admin123");
user.put("mane", "관리자");
user.put("tel", "010-1234-1234");

System.out.println(user);
//결과 : {id=admin, mane=관리자, tel=010-1234-1234, password=admin123}

//연습1.회원 1명의 데이터가 담긴 HashMap을 하나 더 만들어주세요

HashMap<String, String> user2 = new HashMap<>();

user2.put("id", "test");
user2.put("password", "java");
user2.put("name", "홍길동");
user2.put("tel", "010-1111-1111");

System.out.println(user2);

//ArrayList에 HachMap 타입을 저장하면 테이블 형태의 데이터를 표현할 수 있다.
ArrayList<HashMap<String, String>> table = new ArrayList<>();
table.add(user);
table.add(user2);



HashMap<String, String> A = new HashMap<>();

A.put("SUBJECT_CODE", "H001");
A.put("SUBJECT_NM", "호텔관광경영학과");
A.put("UNIV_CODE", "W02");

HashMap<String, String> B = new HashMap<>();
B.put("SUBJECT_CODE", "H003");
B.put("SUBJECT_NM", "철도경영학과");
B.put("UNIV_CODE", "W03");
HashMap<String, String> C = new HashMap<>();
C.put("SUBJECT_CODE", "H004");
C.put("SUBJECT_NM", "간호학과");
C.put("UNIV_CODE", "W05");

HashMap<String, String> D = new HashMap<>();
D.put("SUBJECT_CODE", "H002");
D.put("SUBJECT_NM", "외식조리학과");
D.put("UNIV_CODE", "W02");


ArrayList<HashMap<String, String>> HAKGWA = new ArrayList<>();
HAKGWA.add(A);
HAKGWA.add(B);
HAKGWA.add(C);
HAKGWA.add(D);

System.out.println(HAKGWA);
System.out.println(HAKGWA.get(0));
		
		
	}

}




































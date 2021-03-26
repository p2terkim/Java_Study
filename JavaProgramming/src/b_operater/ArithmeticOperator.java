package b_operater;

public class ArithmeticOperator {

	public static void main(String[] args) {
		/*
		 * 산술 연산자
		 * - 사칙연산: +, -, *,  /, %(나머지)
		 * - 복합연산자 : +=, -=, *=, /=, %=
		 * - 증감연산자 : ++, --
		*/
		
		int result = 10 + 20 - 30  * 40 / 50 % 60;
		
		//나머지 연산
		result = 10 / 3;
		System.out.println(result); //결과는 2
		
		result = 10 % 3;
		System.out.println(result); //결과는 1

		//5개의 산술연산자를 사용해 5개의 연산을 수행 후 결과를 출력해주세요.
		int result1 = 21 + 3; //결과는 24
		int result22 = 21 - 1; //결과는 20
		int result3 = 3 * 1; //결과는 3
		int result4 = 21 / 4; //결과는 5
		int result5 = 21 % 4; //결과는 1
		
		System.out.println(result1);
		System.out.println(result22);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		
		//복합연산자
		//변수에 저장되어 있는 값에 연산을 수행할 때 연산자와 대입연산자를 결합해 사용할 수 있다.
		result = result + 3;
		result += 3;
		
		result = result - 5;
		result -= 5;
		
		result = result * 2;
		result *= 2;
		
		//아래의 문장을 복합연산자를 사용한 문장으로 만들어 주세요.
		//result = result + 10;
		result += 10;
		
		//result = result - 2 * 3;
		result -= 2 * 3;
								
		//result = result % 5;
		result %= 5;
		
		//증감연산자
		//증가연산자(++) : 변수의 값을 1 증가시킨다.
		//감소연산자(--) : 변수의 값을1 감소시킨다.
		int i = 0;
		
		++i; //전위형 : 변수의 값을 읽어오기 전에 1 증가된다.
		i++; //후위형 : 변수의 값을 읽어온 후에 1 증가된다.
		--i; 
		i--;
		
		i = 0;
		System.out.println("++i = " + ++i);
		i = 0;
		System.out.println("i++ = " + i++);
		System.out.println(i);
		
		//피연산자의 타입이 서로 같아야만 연산이 가능하다.
		int _int = 10;
		double _double = 3.14;
		double result2 = _int + _double; //표현범위가 더 큰 타입으로 형변환된다.
		System.out.println(result2);
		
		
		long _long = 100L;
		_long = _int + _long; //표현범위가 더 큰 타입으로 형변환된다.
//		_int = _int + _long; //표현범위가 더 작은 타입에 저장하므로 컴파일에러
		_int = _int + (int)_long; //표현범위가 더 작은 타입에 저장하므로 컴파일에러
		
		byte _byte = 5;
		short _short = 10;
		_int = _byte + _short; //int(4byte)보다 작은 타입들은 int로 형변환된다. char도 마찬가지
		System.out.println(_int);
		
		char _char = 'a';
		char _char2 = 'b';
		_int = _char + _char2; //결과는 195
		System.out.println(_int);
		
		//오버플로우, 언더플로우
		//표현범위를 벗어나는 값을 표현할 때 발생하는 현상
		byte b = 127; //byte의 표현범위는-128~127인데 127보다 크면 가장 작은값을 반환한다.
		b++;
		System.out.println(b); //결과는 -128
		b--;
		System.out.println(b); //결과는 127
		
		//다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
		//1. 123456 + 654321
		//2. 1번의 결과값  * 123456
		//3. 2번의 결과값 / 123456
		//4. 3번의 결과값 - 654321
		//5. 4번의 결과값 % 123456
		
		long res = 123456 + 654321;
		res *= 123456;
		res /= 123456;
		res -= 654321;
		res %= 123456;
		System.out.println(res);
		
		//3개의 int형 변수를 선언 및 초기화 후 합계와 평균을 구해주세요
		
		int num1 = 15;
		int num2 = 34;
		int num3 = 49;
		
		int sum = num1 + num2 + num3;
//		double avg = sum / 3; //결과는 32.0
//		double avg = (double)sum / 3; //결과는 32.6666
		double avg = sum / 3.0; //결과는 32.6666
				
		System.out.println("sum : " + sum + "avg : " + avg);
		
		//반올림
//		avg = Math.round(avg);
//		System.out.println(avg);
		avg = Math.round(avg * 100) / 100.0;
		System.out.println(avg);
		
		//랜덤
		Math.random(); //0.0 ~ 1.0 미만(0.999999.......)
		int random = (int)(Math.random() * 100) + 1; // 1~100
		System.out.println(random);
	
	}
	
}

package com.kh.javaQ_03_01;

public class Exercise3_1 {
	public static void main(String [] args) {
		int x = 2;
		int y = 5;
		char c = 'A';
		
		System.out.println(1 + x << 33); //  값 : 6
		// 3 << 33 쉬프트 연산자 int는 32bit이기때문에 1번만 쉬프트한다 
		// 3 << 1 은 3에 2의제곱인 2를 곱하는것이기에 3*2 = 6이다.
		System.out.println(y >= 5 || x < 0 && x > 2); // 값 : true
		// ||와 &&중 &&연산자가 우선순위 결국 true || false && false 이므로 true가 나온다.
		System.out.println(y += 10 - x++); // 값 : 13
		// 10 - x++를 y에 +하면 되는 식 10 - x++은 x++이 후위연산자로 8이 나오고 이를 y에 더하면 13
		System.out.println(x+=2); // 값 : 5
		// 이전 x 값에서 x가 3이 되었으므로 3+2 = 5
		System.out.println( !('A' <= c && c <= 'z')); // 값 : false
		// c = 'A'이다 A가 A와 Z 사이에 있으므로 ()안의 값은 true다 
		// 하지만 () 앞에 논리부정연산자인 !가 있어 값은 false가 된다. 
		System.out.println('C' - c); // 값 : 2
		// 연산자가 int보다 작은경우 int로 자동타입변환
		// 유니코드로 67 - 65가 되므로 값은 2다.
		System.out.println('5' - '0'); // 값 : 5
		// '5' = 53, '0' = 48 -> 53 - 48 = 5
		System.out.println(c+1); // 값 : 66
		// c의 값은 'A' = 65 이므로 65 + 1 = 66이 된다.
		System.out.println(++c); // 값 : B
		// 단항 연산자는 형변환X, c+1은 'A'+1이므로 65+1=66이 되고 
		// c는 문자로 출력 되므로 66이 문자로 출력 되어 B가 된다.
		System.out.println(c++); // 값 : B
		// c는 이미 전위연산자로 B가 되었고 후위연산은 다음 연산에 적용 되어 
		// 값은 B가 된다.
		System.out.println(c); // 값 : C
		// 전 C++의 후위 연산자가 이번에 c값에 영향을 미쳐 
		// c의 값은 'B'에서 1이 더해져 'C'가 되고 문자로 출력되어 값은 C이다. 
	}
}
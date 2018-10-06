package i_collection;

import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 정규식
 * @author pc02
 *
 */
public class RegExBasic {
	public static void main(String[] args) {
		/*
		1. 정규식
			- 텍스트 데이터 중에서 원하는 조건과 일치하는 문자열을 찾아내기 위해 사용되는 것.
			-정규식의 구성
			  : Pattern 클래스를 이용하여 정규식을 정의한다.
			  : Matcher클래스를 이용해서 Pattern과 데이터를 비교한다.
			  
			  
		
		
		
		
		 */
		//패턴등록
		//*없을 수도, 무한정 있을 수도 있다.
		Pattern p = Pattern.compile("[a-z]*");
		
		//대상비교
		Matcher m = p.matcher("afdfsdfsewlkj");
		
		System.out.println(m.matches());//형식에 맞으면 true, 틀리면 false
		
		
		/*
		//캐릭터 단위로 잘라 검사
		^	문자열의 시작을 의미
		$	문자열의 종료
		.	임의의 한문자(모든 문자), 단 \는 넣을 수 없다.
		*	문자가 아예 없거나 무한정 있을수도 있다.
		+	앞 문자가 하나이상
		?	앞 문자가 없거나 하나있음
		[]	문자의 집합이나 법위를 나타내며 두 문자 사이는 -로 표현한다
			[]내에서 ^가 선행하여 존재하면 not의 의미를 가진다.
		{}	반복 횟수 또는 범위를 나타낸다
		()	소괄호 안의 문자를 하나의 문자로 인식한다
		|	패턴 안에서 or연산을 수행한다
		\s	공백문자
		\S	공백을 제외한 모든 문자
		\w	알파벳이나 숫자
		\W	알파벳이나 숫자를 제외한 모든 문자
		\d	숫자   [0-9]와 같음
		\D	숫자를 제외한 모든문자
		
		영어소문자로 시작 : ^[a-z]
		영어대문자 : [A-Z]
		반복 : [a-z]{2} 2회 반복
			  [a-z]{2} 2회 이상 반복
			  [a-z]{2,4} 2회이상 4이하 반복
		
		 */
		//1. 영어소문자를 2회내지 3회 반복
		String regEx01 = "[a-z]{2,3}";
		System.out.println(Pattern.matches(regEx01, "ss6"));//(정규식, 텍스트)
		
		//2. 영문자가 3회 반복후 숫자가 한번 이상 반복
		String regEx02 = "[a-zA-Z]{3}[0-9]+";
//		String regEx02 = "[a-zA-Z]{3}\\d+";
		System.out.println(Pattern.matches(regEx02, "sDe146846852"));//(정규식, 텍스트)
		
		//3. 핸드폰번호
		// 숫자3개-숫자4개-숫자4개
		String regEx03 = "\\d{3}-\\d{4}-\\d{4}";
		System.out.println("핸드폰번호 "+Pattern.matches(regEx03, "010-6478-4756"));//(정규식, 텍스트)
		
		//4.핸드폰번호 업그레이드
//		01 016789- 1-9숫자3개 - 숫자4개
		String regEx04 = "^01[016789]{1}-[1-9][0-9]{2,3}-\\d{4}";
		System.out.println("핸드폰번호2 "+Pattern.matches(regEx04, "010-6478-4756"));//(정규식, 텍스트)
		
		//5. 주민번호
		//숫자2자리 0 1-9
		String regEx05 = "\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[0-1])-[1-4][0-9]{6}";
//		String regEx05 = "\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[0-1])-[1-4]\\d{6}";
		System.out.println("주민번호 "+Pattern.matches(regEx05, "931231-2409730"));
		
		//6. 이메일정규식
		/*
		1. 시작은 영문자 이어야 한다.
			특수기호는 -_\. 있을수도 있고 없을수도 있다.
		2. @ 이후에 영대소문자 1~7개가 있고
		3. .이후에 영문자가 2~3개가 온다
		4. .kr이 하나 있을수도 또는 존재하지 않을수도 있다.
		 */
		
		String regEx06 = "";
		
		
		
		
		
		/*
		
		
		
		
		 */
		
		
		String regExx = "[가-힣]+";
		System.out.println("한글 "+Pattern.matches(regExx, "유민지"));
		
		
		String text = "야이 개나리 십장생아...이런 조카신발 같은 경우를 봤나";
		String changeTest = filterText(text);
		
		System.out.println(changeTest);
		
	}

	private static String filterText(String text) {
		Pattern p = Pattern.compile("개나리|십장생|조카신발",Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(text);
		
		StringBuffer sb = new StringBuffer();
		while(m.find()){
			m.appendReplacement(sb, maskWord(m.group()));//m.group() 찾기
		}
		m.appendTail(sb);
		
		return sb.toString();
	}

	private static String maskWord(String group) {
		StringBuffer sb = new StringBuffer();
		char[] ch = group.toCharArray();
		
		for(int i=0 ; i<ch.length ; i++){
			if(i==0){
				sb.append(ch[i]);
			}else{
				sb.append("*");
			}
		}
		return sb.toString();
	}
	

}

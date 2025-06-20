package com.kh.chap01_abstration.run;

import com.kh.chap01_abstration.model.vo.Student;

public class AbstractionRun {

	/*
	 * 1. 객체지향언어 : "객체"를 "지향"하는 언어로 "객체 중심"으로 돌아간다고 생각하면 됨.
	 * 
	 * 2. 객체 : 현실 세계에 독립적으로 존재(목적이 있고 가치가 있고 의미가 있는)하는 모든 것들을 의미(유형, 무형, 개념, ...)
	 * 			현실 세계에서는 객체들간의 상호작용으로 돌아감. (내가 물을 먹는다.)
	 * 
	 * 3. 객체지향 프로그래밍 : 현실 세계의 객체들간의 상호작용
	 * 						프로그래밍을 통해 가상세계로 구현하는 과정 (내가 쇼핑몰에서 로그인을 한다.) 
	 * 
	 * 4. 구현하고자 하는 프로그램의 필요한 객체들을 만들기 위해서 (즉, 생성하기 위해서)
	 * 		: 클래스라는 틀을 먼저 만들어야 함!! (클래스란? 각 객체들의 속성(정보)들을 담아낼 그릇과도 같은 존재)
	 * 		=> 이름, 나이, 주소, 전화 번호 등을 담을 수 있는 그릇
	 * 		>> 어떻게 만들까? => 추상화 + 캡슐화 접목해서 만들어야 함!
	 * 
	 * 5. 추상화 과정
	 * 	1) 내가 구현을 하고자 하는 프로그램 필요한 객체들을 생각해볼 것 => 쇼핑몰 (사용자)
	 * 	2) 그 객체들이 가지는 공통적인 속성, 기능들을 모두 추출 => 이름, 나이, 주소, 전화번호, mbti, 혈액형 ...
	 * 	3) 추출한 것들을 가지고 내가 구현하고자 하는 프록그램의 "실질적인 목적"에 맞춰서 불필요한 속성, 기능들은 제거
	 * 	4) 그렇게 최정적으로 추려진 속성들을 어떤 자료형으로, 어떤 변수명으로 사용할 건지 생각.
	 * 
	 *  ex) 학생 관리 프로그램
	 *  	1) 학생관련객체 (차은우 학생, 장원형 학생, 카리나 학생, ...)
	 *  	2) 공통적인 속성 및 기능들 (이름, 나이, 주소, 전화번호, 키, 몸무기, 달리기속도, 학년, 반, 국어점수, 수학, 영어, 점수, 머리색깔, 발사이즈, 식사, 잠, ...)
	 *  	3) 학생 "인적사항"을 관리하는 프로그램이라고 한다면 : 이름, 나이, 주소, 전화번호, 학년, 반, ...
	 *  	4) 학생 "성적"을 관리하는 프로그램이라고 한다면 : 이름, 학년, 반, 국어점수, 수학점수, 영어점수, ... 
	 *  	5) 학생 "건강"을 관리하는 프로글매이라고 한다면 : 이름, 학년, 반, 키, 몸무게, 달리기 속도, 식사, 숙면, ...
	 *  	
	 *  결국 추려진 게 "이름, 나이, 키" 라는 가정 하에
	 *  
	 *  	6) 이름 : String name;
	 *  		나이 : int age;
	 *  		키 : double height;
	 *  
	 *  6. 위에서 선정된 것들을 가지고 본격적인 프로그래밍을 할건데...
	 *  
	 *  	1) "변수:만을 가지고 프로그래밍을 한다면?
	 *  	
	 *  	* 변수 - 하나의 자료형에 하나의 값만을 보관할 수 있음.
	 *  	
	 *  	차은우라는 학생 객체를 만들어내기 위해서? --> String name1 = "차은우"; int age1 = 20; double height1 = 180,5;
	 *  	장원영라는 학생 객체를 만들어내기 위해서? --> String name2 = "장원영"; int aga2 = 21; double height2 = 160.5;
	 *  	카리나라는 학생 객체를 만들어내기 위해서? --> String name3 = "카리나"; int aga3 = 22; double height2 = 150.5;
	 *  	... 등등의 수백명에 해당하는 학생들을 만들어야 함.
	 * 
	 * 		어떤 문제가 발생? => 수백명의 해당하는 학생들을 만들 때 => 수천 개의 변수가 만들어짐.
	 * 
	 * 		2) "배열"로 프로그래밍을 한다면?
	 * 		
	 * 		* 배열 - 하나의 자료형의 여러개의 값들을 보관할 수 있음.
	 * 
	 * 		학생들의 이름을 보관하는 String[] name = {"차은우", "장원영", "카리나"};
	 * 		학생들의 이름을 보관하는 Int[] age = {20, 21, 22}
	 * 		학생들의 키를 보관하는 double[] height = {180.5, 160.5, 150.5};
	 * 
	 * 		수정 작업 등에, 로직이 매우 불편하다.
	 * 		3칸이면 영원히 3칸이어야 한다.
	 * 		
	 * 		어떤 문제가 발생??
	 * 		=> 기존의 학생 정보를 지워야 할 때 뒤의 정보를 앞으로 땡기는 과정을 진행해야 하는데,
	 * 		잘못땡기면 정보가 틀어진다...
	 * 		=> 새로운 학생 전학오면?
	 * 		배열을 다시 만들어야 함. + 복사해야 함.
	 * 
	 * 		3) 그래서 나온 클래스 개념!! (구조체)
	 * 			
	 * 			* 구조체 - 여러 개의 자료형의 여러 개의 값들을 보관할 수 있음.
	 * 
	 * 			String 값도 보관하고, int 값도 보관하고, double 값도 보관값도 보관할 수 있더록
	 * 			나만의 배열이랑 비슷한 자료형을 만들자!!
	 * 			=> 이게 바로 클래스!!
	 * 
	 * 			Student라는 클래스로 만들 거임! => 객체의 정보를 보관할 그릇과도 같은 이런 클래스들은 => model.vo
	 */
	
	public static void main(String[] args) {
			
		// Student 클래스를 만들었음
		// 학생 객체를 만들어보기
		
		// 자바에서의 객체로 만들기 위해서 new라는 키워드를 통해 Heap 영역에 생성 먼저해야 한다.
		Student cha = new Student();
		// 주소값을 담고 있음!! 참조 자료형이기 때문에
		
		// 여기까지는 Heap 영역에 할당된 공간에는 JVM이 초기값들을 셋팅해놨음!!
		
		// 각 영역에 "직접 접근" 해서 내가 원하는 값 대입ㅇ => public 으로 개방해둠!!
		// 객체들에 접근할 때는 . 을 붙여서 접근!!
		
		cha.name = "차은우";
		cha.age = 20;
		cha.height = 180.5;
		
		System.out.println(cha);					// 해당 객체의 주소값이 나오게 된다.
		System.out.println(cha.name + "님의 나이는 " + cha.age + "살이고, 키는 " + cha.height + "cm 입니다.");
		// 직접 접근을 통해서 값을 가져온 것이다.
		
		// 장원영 학생 객체 만들어보기
		// 출력
		
		Student a = new Student();
		
		
		a.name = "장원영";
		a.age = 22;
		a.height = 170;
		System.out.println(a);
		System.out.println(a.name + "님의 나이는 " + a.age + "살이고, 키는 " + a.height + "cm 입니다.");
		
		
		/*
		 * 필드를 public 접근 제한자로 작성
		 * => 필드에 직접적으로 접근해서 각 대입하거나 값을 가져올 수 있음!!
		 * => 외부에서 함부로 값을 변질시키거나 조회 권한이 없는 사람이 가졍로 수 있는 문제 발생!!
		 * 		>> 캡슐화 작업!!
		 */
		
	}

}

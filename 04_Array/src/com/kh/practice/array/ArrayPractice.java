package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;						// 결과값이 i+1 이라는 걸 넣어줘야 한다.
			System.out.print(arr[i] + " ");
		}
		
	}

	public void practice2() {					// 아직 못 품. 역순 어케 하지?
		// 1번에서 역순으로 바꾸기
		
		int[] arr = new int[10];
		
		arr[0] = 10;
		arr[1] = 9;
		arr[2] = 8;
		
		int num = arr.length;
		
		for(int i=0; i<arr.length ; i++) {
			arr[i] = num;
			num--;
			System.out.print(arr[i] + " ");
		}
		
		
	}
	
	public void practice3() {
		//사용자에게 입력받은양의 정수만큼 배열크기를 할당하고
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
				
		//1부터 입력받은 값까지 배열에 초기화한 후출력하세요
		/*
		 * arr[0] = 1	초기화	arr[0] = 1
		 * arr[1] = 2			arr[1] = 2
		 * arr[2] = 3			...
		 */
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
			
		}
		
		sc.close();
	}
	
	public void practice4() {
		/*
		 * 길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화한 후
		 * 배열 인덱스를 활용해서 귤을 출력하세요.
		 * 초기화 한다는 말이 무슨 뜻이지?					=> 직접 입력하란 뜻이었다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열용 길이 5인 선언 : ");
		
		String [] arr = {"사과", "귤", "포도", "복숭아", "참외"};
			System.out.println(arr[1]);
		
		sc.close();
	}
		
		
		/*
		String str = sc.nextLine();
		int[] arr = new int[str.length()];
		
		for(int i=0; i<arr.length; i++) {
			
		}
		*/
		
		
		
		
		/*										이건 단어 분해용, 추출기임.
		char[] arr = new char[str.length()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
			System.out.println(arr[i]);
		}
		*/
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String word = sc.nextLine();
		// 문자열을 입력 받아
		
		
		System.out.print("문자 : ");
		char tx = sc.nextLine().charAt(0);

		// 문자 하나하나를 배열에 넣고
		
		// 검색할 문자가 문자열에 몇개 들어가 있는지
		char[] arr = new char[word.length()];
		
		
		// 개수와 몇번째 인덱스에 위치하는지 인덱스를 출력하세요
		for(int i=0; i<arr.length; i++) {
			arr[i] = word.charAt(i);
			
		}
		System.out.print(word + "에 " + tx + "가 존재하는 위치 (index) : ");

		int count = 0;						//개수 세야지.	
		//쪼개기는 완성
			for(int i=0; i<arr.length; i++) {
				arr[i] = word.charAt(i);
					if(tx == arr[i]) {

						count++;
						System.out.print(i + " ");
					}

					count++;
					System.out.println("arr[" + i + "] : " + arr[i]);
				}
				System.out.println();
				System.out.println("i 개수 : " + count);	
		sc.close();
	}
			

	public void practice6() {
		/* “월“ ~ “일”까지 초기화된 문자열 배열을 만들고
		 * 
		 *  0부터 6까지 숫자를 입력 받아
		 *  입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
		 *  범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“ 를 출력하세요
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String[] day = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
		// 초기화된 문자열 배열
		// System.out.println(day[1]);
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		//숫자를 입력 받아
		
		for(int i=0; i<num; i++) {
			day[i].equals(arr[i]);
			System.out.println(day[i]);
		}
		
		sc.close();
		
		/*
		for(int i=0; i<7; i++) {
			if(day[i] == )
		}
		*/
		
		/*
		 * arr[0] = 월 요일
		 * arr[1] = 화 요일
		 * arr[2] = 수 요일
		 * arr[3] = 목 요일
		 * arr[4] = 금 요일
		 */
		
		/*
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		System.out.println();
		*/
		
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		//사용자가 배열의 길이를 직접 입력
		
		int[] arr = new int[num];
		//사용자가 배열의 길이를 직접 입력
		
		
		for(int i=0; i<num; i++) {
			int value = sc.nextInt();
			arr[i] = value;
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : " );
		// 배열의 크기만큼 직접 값을 반복해서 입력(초기화)
		}
		
		int sum = 0;
		
		for(int i=0; i<num; i++) {
			sum += arr[i];
		}
		
		System.out.println("총 합 : " + sum);
			
		sc.close();
		
	}
	
	public void practice8() {
		/*
		3이상인 홀수 자연수를 입력받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		단, 입력한 정수가 홀수가 아니거나 3미만일 경우 “다시 입력하세요” 를 출력하고
		다시 정수를 받도록 하세요
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
				
		while(true) {
	        System.out.print("정수 : ");

	        int count = 0;

	        if ((num >= 3) && (num % 2 == 1)) {
	            int[] arr = new int[num];

	            for(int i = 0; i < arr.length; i++) {
	                if(i <= arr.length/2) {
	                    arr[i] = ++count;						
	                }else {
	                    arr[i]= --count;
	                }
	            }
	            for(int i = 0; i < arr.length; i++) {
	                System.out.print(arr[i] + " ");
	            }
	            break;
	        }else {
	            System.out.println("다시 입력하세요.");
	        }
	    
	    sc.close();
		
		}
		
	}
	
	public void practice9() {
		
		/*
		 * 사용자가 입력한 값이 배열에 있는지 검색하여
		 * 있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
		 * 단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요
		 */
		

		Scanner sc = new Scanner(System.in);
		
		String[] arr = {"양념", "불닭", "후라이드", "파닭"};
		
		System.out.print("치킨 이름을 입력하세요 : ");
		String menu = sc.nextLine();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals(menu)) {
				System.out.println(menu + "치킨 배달 가능"); break;
			}else {
				System.out.println(menu + "은 없는 메뉴입니다."); break;
			}
		
		}
		
		sc.close();	
	}
	
	
	public void practice10() {
	    Scanner sc = new Scanner(System.in);

	    System.out.print("주민등록번호(-포함) : ");
	    String reg = sc.nextLine();

	    char[] arr = new char[14];

	    for(int i = 0; i < reg.length(); i++) {
	        arr[i] = reg.charAt(i);
	    }
	    char[] hosy = arr.clone();				// 안 배운 내용

	    for(int i = 7; i < hosy.length; i++) {
	        hosy[i] = '*';
	    }
	   
	    System.out.println(hosy);
	    sc.close();	
	}
	
	
	public void practice11() {
		
	    int[] arr = new int[10];
	    
	    
	    for(int i = 0; i < arr.length; i++) {
	        int random = (int)(Math.random()* 10 +1);
	        arr[i] = random;
	        System.out.print(arr[i] + " ");
	    }

	    
	}
	
	
	public void practice12() {
		
		// max, min, buble 정렬 (?)
		
	    int[] arr = new int[10];

	    for(int i = 0; i < arr.length; i++) {
	        int random = (int)(Math.random() * 10 + 1);
	        arr[i] = random;
	    }
	    
	    int max = arr[0];
	    int min = arr[0];

	    for(int i = 0; i < arr.length-1; i++) {
	        if(arr[i] >= max) {
	            max = arr[i]; 
	        }
	        
	        if(arr[i] <= min) {
	            min = arr[i];
	        }
	        
	    }
	    for(int i = 0; i < arr.length; i++) {
	        System.out.print(arr[i]+ " ");
	    }
	    System.out.println();
	    System.out.println("최대 값 : " + max);
	    System.out.println("최소 값 : " + min);
	}
	
	
	public void practice13() {
		
		// buble 참조??
		
	    int[] arr = new int[10];

	    for(int i = 0; i < arr.length; i++) {
	        arr[i] = (int)(Math.random()*10+1);
	        
	        for(int j = 0; j < i; j++) {
	        	
	            if(arr[i] == arr[j]) {
	                i--;
	            }
	            
	        }
	        
	    }

	    for(int i=0; i<arr.length; i++) {
	        System.out.print(arr[i] + " ");
	    }
	    
	}
	
	
	public void practice14() {

		
	    int[] lotto = new int[6];

	    for(int i=0; i<lotto.length; i++) {
	        int random = (int)(Math.random() * 45 + 1);
	        
	        lotto[i] = random;
	        for(int j=0; j<i; j++) {
	            if(lotto[i] == lotto[j]) {
	                i--;
	                break;
	            }
	        }
	        
	    }
	    
	    
	    for(int i=0; i<lotto.length; i++) {
	        System.out.print(lotto[i] + " ");
	    }
	    
	    System.out.println();
	
	}	
	    
	    /*
	    int temp = 0;
	    for(int i = 0; i < lotto.length; i++) {

	        for(int j = i; j < lotto.length; j++) {
	            if(lotto[i] > lotto[j])
	                temp = lotto[i];

	                lotto[i] = lotto[j];

	                lotto[j] = temp;
	            }
	        }
	        

	    for(int i=0; i<lotto.length; i++) {
	        System.out.print(lotto[i] + " ");
	    }
	     */
	
	
	
	public void practice15() {
	    
		Scanner sc = new Scanner(System.in);

	    System.out.print("문자열 : ");
	     String str = sc.nextLine();
	    
	    char[] arr = new char[str.length()];
	    
	    int count = 0;

	    for(int i=0; i<arr.length; i++) {
	    	
	        int num1 = 0;			
	        arr[i] = str.charAt(i);	

	        for(int j=0; j<i; j++) {
	            if(arr[i] == arr[j]) {
	                num1 = 1;
	            }else {
	            	
	            }

	        }
	        
	        
	        if(num1 == 0) {
	            if(i == 0) {
	                System.out.print("문자열에 있는 문자 : " + arr[i]);
	            }else {
	                System.out.print(", " + arr[i]);
	            }
	            count++;
	        }	
	        
	    }
	    
	    System.out.println();
	    System.out.println("문자 개수 : " + count);
	    sc.close();	
	}
	
	
	public void practice16() {
	    Scanner sc = new Scanner(System.in);

	    System.out.print("배열의 크기를 입력하세요 : ");
	    int num = sc.nextInt();
	    sc.nextLine();
	    String[] arr = new String[num];

	    sc.close();
	    
	    for (int i=0; i<num; i++) {
	        System.out.print(i+1 + "번째 문자열 : ");
	        String str = sc.nextLine();
	        arr[i] = str;
	    }

	    int l1 = 0;
	    while(true) {
	        System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
	        char yn = sc.nextLine().charAt(0);

	        if (yn == 'y' || yn == 'Y') {
	            System.out.print("더 입력하고 싶은 개수 : ");
	            int add = sc.nextInt();
	            sc.nextLine();
	        }

	    }
	   
	}
	
}			

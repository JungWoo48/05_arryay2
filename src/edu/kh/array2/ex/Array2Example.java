package edu.kh.array2.ex;

import java.util.Arrays;

public class Array2Example {
	
	/*
	 * 2차배열
	 * 
	 * -자료형이 같은 1차원 배열을 묶음으로 다루는것
	 * -> 행 열 개념이 추가된것
	 * 
	 * 
	 */
	public void ex1() {
		//2차원 배열 선어
		int[][] arr;
		//int 2차원 배열을 참조하는 참조 변수 선언
		//int[][] arr
		//int arr[][]
		// 주의!-(참조형 == 참조변수 == 레퍼런스 변수 == 레퍼런스)-모두 같은 말이다
		
		//2차원 배열 할당
		//new 자료형[행크기][열크기]
		
		arr = new int[2][3];
		//heap 영역에 int 2차원 배열 2행 3열을 할당한것이다.
		
		//2차원 배열 초기화
		//1) 행, 열 인덱스르 이용하여 직접 초기화
		/*arr[0][0] =10;
		arr[0][1] = 20;
		arr[0][1] = 30;
		
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;
		*/
		//2)2중 for문을 이용한 초기화
		
		//배열 요소 초기화에 사용할 변수를 만든다
		int num = 10;
		
		//배열길이 -> 배열명.length는 변수가 '직접 참조'하고 있는 배열의 길이를 반환
		
		System.out.println(arr.length); //답:2 (행의 길이이다)
		//arr이 참조하고 있는 2차원 배열의 행의 길이
		
		System.out.println(arr[0].length); // 3 (열의 길이)
		//arr[0]행이 참조하고 있는 1차원 배열(열)의 길이
		
		
		for(int row =0; row <arr.length; row++) {//첫번쨰 for문은 행의 반복을 담당한다(0,1)
			for(int col = 0; col < arr[row].length; col++) {//두번쨰 for문은 열을 반복한다(0,1,2)
				
				arr[row][col] = num;
				num += 10;//10씩증가
				
			}
		}
		
		//출력
		//Arrays.toString은 참조하고 있는 1차원 배열값을 문자열로 변환하는것이다
		//Arrays.deepToString은 테이터가 나오는 부분까지 파고들어가서
		// 모든 값을 문자열로 변환한다
		//2차원 이상의 배열은 항상 이것을 사용
		System.out.println(Arrays.deepToString(arr));
	
	}
	public void ex2() {
		//2차원 배열 선언과 동시에 초기화
		
		//3행 3열 짜리 정수형 2차원 배열 선언과 동시에
		//1~9까지 초기화
		
		int[][] arr = new int[][] {{1,2,3,},
								   {4,5,6,},
								   {7,8,9}};
		
		//행별로 합 출력
		
		for(int row = 0; row<arr.length; row++) {
			int sum = 0;
			
			for(int col = 0; col< arr[row].length; col++) {
				
				
				//현재 행의 모든 열의 값을 누적해야한다
				sum += arr[row][col];//-모든 값을 누적시키는 코드
				
			}
			System.out.printf("%d행의 합 : %d\n", row , sum);
			
		}System.out.println("===============");
		//열별로 합 출력
		//-열 부터 지정후 각 행의 값을 누적
		for(int col = 0; col <arr[0].length; col++) { //열을 반복
			
			int sum = 0;
			
			for(int row = 0; row <arr.length; row++) {
				sum += arr[row][col];
			}
			
			System.out.printf("%d열의 합 : %d\n", col , sum);
		}System.out.println("===============");
		
		int sum =0;//모든 행과 열의 합
		for(int row =0; row < arr.length; row++) {
			for(int col =0; col < arr[row].length; col++) {
				sum += arr[row][col];
			}
		}
		System.out.println(sum);
	}
	public void ex() {
		//가변 배열
		// 2차 배열 생성시 마지막 배열차수(열)을 지정하지 않고
		// 나중에 서로 크기가 다른 차원 배열을 생성하여 참조하는 배열
		
		char[][] arr = new char[4][];
						//행 부분만 작성된 2차원 배열
		
		arr[0] = new char[3]; // 0행의 3열짜리 1차원 배열을 생성하여 주소값을 저장한것
		arr[1] = new char[4]; // 1행의 4열짜리 1차원 배열을 생성하여 주소값을 저장
		arr[2] = new char[5]; // 2행에 5열짜리 1차원 배열을  생성하여 ;;
		arr[3] = new char[2]; // 3행에 2열짜리 ;;
		
		char ch = 'a';
		for(int row = 0; row < arr.length; row++) {//횅
			
			for(int col = 0; col < arr[row].length; col++) {//열
				arr[row][col] = ch ++;
				
			}
		}
		
		System.out.println(Arrays.deepToString(arr));
		
	}
	
	
	
}

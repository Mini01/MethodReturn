package com.biz.method;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.method.vo.GradeVO;





public class Method02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<GradeVO> grdes = new ArrayList();
		for (int i = 0 ; i < 3 ; i ++) {
			System.out.println("현재위치:" + i);
			GradeVO gradeVO = new GradeVO();
			//if(makeScore(gradeVO) == false) {
			if(!makeScore(gradeVO)) {
				// makeScore 가 실행되는 도중 문제가 발생하면
				// false를 return 할 것이고
				// i 값을 1개 감소한 다음
				// 다시 for로 되돌아가서
				// 현재 학생의 점수를 다시 입력받도록 시도
		
				i--;
				continue;
			}
			grdes.add(gradeVO);
		}
		
		

	}
	
	public static boolean makeScore(GradeVO gradeVO) {
        Scanner scanner = new Scanner(System.in);
        boolean retOk = true;
		
		System.out.print("학번 >>"); 
		String strNum = scanner.nextLine();
		
		System.out.print("이름 >>");
		String strName = scanner.nextLine();
		
		System.out.println("국어 >>");
		String strKor = scanner.nextLine();
		
		System.out.println("영어 >>");
		String strEng = scanner.nextLine();
		
		System.out.println("수학 >>");
		String strMath = scanner.nextLine();
		
		try {
			gradeVO.setIntKor(Integer.valueOf(strKor));
			gradeVO.setIntEng(Integer.valueOf(strEng));
			gradeVO.setIntMath(Integer.valueOf(strMath));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("과목점수 변경 오류");
			retOk = false;
		}
		return retOk;

		
	}

}

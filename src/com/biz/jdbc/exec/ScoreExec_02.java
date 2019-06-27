package com.biz.jdbc.exec;

import java.util.Scanner;

import com.biz.jdbc.model.ScoreVO;
import com.biz.jdbc.service.ScoreService;
import com.biz.jdbc.service.ScoreServiceImp_01;

public class ScoreExec_02 {

	public static void main(String[] args) {
		ScoreService ss = new ScoreServiceImp_01();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("SEQ");
			String strSeq = scan.nextLine();
			long longSeq = Long.valueOf(strSeq);
			
			ScoreVO sVO = ss.findById(longSeq);
			if(sVO == null) System.out.println("점수정보가 없습니다.");
			else System.out.println(sVO);
		}

	}

}

package com.biz.jdbc.exec;

import com.biz.jdbc.model.StudentVO;
import com.biz.jdbc.service.StdService;
import com.biz.jdbc.service.StdServiceImp_01;

public class StdExec_02 {

	public static void main(String[] args) {

		StdService ss = new StdServiceImp_01();
		StudentVO stdVO = ss.findByNum("011");
		
		if(stdVO == null) System.out.println("찾는 학생이 없음");
		else {
			System.out.println(stdVO.toString());
		}
		
		
		
	}

}

package com.greedy.cosmetic.views;

import java.util.List;

import com.greedy.cosmetic.model.dto.CosmeticDTO;

public class PrintResult {

	public void printCosmeticList(List<CosmeticDTO> cosmeticList) {
		for(CosmeticDTO cosmetic : cosmeticList) {
			System.out.println(cosmetic);
		}
	}
	
	public void printErrorMessage(String errorCode) {
		String errorMessage = "";
		switch(errorCode) {
		case "selectList" : errorMessage = "메뉴 목록 조회에 실패하였습니다."; break;
		case "insert" : errorMessage = "메뉴 등록에 실패하였습니다."; break;
//		case "update" : errorMessage = "메뉴 수정에 실패하였습니다."; break;
//		case "delete" : errorMessage = "메뉴 삭제에 실패하였습니다."; break;
		}
		System.out.println(errorMessage);
	}

	public void printSuccessMessage(String successCode) {
		String successMessage = "";
		switch(successCode) {
		case "insert" : successMessage = "등록에 성공하였습니다."; break;
//		case "update" : successMessage = "수정에 성공하였습니다."; break;
//		case "delete" : successMessage = "삭제에 성공하였습니다."; break;
		}
		
		System.out.println(successMessage);
		
		
	}

}

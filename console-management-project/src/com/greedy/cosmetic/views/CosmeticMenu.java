package com.greedy.cosmetic.views;

import java.util.Scanner;

import com.greedy.cosmetic.controller.CosmeticController;

public class CosmeticMenu {
	
	private Scanner sc = new Scanner(System.in);

	public void displayCosmetic() {
		
		CosmeticController cosmeticController = new CosmeticController();
		
		do {
			System.out.println("==== 코스메틱 관리 프로그램 ====");
			System.out.println("1. 전체 제품 조회");
			System.out.println("2. 신규 제품 추가");
			System.out.println("3. 제품 수정");
			System.out.println("4. 제품 삭제");
			System.out.println("원하는 관리 번호를 입력하세요 : ");
			int no = sc.nextInt();
			
			switch(no) {
			case 1: cosmeticController.selectAllCosmetic(); break;
//			case 2: cosmeticController.registCosmetic(inputCosmetic()); break;
//			case 3: cosmeticController.modifyCosmetic(inputModifyCosmetic()); break;
//			case 4: cosmeticController.deleteCosmetic(inputCosmeticCode()); break;
			default: System.out.println("잘못 된 관리번호를 선택하셨습니다.");
			}
			
			
			
		}while(true);
	}


}

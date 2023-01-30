package com.greedy.cosmetic.views;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.greedy.cosmetic.controller.CosmeticController;
import com.greedy.cosmetic.model.dto.CosmeticDTO;

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
			case 2: cosmeticController.registCosmetic(inputCosmetic()); break;
//			case 3: cosmeticController.modifyCosmetic(inputModifyCosmetic()); break;
//			case 4: cosmeticController.deleteCosmetic(inputCosmeticCode()); break;
			default: System.out.println("잘못 된 관리번호를 선택하셨습니다."); break;
			}
			
			
			
		}while(true);
	}

	 public Map<String, String> inputCosmetic() {//추가
		
		Map<String, String> map = new HashMap<>();
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("등록할 코스메틱 제품 코드를 입력하세요 : ");
		sc.nextLine();
		map.put("cosmeticCode", sc.nextLine());
		
		System.out.print("등록할 코스메틱 제품 이름을 입력하세요 : ");
		sc.nextLine();
		map.put("name", sc.nextLine());
//		String name = sc.nextLine();
		
		System.out.print("등록할 코스메틱 제품 가격을 입력하세요 : ");
		sc.nextLine();
		map.put("price", sc.nextLine());
		
		System.out.print("등록할 카테고리 코드를 입력하세요 : ");
		sc.nextLine();
		map.put("categoryCode", sc.nextLine());
		
		System.out.print("재고 여부를 입력하세요(Y/N) : ");
		sc.nextLine();
		map.put("stock", sc.nextLine().toUpperCase());
		
//		CosmeticDTO cosmetic = new CosmeticDTO();
//		cosmetic.setCosmeticName(name);
//		cosmetic.setCosmeticPrice(price);
//		cosmetic.setCategoryCode(categoryCode);
//		cosmetic.setStockStatus(stockStatus);
		
		return map;
	}


}

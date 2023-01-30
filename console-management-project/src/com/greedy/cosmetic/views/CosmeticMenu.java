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
			System.out.println("3. 메뉴 또는 카테고리 코드로 검색(검색 조건이 없는 경우 전체 검색)");
			System.out.println("4. 제품 수정");
			System.out.println("5. 제품 삭제");
			System.out.println("원하는 관리 번호를 입력하세요 : ");
			int no = sc.nextInt();
			
			switch(no) {
			case 1: cosmeticController.selectAllCosmetic(); break;
			case 2: cosmeticController.registCosmetic(inputCosmetic()); break;
			case 3: cosmeticController.searchMenuByNameOrCategory(inputSearch()); break;
			case 4: cosmeticController.updateCosmetic(inputUpdate()); break;
			case 5: cosmeticController.deleteCosmetic(inputMenuCode()); break;
			default: System.out.println("잘못 된 관리번호를 선택하셨습니다."); break;
			}
			
			
			
		}while(true);
	}


	public Map<String, String> inputCosmetic() {//추가
		
		Map<String, String> map = new HashMap<>();
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("등록할 코스메틱 제품 이름을 입력하세요 : ");
		map.put("name", sc.nextLine());
		System.out.print("등록할 코스메틱 제품 가격을 입력하세요 : ");
		map.put("price", sc.nextLine());
		System.out.print("등록할 카테고리 코드를 입력하세요 : ");
		map.put("categoryCode", sc.nextLine());
		System.out.print("재고 여부를 입력하세요(Y/N) : ");
		map.put("stock", sc.nextLine().toUpperCase());

		return map;
	}

	private static Map<String, Object> inputSearch() {
		
		Map<String, Object> map = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("검색할 조건을 입력하세요(category or name or both or null) : ");
		
		String condition = sc.nextLine();
		
		if("category".equals(condition)) {//카테고리라고 입력한 경우
			System.out.println("검색할 카테고리 코드 입력 : ");
			int categoryValue = sc.nextInt();
			
			map.put("categoryValue", categoryValue);
			
		}else if("name".equals(condition)) {//name라고 입력한경우 
			
			System.out.print("검색할 메뉴 이름 입력 : ");
			String nameValue = sc.nextLine();
			
			map.put("nameValue", nameValue);
			
		} else if("both".equals(condition)) {//카테고리, 메뉴 둘 다 검색조건으로 쓸 때
			
			System.out.print("검색할 카테고리 코드 입력 : ");
			int categoryValue = sc.nextInt();
			sc.nextLine();
			System.out.print("검색할 메뉴 이름 입력 : ");
			String nameValue = sc.nextLine();
			
			map.put("categoryValue", categoryValue);
			map.put("nameValue", nameValue);
		}
		
		
		return map;
	}
	
	//수정
	private static Map<String, String> inputUpdate() {
		Map<String, String> map = new HashMap<>();
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 제품 코드를 입력하세요 : ");
		map.put("cosmeticCode", sc.nextLine());
		System.out.print("수정할 코스메틱 제품 이름을 입력하세요 : ");
		map.put("name", sc.nextLine());
		System.out.print("수정할 코스메틱 제품 가격을 입력하세요 : ");
		map.put("price", sc.nextLine());
		System.out.print("수정할 카테고리 코드를 입력하세요 : ");
		map.put("categoryCode", sc.nextLine());
//		System.out.print("재고 여부를 입력하세요(Y/N) : ");
//		map.put("stock", sc.nextLine().toUpperCase());

		return map;
	}

	//삭제
	private static Map<String, String> inputMenuCode() {
		Scanner sc = new Scanner(System.in);
		System.out.print("제품 코드 입력 : ");
		String code = sc.nextLine();
		
		Map<String, String> parameter = new HashMap<>();
		parameter.put("code", code);
		
		return parameter;
	}

}

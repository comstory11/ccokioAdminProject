package view;

import java.util.InputMismatchException;
import java.util.Scanner;

import controller.Controllers;


public class ProductDeleteView {

	private Scanner keyboard;

	public ProductDeleteView() {
		keyboard = new Scanner(System.in);
	}
	
	
	public void getSearchProductNumber() {
		
		int searchProductNumber = 0;

		try {
			System.out.println("\n[제품 삭제 모드]");
			System.out.print("삭제 할 제품번호 : ");
			searchProductNumber = keyboard.nextInt();

			Controllers.getProductController().requestDelete(searchProductNumber);
		} catch (InputMismatchException e) {
			System.out.println("올바른 입력을 입력해주세요.");
			Controllers.getProductController().requestDeleteSearchNumber();
		}
		
	}
	
	public void productDelete(int searchProductNumer) {
		System.out.println("제품을 삭제시키겠습니까? (Y / anyKey press)");
		char selectChar = keyboard.next().charAt(0);
		
		if(selectChar == 'Y' || selectChar == 'y') {
			Controllers.getProductController().requestReturnDelete(searchProductNumer);
		} else {
			System.out.println("제품삭제를 취소했습니다.");
			Controllers.getProductController().requestProductSelectList();
		}
	}
	
}

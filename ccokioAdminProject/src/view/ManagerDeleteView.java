package view;

import java.util.InputMismatchException;
import java.util.Scanner;

import controller.Controllers;

public class ManagerDeleteView {

	private Scanner keyboard;

	public ManagerDeleteView() {
		keyboard = new Scanner(System.in);
	}
	
	
	public void getSearchManagerNumber() {
		
		int searchMangerNumber = 0;

		try {
			System.out.println("\n[매니저 삭제 모드]");
			System.out.print("삭제 할 매니저번호 : ");
			searchMangerNumber = keyboard.nextInt();

			Controllers.getManagerController().requestDelete(searchMangerNumber);	
			
		} catch (InputMismatchException e) {
			System.out.println("올바른 입력을 입력해주세요.");
			Controllers.getManagerController().requestDeleteSearchNumber();
		}
		
		
	}
	
	public void managerDelete(int searchMangerNumer) {
		System.out.println("매니저를 탈퇴시키겠습니까? (Y / anyKey press)");
		char selectChar = keyboard.next().charAt(0);
		
		if(selectChar == 'Y' || selectChar == 'y') {
			Controllers.getManagerController().requestReturnDelete(searchMangerNumer);
		} else {
			System.out.println("회원탈퇴를 취소했습니다.");
			Controllers.getManagerController().requestSelectList();
		}
	}
	
}

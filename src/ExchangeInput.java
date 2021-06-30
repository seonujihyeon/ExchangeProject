package project1;

import java.util.Scanner;

public class ExchangeInput {
	
	
	double inputKRW;
	int inputType;
	
	
	Scanner myInput = new Scanner(System.in);
	
	
	
	public void inputKRW() {
		System.out.printf("얼마를 환전하시겠습니까?(0.선택안함) : ");
		inputKRW = myInput.nextDouble();
	}
	
	public void inputChangeType( ) {	
		System.out.printf("환전할 종류를 선택(1.USD, 2.EUR, 3.JPY)? : ");
		inputType = myInput.nextInt();
	}

}

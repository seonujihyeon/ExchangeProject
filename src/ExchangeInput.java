package project1;

import java.util.Scanner;

public class ExchangeInput {
	
	
	double inputKRW;
	int inputType;
	
	
	Scanner myInput = new Scanner(System.in);
	
	
	
	public void inputKRW() {
		System.out.printf("�󸶸� ȯ���Ͻðڽ��ϱ�?(0.���þ���) : ");
		inputKRW = myInput.nextDouble();
	}
	
	public void inputChangeType( ) {	
		System.out.printf("ȯ���� ������ ����(1.USD, 2.EUR, 3.JPY)? : ");
		inputType = myInput.nextInt();
	}

}

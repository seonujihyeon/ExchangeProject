package project1;

public class ExchangeOutput {
	
	
	
	public void close() {
		System.out.printf("���� �Ǿ����ϴ�.");
		}
	
	public void result(int resultInt, String exchangeType) {
	System.out.printf("ȯ������� %d%s �Դϴ�.\n", resultInt, exchangeType);
	}
	
	
	public void resultUSD(int resultUSD100, int resultUSD50, int resultUSD20, 
			int resultUSD10, int resultUSD5, int resultUSD2, int resultUSD1 ) {
		System.out.printf("100$ : %d��\n", resultUSD100);
		System.out.printf("50$ : %d��\n", resultUSD50);
		System.out.printf("20$ : %d��\n", resultUSD20);	
		System.out.printf("10$ : %d��\n", resultUSD10);	
		System.out.printf("5$ : %d��\n", resultUSD5);	
		System.out.printf("2$ : %d��\n", resultUSD2);	
		System.out.printf("1$ : %d��\n", resultUSD1);
	}
	
	public void resultEUR(int resultEUR500, int resultEUR200, int resultEUR100, 
			int resultEUR50, int resultEUR20, int resultEUR10, int resultEUR5) {
		System.out.printf("500EUR : %d��\n", resultEUR500);
		System.out.printf("200EUR : %d��\n", resultEUR200);
		System.out.printf("100EUR : %d��\n", resultEUR100);	
		System.out.printf("50EUR : %d��\n", resultEUR50);	
		System.out.printf("20EUR : %d��\n", resultEUR20);	
		System.out.printf("10EUR : %d��\n", resultEUR10);
		System.out.printf("5EUR : %d��\n", resultEUR5);
	}
	
	public void resultJPY(int resultJPY10000, int resultJPY5000, int resultJPY2000, int resultJPY1000, 
			int resultJPY500, int resultJPY100, int resultJPY50, int resultJPY10, int resultJPY5, int resultJPY1) {
		System.out.printf("10000JPY : %d��\n", resultJPY10000);
		System.out.printf("5000JPY : %d��\n", resultJPY5000);
		System.out.printf("2000JPY : %d��\n", resultJPY2000);	
		System.out.printf("1000JPY : %d��\n", resultJPY1000);	
		System.out.printf("500JPY : %d��\n", resultJPY500);	
		System.out.printf("100JPY : %d��\n", resultJPY100);
		System.out.printf("50JPY : %d��\n", resultJPY50);
		System.out.printf("10JPY : %d��\n", resultJPY10);
		System.out.printf("5JPY : %d��\n", resultJPY5);
		System.out.printf("1JPY : %d��\n", resultJPY1);
	}
	
	public void returnKRW(int returnKRW) {
		System.out.printf("�Ž��� ���� %d�� �Դϴ�.\n", returnKRW);
	}
	
	public void resultReturn(int resultKRW5000, int resultKRW1000, int resultKRW500, 
			int resultKRW100, int resultKRW50, int resultKRW10 ) {
		System.out.printf("5000�� : %d��\n", resultKRW5000);
		System.out.printf("1000�� : %d��\n", resultKRW1000);
		System.out.printf("500�� : %d��\n", resultKRW500);
		System.out.printf("100�� : %d��\n", resultKRW100);	
		System.out.printf("50�� : %d��\n", resultKRW50);	
		System.out.printf("10�� : %d��\n", resultKRW10);	
	}
	
}

package project1;

public class ExchangeOutput {
	
	
	
	public void close() {
		System.out.printf("종료 되었습니다.");
		}
	
	public void result(int resultInt, String exchangeType) {
	System.out.printf("환전결과는 %d%s 입니다.\n", resultInt, exchangeType);
	}
	
	
	public void resultUSD(int resultUSD100, int resultUSD50, int resultUSD20, 
			int resultUSD10, int resultUSD5, int resultUSD2, int resultUSD1 ) {
		System.out.printf("100$ : %d장\n", resultUSD100);
		System.out.printf("50$ : %d장\n", resultUSD50);
		System.out.printf("20$ : %d장\n", resultUSD20);	
		System.out.printf("10$ : %d장\n", resultUSD10);	
		System.out.printf("5$ : %d장\n", resultUSD5);	
		System.out.printf("2$ : %d장\n", resultUSD2);	
		System.out.printf("1$ : %d장\n", resultUSD1);
	}
	
	public void resultEUR(int resultEUR500, int resultEUR200, int resultEUR100, 
			int resultEUR50, int resultEUR20, int resultEUR10, int resultEUR5) {
		System.out.printf("500EUR : %d장\n", resultEUR500);
		System.out.printf("200EUR : %d장\n", resultEUR200);
		System.out.printf("100EUR : %d장\n", resultEUR100);	
		System.out.printf("50EUR : %d장\n", resultEUR50);	
		System.out.printf("20EUR : %d장\n", resultEUR20);	
		System.out.printf("10EUR : %d장\n", resultEUR10);
		System.out.printf("5EUR : %d장\n", resultEUR5);
	}
	
	public void resultJPY(int resultJPY10000, int resultJPY5000, int resultJPY2000, int resultJPY1000, 
			int resultJPY500, int resultJPY100, int resultJPY50, int resultJPY10, int resultJPY5, int resultJPY1) {
		System.out.printf("10000JPY : %d장\n", resultJPY10000);
		System.out.printf("5000JPY : %d장\n", resultJPY5000);
		System.out.printf("2000JPY : %d장\n", resultJPY2000);	
		System.out.printf("1000JPY : %d장\n", resultJPY1000);	
		System.out.printf("500JPY : %d장\n", resultJPY500);	
		System.out.printf("100JPY : %d장\n", resultJPY100);
		System.out.printf("50JPY : %d장\n", resultJPY50);
		System.out.printf("10JPY : %d장\n", resultJPY10);
		System.out.printf("5JPY : %d장\n", resultJPY5);
		System.out.printf("1JPY : %d장\n", resultJPY1);
	}
	
	public void returnKRW(int returnKRW) {
		System.out.printf("거스름 돈은 %d원 입니다.\n", returnKRW);
	}
	
	public void resultReturn(int resultKRW5000, int resultKRW1000, int resultKRW500, 
			int resultKRW100, int resultKRW50, int resultKRW10 ) {
		System.out.printf("5000원 : %d장\n", resultKRW5000);
		System.out.printf("1000원 : %d장\n", resultKRW1000);
		System.out.printf("500원 : %d개\n", resultKRW500);
		System.out.printf("100원 : %d개\n", resultKRW100);	
		System.out.printf("50원 : %d개\n", resultKRW50);	
		System.out.printf("10원 : %d개\n", resultKRW10);	
	}
	
}

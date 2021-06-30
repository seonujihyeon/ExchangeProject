package project1;

public class ExchangeProcess {
	
	final double EXCHANGE_RATE_USD = 1136.8;
	final double EXCHANGE_RATE_EUR = 1341.73;
	final double EXCHANGE_RATE_JPY = 10.26;
	double result = 0;
	int returnKRW = 0;
	int resultInt = 0;
	String exchangeType = null;
	int resultUSD100, resultUSD50, resultUSD20, resultUSD10,
    resultUSD5, resultUSD2, resultUSD1;
	int resultEUR500, resultEUR200, resultEUR100, resultEUR50,
    resultEUR20, resultEUR10, resultEUR5;
	int resultJPY10000, resultJPY5000, resultJPY2000, resultJPY1000,
    resultJPY500, resultJPY100, resultJPY50, resultJPY10,
    resultJPY5, resultJPY1;
	int resultKRW5000, resultKRW1000, resultKRW500, resultKRW100, 
    resultKRW50, resultKRW10;
	
	public void processResult(double inputKRW, int inputType) {
		switch(inputType) {
		case 1 :
		result = inputKRW / EXCHANGE_RATE_USD;
		returnKRW = (int) (inputKRW % EXCHANGE_RATE_USD);
		exchangeType = "USD";
		break;
		case 2 :
		result = inputKRW / EXCHANGE_RATE_EUR;
		returnKRW = (int) (inputKRW % EXCHANGE_RATE_EUR);
		exchangeType = "EUR";	
		break;
		case 3 :
		result = inputKRW / EXCHANGE_RATE_JPY;
		returnKRW = (int) (inputKRW % EXCHANGE_RATE_JPY);
		exchangeType = "JPY";	
		default :
		}
	}
	
	
	public void resultInt() {
	resultInt = (int) result;
	returnKRW = returnKRW / 10 * 10;
	}
	
	public void processUSD() {
	resultUSD100 = resultInt/100; 
	resultInt = resultInt - resultUSD100 * 100;
	resultUSD50 = resultInt/50; 
	resultInt = resultInt - resultUSD50 * 50;
	resultUSD20 = resultInt/20; 
	resultInt = resultInt - resultUSD20 * 20;
	resultUSD10 = resultInt/10; 
	resultInt = resultInt - resultUSD10 * 10;
	resultUSD5 = resultInt/5;
	resultInt = resultInt - resultUSD5 * 5;
	resultUSD2 = resultInt/2;
	resultInt = resultInt - resultUSD2 * 2;
	resultUSD1 = resultInt/1;
	resultInt = resultInt - resultUSD1 * 1;
	}

	public void processERU() {
	resultEUR500 = resultInt/500;
	resultInt = resultInt - resultEUR500 * 500;
	resultEUR200 = resultInt/200;
	resultInt = resultInt - resultEUR200 * 200;
	resultEUR100 = resultInt/100;
	resultInt = resultInt - resultEUR100 * 100;
	resultEUR50 = resultInt/50;
	resultInt = resultInt - resultEUR50 * 50;
	resultEUR20 = resultInt/20;
	resultInt = resultInt - resultEUR20 * 20;
	resultEUR10 = resultInt/10;
	resultInt = resultInt - resultEUR10 * 10;
	resultEUR5 = resultInt/5;
	resultInt = resultInt - resultEUR5 * 5;
	}

	public void processJPY() {
	resultJPY10000 = resultInt/10000;
	resultInt = resultInt - resultJPY10000 * 10000;
	resultJPY5000 = resultInt/5000;
	resultInt = resultInt - resultJPY5000 * 5000;
	resultJPY2000 = resultInt/2000;
	resultInt = resultInt - resultJPY2000 * 2000;
	resultJPY1000 = resultInt/1000;
	resultInt = resultInt - resultJPY1000 * 1000;
	resultJPY500 = resultInt/500;
	resultInt = resultInt - resultJPY500 * 500;
	resultJPY100 = resultInt/100;
	resultInt = resultInt - resultJPY100 * 100;
	resultJPY50 = resultInt/50;
	resultInt = resultInt - resultJPY50 * 50;
	resultJPY10 = resultInt/10;
	resultInt = resultInt - resultJPY10 * 10;
	resultJPY5 = resultInt/5;
	resultInt = resultInt - resultJPY5 * 5;
	resultJPY1 = resultInt/1;
	resultInt = resultInt - resultJPY1 * 1;
	}
	
	public void processReturn() {
	resultKRW5000 = returnKRW/5000;
	returnKRW = returnKRW - resultKRW5000 * 5000;
	resultKRW1000 = returnKRW/1000;
	returnKRW = returnKRW - resultKRW1000 * 1000;
	resultKRW500 = returnKRW/500;
	returnKRW = returnKRW - resultKRW500 * 500;
	resultKRW100 = returnKRW/100;
	returnKRW = returnKRW - resultKRW100 * 100;
	resultKRW50 = returnKRW/50;
	returnKRW = returnKRW - resultKRW50 * 50;
	resultKRW10 = returnKRW/10;
	returnKRW = returnKRW - resultKRW10 * 10;
	}
}

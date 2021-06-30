package project1;

public class ExchangeProject {
	
	public static void main(String[] args) {
	
		ExchangeInput ExchangeInput = new ExchangeInput();
		ExchangeOutput ExchangeOutput = new ExchangeOutput();
		ExchangeProcess ExchangeProcess = new ExchangeProcess();
		
		while(true) {
			
			ExchangeInput.inputKRW();
			if(ExchangeInput.inputKRW == 0) {
				ExchangeOutput.close();
				break;	
			}
			ExchangeInput.inputChangeType();
			ExchangeProcess.processResult(ExchangeInput.inputKRW, ExchangeInput.inputType);		
			ExchangeProcess.resultInt();
			ExchangeOutput.result(ExchangeProcess.resultInt, ExchangeProcess.exchangeType);
		
			switch(ExchangeInput.inputType) {
			case 1 :
			ExchangeProcess.processUSD();	
			ExchangeOutput.resultUSD(ExchangeProcess.resultUSD100, ExchangeProcess.resultUSD50, ExchangeProcess.resultUSD20, 
					ExchangeProcess.resultUSD10, ExchangeProcess.resultUSD5, ExchangeProcess.resultUSD2, ExchangeProcess.resultUSD1);
			break;
			case 2 :
			ExchangeProcess.processERU();
			ExchangeOutput.resultEUR(ExchangeProcess.resultEUR500, ExchangeProcess.resultEUR200, ExchangeProcess.resultEUR100, ExchangeProcess.resultEUR50,
					ExchangeProcess.resultEUR20, ExchangeProcess.resultEUR10, ExchangeProcess.resultEUR5);
			break;
			case 3 :
			ExchangeProcess.processJPY();
			ExchangeOutput.resultJPY(ExchangeProcess.resultJPY10000, ExchangeProcess.resultJPY5000, ExchangeProcess.resultJPY2000, ExchangeProcess.resultJPY1000,
					ExchangeProcess.resultJPY500, ExchangeProcess.resultJPY100, ExchangeProcess.resultJPY50, ExchangeProcess.resultJPY10,
					ExchangeProcess.resultJPY5, ExchangeProcess.resultJPY1);
			default:
			}
		
			ExchangeOutput.returnKRW(ExchangeProcess.returnKRW);
			ExchangeProcess.processReturn();
			ExchangeOutput.resultReturn(ExchangeProcess.resultKRW5000, ExchangeProcess.resultKRW1000, ExchangeProcess.resultKRW500, ExchangeProcess.resultKRW100, 
					ExchangeProcess.resultKRW50, ExchangeProcess.resultKRW10);
		}
	}
}	
		
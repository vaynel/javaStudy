package designPattern.factory;

public class Run {

	public static void main(String[] args) {
		
		// naver 메일을 보내보자 
		ConnectorFactory.createSMTPConnector("dawm").connect();
		
	}
}

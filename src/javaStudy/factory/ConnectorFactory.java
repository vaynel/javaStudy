package javaStudy.factory;

public class ConnectorFactory {
	
	// 인스턴스를 생성하는 코드가 한 곳에 모여있음.
	// 인스턴스를 생성하는 코드가 변결되었을때 여기도 변경한다.
	
	public static SMTPConnector createSMTPConnector(String mailName) {
		switch (mailName.toUpperCase()) {
		case "NAVER":
			return new NaverMail(EmailConf.NAVER_CONF);
		case "DAWM":
			return new DawmMail(EmailConf.DAWM_CONF);

		default:
			throw new RuntimeException("존재하지 않는 SMTP 서버 이름입니다");
		}
	}

}

package designPattern.factory;

public class DawmMail extends SMTPConnector {
	
	private EmailConf conf;

	protected DawmMail(EmailConf conf) {
		super();
		this.conf = conf;
	}
	@Override
	public void connect() {
		System.out.println("다음 메일에 연결");
		
	}

}

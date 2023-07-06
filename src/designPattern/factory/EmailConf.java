package designPattern.factory;

public enum EmailConf {
	
	NAVER_CONF("smtp.naver.com","mc","1234abc",5000),
	DAWM_CONF("stmp.dawm.com","jaehyun","123!@#",5000);
	
	public final String URL;
	public final String ID;
	public final String PASSWORD;
	public final int TIMEOUT_MS;
	
	private EmailConf(String URL, String ID, String PASSWORD, int TIMEOUT_MS) {
		this.URL = URL;
		this.ID = ID;
		this.PASSWORD = PASSWORD;
		this.TIMEOUT_MS = TIMEOUT_MS;
	}
	
	
	
}

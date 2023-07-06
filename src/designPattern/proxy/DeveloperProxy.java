package designPattern.proxy;

public class DeveloperProxy implements Developer {
	
	private Developer developer;
	
	public DeveloperProxy(Developer developer) {
		super();
		this.developer = developer;
	}

	@Override
	public void develop() {
		System.out.println("proxy : 오늘도 TIL을 작성합니다.");

		try {
			developer.develop();
		} catch (Exception e) {
			System.out.println("proxy : 쉬는 날이었다.");
			// TODO: handle exception
		}finally {
			System.out.println("proxy : 집에 간다.");
		}
		
	}

}

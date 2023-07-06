package designPattern.proxy;

public class Run {
	public static void main(String[] args) {
		System.out.println("proxy 공부");
		
		Developer man = new DeveloperProxy(new Man());
		man.develop();
	}

}

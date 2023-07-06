package designPattern.singleton;

public class Singleton {
	// final을 통해 JVM클래스가 초기화 과정에서 원자성 특성을 이용해 싱글톤 패턴의 초기화 문제에 대한 책임을 JVM에 떠넘긴다
	private static final Singleton instance = new Singleton();

	private Singleton() {
		// 생성자
	}
	
	public static Singleton getInstance() {
		return instance;
	}

}

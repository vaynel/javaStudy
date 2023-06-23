package javaStudy.templateMethod.framework.common;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

public abstract class JDBCTemplate {

	
	// singletone pattern 임으로 프로그램내에서 한번만 호출되는 생성자
	public JDBCTemplate() {
		try {
			
			// 클래스 정보 데이터는 static 영역에 올라가기 때문에, 한번만 드라이버를 등록하면 프로그램 종료 때 까지 메모리에 내려오지 않는다.
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void setConfig(Map<String,String> conf) {
		
	}
	
	// template method를 사용하여 쓰고싶은 하위 메서드 -> 자식 클래스에서 정의하여 사용
	public abstract Connection getConnection();
	
	public void commit(Connection conn) {
		try {
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void rollback(Connection conn) {
		try {
			conn.rollback();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void close(ResultSet rset) {
		try {
			if(rset!=null && !rset.isClosed()) rset.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void close(Statement stmt) {
		try {
			if(stmt != null && !stmt.isClosed())stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void close(Connection conn) {
		try {
			if(conn!=null && !conn.isClosed())conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void close(ResultSet rset, Statement stmt) {
		close(rset);
		close(stmt);
	}
	
	
	

	
}

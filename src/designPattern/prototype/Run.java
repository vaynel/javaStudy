package designPattern.prototype;

import java.util.List;

public class Run {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employees emps = new Employees();
		emps.loadDate();
		
		Employees empsNew = (Employees) emps.clone();
		Employees empsNew1 = (Employees) emps.clone();
		List<String> list = empsNew.getEmpList();
		list.add("Join");
		List<String> list1 = empsNew1.getEmpList();
		list1.remove("Pankaj");
		
		System.out.println("emps List : "+emps.getEmpList());
		System.out.println("empsNew List : "+ list);
		System.out.println("empsNew1 List : "+list1);
	}

}

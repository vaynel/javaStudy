package dataStructure;

public class MyArray {
	
	Object[] intArr;
	int count;
	
	public int ARRAY_SIZE;
	public static final int ERROR_NOM = -999999999;
	
	public MyArray() {
		count =0;
		ARRAY_SIZE = 10;
		intArr = new Object[ARRAY_SIZE];
	}
	
	public MyArray(int size) {
		count =0;
		ARRAY_SIZE = size;
		intArr = new Object[ARRAY_SIZE];
	}
	
	public void addElement(int num) {
		if(count>= ARRAY_SIZE) {
			System.out.println("not enough memory");
			return;
		}
		intArr[count++]=num;
	}
	
	public void insertElement(int position,int num) {
		
		int i;
		if(count>= ARRAY_SIZE) {
			System.out.println("not enough memory");
			return;
		}
		
		if(position<0 || position>count) {
			// index error
			System.out.println("insert Error : index error");
			return ;
		}
		
		for(i = count-1; i>=position; i--) {
			// 하나씩 이동해서 positon의 인덱스의 리스트를 비워둔다.
			intArr[i+1]=intArr[i];
		}
		intArr[position]=num;
		count++;
	}
	
	public Object removeElement(int position) {
		
		Object ret = ERROR_NOM;
		if(isEmpty()) {
			System.out.println("There is no element");
			return ret;
		}
		
		if(position <0 || position>= count ) {
			// index error
			System.out.println("remove error : index error");
			return ret;
		}
		
		ret = intArr[position];
		
		for (int i = position; i < count -1; i++) {
			intArr[i] = intArr[i+1];
			
		}
		count--;		
		return ret;
	}
	
	public int getSize(){
		return count;
	}
	
	
	
	public boolean isEmpty() {
		if(count ==0) {
			return true;
		}
		else return false;
	}
	
	
	public Object getElement(int position) {
		
		if(position < 0 || position > count-1){
			System.out.println("검색 위치 오류. 현재 리스트의 개수는 " + count +"개 입니다.");
			return ERROR_NOM;
		}
		return intArr[position];
	}
	
	public void printAll() {
		if(count ==0) {
			System.out.println("출력할 내용이 없습니다.");
			return; 
		}
		for (int i = 0; i < count; i++) {
			System.out.println(intArr[i]);
		}
	}
	
	public void removeAll() {
		for (int i = 0; i < count; i++) {
			intArr[i]=0;
		}
		count =0;
	}
	
	
}

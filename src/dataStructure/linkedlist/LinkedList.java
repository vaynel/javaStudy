package dataStructure.linkedlist;

public class LinkedList {

	private ListNode head;

	public LinkedList() {
		head = null;
	}
	
	// Node 중간에 삽입
	public void insertNode(ListNode preNode,String data) {
		ListNode newNode = new ListNode(data);
		newNode.link=preNode.link;
		preNode.link=newNode;
	}
	
	// 마지막에 데이터 추가
	public void insertNode(String data) {
		ListNode newNode = new ListNode(data);
		
		if(head ==null) {
			this.head = newNode;
		}else {
			ListNode tempNode = head;
			while(tempNode.link!=null) {
				tempNode = tempNode.link;
			}
			// tempNode의 link가 다음노드를 참조하도록함
			tempNode.link = newNode;
		}
		
	}
	
	// Node 삭제 중간에 
	public void deleteNode(String data) {
		ListNode preNode = head;
		ListNode tempNode = head.link;
		
		if(data.equals(preNode.getData())) {
			head = preNode.link;
			preNode.link=null;
		}else {
			while(tempNode != null) {
				if(data.equals(tempNode.getData())) {
					if(tempNode.link==null) {
						preNode.link = null;
					}else {
						preNode.link = tempNode.link;
						tempNode.link = null;
					}
					break;
				}else {
					preNode = tempNode;
					tempNode = tempNode.link;
				}
			}
		}
	}
	
	public void deletNode() {
		ListNode preNode;
		ListNode tempNode;
		
		if(head == null) {
			return;
		}else {
			preNode = head;
			tempNode = head.link;
			
			while(tempNode.link != null) {
				preNode = tempNode;
				tempNode = tempNode.link;
			}
			preNode.link = null;
		}
	}
	
	public ListNode searchNode(String data) {
        ListNode tempNode = this.head;    // temp 노드에 head가 가리키는 첫 번째 할당.
        
        // temp 노드가 null이 아닐 때까지 반복하여 탐색
        while(tempNode != null) {
            // 주어진 데이터와 temp 노드의 데이터가 일치할 경우 해당 temp 노드를 return
            if(data.equals(tempNode.getData())) {
                return tempNode;
            } else {
                // 데이터가 일치하지 않을 경우 temp 노드에 다음 노드 할당.
                tempNode = tempNode.link;
            }
        }
        
        return tempNode;
    }
	
	public void prinkList() {
		ListNode tempNode = this.head;
		
		while(tempNode != null) {
			System.out.print(tempNode.getData()+" ");
			tempNode = tempNode.link;
		}
		System.out.println();
	}

}

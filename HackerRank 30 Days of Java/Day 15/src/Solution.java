import java.util.LinkedList;
import java.util.Scanner;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}
class Solution {
	static LinkedList<Integer> nodeLinkedList = new LinkedList<Integer>();
	
	public static  Node insert(Node head,int data)
	{
		nodeLinkedList.addLast(data);
		Node lastNode = null;
		Node currentNode = null;
		for(int i = nodeLinkedList.size()-1;i > -1; i-- )
		{
			if(lastNode == null)
			{ 
				lastNode = new Node(nodeLinkedList.get(i));
			}
			else
			{
				currentNode = new Node(nodeLinkedList.get(i));
				currentNode.next = lastNode;
				lastNode = currentNode;
			}			
		}
		return currentNode;		
    }
	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}


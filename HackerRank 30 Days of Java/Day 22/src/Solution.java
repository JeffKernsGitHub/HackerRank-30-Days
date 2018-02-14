import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class Solution {
	public static int getHeight(Node root)
	{
		//Write your code here
		int rtnInt = 0;
		List<Node> currNodes = new ArrayList<Node>();
		List<Node> nextNodes = new ArrayList<Node>();
		Node tempNode;
		boolean isDone = false;
		if(root == null) return rtnInt;
		currNodes.add(root);
		do 
		{			
			Iterator<Node> foreach = currNodes.iterator();
			while (foreach.hasNext())
			{
				tempNode = foreach.next();
				if(tempNode.left != null ) nextNodes.add(tempNode.left);
				if(tempNode.right != null ) nextNodes.add(tempNode.right);				
			}		
			if(nextNodes.size() > 0)
			{
				rtnInt++;
			}
			else
			{
				isDone = true;				
			}			
			currNodes = nextNodes;
			nextNodes = new ArrayList<Node>();
		}
		while (!isDone);
		return rtnInt;
	      //End Write your code here
	}
	
	 public static Node insert(Node root,int data){
	        if(root==null){
	            return new Node(data);
	        }
	        else{
	            Node cur;
	            if(data<=root.data){
	                cur=insert(root.left,data);
	                root.left=cur;
	            }
	            else{
	                cur=insert(root.right,data);
	                root.right=cur;
	            }
	            return root;
	        }
	    }
		 public static void main(String args[]){
	        Scanner sc=new Scanner(System.in);
	        int T=sc.nextInt();
	        Node root=null;
	        while(T-->0){
	            int data=sc.nextInt();
	            root=insert(root,data);
	        }
	        sc.close();
	        int height=getHeight(root);
	        System.out.println(height);
	    }
	}
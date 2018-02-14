import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Node
{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution
{
	static void levelOrder(Node root)
	{
		if(root == null) return;
		String outString = "";
		List<Node> currNodes = new ArrayList<Node>();
		List<Node> nextNodes = new ArrayList<Node>();
		Node tempNode;
		boolean isDone = false;		
		currNodes.add(root);
		outString += String.valueOf(root.data);		
		do 
		{			
			Iterator<Node> foreach = currNodes.iterator();
			while (foreach.hasNext())
			{
				tempNode = foreach.next();
				if(tempNode.left != null )
				{
					nextNodes.add(tempNode.left);
					outString = outString+" "+String.valueOf(tempNode.left.data);
				}					
				if(tempNode.right != null )
				{
					nextNodes.add(tempNode.right);				
					outString = outString+" "+String.valueOf(tempNode.right.data);
				}
			}		
			if(nextNodes.size() == 0)			
			{
				isDone = true;				
			}			
			currNodes = nextNodes;
			nextNodes = new ArrayList<Node>();
		}
		while (!isDone); 
		System.out.println(outString);
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
            levelOrder(root);
        }	
}
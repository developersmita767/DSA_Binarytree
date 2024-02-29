import java.util.Scanner;
class node
{
	node left;
	int data;
	node right;
}
class binarytree
{
	static Scanner sc=new Scanner(System.in);
	static node create()
	{
	  System.out.print("enter data(-1 for no data) : ");
	  int x=sc.nextInt();
	  if(x==-1)
	  {
	   return null;
	  }
	  node p=new node();
	  p.data=x;
	  System.out.println("enter left child of "+x);
	  p.left=create();
	  System.out.println("enter right child of "+x);
	  p.right=create();
	  return p;
	}
	static void preorder(node root)
	{
	  if(root!=null)
	  {
	    System.out.println(root.data);
	    preorder(root.left);
	    preorder(root.right);

	  
	  }
	}
	static void inorder(node root)
	{
	  if(root!=null)
	  {
	     preorder(root.left);
	    System.out.println(root.data);
	    preorder(root.right);

	  
	  }
	}
	static void postorder(node root)
	{
	  if(root!=null)
	  {
	     postorder(root.left);
	     postorder(root.right);
	    System.out.println(root.data);
	  
	  }
	}
}
class Test
{
	public static void main(String args[])
	{
	  node root=binarytree.create();
	  binarytree.postorder(root);
	}
}
	 




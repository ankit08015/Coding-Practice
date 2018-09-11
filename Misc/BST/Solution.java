package BST;

import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{

    static void levelOrder(Node root) {
        //Write your code here

        Queue<Node> queue = new LinkedList<>();

        if (root != null) {
            queue.add(root);

            while (!queue.isEmpty()) {

                Node cur = queue.remove();
                System.out.println(cur.data + " ");

                if (cur.left != null) queue.add(cur.left);
                if (cur.right != null) queue.add(cur.right);


            }


        }
    }

    static void preOrder(Node root){
        if(root==null)return;
        System.out.println(root.data+ " ");
        preOrder(root.left);
        preOrder(root.right);
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




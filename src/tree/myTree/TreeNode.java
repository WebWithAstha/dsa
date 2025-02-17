package tree.myTree;

import java.util.Scanner;

public class TreeNode {
    int data;
    TreeNode left,right;

    TreeNode(int data ){
        this.data = data;
        left = right =null;
    }

    static Scanner sc;
    static {
        sc = new Scanner(System.in);
    }

    public static TreeNode buildTree(){
        int data = sc.nextInt();

        if(data == -1) return null;

        // make root node
        TreeNode root = new TreeNode(data);
        // ask for left of root
        System.out.println("Enter left of : "+root.data);
        root.left = buildTree();
        // ask for right of root
        System.out.println("Enter right of : "+root.data);
        root.right = buildTree();

        return root;
    }

    public static void inOrder(TreeNode head){
        if(head == null) return;

        inOrder(head.left);
        System.out.print(head.data+" , ");
        inOrder(head.right);

    }

    public static void main(String[] args) {
            TreeNode head = buildTree();
            inOrder(head);
    }

}

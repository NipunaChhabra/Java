class BinaryTreeOperations
{
    BinaryTreeNode root;
    
    public void createBt()
    {
        BinaryTreeNode n1 = new BinaryTreeNode(1, "aa");
         BinaryTreeNode n2 = new BinaryTreeNode(2, "bb");
          BinaryTreeNode n3 = new BinaryTreeNode(3, "cc");
           BinaryTreeNode n4 = new BinaryTreeNode(4, "dd");
            BinaryTreeNode n5 = new BinaryTreeNode(5, "ee");
        root=n1;
        n1.left=n2;
        n1.right=n3;
        n2.left=n4;
        n2.right=n5;   
         }
        
        private void preorder(BinaryTreeNode x)
        {
            System.out.println(x.rn+" " + x.name);
            if(x.left!=null)preorder(x.left);
            if(x.right!=null)preorder(x.right);
        }
        
        public void preorder()
        {
            preorder(root);
        }
        
        private void inorder(BinaryTreeNode x)
        {
            if(x.left!=null)inorder(x.left);
            System.out.println(x.rn+" " + x.name);
            if(x.right!=null)inorder(x.right);
        }
        
        public void inorder()
        {
            inorder(root);
        }
         
        private void postorder(BinaryTreeNode x)
        {
            if(x.left!=null)postorder(x.left);
            if(x.right!=null)postorder(x.right);
            System.out.println(x.rn+" " + x.name);
        }
        
        public void postorder()
        {
            postorder(root);
        }
        
    }
    
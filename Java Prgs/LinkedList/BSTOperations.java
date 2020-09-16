class BSTOperations
{
    BSTNode root;

    private void insert(BSTNode x, int num)
    {
        if(x==null){root=new BSTNode(num);
            return;}

        while(x!=null)
        {if(num<x.value && x.left==null)
            {BSTNode ni = new BSTNode(num);
                x.left=ni;
                break;
            }

            else if(num>=x.value && x.right==null)
            {BSTNode ni = new BSTNode(num);
                x.right=ni;
                break;
            }
            else if(num<x.value)x=x.left;
            else if(num>=x.value)x=x.right;
        }
    }

    public void insert(int value)
    {insert(root, value);
    }

    public void insert()
    {
        int dt[] = {1,2,4,56,7,8,90,};
        for(int i= 0; i<dt.length;i++)
        {insert(root, dt[i]);
        }
    }

    public void binSearch(int ns)
    {
        boolean found=false;
        BSTNode x = root;
        while(x!=null && found ==false)
        {
            if(ns==x.value)
                found=true;
            else if(ns<x.value)x=x.left;
            else x= x.right;    
        }
        if(found)System.out.println(ns+"is present in BST");
        else System.out.println(ns +"is not present in BST");
    }

    public void bSearch(int ns)
    {
        BSTNode x = root; int l =-1; boolean r=true;
        while(x!=null)
        {        l++;
            if(ns==x.value)
            { System.out.println(ns +"is found at: " + l);
                x= x.right; r=false;
            }
            else if(ns<x.value)x=x.left;
            else x= x.right;    
        }
        if(r)System.out.println(ns +"is not present in BST");
    }

    private void binSearchR(BSTNode x, int ns)
    {
        if(x==null)
            System.out.println(ns+"Not present");
        else if(ns==x.value)System.out.println(ns + "is present");
        else if (ns<x.value)binSearchR(x.left, ns);
        else if(ns>=x.value)binSearchR(x.right, ns);
    }

    public void binSearchR(int ns)
    {binSearchR(root,ns);
    }

    private void SearchR(BSTNode x, int ns, int l)
    {        if(x==null)
            System.out.println(ns+"Not present");
        else if(ns==x.value)System.out.println(ns + "is found at" + l);
        else if (ns<x.value){SearchR(x.left, ns, ++l);}
        else if(ns>=x.value){SearchR(x.right, ns, ++l);}
    }

    public void SearchR(int ns)
    {SearchR(root,ns,0);
    }

    private void deleteNode(BSTNode x, int num)
    {boolean l=true; BSTNode pre = null; boolean deleted = false;
        while(x!=null)
        {
            if(num==x.value && x.left ==null && x.right==null && l==true)
            {pre.left=null;
                deleted = true;
                break;
            }
            else if(num==x.value && x.left==null && x.right ==null && l==false)
            {pre.right =null;
                deleted = true;
                break;
            }
            else if(num<x.value)
            {pre=x; x=x.left; l=true;}
            else if(num>=x.value){pre=x; x=x.right; l=false;}
        }//end of while
        if(deleted == false)System.out.println("Not a leaf node; Can't be deleted");
    }
  
        
        private void inorder(BSTNode x)
        {
        if(x.left!=null)inorder(x.left);
        System.out.println(x.value);
        if(x.right!=null)inorder(x.right);
    }

    public void inorder()
    {inorder(root);
    }
    
    private int countNodesR(BSTNode x)
    {if(x==null)return 0;
        else
        {int count = 1;
            count = countNodesR(x.left);
            count = countNodesR(x.right);
            return count;
        }
    }

}

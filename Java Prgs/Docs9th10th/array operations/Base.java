class Base
{
    int A[]  = { 2,3,4,56,7,8,9,7,3,5,6,7,8,9,3,2,1,
        5,3,3,2,2,4,6,7,8,9
        ,0,89,85,58,25,32,21,41,0,0,0,0};
    int NE;
    public void elementNumber()
    {for(int i = A.length; i<0; i++)
        {
            if(A[i]>0)
            NE=i;
        }
    }
        
    }
    
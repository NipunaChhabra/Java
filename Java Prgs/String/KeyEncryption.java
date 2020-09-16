class KeyEncryption
{
    String key, data; int odd, even; char o, e;
    KeyEncryption(String key,String data)
    {this.data=data;
        this.key=key;}

    void interpretKey()
    {odd=(int)key.charAt(0);
        even =(int)key.charAt(2);
        o = key.charAt(1);
        e = key.charAt(3);
    }

    void encrypt()
    {String encrypt;
        for(int i= 0; i<data.length(); i++)
        {  char tO = data.charAt(i);
            if(o.equals('f'))t+=odd;
            if(o.equals('b')) t-=odd;
             
            if(
        }

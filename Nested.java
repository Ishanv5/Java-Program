                      /* Nested if else  statement  ...... */
    class Nested
    {
    	public static void main(String[] args)
        {
            int a=10,b=30,c=40;
            if(a>b)
            {
              if(a>c)
              {
                System.out.println(a);
              }
              else
              {
                System.out.println(c);
              }
            }
            else
            {
                if( b>c)
                {
                  System.out.println(b);
                }
                else
                {
                  System.out.println(c);
                }
            }
        }
    }
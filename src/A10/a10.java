package A10;

public class a10 {
    /*public a10(String []args){ //questtion 1
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=a+b;
        System.out.println(("sum is"+c));
    }
    */

    /*public a10(String []args){//question 2
       int sum=0;
       for(int i=0;i<args.length;i++)
           sum=sum+Integer.parseInt(args[i]);
       System.out.println("sum is"+sum);
    }*/
    /*public a10(String[]args){     //question 3
        for(int i=0;i<args.length;i++)
            System.out.println(args[i]);

    }*/
   /* public a10(String[]args){    //question 4
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int L;
        for(L=a>b?a:b;L<=a*b;L++)
            if(L%a==0&&L%b==0)
                break;
        System.out.println("LCM is"+L);

    }*/
    /*public a10(String []args){ //question 5
        int a=Integer.parseInt(args[0]);
        int i;
        for(i=2;i<a;i++)
            if(a%i==0)
                break;
        if(i==a)
            System.out.println("prime");
        else
            System.out.println("not prime");

    }*/
   /*public a10(String []args) {//question 6
       int a,i;
       for(int j=0;j<args.length;j++){
           a = Integer.parseInt(args[j]);
           for (i = 2; i < a; i++)
               if (a % i == 0)
                   break;
           if (i == a)
               System.out.println("prime");
       }
   }*/

    /*public a10(String[]args){//question 7
       int a=Integer.parseInt(args[0]);
       int f=1;
       while(a!=0){
           f=f*a;
           a--;
       }
       System.out.println("factorial is"+f);
    }*/

    /*public a10(String[]args){//question 8
        int a,b,s,i;
        for(int j=0;j<args.length;j++){
            a=Integer.parseInt(args[j]);
            b=a;
            s=0;
            while(b!=0){
                s=s+b%10;
                b=b/10;
            }
            System.out.println(a+"  "+s);
        }

    }*/
   /* public a10(String[]args){//question 9
        int a,max;
        max=Integer.parseInt(args[0]);
        for(int j=0;j<args.length;j++){
            a=Integer.parseInt(args[j]);
            if(max<a)
                max=a;
            }
            System.out.println("greatest number is"+max);
        }*/

    public a10(String[]args){//question10
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int H;
        for(H=a<b?a:b;H>=1;H--)
            if(a%H==0&&b%H==0)
                break;
        System.out.println("Hcm is"+H);

    }



        public void driver(){

    }
}


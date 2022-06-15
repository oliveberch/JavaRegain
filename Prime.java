class Prime
{
    public static void main(int a)
    {
        int [] rem = new int[a];
        int flag = 0;
        for(int i=0;i<a;i+=1)
        {
            int k=i+1;
            rem[i] = a%k;
            if(i>0 && i<a-1){
                if(rem[i]==0){
                    flag++;
                }
            }
        }
        if(flag == 0){
            System.out.print("Prime");
        }
        else{
            System.out.print("Not Prime");
        }
    }
}

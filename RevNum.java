class reverse
{
    public static void main(int a)
    {
        while(a != 0)
        {
            int c = a%10;
            System.out.print(c);
            a = a/10;
        }
    }
}
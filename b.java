class b
{
    public static void main(String args[])
    {
        int a=15;
        int b=30;
        int c=10;
        int max=((a>b)?a:b);
        System.out.println(max);
        int d=(a>b&&a>c)?a:(b>c)?b:c;
        System.out.println(d);
    }
}
        
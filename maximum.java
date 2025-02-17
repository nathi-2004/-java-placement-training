class maximum{
     public static void main (String[] args) {
    int a[]={1,8,5,3,4,7};
    int temp;
    for(int i=0;i<a.length;i++)
    {
        for(int j=i+1;j<a.length;j++)
{
    if(a[i]<a[j])
    
    {
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
}
    System.out.println(a[1]);
}    
}

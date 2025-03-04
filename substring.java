class Main{
    void string(){
        String a="$aba$";
        String rev = "";
      System.out.println("substring: "+a.substring(0,3));
        for (int i = a.length() - 1; i >= 0; i--) {
            rev=rev+ a.charAt(i); 
        }

        System.out.println("Reversed String: " + rev);
        if(a.equals(rev)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
     void stringbuilder(){
        String b = "Hello123$#@";
        StringBuilder sb = new StringBuilder(b);
        System.out.println("Reversed String: " + sb.reverse());
           System.out.println("substring: "+b.substring(0,7));
        if(b.equals(sb.reverse())){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
    
     void stringbuffer(){
         String c = "@abcde@";
        StringBuffer sb = new StringBuffer(c);
        System.out.println("Reversed String: " + sb.reverse());
           System.out.println("substring: "+c.substring(0,5));
         if(c.equals(sb.reverse().toString())){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
    
  void withoutstring() {
        String d= "13a$$a31";
        char[] charArray = d.toCharArray();
        for (int i = 0, j = charArray.length - 1; i < j; i++, j--) 
        {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }
        
        System.out.println("Reversed String: " + new String(charArray));
        if(d.equals(new String(charArray)))
        {
              System.out.println("palindrome");
            
        } else{
            System.out.println("not palindrome");
        }
    
}

     
    public static void main(String args[]){
        Main obj=new Main();
        obj.string();
         obj.stringbuilder();
         obj.stringbuffer();
         obj.withoutstring();
       
    }
}

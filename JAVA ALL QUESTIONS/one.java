public class one{
    public static void getSmallestAndLargest(String s, int k) {
        String a = s.substring(0, k);
        String b = s.substring(0, k);

        for (int i = 1; i <= s.length() - k; i++) {
            String cur = s.substring(i, i + k);
if (a.compareTo(cur) > 0) {
                a= cur;
            }

            if (b.compareTo(cur) < 0) {
                b= cur;
            }
        }
            

        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        String str = "hacker";
        int k = 3;
        getSmallestAndLargest(str, k);
 String str1 = "java";
      int   k2 = 2;
        getSmallestAndLargest(str1, k2);
    }
}

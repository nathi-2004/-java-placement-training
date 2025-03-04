 class Main {
    public static void main(String[] args) {
        String a = "I  LOVE   JAVA PROGRAMMING  ";
        StringBuilder rev = new StringBuilder();
        
        for (int i = a.length() - 1; i >= 0; i--) {
            char ch = a.charAt(i);

            if (ch != ' ') {
                rev.append(ch);
            } 
           
            else if (rev.length() > 0 && rev.charAt(rev.length() - 1) != ' ') {
                rev.append(' ');
            }
        }

        System.out.println("Reversed String with single spaces: " + rev.toString().trim());
    }
}

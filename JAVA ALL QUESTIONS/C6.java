import java.util.*;
 class C6 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the month: ");
        int month = in.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Invalid month");
        } else {
            String season = "";
            if (month >= 3 && month <= 5) {
                season = "Spring";
            } else if (month >= 6 && month <= 8) {
                season = "Summer";
            } else if (month >= 9 && month <= 11) {
                season = "Autumn";
            } else {
                season = "Winter";
            }
            System.out.println("Season: " + season);
        }
    }
}

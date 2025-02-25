public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 10, 10};

        int[] result = new int[arr.length];
        int resultIndex = 0;

        if (arr.length > 0) {
            int currentMax = arr[0];

            result[resultIndex++] = currentMax;

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] != currentMax) {
                    result[resultIndex++] = arr[i];
                    currentMax = arr[i];
                }
            }
        }

        for (int i = 0; i < resultIndex; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

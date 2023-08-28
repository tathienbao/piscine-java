public class SortArgs {
    public static void sort(String[] args) {
        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }

        for (int i = 0; i < numbers.length; i++) {
            int min = numbers[i];
            int minIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < min) {
                    min = numbers[j];
                    minIndex = j;
                }
            }

            int temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;
        }
        for (int i = 0; i < numbers.length; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(numbers[i]);
        }
        System.out.println();
    }
}
// Better solution:
// import java.util.Arrays;

// public class SortArgs {
//     public static void sort(String[] args) {
//         int[] numbers = new int[args.length];
//         for (int i = 0; i < args.length; i++) {
//             numbers[i] = Integer.parseInt(args[i]);
//         }
//         Arrays.sort(numbers);
        
//         for (int i = 0; i < numbers.length; i++) {
//             if (i > 0) {
//                 System.out.print(" ");
//             }
//             System.out.print(numbers[i]);
//         }
//         System.out.println();
//     }
// }
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class subsets {
//    class find {
//        public List<List<Integer>> finalAns = new ArrayList<>();
//
//        public void helper(int[] num, int index, List<Integer> combinationsFormedSoFar) {
//            // BASE CASE
//            if (index == num.length) {
//                finalAns.add(new ArrayList<>(combinationsFormedSoFar));
//                return;
//            }
//            // INCLUDE THE CURRENT ELEMENT IN OUR COMBINATION
//            helper(num, index + 1, combinationsFormedSoFar);
//                combinationsFormedSoFar.add(num[index]);
//
//            // DONT INCLUDE THE CURRENT ELEMENT IN OUR COMBINATION
//            helper(num, index + 1, combinationsFormedSoFar);
//            combinationsFormedSoFar.remove(combinationsFormedSoFar.size() - 1);
//        }
//
//        public List<List<Integer>> Answer(int[] num) {
//            helper(num, 0, new ArrayList<>());
//            return finalAns;
//        }
//    }
//
//    public static void main(String[] args) {
//        subsets obj = new subsets();
//        try (Scanner input = new Scanner(System.in)) {
//            System.out.print("Enter the number of elements in the array: ");
//            int n = input.nextInt();
//            int[] num = new int[n];
//            System.out.println("Enter the elements of the array: ");
//            for (int i = 0; i < n; i++) {
//                num[i] = input.nextInt();
//            }
//            System.out.print("The subsets of the given array are: " + obj.new find().Answer(num));
//        }
//    }
//}







import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class subsets {
    class find {
        public List<List<Integer>> finalAns = new ArrayList<>();

        public void helper(int[] num, int index, List<Integer> combinationsFormedSoFar) {
            // BASE CASE
            if (index == num.length) {
                finalAns.add(new ArrayList<>(combinationsFormedSoFar));
                System.out.println("Added " + combinationsFormedSoFar + " to final answer. Final answer is now: " + finalAns);
                return;
            }

            // INCLUDE THE CURRENT ELEMENT IN OUR COMBINATION
            System.out.println("Including element at index " + index + ": " + num[index]);
            combinationsFormedSoFar.add(num[index]);
            helper(num, index + 1, combinationsFormedSoFar);

            // DONT INCLUDE THE CURRENT ELEMENT IN OUR COMBINATION
            System.out.println("Excluding element at index " + index + ": " + num[index]);
            combinationsFormedSoFar.remove(combinationsFormedSoFar.size() - 1);
            helper(num, index + 1, combinationsFormedSoFar);
        }

        public List<List<Integer>> Answer(int[] num) {
            helper(num, 0, new ArrayList<>());
            return finalAns;
        }
    }

    public static void main(String[] args) {
        subsets obj = new subsets();
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the number of elements in the array: ");
            int n = input.nextInt();
            int[] num = new int[n];
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                num[i] = input.nextInt();
            }
            System.out.print("The subsets of the given array are: " + obj.new find().Answer(num));
        }
    }
}
//import java.util.ArrayList;
//import java.util.List;
//public class Subset {
////
//        public List<List<Integer>> subsets(int[] nums) {
//            List<List<Integer>> resultList = new ArrayList<>();
//
//            // Start backtracking from the beginning
//            backtrack(resultList, new ArrayList<>(), nums, 0);
//            return resultList;
//        }
//
//    private void backtrack(List<List<Integer>> resultList, List<Integer> tempSet,int[] nums, int start) {
//        // Add the set to result set
//            resultList.add(new ArrayList<>(tempSet));
//        System.out.println("Added " + tempSet + " to result sets. Result sets are now: " + resultList);
//
//        for (int i = start; i < nums.length; i++) {
//            // Case of including the number
//            tempSet.add(nums[i]);
//            System.out.println("Added " + nums[i] + " to temp set. Temp set is now: " + tempSet);
//
//            // Backtrack the new subset
//            System.out.println("Calling backtrack with start = " + (i + 1));
//            backtrack(resultList, tempSet, nums, i + 1);
//
//            // Case of not-including the number
//            tempSet.remove(tempSet.size() - 1);
//            System.out.println("Removed last element from temp set. Temp set is now: " + tempSet);
//        }
//    }
////private void backtrack(List<List<Integer>> resultSets, List<Integer> tempSet,int[] nums, int start) {
////    // Add the set to result set
////    resultSets.add(new ArrayList<>(tempSet));
////    System.out.println("Added " + tempSet + " to result sets. Result sets are now: " + resultSets);
////
////    for (int i = start; i < nums.length; i++) {
////        // Case of including the number
////        tempSet.add(nums[i]);
////        System.out.println("Added " + nums[i] + " to temp set. Temp set is now: " + tempSet);
////
////        // Backtrack the new subset
////        System.out.println("Calling backtrack with start = " + (i + 1));
////        backtrack(resultSets, tempSet, nums, i + 1);
////
////        // Case of not-including the number
////        tempSet.remove(tempSet.size() - 1);
////        System.out.println("Removed last element from temp set. Temp set is now: " + tempSet);
////    }
////    System.out.println("End of recursive call with start = " + start);
////    if (start < nums.length - 1) {
////        System.out.println("Incrementing i to " + (start + 1));
////    }
////}
//
//    public static void main(String[] args) {
//        Subset obj = new Subset();
//        int[] num = {1, 2, 3};
//        System.out.println("The subsets of the given array are: " + obj.subsets(num));
//    }
//
//
//
//
//
//
//
//
//
//
//
////        static void out(int n){
////            for(int i = 0; i < n; i++) {
////            System.out.pr3intln("Hello World!");
////
////        }
////        }
////
////
////
////    public static void main(String[] args) {
////        out(5);
////    }
//    }








import java.util.ArrayList;
import java.util.List;

public class Subset {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        backtrack(resultList, new ArrayList<>(), nums, 0);
        return resultList;
    }

    private void backtrack(List<List<Integer>> resultList, List<Integer> tempSet, int[] nums, int start) {
        resultList.add(new ArrayList<>(tempSet));
        System.out.println("Added " + tempSet + " to result sets. Result sets are now: " + resultList);

        for (int i = start; i < nums.length; i++) {
            System.out.println("Considering element at index " + i + ": " + nums[i]);

            // Case of including the number
            tempSet.add(nums[i]);
            System.out.println("Added " + nums[i] + " to temp set. Temp set is now: " + tempSet);

            // Backtrack the new subset
            System.out.println("Calling backtrack with start = " + (i + 1));
            backtrack(resultList, tempSet, nums, i + 1);

            // Case of not-including the number
            tempSet.remove(tempSet.size() - 1);
            System.out.println("Removed last element from temp set. Temp set is now: " + tempSet);
        }
    }

    public static void main(String[] args) {
        Subset obj = new Subset();
        int[] num = {1, 2, 3};
        System.out.println("The subsets of the given array are: " + obj.subsets(num));
    }
}
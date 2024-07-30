//import java.util.ArrayList;
//import java.util.List;
//public class combiSum {
//    class Solution {
//        public List<List<Integer>> ans = new ArrayList<>();
//        public void helper(int[] candidates, int target, int index, List<Integer> lst){
//          if(target == 0)
//        {
//            ans.add(new ArrayList<>(lst));
//            return;
//        }
//          if(index == candidates.length || target < 0)
//                return;
//
//        helper(candidates, target, index + 1, lst);
//        lst.add(candidates [index]);
//        helper(candidates, target - candidates [index], index, lst);
//        lst.remove(lst.size() - 1);
//    }
//    public List<List<Integer>> combinationSum (int[] candidates, int target){
//        helper (candidates, target, 0, new ArrayList<>());
//        return ans;
//    }
//}
//
//    public static void main(String[] args) {
//        combiSum obj = new combiSum();
//        int[] candidates = {2, 3, 6, 7};
//        int target = 7;
//        System.out.println("The combinations of the given array are: " + obj.new Solution().combinationSum(candidates, target));
//    }
//}





//import java.util.ArrayList;
//import java.util.List;
//
//public class combiSum {
//    class Solution {
//        public List<List<Integer>> ans = new ArrayList<>();
//
//        public void helper(int[] candidates, int target, int index, List<Integer> lst) {
//            if (target == 0) {
//                ans.add(new ArrayList<>(lst));
//                System.out.println("Target reached. Added " + lst + " to the answer list. Answer list is now: " + ans);
//                return;
//            }
//            if (index == candidates.length || target < 0) {
//                System.out.println("Index out of bounds or target less than 0. Returning...");
//                return;
//            }
//
//            System.out.println("Calling helper without including " + candidates[index] + " in the list.");
//            helper(candidates, target, index + 1, lst);
//
//            lst.add(candidates[index]);
//            System.out.println("Added " + candidates[index] + " to the list. List is now: " + lst);
//
//            System.out.println("Calling helper after including " + candidates[index] + " in the list.");
//            helper(candidates, target - candidates[index], index, lst);
//
//            lst.remove(lst.size() - 1);
//            System.out.println("Removed last element from the list. List is now: " + lst);
//        }
//
//        public List<List<Integer>> combinationSum(int[] candidates, int target) {
//            helper(candidates, target, 0, new ArrayList<>());
//            return ans;
//        }
//    }
//
//    public static void main(String[] args) {
//        combiSum obj = new combiSum();
//        int[] candidates = {2, 3, 6, 7};
//        int target = 7;
//        System.out.println("The combinations of the given array are: " + obj.new Solution().combinationSum(candidates, target));
//    }
//}






import java.util.ArrayList;
import java.util.List;

public class combiSum {
    class Solution {
        public List<List<Integer>> ans = new ArrayList<>();

        public void helper(int[] candidates, int target, int index, List<Integer> lst) {
            if (target == 0) {
                ans.add(new ArrayList<>(lst));
                System.out.println("Target reached. Added " + lst + " to the answer list. Answer list is now: " + ans);
                return;
            }
            if (index == candidates.length || target < 0) {
                System.out.println("Index out of bounds or target less than 0. Returning...");
                return;
            }

            // Try including the current number in the list
            lst.add(candidates[index]);
            System.out.println("Added " + candidates[index] + " to the list. List is now: " + lst);
            System.out.println("Calling helper after including " + candidates[index] + " in the list.");
            helper(candidates, target - candidates[index], index, lst);

            // Then try excluding the current number from the list
            lst.remove(lst.size() - 1);
            System.out.println("Removed last element from the list. List is now: " + lst);
            System.out.println("Calling helper without including " + candidates[index] + " in the list.");
            helper(candidates, target, index + 1, lst);
        }

        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            helper(candidates, target, 0, new ArrayList<>());
            return ans;
        }
    }

    public static void main(String[] args) {
        combiSum obj = new combiSum();
        Solution sol = obj.new Solution();
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        System.out.println("The combinations of the given array are: " + sol.combinationSum(candidates, target));
    }
}









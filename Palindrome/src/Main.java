// import java.util.Scanner;
// // public class Main {
// //     boolean isPalindrome(String S) {
// //         int i = 0;
// //         int j = S.length() - 1;
// //         for (i = 0; i < j; i++, j--) {
// //             if (S.charAt(i) != S.charAt(j)) {
// //                 return false;
// //             }
// //         }
// //         return true;
// //     }

// public class Main{
//     boolean isPalindrome(String S) {
//         int i = 0;
//         int j = S.length() - 1;
//         for (i = 0; i < j; i++, j--) {
//             if (S.charAt(i) != S.charAt(j)) {
//                 System.out.println(S + " is not a palindrome."); // Print result before returning
//                 return false;
//             }
//         }
//         System.out.println(S + " is a palindrome."); // Print result before returning
//         return true;
//     }

// public static void main(String[] args) {
// Main p = new Main();
// Scanner in = new Scanner(System.in);
// System.out.println("Enter the string: ");
// String variable = in.nextLine();
// p.isPalindrome(variable);
// }

//     public static void main(String[] args) {
//         Main p = new Main();
//         try (Scanner in = new Scanner(System.in)) {
//             System.out.println("Enter the string: "); // Move this line before reading the input
//             String variable = in.nextLine();
//             p.isPalindrome(variable); // Store the result of isPalindrome
//         }
//     }
// }

             // USING RECURSION
    import java.util.Scanner;
    public class Main {
        boolean isPalindrome(String S, int i, int j) {
            if (i > j) {
                return true;
            }
            return S.charAt(i) == S.charAt(j) && isPalindrome(S, i + 1, j - 1);
        }

        public static void main(String[] args) {
            Main p = new Main();
            try (Scanner in = new Scanner(System.in)) {
                // code that uses the Scanner object
                System.out.println("Enter the string:");
                String var = in.nextLine();
                System.out.println(
                        p.isPalindrome(var, 0, var.length() - 1) ? var + " is  palindrome." : var + " is not  palindrome.");
            }
        }
    }

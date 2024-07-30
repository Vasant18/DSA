//public class logN {
//    public int binarySearch(int[] array, int target) {
//        int left = 0;
//        int right = array.length - 1;
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//            if (array[mid] == target) {
//                System.out.println(mid);
//                return mid;
//            } else if (array[mid] < target) {
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//        } // Target not found
//          return -1;
//    }
//    public static void main(String[] args){
//        logN obj = new logN();
//        obj.binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 6);
//
//    }
//}







public class logN {
    public int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                System.out.println(mid);
                return mid; // Return the index if target is found
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        logN obj = new logN();
        int result = obj.binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 6);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
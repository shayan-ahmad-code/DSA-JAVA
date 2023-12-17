public class BinarySearch {
        // Binary search function
        public static int binarySearch(int[] arr, int target) {
            int left = 0;
            int right = arr.length - 1;
                 // Now search for Element.
            while (left <= right) {
                int mid = left + (right - left) / 2;
    
                // Check if the target is equal to the middle element
                if (arr[mid] == target) {
                    return mid;
                }
    
                // If the target is smaller, search the left half
                if (arr[mid] > target) {
                    right = mid - 1;
                }
                // If the target is larger, search the right half
                else {
                    left = mid + 1;
                }
            }
    
            // If the target is not found, return -1
            return -1;
        }
    
        public static void main(String[] args) {
            int[] sortedArray = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
            int target = 12;
    
            int result = binarySearch(sortedArray, target);
    
            if (result != -1) {
                System.out.println("Element found at index " + result);
            } else {
                System.out.println("Element not found in the array.");
            }
        }
    }
    


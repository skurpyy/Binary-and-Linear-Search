public class BinarySearchAlgorithm {


    public static void main(String[] args) {
        int[] sorted = {3,7,11,15,19,23,29,42,50};
        System.out.println("Binary Search for target of 42: " + BinarySearch(sorted, 42) ); // for an existent case
        System.out.println("Binary Search for target of 20: " + BinarySearch(sorted, 20) ); // for a nonexistent case
    }


    public static int BinarySearch(int A[], int Target) {
        int low = 0;
        int high = A.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A[mid] == Target) {
                return mid;

            } else if (A[mid] < Target) {
                low = mid + 1;
            } else {
                high = mid - 1;

            }
        }
            return -1;


        }
    }
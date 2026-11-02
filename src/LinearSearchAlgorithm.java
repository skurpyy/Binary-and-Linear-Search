
public class LinearSearchAlgorithm{

    public static int LinearSearch( int[] A, int Target){
        for (int i=0; i < A.length; i++){
            if (A[i] ==Target)
            return i;
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] raw = {17,4,23,9,23};

        System.out.println("Linear search for 23: " + LinearSearch(raw, 23)); //case for an existent element
        System.out.println("Linear search for 23: " + LinearSearch(raw, 8)); //case for a nonexistent element
    }
}
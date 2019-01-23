public class BinarySearch {
    public static void main(String args[]) {
       int array[] = {1,2,3,4,5,6,7,8,9,10};
        int index = binarySearch(array, 11);   
        System.out.println("index = " + index);
    }
    static int binarySearch(int array[], int item) {
        int low = 0;
        int high = array.length-1;
        System.out.println("high = " + high);
        while (low <= high) {
            int mid = (low+high)/2;
            System.out.println("mid = " + mid);
            if (item == array[mid]) {
                return mid;
            } else if (item>array[mid]) {
                low = mid +1;
            } else {
                high = mid-1;
            }
        }
        return -1;
    }
}

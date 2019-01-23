public class ArrayRecursiveTotal {
    public static void main(String args[]) {
       int array[] = {1,2,3,4,5,6,7,8,9,10};
        int total = sum(array, array.length-1);   
        System.out.println("total = " + total);
    }
    static int sum(int array[], int length) {
        int total;
        if (length == -1) {
            return 0;
        } else {
           total = array[length] + sum(array, length-1);
        }
        System.out.println("total = " + total);
        return total;
    }
}

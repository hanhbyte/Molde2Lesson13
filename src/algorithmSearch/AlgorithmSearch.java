package algorithmSearch;

public class AlgorithmSearch {
    public static void main(String[] args) {
    System.out.println(binarySearch(list, 2));  /* 0 */
    System.out.println(binarySearch(list, 11)); /* 4 */
    System.out.println(binarySearch(list, 79)); /*12 */
    System.out.println(binarySearch(list, 1));  /*-1 */
    System.out.println(binarySearch(list, 5));  /*-1 */
    System.out.println(binarySearch(list, 80)); /*-1 */
}
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
    static int binarySearch(int[] arr, int number) {
        int low = 0;
        int high = arr.length - 1;
        int midle;
        while (high >= low){
            midle = (low + high) /2;
            if (arr[midle] > number){
                high = midle - 1;
            }else if (arr[midle] < number){
                low = midle + 1;
            }else return midle;
        }
        return -1;
    }


}

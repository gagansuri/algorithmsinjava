public class BinarySearch {

    private int numbers[];
    private int N;

    public BinarySearch(){}

    public BinarySearch(int n, int[] arr) {
        this.N = n;
        this.numbers = arr;
        // or copy to a new array check this
    }


    public int search(int number, int[] arr) {


        int low = 0;
        int high = arr.length - 1;
        // check if the number if greater than arr[mid]
        while (low <= high) {
            int mid = low+(high - low) / 2;
            System.out.println("mid :" + mid);
            if (number < arr[mid]) {
                high = mid-1;
            } else if (number > arr[mid]) {
                low = mid+1;
            } else  {
                return mid;
            }
            }
        return -1;

    }


    public int recursiveBinarySearch(int number, int[] arr,int low,int high) {


        if (low <= high) {
            int mid = low+(high - low) / 2;
            System.out.println("mid :" + mid);
            if (number < arr[mid]) {
                high = mid-1;
                recursiveBinarySearch(number,arr,low,high);
            } else if (number > arr[mid]) {
                low = mid+1;
                recursiveBinarySearch(number,arr,low,high);
            } else  {
                return mid;
            }
        }
        return -1;

    }


    public static void main(String[] args) {
        BinarySearch bs=new BinarySearch();
        int[] arr=new int[]{5,8,9,10,12,15,17,19,21,33,34,37,67,78,88,89,90};

        //System.out.println(" number found at : "+bs.search(17,arr));
        System.out.println(" number found at : "+bs.search(-1,arr));

    }

}
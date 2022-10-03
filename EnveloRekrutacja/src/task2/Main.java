package task2;

public class Main {
    static int x = 1;
    public static void main(String[] args) {

        int[] numbers = new int[]{10,9,8,7,6,5,4,3,2,1};
        Main m = new Main();
        boolean myBoolean = m.search(numbers, x);
        System.out.println(myBoolean);


    }
    private boolean search(int[] numbers, int x){

        if(quickSearch(numbers, 0, numbers.length-1) == x){
            return true;
        }
        return false;

    }
    public int quickSearch(int numbers[], int n, int m){
        if((m-n)<2){
            return numbers[n] == x ? numbers[n] : numbers[m];
        }
        if(numbers[(m+n)/2]<x){
            return quickSearch(numbers, n, (m+n)/2);
        }else{
            return quickSearch(numbers, (m+n)/2, m);
        }
    }
}
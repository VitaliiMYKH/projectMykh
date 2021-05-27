public class app4Branch2 {
    public static void main (String[] args) {
        int [] arr ={1,5,9,6};
        System.out.println(arrSum(arr));
    }
    public static int arrSum ( int [] arr){
      int   sum = 0;
        for(int i : arr){
            sum = sum +i;
        }
        return sum;
    }
}

public class app4Branch2 {
    public static void main (String[] args) {
        int [] arr ={1,5,9,6};
        char[] charArr ={ 'f', 't', 'o', 'p','a','y','r','e','s','p','e','c','t'};
        System.out.println(arrSum(arr));
        System.out.println(makeString( charArr));
    }
    public static int arrSum ( int [] arr){
      int   sum = 0;
        for (int i : arr){
            sum = sum +i;
        }
        return sum;
    }
    public static String makeString (char[] cArr){
     //   StringBuilder sb = new StringBuilder();
     //   for (char i: cArr){
      //     sb.append(i);

        return new String(cArr);

        }
    }


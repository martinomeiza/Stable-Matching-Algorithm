import java.util.Random;

class stableMatching {

    public static void main(String[] args) {

        // int H, S, S1;

        Random rd = new Random();
        int[] arr = new int[10];
        // int k = n;
        for (int n = 20; n < arr.length; n += 10) {
            arr[n] = rd.nextInt();
            System.out.println(arr[n]);
        }

    }

}

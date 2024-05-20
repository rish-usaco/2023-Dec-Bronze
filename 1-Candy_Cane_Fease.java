import java.util.*;

public class CandyCaneFeast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        int M = scan.nextInt();
        
        long[] cowA = new long[N];
        for (int i = 0; i < N; i++) {
            cowA[i] = scan.nextInt();
        }
        
        for (int t = 0; t < M; t++) {
            long cLow = 0;
            long cHigh = scan.nextInt();
            int i = 0;
            while (cLow < cHigh) {
                //System.out.println("i: " + i);
                if (cowA[i] > cLow) {
                    long temp = cowA[i];
                    cowA[i] += Math.min(cowA[i], cHigh) - cLow;
                    cLow = temp;
                } 
                //System.out.println("cowA[" + i + "]: " + cowA[i]);
                //System.out.println("cLow: " + cLow);
                //System.out.println("cane: " + t);
                //System.out.println("------------------");
                i += 1;
                if (i >= N) {
                    break;
                }
            }
            
            
        }
        //System.out.println("end:");
        for (int i = 0; i < N; i++) {
            System.out.println(cowA[i]);
        }

    }       
}

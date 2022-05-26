import java.util.Arrays;
public class leetcode6075 {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int[] res=new int [capacity.length];
        for (int i = 0; i < capacity.length; i++) {
            res[i]=capacity[i]-rocks[i];
        }
        Arrays.sort(res);
        int sum=0;
        int i=0;
        int count=0;
      while(sum<additionalRocks&&i<res.length){
          sum+=res[i];
          count++;
          i++;
      }
      return count;
    }
}

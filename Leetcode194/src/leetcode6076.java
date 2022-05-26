import java.util.Arrays;
public class leetcode6076 {
    public int minimumLines(int[][] stockPrices) {
        for (int i = 0; i < stockPrices.length; i++) {
            Arrays.sort(stockPrices[i]);
        }
        int count=0;
        long  dao=Long.MIN_VALUE;
        long  tmp;
        if(stockPrices.length==1)return 0;
        for (int i = 1; i < stockPrices.length; i++) {
            if(stockPrices[i][0]-stockPrices[i-1][0]!=0){
                tmp=(stockPrices[i][1]-stockPrices[i-1][1])/(stockPrices[i][0]-stockPrices[i-1][0]);}
            else{
                tmp=Long.MAX_VALUE;
            }
            if(tmp!=dao){
                count++;
                dao=tmp;
            }

        }
        return count;
    }
}

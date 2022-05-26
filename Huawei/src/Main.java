

import java.util.*;
public class Main {
    public static void main(String[] args) {
        // please define the JAVA input here. For example: Scanner s = new Scanner(System.in);
        // please finish the function body here.
        // please define the  output here. For example: System.out.println(s.nextInt());
        Scanner sc = new Scanner(System.in);
        int[] paiz = new int[13];
        int[] pai2 = new int[13];
        int[] hua1 = new int[13];
        int[] hua2 = new int[13];
        int[] hua3 = new int[13];
        int[] hua4 = new int[13];
        while (sc.hasNext()) {
            int sum = sc.nextInt();
            for (int i = 0; i < sum; i++) {
                int huase = sc.nextInt();
                int pai = sc.nextInt();
                paiz[pai-1]=paiz[pai-1]+1;
                if (huase == 1) {
                    hua1[pai-1] = 1;
                }
                if (huase == 2) {
                    hua2[pai-1] = 1;
                }
                if (huase == 3) {
                    hua3[pai-1] = 1;
                }
                if(huase == 4){
                    hua4[pai-1] = 1;
                }
            }
            for (int j = 0; j < 13; j++) {
                if (paiz[j] == 4) {
                    System.out.println("1 "+(j+1));
                    System.out.println("2 "+(j+1));
                    System.out.println("3 "+(j+1));
                    System.out.println("4 "+(j+1));
                    paiz[j] = 0;
                }
            }
            for (int j = 0; j < 13; j++) {
                if (paiz[j] == 3) {
                    if (hua4[j] == 1) {
                        pai2[j] = 4;
                        hua4[j]=0;
                    } else if (hua3[j] == 1) {
                        pai2[j] = 3;
                        hua3[j]=0;
                    }
                    paiz[j]=2;
                }

            }
            for (int j = 0; j < 13; j++) {
                if (paiz[j] == 2) {
                    if (hua1[j] == 1) {
                        System.out.println("1 "+(j+1));
                        hua1[j] = 0;
                    }
                    if (hua2[j] == 1) {
                        System.out.println("2 "+(j+1));
                        hua2[j] = 0;
                    }
                    if (hua3[j] == 1) {
                        System.out.println("3 "+(j+1));
                        hua3[j] = 0;
                    }
                    if(hua4[j] == 1){
                        System.out.println("4 "+(j+1));
                        hua4[j] = 0;
                    }
                    paiz[j] =0;
                }
            }
            for (int j = 0; j < 13; j++) {
                if (pai2[j]!= 0) {
                    paiz[j] = 1;
                    if (pai2[j] == 3) {
                        hua3[j] = 1;
                    }
                    if (pai2[j] == 4)  {
                        hua4[j] = 1;
                    }
                }
            }
            for (int j = 0; j < 13; j++) {
                if (paiz[j] == 1) {
                    if (hua1[j] == 1) {
                        System.out.println("1 "+(j+1));
                    }
                    if (hua2[j] == 1) {
                        System.out.println("2 "+(j+1));
                    }
                    if (hua3[j] == 1) {
                        System.out.println("3 "+(j+1));
                    }
                    if (hua4[j] == 1) {
                        System.out.println("4 "+(j+1));
                    }
                }
            }
        }
    }
}

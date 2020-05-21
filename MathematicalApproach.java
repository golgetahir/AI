import java.util.*;
public class MathematicalApproach {
    public static void main(String Args[]){
        int k = 0;
        int m = 3;
        int n = 7;
        int d = 5;
        int x = 0;
        int y = 0;
        List solution = new ArrayList();
        List k_values = new ArrayList();
        solution.add("(0,0)");
        //ALGORITHM 2.1 AS DESCRIBED IMPLEMENTED ACCORDING TO THE GIVEN CONDITIONS SUMMING M AND SUBTRACTING N
        //CREATING THE PATH CHECKS FOR JUGS WHETHER FILLED OR NOT, EMPTIES THE JUG FIRST IF IT IS FILLED AND WANTS TO
        //BE FILLED AGAIN
        while(k != d) {
            while (k < n) {
                k = k + m;
                System.out.println(k);
                k_values.add(k);

                if(x == 0){
                    x = x+3;
                    solution.add("(" + x + "," + y + ")");

                }else if ( k == d ){
                    y = x;
                    x = 0;
                    solution.add("(" + x + "," + y + ")");
                    x += 3;
                    solution.add("(" + x + "," + y + ")");
                    y = d;
                    x = k - d;
                    solution.add("(" + x + "," + y + ")");
                    break;
                }
                else{
                    y += 3;
                    x = 0;
                    solution.add(("(" + x + "," + y + ")"));
                    x = 3;
                    solution.add("(" + x + "," + y + ")");
                }

            }
            while (k >= n) {
                k = k - n;
                k_values.add(k);
                System.out.println(k);
                if(y != 7){
                    x = x - (7 - y);
                    y = 7;
                    solution.add("(" + x + "," + y + ")");
                }
                y = 0;
                x = k - y;
                solution.add("(" + x + "," + y + ")");
            }
        }System.out.println(solution);
    }
}

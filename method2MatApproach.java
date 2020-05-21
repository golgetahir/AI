import java.util.ArrayList;
import java.util.List;

public class method2MatApproach {
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
        System.out.println("Steps of K");
        //ALGORITHM AS DESCRIBED SUMS UP N IN CONDITIONS AND SUBTRACT M IN GIVEN CONDITIONS
        //CREATING THE PATH CHECKS FOR JUGS WHETHER FILLED OR NOT, EMPTIES THE JUG FIRST IF IT IS FILLED AND WANTS TO
        //BE FILLED AGAIN
        while(k != d) {
            if (k < d) {
                k = k + n;
                if( y == 0) {
                    y = 7;
                    x = k - y;
                    solution.add("(" + x + "," + y + ")");
                    k_values.add(k);
                }else if(k != d){
                    x = y;
                    y = 0;
                    solution.add("(" + x + "," + y + ")");
                    y = 7;
                    solution.add("(" + x + "," + y + ")");
                }
                System.out.println(k);
            }
            else if (k > d){
                while( k > m ) {
                    k = k - m;
                    if(k == d){
                        x += y-d;
                        y = d;
                        solution.add("(" + x + "," + y + ")");
                        System.out.println(k);
                        k_values.add(k);
                        break;
                    }
                    if (x == 0){
                        x = m;
                        y = y - m;
                        solution.add("(" + x + "," + y + ")");
                        x = 0;
                        solution.add("(" + x + "," + y + ")");
                    }else{
                        x = 0;
                        solution.add("(" + x + "," + y + ")");
                        x += 3;
                        y -= 3;
                        solution.add("(" + x + "," + y + ")");
                    }
                    System.out.println(k);
                    k_values.add(k);
                }
            }
        }System.out.println("Path that goes to solution = " + solution);
    }
}

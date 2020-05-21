import java.util.*;

public class DFS2 {

    public static void main(String args[]){
        //Initializing the solution tree
        LinkedList<String> solution = new LinkedList<String>();
        solution.addFirst("(0,0)");
        int count = 0;
        List visited = new ArrayList();
        List road = new ArrayList();
        int solnumber = 0;

        //WILL STOP IF THE SOLUTION IS FOUND
        while(true){
            String data = solution.poll();
            count +=1;

            //STOP CONDITIONS FOR DEPTH FIRST SEARCH
            if (data == null){
                System.out.println("No solution - " + count);
                break;
            }
            if (data.equals("(5,0)")){
                solnumber +=1;
                if (solnumber < 2) {
                    road.add(data);
                    System.out.println("1st solution = " + road);
                    visited = road.subList(2,road.size()-1);
                    solution = new LinkedList<>();
                    solution.addFirst("(0,0)");
                    road = new ArrayList();
                    continue;
                }else{
                    road.add(data);
                    System.out.println("2nd solution = " + road);
                    break;
                }
            }

            //FOR KEEPING TRACK OF THE LOOPS, NO LOOP IS ALLOWED
            if (visited.contains(data)){
                continue;
            }
            road.add(data);

            //CONDITIONS OF THE PROBLEM AND TREE UPDATED ACCORDINGLY
            int x = Character.getNumericValue(data.charAt(1));
            int y = Character.getNumericValue(data.charAt(3));

            if (x+y > 3 && y < 3){
                int a = x + y - 3;
                solution.addFirst(  "(" + a + ",3)");
            }
            if (x+y <= 3 && x > 0){
                int a = x + y;
                solution.addFirst( "(0," + a + ")");
            }
            if (x+y > 7 && x < 7){
                int a = x + y - 7;
                solution.addFirst( "(7," + a + ")");
            }
            if (x+y <= 7 && y > 0){
                int a = x + y;
                solution.addFirst( "(" + a + ",0)");
            }
            if (y > 0){
                solution.addFirst("(" + x + ",0)");
            }
            if (x > 0){
                solution.addFirst("(0," + y + ")");
            }
            if (y < 3){
                solution.addFirst("(" + x + ",3)");
            }
            if (x < 7){
                solution.addFirst("(7," + y + ")");
            }
            visited.add(data);
            System.out.println(road);
        }

    }
}

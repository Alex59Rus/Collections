import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> colCount = new ArrayList();
        List<Integer> col = new ArrayList();
        col.add(3);
        col.add(8);
        col.add(15);
        col.add(17);
        int input = scanner.nextInt();
        for (int i = 0; i <= col.size(); i++) {
            int counter = input - col.get(i);
            //System.out.println(counter);
            if (col.contains(counter)) {
                if (true){
                    colCount.add(col.indexOf(counter));
                    System.out.println("result " + colCount);
                }
            }
        }
    }
}
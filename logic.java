import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> col = new ArrayList();
        col.add(2);
        col.add(3);
        col.add(4);
        col.add(8);
        System.out.println(col);
        int input = scanner.nextInt();
        for (int i = 0; i <= col.size(); i++) {
            int counter = input - col.get(i);
            //System.out.println(counter);
            if (col.contains(counter)) {
                if (true){
                    System.out.print(col.indexOf(counter) + " ");
                }
            }
        }
    }
}
import java.util.*;

public class main {
    public static void main(String[] args) {
        List<Integer> col2 = new ArrayList();
        List<Integer> col = new ArrayList();
        List<Integer> col1 = new ArrayList();
        col.add(4);
        col.add(5);
        col.add(6);
        col.add(6);
        col.add(8);
        col2.add(4);
        col2.add(5);
        col2.add(6);
        col2.add(7);
        col2.add(8);
        for (int i = 0; i < col.size(); i++) {
            for (int j = i+1; j < col.size(); j++) {
                if (col.get(i) == col.get(j)){
                    col1.add(col.get(i));
                }
            }
        }
        if (col1 != null){
            System.out.println("Result: true");
            System.out.println("Число " + col1 + " повторяется 2 раза");
        }
        if (col1 == null) {
            System.out.println("Result: false");
            System.out.println("Дубликатов нет");
        }
    }
}
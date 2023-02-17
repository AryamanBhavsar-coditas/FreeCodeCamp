import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayLisst {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();

        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);

        //A.remove(2);

        A.remove(Integer.valueOf(3));

        System.out.println(A.toString());

        System.out.println(A.get(3));

        A.set(2,10);

        A.sort(Comparator.reverseOrder());

        A.forEach(i ->{
            System.out.println(i+1);
        });

        System.out.println(A.toString());

        A.clear();
        System.out.println(A.toString());
    }

}

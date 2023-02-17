import java.util.Arrays;

public class Arrayss {
    public static void main(String[] args) {
        char vowels[]={'a','e','i','o','u'};
        char vowels2[]={'i','a','e','u','o'};
        int a[]={1,2,6,7,4,68,0};

        Arrays.sort(a);

        int key=4;
        int location= Arrays.binarySearch(a,key);


        System.out.println(location);

        System.out.println(Arrays.toString(vowels));
        System.out.println(Arrays.toString(a));

        //Arrays.fill(a,5);

        System.out.println(Arrays.toString(a));

        int b[] = Arrays.copyOf(a,a.length);

        System.out.println(Arrays.toString(b));


    }
}

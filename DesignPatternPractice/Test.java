import java.util.Arrays;
public class Test {
    public static void main(String[] args){
        Integer [] listA = new Integer[]{1,2,3,4,5};
        Integer [] listB = listA;
        listB[0] = 9;
        System.out.println(Arrays.toString(listA));
        System.out.println(Arrays.toString(listB));
    }
}

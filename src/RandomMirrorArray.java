import java.util.Arrays;
import java.util.Random;

public class RandomMirrorArray {

    public static void main(String[] args) {


        Random r = new Random();

        int arraySize = 9;

        int[] tab = new int[arraySize];

        for (int i=0 ; i < tab.length ; i++){
            tab[i] = r.nextInt(99)+1;
        }

        int[] tabMirror = new int[arraySize*2];
        for (int i=0 ; i < tab.length ; i++) {
            tabMirror[i] = tab[i];
            tabMirror[tabMirror.length-i-1] = tab[i];
        }


        System.out.println( Arrays.toString(tabMirror));



    }




}

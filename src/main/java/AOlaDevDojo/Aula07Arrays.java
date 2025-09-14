package AOlaDevDojo;

import java.util.ArrayList;
import java.util.List;

public class Aula07Arrays {
    public static void main(String[] args) {

        // tipo reference []
        int[] ages = new int[3];
        ages[0] = 12;
        ages[1] = 22;
        ages[2] = 32;
        for (int i = ages.length-1; i >=0 ; i--) {
            System.out.println("Idades -- " + ages[i]);
        }
    }
}

package scr.espm.poo.aula04;
import java.util.Arrays;

public class MainArrays {
    public static void main(String[] args){
        int [] ns = new int [10];

        for (int n : ns){
            System.out.println(n);
        }

        Arrays.asList(ns).forEach(n -> System.out.println(n));

        int [][] matriz = new int [][]{
            {4, 0, 1},
            {2, 7, 5},
        };
        for (int [] l:matriz){
            for (int c: l){
                System.out.println(c);
            }
        }
       
    }
}

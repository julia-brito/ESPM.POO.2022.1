package scr.espm.poo.aula03;
import javax.swing.event.SwingPropertyChangeSupport;

public class main {
    public static void main(String[] args){
        int N = 1000000;
        long t = System.currentTimeMillis();
        Pessoa[] ps = new Pessoa[N];
        for (int i = 0; i < N; i++){
            ps[i] = new Pessoa(i+"berto");
        }
        long a = System.currentTimeMillis();
        System.out.println("d1: "+ (a - t));
        System.out.println(Runtime.getRuntime().freeMemory()/1024/1024);

        System.gc();
        t = System.currentTimeMillis();
        System.out.println("d2: "+ (t - a));

        System.out.println(Runtime.getRuntime().freeMemory()/1024/1024);
    }
    
}

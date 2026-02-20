package retodiscos;

import java.util.ArrayList;

public class main {

    static int cont;

    public static void main(String[] args) {
        Disco badBunny = new Disco("Bad", "fe", "fe", 3.0, "", 8, "");
        Disco badBunny2 = new Disco("Bad", "fe", "fe", 3.0, "", 8, "");
        Disco badBunny3 = new Disco("Bad", "fe", "fe", 3.0, "", 8, "");
        Disco badBunny4 = new Disco("Bad", "fe", "fe", 3.0, "", 8, "");
        ArrayList<Disco> discos = new ArrayList<Disco>();

        System.out.println(discos.size());

        for (int i = 0; i < discos.size(); i++) {
            discos.add(cont, badBunny);
        }

    }
}

package dga;

public class Dga {

    public static void main(String[] args) {

        Animal v[] = new Animal[12];

        v[0] = new Gato("GILBERTO", 43);
        v[1] = new Gato("ISRAEL", 12);
        v[2] = new Gato("MORENÃO RS", 2);
        v[3] = new Gato("PAVAN", 6);
        v[4] = new Cachorro("GUSTAVO", 53);
        v[5] = new Cachorro("JORJE", 12453);
        v[6] = new Cachorro("AAAAAAAAAAAAAAAA", 81);
        v[7] = new Cachorro("MOTOR BITURBO", 12);
        v[8] = new Cavalo("SIM", 12);
        v[9] = new Cavalo("NÃO", 5);
        v[10] = new Cavalo("VABALO", 15);
        v[11] = new Cavalo("AGENOR", 1190);

        for (int i = 0; i < 9; i++) {
            v[i].emitirSom();
            System.out.println("\n ---- \n");
        }

    }

}

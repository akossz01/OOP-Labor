import java.util.ArrayList;
import java.util.Optional;

public class Halozat {
    //private ArrayList<Eszkoz> eszkozok = new ArrayList<>();
    private final Eszkoz[] eszkozok = new Eszkoz[256];

    private int elsoSzabad(){
        for (int i = 0; i < eszkozok.length; ++i) {
            if (eszkozok[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public boolean teleVanE(){
        if(elsoSzabad() == -1){
            return true;
        }
        return false;
    }

    public void kapcsolodas(Eszkoz e) {
        int IP = elsoSzabad();
        if (IP == -1) {
            System.out.println("A halozat tele van");
            return;
        }

        eszkozok[IP] = e;
        e.setIP(IP);

    }

    public void levalas(Eszkoz e) {
        for (int i = 0; i < 256; ++i){
            if(eszkozok[i] == e){
                eszkozok[i].setIP(-1);
            }
        }
        e = null;
    }

    public void listazas() {
        for (Eszkoz e : eszkozok) {
            if (e == null){
                continue;
            }
            System.out.println(e);
        }
    }

    public void listazMobil(){
        for (Eszkoz e:eszkozok){
            if(e == null){
                continue;
            }
            if (e.getClass() == Mobil.class){
                System.out.println(e);
            }
        }
    }
}

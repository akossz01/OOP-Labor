public class Main {
    public static void main(String[] args) {
        Halozat h = new Halozat();

        Eszkoz e1 = new Mobil("iOS", false);
        Eszkoz e2 = new Mobil("iOS", true);
        Eszkoz e3 = new Mobil("Android", false);

        Eszkoz e4 = new Szamitogep("MacOS", 256);
        Eszkoz e5 = new Szamitogep("Windows", 512);
        Eszkoz e6 = new Szamitogep("Linux", 512);

        h.kapcsolodas(e1);
        h.kapcsolodas(e2);
        h.kapcsolodas(e3);
        h.kapcsolodas(e4);
        h.kapcsolodas(e5);
        h.kapcsolodas(e5);

        System.out.println("Listazas\n");
        h.listazas();
        System.out.println("\nListaz mobil: \n");
        h.listazMobil();
    }
}

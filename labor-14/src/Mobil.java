public class Mobil extends Eszkoz{
    private boolean SIM;

    public Mobil(String oprendszer, boolean SIM){
        super(oprendszer);
        this.SIM = SIM;
    }

    public boolean isSIM(){
        return SIM;
    }

    public void setSIM(boolean SIM) {
        this.SIM = SIM;
    }

    @Override
    public String toString() {
        return super.toString() +  "Mobil{" +
                "SIM=" + SIM +
                '}';
    }
}

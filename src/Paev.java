import java.util.*

public class Paev {
    public String kuupaev;
    public List<Tund> tundideNimekiri;

    @Override
    public String toString() {
        return "Päev: " +
                "\nkuupäev: " + kuupaev +
                "\nTunnid: " + tundideNimekiri +
                "\n"
                ;
    }
}
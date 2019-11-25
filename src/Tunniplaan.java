import java.util.*;

public class Tunniplaan {
    public String nadal;
    public Map<String, List<Tund>> tunnid;

    @Override
    public String toString() {
        return "Tunniplaan:" +
                "\nnadal:\n" + nadal +
                "\ntunnid:\n" + tunnid
                ;
    }
}
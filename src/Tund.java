public class Tund {
    public String tund;
    public String algus;
    public String lopp;
    public String aine;
    public String grupp;
    public String opetaja;
    public String ruum;

    @Override
    public String toString() {
        return  "\nTund: " + tund +
                "\nAlgus: " + algus +
                "\nLõpp: " + lopp +
                "\nAine: " + aine +
                "\nGrupp: " + grupp +
                "\nOpetaja: " + opetaja +
                "\nRuum: " + ruum +
                "\n-------------------" +
                "\n"
                ;
    }
}
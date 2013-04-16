package adapter;

public class Traduttore {
    private boolean listo;
    public Traduttore() {
        listo=false;
    }

   
    /**
     * Activa la capacidad de traducción del subsistema
     * Cada vez que se traduce una palabra, se desactiva
     */

    public void activare() {
        listo=true;
    }

    /**
     *
     * @param parola la palabra a traducir
     * @return la palabra traducida
     * @throws WordException si se invoca este método antes de activar
     * la capacidad de traducción mediante el método {@link #activare()}
     */

    public String tradurre(String parola) throws WordException {
        String parolaFinale="";
        if (!listo) {throw new WordException();}
        switch (parola) {
        case "hola":
            parolaFinale = "ciao";
            break;
        case "adios":
            parolaFinale = "addio";
            break;
        default:
            parolaFinale = "sconosciuto";
            break;
        }
        listo=false;
        return parolaFinale;
    }
}
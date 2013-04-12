package adapter;

public class Traducteur {
    private String motOriginal;
    private String motTraduit;

       /**
       * Prepara la palabra a traducir
       */
    public void preparez(String mot) {
       this.motOriginal=mot;
    }

       /**
       * Traduce <b>internamente</b> la palabra anteriormente preparada
       */
    public void traduire() {
       switch (motOriginal) {
          case "hola":motTraduit="bojour";
             break;
          case "adios":motTraduit="adieu";
             break;
          default:motTraduit="mot inconnu";
             break;
       }
    }

       /**
       * Obtiene la palabra traducida previamente.
       */
       public String getMotTraduit() {
           return (this.motTraduit);
       }

 }
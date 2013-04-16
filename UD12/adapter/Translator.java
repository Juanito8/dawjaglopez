package adapter;

public class Translator {
    public String translate(String word) {
       String palabra=null;
       switch (word) {
          case "hola":palabra="hello";
             break;
          case "adios":palabra="bye";
             break;
          default:palabra="unknown";
             break;
       }
       return palabra;
    }
 }

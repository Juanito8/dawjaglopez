package adapter;

public class Translator {
    private String translate(String word) {
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

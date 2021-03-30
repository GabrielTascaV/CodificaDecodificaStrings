package Codificadores;

public class Codifica18106131 implements Codifica {
    public String alfabetoNormal = "abcdefghijklmnopqrstuvwxyz";
    public String alfabetoAlterado = "bcafedhgikjlnomqrptuswxvz";

    @Override
    public String codifica(String str){
        String codificada = "";
        for(int i = 0;i<str.length();i++){
            String letra = str.substring(i);
            int indexAlfabeto = alfabetoNormal.indexOf(letra);
            codificada += alfabetoAlterado.substring(indexAlfabeto);
        }
        codificada = new StringBuilder(codificada).reverse().toString();
        return codificada;
    }

    @Override
    public String decodifica(String str){
        String decodificada = "";
        str = new StringBuilder(str).reverse().toString();
        for(int i = 0;i<str.length();i++){
            String letra = str.substring(i);
            int indexAlfabeto = alfabetoAlterado.indexOf(letra);
            decodificada += alfabetoNormal.substring(indexAlfabeto);
        }
        return decodificada;
    }

    @Override
    public String getMatriculaAutor() {
        return "18106131";
    }

    @Override
    public String getNomeAutor() {
        return "Gabriel Tasca Villa";
    }
}

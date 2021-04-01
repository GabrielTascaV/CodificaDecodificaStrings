package Codificadores;

public class Codifica18106131 implements Codifica {
    public String alfabetoNormal = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ:çãâôõéêÇÃÂÔÕÉÊ/*?{}()[]";
    public String alfabetoAlterado = "bcaefdhigkjlnomqrptuswxvyzBCAEFDHIGKLJNOMQRPTUSWXVZY-ôçõâéêãÔÇÕÂÉÊÃ()[]*?/{}";

    
    public String codifica(String str){
        String saida = "";
        String letra = "";
        for(int i = 0; i<str.length();i++){
            letra = Character.toString(str.charAt(i));
            for( int j = 0; j<alfabetoNormal.length();j++){
                if(letra.equals(Character.toString(alfabetoNormal.charAt(j)))){
                    saida += alfabetoAlterado.charAt(j);
                }
            }
            
        }
        
        saida = new StringBuilder(saida).reverse().toString();
        return saida;
    }
    
    public String decodifica(String str){
        String saida = "";
        String letra = "";
        str = new StringBuilder(str).reverse().toString();
        for(int i = 0; i<str.length();i++){
            letra = Character.toString(str.charAt(i));
            for( int j = 0; j<alfabetoAlterado.length();j++){
                if(letra.equals(Character.toString(alfabetoAlterado.charAt(j)))){
                    saida += alfabetoNormal.charAt(j);
                }
            }
            
        }
        return saida;
    }

   
    public String getMatriculaAutor() {
        return "18106131";
    }

    
    public String getNomeAutor() {
        return "Gabriel Tasca Villa";
    }
}

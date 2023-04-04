import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("digite a frase");
        String frase = scan.nextLine();
        Pilhas pilha = new Pilhas(frase.length());  
        String palavra = "";
        
        for (int i = 0; i < frase.length(); i++) {
            String l =  Character.toString(frase.charAt(i));
            
            if (!(l.equals(" "))){
                palavra+=l;
                
            }
            else {pilha.push(palavra);
                palavra = "";};
            
        } 
        pilha.push(palavra);
        
        frase = "";
        int tamanhoPilha = pilha.length();
        for (int i = 0; i < tamanhoPilha; i++) {
            palavra = "";
            palavra = pilha.top();            
            if (palavra != null) {
                for (int j = palavra.length()-1; j >=0;  j--) {
                    frase+= Character.toString(palavra.charAt(j));
                }
                frase+=" ";
                
            }
            pilha.pop();
        }
        System.out.println(frase);
       
    }
}

import java.sql.Array;

public class Pilhas{
    private int top;
    private int tamanho; 
    private String[] pilha;
    

    Pilhas(int tamanho){
        this.tamanho = tamanho;
        this.pilha = new String[tamanho];
        this.top = -1;
    }
 
    public void push(String string){
        this.top++;
        if(this.top < 0) this.top = 0; 
        
        if (this.top >= this.tamanho){
            this.top = this.tamanho -1;
            System.out.println("você ja atingiu o limite da sua fila, não pode adicionar mais valores ");
            return;
        }
        this.pilha[this.top] = string;
    }

    public void pop(){
        if (this.top == -1){
            System.out.println("Sua pilha ja esta vazia");
            return;
        }
        this.top--;
    }
    public int length(){
        return this.top+1;
    }
    public String top(){
        if (this.top < 0){
            System.out.println("sua pilha esta vazia");
            return null;
        }
        return pilha[this.top];
    }

      
} 
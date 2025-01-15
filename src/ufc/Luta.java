package ufc;

import java.util.Random;

public class Luta {
    
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //Metodos publicos
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante =l2;
        }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    
    public void lutar(){
        if(this.aprovada == true){
            System.out.println("-------DESAFIADO-------");
           this.desafiado.apresentar(); 
           System.out.println("-------DESAFIANTE-------");
           this.desafiante.apresentar(); 
           
           Random aleatorio = new Random();
           int vencedor = aleatorio.nextInt(3);
           switch(vencedor){
               case 0 -> {
                   //Empate
                   System.out.println("-------------------------");
                   System.out.println("Empatou!");
                   this.desafiado.empatarLuta();
                   this.desafiante.empatarLuta();
                }
               case 1 -> {
                   //Desafiado vence
                   System.out.println("-------------------------");
                   System.out.println("Vitória do " + this.desafiado.getNome());
                   this.desafiado.ganharLuta();
                }
                   
               case 2 -> {
                   //Desafiante vence
                   System.out.println("-------------------------");
                   System.out.println("Vitória do " + this.desafiante.getNome());
                   this.desafiante.ganharLuta();
                }
           }
                

        }else{
                    System.out.println("A luta não pode acontecer!");
                   }
        
    }
    
    //Metodos Especiais
    
    //Getters e Setters
  public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}

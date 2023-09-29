public class Pessoa {
    protected String nome, ocupacao, CPF;
    int matricula, idade; 
    
    public Pessoa(){
        
    }
    public void imprimir(){
        System.out.println("Nome:" +this.nome);
        System.out.println("ocupacao" +this.ocupacao);
        System.out.println("CPF" +this.nome);
        System.out.println("matricula:" +this.matricula);
        System.out.println("idade:" +this.idade);
    }
    public class Funcionario extends Pessoa{
        
        
    }
}

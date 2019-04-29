
package empresa;


public class Funcionario extends Pessoa{
    String nome;
    Funcionario(String nome){
        super(nome);
        this.nome = nome;
    } 
    public String trabalhando() {
        return "trabalhando";
}
}

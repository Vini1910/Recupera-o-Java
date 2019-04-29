
package empresa;



public class Chefe extends Pessoa{
    String nome;
    Chefe(String nome){
        super(nome);
        this.nome = nome;
    }
    public String chefia () {
        return "Administrando";
    }    
}


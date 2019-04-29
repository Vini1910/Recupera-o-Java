
package empresa;


import java.util.ArrayList;
import java.util.List;


public class Empresa {

   static String local ;
           
    public static void main(String[] args) {
        Local l = new Local();
        l.nome = "empresa";
        
        Empresa.local = l.nome;
        
        List <Pessoa> pessoas= new ArrayList <Pessoa>();
        Pessoa w = new Funcionario("vinvicius");
        Pessoa c = new Funcionario("nicoly");
        Pessoa n = new Chefe("Maria");
        Pessoa me = new Chefe("Eduarda");
   
        pessoas.add(w);
        pessoas.add(c);
        pessoas.add(n);
        pessoas.add(me);
        
        if(Empresa.local.equals("almoço")){
            for(Pessoa a:pessoas){
            System.out.println(a.nome);
            System.out.println(a.baterPapo());
            }
        }
        if(Empresa.local.equals("empresa")){
            for(Pessoa a: pessoas){
                System.out.println(a.nome);
                if( a instanceof Chefe ){       
                    System.out.println(((Chefe) a).chefia());
                }
                if( a instanceof Funcionario ){  
                    System.out.println(((Funcionario) a).trabalhando());
                
                }                
            }
        }
    }   
}


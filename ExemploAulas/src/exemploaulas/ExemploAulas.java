package exemploaulas;


public class ExemploAulas {

    
    private static void mostrarCPF(Pessoa pessoa){
        System.out.println(pessoa.getCpf());
    }
    
    public static void main(String[] args) {
       //EXEMPLO PRA MOSTRAR COMO FUNCIONA  Exemplo de modificação.
       Pessoa x = new Pessoa("Edvan", "000.000.000-00", 22, 1.89);
       mostrarCPF(x);
       mostrarCPF(x);
       mostrarCPF(x);
       
    }
    
}

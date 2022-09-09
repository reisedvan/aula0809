
package exemploaulas;


public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;
    private double altura;

    public Pessoa(String nome, String cpf, int idade, double altura) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.altura = altura;
    }

    public Pessoa() {
        
    } 
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        String retorno = cpf.substring(0,4);
        retorno+="***.***";
        retorno+=cpf.substring(11,14);
        return retorno;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
           
}

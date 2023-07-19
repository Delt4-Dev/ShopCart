import java.lang.String;
public class Stock {
    private String nome;
    private int valor;
    private int quantidade;

    public Stock(String n, int v, int q) {
        this.nome = n;
        this.valor = v;
        this.quantidade = q;
    }

    public Stock(String n,int q){
        this.nome = n;
        this.quantidade = q;
    }

    public int getQuantidade() {return quantidade;}
    public int getValor() {return valor;}
    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public void setValor(int valor) {this.valor = valor;}

}

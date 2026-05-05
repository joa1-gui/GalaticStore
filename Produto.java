public class Produto{
    String nome;
    double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public void aplicarDesconto(double porcentagem){
        this.preco -= this.preco * (porcentagem/100);
        System.out.println("Novo preço: "+ this.preco);
    }
}

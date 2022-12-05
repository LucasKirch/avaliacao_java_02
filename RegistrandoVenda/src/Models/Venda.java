package Models;
public class Venda {


    public Venda(Vendedor vendedor, Produto produto, double desconto, int quantidadeItens) {
        this.vendedor = vendedor;
        this.produto = produto;
        this.desconto = desconto;
        this.quantidadeItens = quantidadeItens;
        this.valor = valor;
    }

    private Vendedor vendedor;
    private Produto produto ;
    private double desconto;
    private int quantidadeItens;
    private double valor;


    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }

    public double getValor() {
        return produto.getValorVenda()*getQuantidadeItens();
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}

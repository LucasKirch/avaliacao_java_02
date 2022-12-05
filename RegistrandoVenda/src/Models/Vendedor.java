package Models;
public class Vendedor {

    private String nome;
    private int codigo;
    private double comissao;
    private String endereco;

    public Vendedor(String nome, int codigo, String endereco, double comissao) {
        this.nome = nome;
        this.codigo = codigo;
        this.endereco = endereco;
        this.comissao = comissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


}

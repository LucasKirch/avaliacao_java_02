package Service;
import Models.Produto;
import Models.Venda;
import Models.Vendedor;

import java.util.Scanner;


public class ViewService {


    public static void ExibirMenuPrincipal() {

        System.out.println("*****************MENU*****************" + "\n");
        System.out.println("1 - CADASTRAR VENDEDOR");
        System.out.println("2 - REGISTRAR VENDA");
        System.out.println("3 - RESUMO DA VENDA");
        System.out.println("100 - ENCERRAR" + "\n");

        System.out.println("*************************************");

    }


    public static void ExibirInformacoesVenda(Produto produto, Venda venda, Vendedor vendedor) {
        System.out.println("-----------------------RESUMO------------------------------");
        System.out.println("**** VENDEDOR");
        System.out.println("CODIGO: " + vendedor.getCodigo());
        System.out.println("NOME: " + vendedor.getNome());
        System.out.println("ENDEREÇO: " + vendedor.getEndereco());
        System.out.println("COMISSAO: " + vendedor.getComissao() + "%");
        System.out.println("**** VENDA");
        System.out.println("PRODUTO: " + produto.getDescricao());
        System.out.println("CODIGO: " + produto.getCodigo());
        System.out.println("QUANTIDADE: " + venda.getQuantidadeItens());
        System.out.println("VALOR: " + venda.getValor());
        System.out.println("DESCONTO: " + venda.getDesconto());
        System.out.println("TOTAL: " + (venda.getValor() - venda.getDesconto() ));
        System.out.println("-------------------------------------------------");

    }





    public static void ExibirMensagemAlerta(String msg) {
        System.out.println("*****************ALERTA*****************" + "\n");
        System.out.println(msg + "\n");
        System.out.println("*************************************");
    }

    public static void ExibirMensagem(String msg) {
        System.out.println(msg);
    }

    public static void Encerrar() {

        System.out.close();
        System.out.println("ENCERRANDO...");
        System.exit(-1);
    }


    public static String CapturarEntrada() {

        Scanner scanner = new Scanner(System.in);

        String dado = scanner.next();

        return dado;

    }



}

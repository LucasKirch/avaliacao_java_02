import Models.Produto;
import Models.Venda;
import Models.Vendedor;
import Service.ViewService;
import Exceptions.*;
import java.lang.Exception;
import javax.swing.text.View;
import java.util.Scanner;

public class Main {

    public static Vendedor vendedorClasse = new Vendedor("", 0, "", 0);
    public static Venda vendaClasse = new Venda(null, null, 0, 0);
    public static Produto produtoClasse = new Produto(0, "", 0,0,false);

    public static void main(String[] args)  {
        boolean isEncerrar = false;

        while (isEncerrar == false){
            try {
                ViewService.ExibirMenuPrincipal();
                String opcao = ViewService.CapturarEntrada();
                tratarEscolhaMenu(opcao);

            }catch (ExitException e) {
                isEncerrar = true;
                ViewService.ExibirMensagemAlerta(e.getMessage());
            }catch (InvalidValueExcepetion e) {
                isEncerrar = false;
                ViewService.ExibirMensagemAlerta(e.getMessage());
            } catch (Exception e) {
                isEncerrar = false;
                ViewService.ExibirMensagemAlerta("Valor inválido! Retornando ao menu principal...");
                ViewService.ExibirMenuPrincipal();
            }
        }

    }
    public static void tratarEscolhaMenu(String opcao) throws ExitException, InvalidValueExcepetion{
       boolean escolhaCorreta = false;

            while (escolhaCorreta == false ) {
                switch (opcao) {
                    case "1": {
                        escolhaCorreta = true;
                        Vendedor vendedor = ObterVendedor();

                        vendedorClasse = vendedor;

                        ViewService.ExibirMensagem("Vendedor cadastrado com sucesso!");
                        break;
                    }
                    case "2": {
                        escolhaCorreta = true;
                        Venda venda = ObterVenda();
                        vendaClasse = venda;
                        ViewService.ExibirMensagem("Venda realizada com sucesso!");
                        break;
                    }
                    case "3": {
                        escolhaCorreta = true;

                        if(vendaClasse.getProduto() != null){
                            ViewService.ExibirInformacoesVenda(produtoClasse, vendaClasse,vendedorClasse);

                        }else {
                            ViewService.ExibirMensagem("Nenhuma venda cadastrada! Favor, primeiramente cadastre uma venda.");
                        }
                        break;
                    }
                    case "100": {
                        escolhaCorreta = true;
                        throw new ExitException("Encerrando o sistema...");
                    }
                    default : {

                        ViewService.ExibirMensagem("Opção inválida, digite novamente:");
                        opcao = ViewService.CapturarEntrada();
                        escolhaCorreta = false;
                        break;
                    }
                }
            }

    }

    public static Vendedor ObterVendedor() throws InvalidValueExcepetion {
        int codigo = 0;

        ViewService.ExibirMensagem("Digite o nome do vendedor");
        String nome = ViewService.CapturarEntrada();

        ViewService.ExibirMensagem("Digite o endereço");
        String endereco = ViewService.CapturarEntrada();

        ViewService.ExibirMensagem("Digite o percentual de comissao deste vendedor");
        String comissao = "";
        Double comissaoDouble;
        try {
            comissao = ViewService.CapturarEntrada();
            comissaoDouble = Double.valueOf(comissao);
        }catch (Exception ex){
            throw new InvalidValueExcepetion("Valor da comissão é inválido. Vendedor não cadastrado.");
        }

        Vendedor vendedor = new Vendedor(nome, codigo, endereco,comissaoDouble );
        return vendedor;
    }


    public static Venda ObterVenda() throws InvalidValueExcepetion {

        if(vendedorClasse.getNome() != "") {
            Produto produto = new Produto(1, "Shampool 500 ml", 15, 11, false);



            ViewService.ExibirMensagem("Digite o valor de desconto para a venda.");
            String desconto;
            Double descontoDouble;
            try {
                desconto = ViewService.CapturarEntrada();
                descontoDouble = Double.valueOf(desconto);
            }catch (Exception ex){
                throw new InvalidValueExcepetion("Valor do desconto é inválido. Venda não registrada.");
            }

            ViewService.ExibirMensagem("Digite a quantidade de produtos para a venda.");
            String qtd = "";
            int qtdInt;
            try {
                qtd = ViewService.CapturarEntrada();
                qtdInt = Integer.parseInt(qtd);
            }catch (Exception ex){
                throw new InvalidValueExcepetion("Valor da quantidade é inválido. Venda não registrada.");
            }
            Venda venda = new Venda(vendedorClasse, produto, descontoDouble, qtdInt);

            produtoClasse = produto;

            return  venda;

        }else {
            throw new InvalidValueExcepetion("Vendedor ainda não cadastrado. Favor, cadastre um vendedor!");

        }

    }



}
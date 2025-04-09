import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public  class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        ArrayList<Produto> produtos = new ArrayList<>();
        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("admin", "102030"));

        Login(usuarios, teclado);

        int opcaoGeral;

        do {
            System.out.println("+========= MENU PRINCIPAL =========+");
            System.out.println("1. Menu de Clientes");
            System.out.println("2. Menu de Produtos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcaoGeral = teclado.nextInt();
            teclado.nextLine();

            switch (opcaoGeral) {
                case 1:
                    menuPessoas(pessoas, teclado);
                    break;
                case 2:
                    menuProdutos(produtos, teclado);
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcaoGeral != 0);

    }
    public static void menuPessoas(ArrayList<Pessoa> pessoas, Scanner teclado){
        int opcao;

        do {
            System.out.println("+========= CADASTRO DE CLIENTE =========+");
            System.out.println("1. Cadastrar pessoa");
            System.out.println("2. Listar pessoas");
            System.out.println("3. Remover pessoa");
            System.out.println("0. Voltar ao menu principal ");
            System.out.print("Escolha uma opção: ");
            opcao = teclado.nextInt();
            teclado.nextLine();

            if (opcao == 1) {
                cadastrarPessoa(pessoas, teclado);
            } else if (opcao == 2) {
                listarPessoa(pessoas);
            } else if (opcao == 3) {
                removerPessoa(pessoas, teclado);
            } else if (opcao != 0) {
                System.out.println("Indice inválido.");
            }
        } while (opcao != 0);
        System.out.println("Retornando ao menu principal...");
    }

    public static void cadastrarPessoa (ArrayList<Pessoa> pessoas, Scanner teclado) {
        System.out.println("Digite o nome: ");
        String nome = teclado.nextLine();

        System.out.println("Digite a idade: ");
        int idade = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Digite seu email: ");
        String email = teclado.nextLine();

        System.out.println("Digite seu CPF (somente numeros): ");
        String cpf = teclado.nextLine();
        System.out.println("Digite o telefone para contato: ");
        String telefone = teclado.nextLine();


        for (Pessoa p : pessoas) {
            if (p.getCpf().equals(cpf)) {
                System.out.println("CPF já cadastrado!");
                return;
            }
        }

        Pessoa p = new Pessoa(nome, idade, cpf, email, telefone);
        pessoas.add(p);
        System.out.println("Pessoa cadastrada com sucesso!");
    }

    public static void listarPessoa(ArrayList<Pessoa> pessoas) {
        for (Pessoa p : pessoas) {
            p.exibirDados();
        }
    }

    public static void removerPessoa(ArrayList<Pessoa> pessoas, Scanner teclado) {
        for (int i = 0; i < pessoas.size(); i++) {
            System.out.println("[" + i + "]");
            pessoas.get(i).exibirDados();
        }
        System.out.println("Digite o número para ser removido");
        int indice = teclado.nextInt();
        teclado.nextLine();

        if (indice >= 0 && indice < pessoas.size()) {
            pessoas.remove(indice);
            System.out.println("Pessoa removida com sucesso!");
        }
    }

    public static void menuProdutos(ArrayList<Produto> produtos, Scanner teclado) {
        int opcaoProduto;
        do {
            System.out.println("+========= CADASTRO DE PRODUTO =========+");
            System.out.println("1. Cadastrar produto");
            System.out.println("2. Listar produto");
            System.out.println("3. Remover produto");
            System.out.println("4. Editar produto");
            System.out.println("0. Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");
            opcaoProduto = teclado.nextInt();
            teclado.nextLine();

            if (opcaoProduto == 1) {
                cadastrarProduto(produtos, teclado);
            } else if (opcaoProduto == 2) {
                listarProdutos(produtos);
            } else if (opcaoProduto == 3) {
                removerProduto(produtos, teclado);
            } else if (opcaoProduto == 4){
                editarProduto(produtos, teclado);
            }
            else if (opcaoProduto != 0) {
                System.out.println("Indice inválido.");
            }
        } while (opcaoProduto != 0);
        System.out.println("Retornando ao menu principal...");
    }

    public static void cadastrarProduto(ArrayList <Produto> produtos, Scanner teclado) {
        System.out.println("Digite o nome do produto: ");
        String nomeProduto = teclado.nextLine();

        System.out.println("Digite o código do produto: ");
        int idProduto = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Digite o tipo do produto: ");
        String tipoProduto = teclado.nextLine();

        System.out.println("Digite a quantidade em estoque: ");
        int qtdProduto = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Digite o valor unitário do produto: ");
        double valorUnitario = teclado.nextDouble();



        for(Produto prod: produtos){
            if(prod.getIdProduto() == (idProduto)){
                System.out.println("Id do produto já cadastrado!");
                return;
            }
        }

        Produto prod = new Produto(nomeProduto, idProduto, tipoProduto, qtdProduto, valorUnitario);
        produtos.add(prod);
        System.out.println("Produto cadastrado com sucesso!");
    }


    public static void listarProdutos(ArrayList<Produto> produtos){
        for (Produto prod : produtos) {
            prod.exibirDadosProduto();
        }
    }
    public static void removerProduto(ArrayList<Produto> produtos, Scanner teclado) {
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println("[" + i + "]");
            produtos.get(i).exibirDadosProduto();
        }
        System.out.println("Digite o número para ser removido");
        int indice = teclado.nextInt();
        teclado.nextLine();

        if (indice >= 0 && indice < produtos.size()) {
            produtos.remove(indice);
            System.out.println("Produto removido com sucesso!");
        }
    }
    public static void editarProduto(ArrayList<Produto> produtos, Scanner teclado){
        for(int i = 0; i < produtos.size(); i++){
            System.out.println("[" + i + "]");
            produtos.get(i).exibirDadosProduto();
        }
        System.out.println("Digite o numero do produto que deseja editar");
        int indice = teclado.nextInt();
        teclado.nextLine();

        if(indice < 0 || indice >= produtos.size()){
            System.out.println("Índice inválido! Nenhum produto será editado.");
            return;
        }

        System.out.println("Escolha o tópico a ser editado: ");
        System.out.println("1. Nome do produto");
        System.out.println("2. Tipo do produto");
        System.out.println("3. Quantidade em estoque");
        System.out.println("4. Valor unitário");
        System.out.println("0. Sair");
        int escolha = teclado.nextInt();
        teclado.nextLine();

        Produto prodSelecionado = produtos.get(indice);
        switch (escolha) {
            case 1:
                System.out.println("1. Digite o novo nome do produto: ");
                String novoNome = teclado.nextLine();
                prodSelecionado.setNomeProduto(novoNome);
                System.out.println("Nome atualizado com sucesso.");
                break;
            case 2:
                System.out.println("2. Digite o novo tipo do produto: ");
                String novoTipoProduto = teclado.nextLine();
                prodSelecionado.setTipoProduto(novoTipoProduto);
                System.out.println("Tipo do produto atualizado com sucesso: ");
                break;
            case 3:
                System.out.println("3. Digite a nova quantidade em estoque:  ");
                int novoQtdProduto = teclado.nextInt();;
                teclado.nextLine();
                prodSelecionado.setQtdProduto(novoQtdProduto);
                System.out.println("Quantidade atualizada com sucesso, agora a quantidade é: "+novoQtdProduto);
                break;
            case 4:
                System.out.println("Digite o novo valor unitário do produto: ");
                double novoValorUnitario = teclado.nextDouble();
                prodSelecionado.setValorUnitario(novoValorUnitario);
                System.out.println("Valor atualizado com sucesso, agora o produto custa: R$"+novoValorUnitario);
            default:
                System.out.println("Cancelar edição");
        }

    }
    public static void Login(ArrayList <Usuario> usuarios, Scanner teclado){

        boolean logado = false;
        while (!logado){
            System.out.println("Id de usuário: ");
            String login = teclado.nextLine();

            System.out.println("Senha: ");
            String senha = teclado.nextLine();

            for (Usuario u : usuarios) {
                if (u.getLogin().equals(login) && u.getSenha().equals(senha)) {
                    logado = true;
                    break;
                }
            }
            if(!logado){
                System.out.println("Login ou senha incorretos. Tente novamente.");
            }

        }
        System.out.println("Login realizado com sucesso.");
    }
}
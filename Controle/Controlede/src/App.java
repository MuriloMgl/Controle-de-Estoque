import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> produtos = new ArrayList<>();
        ArrayList<Integer> qtdProduto = new ArrayList<>();
        ArrayList<Double> precoProduto = new ArrayList<>();

        int opcao = 0;

        while (opcao != 5) {
            System.out.println("\n-----ESTOQUE-----\n");
            System.out.println("1 | Listar Produtos");
            System.out.println("2 | Cadastrar Produtos");
            System.out.println("3 | Repor Produto");
            System.out.println("4 | Retirar Produto");
            System.out.println("5 | Sair");

            try {

                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1: {
                        System.out.println("\n-----PRODUTOS-----\n");

                        if (produtos.isEmpty()) {
                            System.out.println("Não há nenhum produto cadastrado");
                        } else {
                            for (int i = 0; i < produtos.size(); i++) {
                                System.out.println(
                                        (i + 1) + " -" + " Produto: " + produtos.get(i) + " |" + " Quantidade: "
                                                + qtdProduto.get(i) + " |" + " Preço: R$ " + precoProduto.get(i));
                            }
                        }
                        break;
                    }

                    case 2: {
                        System.out.println("\n-----CADASTRAR PRODUTOS-----");

                        System.out.println("Digite  o nome do produto: ");
                        String nome = sc.nextLine();

                        System.out.println("Digite a quantidade: ");

                        int quantidade;

                        try {
                            quantidade = sc.nextInt();
                            sc.nextLine();
                        } catch (InputMismatchException e) {
                            System.out.println("Digite uma quantidade válida.");
                            sc.nextLine();
                            break;
                        }

                        if (quantidade <= 0) {
                            System.out.println("Digite uma quantidade válida.");
                            break;
                        }

                        System.out.println("Informe o valor: ");

                        double preco;

                        try {
                            preco = sc.nextDouble();
                            sc.nextLine();
                        } catch (InputMismatchException e) {
                            System.out.println("Informe um valor válido.");
                            sc.nextLine();
                            break;
                        }

                        if (preco <= 0) {
                            System.out.println("Informe um valor válido.");
                            break;
                        }

                        produtos.add(nome);
                        qtdProduto.add(quantidade);
                        precoProduto.add(preco);

                        System.out.println("O produto foi cadastrado!");
                        break;
                    }

                    case 3: {
                        System.out.println("\n-----REPOR PRODUTO-----\n");

                        if (produtos.isEmpty()) {
                            System.out.println("Não há nenhum produto cadastrado");
                            break;
                        }

                        for (int i = 0; i < produtos.size(); i++) {
                            System.out.println((i + 1) + " -" + " Produto: " + produtos.get(i) + " Quantidade: "
                                    + qtdProduto.get(i));
                        }

                        System.out.println("Digite o número do produto: ");

                        int produto;

                        try {
                            produto = sc.nextInt();
                            sc.nextLine();
                        } catch (InputMismatchException e) {
                            System.out.println("Digite um número válido");
                            sc.nextLine();
                            break;
                        }

                        if (produto < 1 || produto > produtos.size()) {
                            System.out.println("Número inválido");
                            break;
                        }

                        int indice = produto - 1;

                        System.out.println("Informe a quantidade que deseja repor: ");

                        int quantidade;

                        try {
                            quantidade = sc.nextInt();
                            sc.nextLine();
                        } catch (InputMismatchException e) {
                            System.out.println("Digite uma quantidade válida");
                            sc.nextLine();
                            break;
                        }

                        if (quantidade <= 0) {
                            System.out.println("A quantidade deve ser maior que zero");
                            break;
                        }

                        qtdProduto.set(indice, qtdProduto.get(indice) + quantidade);
                        System.out.println("Produto reposto.");

                        break;

                    }

                    case 4: {
                        System.out.println("\n-----RETIRAR PRODUTO-----\n");

                        if (produtos.isEmpty()) {
                            System.out.println("Não há nenhum produto cadastrado");
                            break;
                        }

                        for (int i = 0; i < produtos.size(); i++) {
                            System.out.println((i + 1) + " -" + " Produto: " + produtos.get(i) + " Quantidade: "
                                    + qtdProduto.get(i));
                        }

                        System.out.println("Digite o número do produto: ");

                        int produto;

                        try {
                            produto = sc.nextInt();
                            sc.nextLine();
                        } catch (InputMismatchException e) {
                            System.out.println("Digite um número válido");
                            sc.nextLine();
                            break;
                        }

                        if (produto < 1 || produto > produtos.size()) {
                            System.out.println("Número inválido");
                            break;
                        }

                        int indice = produto - 1;

                        System.out.println("Informe a quantidade que deseja retirar: ");

                        int quantidade;

                        try {
                            quantidade = sc.nextInt();
                            sc.nextLine();
                        } catch (InputMismatchException e) {
                            System.out.println("Digite uma quantidade válida");
                            sc.nextLine();
                            break;
                        }

                        if (quantidade <= 0) {
                            System.out.println("A quantidade deve ser maior que zero");
                            break;
                        }

                        qtdProduto.set(indice, qtdProduto.get(indice) - quantidade);
                        System.out.println("Produto retirado.");

                        break;

                    }

                }

            } catch (Exception e) {

            }

        }

    }

}
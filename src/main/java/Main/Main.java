package Main;

import domain.*;
import domain.enums.ProductType;
import domain.enums.ProductValid;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Deseja criar um E-commerce?\n(1) SIM\n(2) NÃO\nR: ");
        int optional = sc.nextInt();

        while (optional != 1) {
            if (optional == 2)
                break;
            System.out.println("Opção inválida! Escolha entre as opções (1) SIM ou (2) NÃO");
            System.out.print("Deseja criar um E-commerce?\n(1) SIM\n(2) NÃO\nR: ");
            optional = sc.nextInt();
        }
        switch (optional) {
            case 1:
                System.out.print("Escolha um nome: ");
                sc.nextLine();
                String name = sc.nextLine();
                ECommerce ecommerce = new ECommerce(name);
                System.out.print("Deseja criar um estoque para seu E-commerce agora?\n(1) Sim\n(2) NÃO\nR: ");
                optional = sc.nextInt();
                switch (optional) {
                    case 1:
                        System.out.print("Qual o tipo do estoque?\n(1) Comida\n(2) Bebida\nR: ");
                        optional = sc.nextInt();
                        switch (optional) {
                            case 1:
                                System.out.print("(1) Perecível ou\n(2) Não perecível?\nR: ");
                                optional = sc.nextInt();
                                Stock stock;
                                if (optional == 1) {
                                    stock = new FoodStock("Comida", ProductValid.PERISHABLE);
                                } else {
                                    stock = new FoodStock("Comida", ProductValid.NON_PERISHABLE);
                                }
                                System.out.println("E-commerce criado!");
                                ecommerce.getStocks().add(stock);
                                System.out.println(ecommerce);
                                stock.productsList();
                                System.out.print("Deseja adicionar algum produto agora?\n(1) SIM\n(2) NÃO\nR: ");
                                optional = sc.nextInt();
                                if (optional == 1) {
                                    System.out.print("Qual o código do estoque? ");
                                    int code = sc.nextInt();
                                    System.out.print("Qual o nome do produto? ");
                                    sc.nextLine();
                                    name = sc.nextLine();
                                    System.out.print("Qual a quantidade? ");
                                    int quantity = sc.nextInt();
                                    System.out.print("Qual o preço unitário? ");
                                    double price = sc.nextDouble();
                                    Product product = new Product(code, name, quantity, price);
                                    System.out.println("Produto adicionado com sucesso!");
                                    stock.getProducts().add(product);
                                    System.out.println(ecommerce);
                                    stock.productsList();
                                    break;
                                } else {
                                    System.out.println("Tudo bem! Então seu E-commerce ficou assim :D");
                                    System.out.println(ecommerce);
                                    stock.productsList();
                                    break;
                                }
                            case 2:
                                System.out.print("(1) Lata ou\n(2) Garrafa?\nR: ");
                                optional = sc.nextInt();
                                if (optional == 1) {
                                    stock = new DrinkStock("Bebida", ProductType.CAN);
                                } else {
                                    stock = new DrinkStock("Bebida", ProductType.BOTTLE);
                                }
                                System.out.println("E-commerce criado!");
                                ecommerce.getStocks().add(stock);
                                System.out.println(ecommerce);
                                stock.productsList();
                                System.out.print("Deseja adicionar algum produto agora?\n(1) SIM\n(2) NÃO\nR: ");
                                optional = sc.nextInt();
                                if (optional == 1) {
                                    System.out.print("Qual o código do estoque? ");
                                    int code = sc.nextInt();
                                    System.out.print("Qual o nome do produto? ");
                                    sc.nextLine();
                                    name = sc.nextLine();
                                    System.out.print("Qual a quantidade? ");
                                    int quantity = sc.nextInt();
                                    System.out.print("Qual o preço unitário? ");
                                    double price = sc.nextDouble();
                                    Product product = new Product(code, name, quantity, price);
                                    System.out.println("Produto adicionado com sucesso!");
                                    stock.getProducts().add(product);
                                    System.out.println(ecommerce);
                                    stock.productsList();
                                } else {
                                    System.out.println("Tudo bem! Então seu E-commerce ficou assim :D");
                                    System.out.println(ecommerce);
                                    stock.productsList();
                                }
                        }
                }
            case 2:
                if (optional == 1 || optional == 2) {
                    System.out.println();
                    System.out.println("Obrigado por testar!");
                    break;
                }
        }
        sc.close();
    }
}

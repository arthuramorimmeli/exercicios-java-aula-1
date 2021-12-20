package programs;

import programs.models.Product;

import java.util.ArrayList;
import java.util.List;

public class List2Exercicio3 {

    private List<Product> products;

    public void runProgram() {
        initValues();
        this.printShoppingCart();
        System.out.println("\nTotal: " + this.showTotalShoppingCart());
    }

    private void initValues() {
        products = new ArrayList<>();
        Product arroz = new Product("Arroz", 10.99, 2);
        Product feijao = new Product("Feijão", 14.49, 1);
        Product tomate = new Product("Tomate", 9.99, 5);
        products.add(arroz);
        products.add(feijao);
        products.add(tomate);
    }

    private void printShoppingCart() {
        products.forEach(product -> {
            System.out.println(
                    "\nName: "+ product.getName() +
                    "\nPrice: R$ " + product.getValue() +
                    "\nQuantity: " + product.getQuantity());
        });
    }

    private Double showTotalShoppingCart() {
        double total = 0.0;
        for (Product product : this.products) {
            total = product.getValue() * product.getQuantity();
        }
        return total;
    }

}

package lab4;

public class ProductTest {
    public static void main(String[] args) {
        Product product = new Product("Iphone 17",23,78000.00);
        Product product1 = new Product();

        System.out.println(product.getProductId());
        System.out.println(product1.getProductId());

        System.out.println(product.getName()  +" "+ product.getQuantity()+ " " + product.getPrice());

        System.out.println(product.getItemValue());

        product1.setName("galaxy Z Fold7");
        product1.setQuantity(20);
        product1.setPrice(50000.00);

        System.out.println(product1.toString());
    }

}

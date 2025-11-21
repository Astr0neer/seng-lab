package lab4;

public class Product {
    private String name;
    private int quantity;
    private double price;
    private  double productId;
    private  static int idCounter=1;

    Product(){
        name = "Unknown";
        quantity =0;
        price =0.00;
         productId =idCounter++;
    }
    Product(String name,int quantity, double price){
        this.price = price;
        this.quantity = quantity;
        this.name = name;
        productId =idCounter++;
    }



    public String getName() {
        return name;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public double getProductId() {
        return productId;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if(price <0){
            price =0;
        }
        else{
            this.price = price;
        }

    }

    public void setProductId(double productId) {
        this.productId = productId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public  double getItemValue(){
         return price*quantity;
    }


    @Override
    public String toString() {
        return this.name +  " "+ this.price;
    }
}

package arrays;

public class Product {
    private String name;
    private  int priceInCents;

    //Getter

    public String getName(){
       return name;
    }

    public Product (String name, int priceInCents){
        this.name = name;
        this.priceInCents = priceInCents;
    }

    public int getPriceInCents(){
        return priceInCents;
    }

    public static double getAverage(Product[] product) {
        double price = 0;
        for (Product products : product) {
            price += products.getPriceInCents();

        }
        return price / product.length;
    }


    public static void main(String[] args) {
        Product newOne = new Product("Gun", 1000);
        Product newTwo = new Product("Sword", 1500);
        Product newThree = new Product("Bat", 3000);

        Product[] customers = {
                newOne,
                newTwo,
                newThree
        };

        double average = getAverage(customers);

        System.out.printf("The average is $%.2f",average);


    }




}



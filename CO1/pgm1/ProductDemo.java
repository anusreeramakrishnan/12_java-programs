class Product {
    String pcode;
    String pname;
    double price;

    void SetValues(String pc, String pn, double p) {
        pcode = pc;
        pname = pn;
        price = p;
    }

    String FindLowestPrice(Product p1, Product p2, Product p3) {
        if (p1.price < p2.price && p1.price < p3.price)
            return p1.pname;
        if (p2.price < p1.price && p2.price < p3.price)
            return p2.pname;
        else
            return p3.pname;
    }
}

public class ProductDemo {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        String lname;

        p1.SetValues("P1", "Soap", 30);

        p2.SetValues("P2", "shampoo",45 );

        p3.SetValues("P3", "oil", 40);

        lname = p3.FindLowestPrice(p1, p2, p3);

        System.out.println("\nProduct having lowest price is : " + lname + "\n");

    }
}
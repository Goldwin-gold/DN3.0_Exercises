import java.util.Arrays;
import java.util.Comparator;
public class Product {
    private int productId;
    private String productName;
    private String category;

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Product[] products={
                new Product(1,"gaming console","electronics"),
                new Product(2,"CPU","electronics"),
                new Product(3,"graphics card","electronics"),
                new Product(4,"monitor","electronics")
        };
        Arrays.sort(products,Comparator.comparing(Product::getProductName));
        Product found1=Linear.linear(products,3);
        System.out.println("the linear search"+found1);
        Product found2=binary.binary(products,"CPU");
        System.out.println("the binary search"+found2);
    }
}

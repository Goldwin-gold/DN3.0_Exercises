public class Linear {
    public static Product linear(Product[] products,int nameId){
        for(Product product:products){
            if(product.getProductId()==nameId){
                return product;
            }
        }
        return null;
    }
}

public class bubble {
    public static void bubb(order[] orders){
        int n= orders.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++ ){
                if(orders[j].getTotalPrice()>orders[j+1].getTotalPrice())
                {
                    order temp= orders[j];
                    orders[j]=orders[j+1];
                    orders[j+1]=temp;

                }
            }
        }
    }

    public static void main(String[] args) {
        order[] orders={
                new order(1,"janice",500),
                new order(2,"Reina",400),
                new order(3,"dilfina",300),
                new order(4,"catherina",200),
                new order(5,"elena",100)
        };
        System.out.println("before sorting");
        for(order order:orders){
            System.out.println(order);
        }
        bubb(orders);
        for(order order:orders){
            System.out.println(order);
        }
    }
}

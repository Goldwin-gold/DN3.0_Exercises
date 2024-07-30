public class test {
    public static void main(String[] args) {
        Computer c=new builder().setCPU("Intel").build();
        System.out.println(c);
    }
}

interface Image {
    void display();
}
class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromServer();
    }

    private void loadImageFromServer() {
        System.out.println("Loading image: " + filename);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + filename);
    }
}
class ProxyImage implements Image {
    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}
public class ProxyPattern {
    public static void main(String[] args)
        {
        Image image1=new ProxyImage("photo1.png");
        Image image2=new ProxyImage("photo2.png");


        System.out.println("First time displaying photo1:");
        image1.display();

        System.out.println("Second time displaying photo1:");
        image1.display();

        System.out.println("First time displaying photo2: ");
        image2.display();

        System.out.println("Second time displaying photo2:");


    }
}

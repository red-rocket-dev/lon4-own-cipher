package pl.sda;

public class BlocksExample {


    static {
        System.out.println("Tu blok statyczny!");
    }

    {
        System.out.println("Tu blok niestatyczny!");
    }

    public BlocksExample() {
        System.out.println("Tu konstruktor!");
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox1 = new Box(10,20,15);
        Box myBox2 = new Box(3,6,9);
        double vol;

        vol= myBox1.volume();
        System.out.println("Obyem raven " + vol);

        vol= myBox2.volume();
        System.out.println("Obyem raven " + vol);
    }
}

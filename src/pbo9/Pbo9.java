package pbo9;

public class Pbo9 {
    public static void main(String[] args) {
        System.out.println("Kelas Spider");
        Spider laba = new Spider();
        laba.walk();
        laba.eat();
        
        System.out.println("\nKelas Cat");
        Cat kucing = new Cat("Molly");
        kucing.walk();
        kucing.play();
        kucing.eat();
        
        System.out.println("\nKelas Fish");
        Fish ikan = new Fish();
        ikan.setName("Nemo");
        ikan.walk();
        ikan.play();
        ikan.eat();
    }
}

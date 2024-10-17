package pbo9;

class Fish extends Animal implements Pet{
    private String name;

    public Fish() {
        super(0);
    } 

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String n) {
        this.name = n;
    }
    
    @Override
    public void play(){
        System.out.println("Ikan sedang bermain");
    }
    
    @Override
    public void walk(){
        System.out.println("Ikan tidak bisa berjalan, tapi ikan berenang");
    }
    
    @Override
    public void eat(){
        System.out.println("Ikan sedang makan");
    }
}

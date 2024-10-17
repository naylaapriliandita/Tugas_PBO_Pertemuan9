package pbo9;

class Cat extends Animal implements Pet{
    private String name;
    
    public Cat(String n){
        super(4);
        this.name = n;
    }

    public Cat() {
        this("Kucing jalanan");
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
        System.out.println(name + " sedang bermain dengan bola");
    }
    
    @Override
    public void eat(){
        System.out.println(name + " sedang makan whiskas");
    }
}

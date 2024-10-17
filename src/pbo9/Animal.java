package pbo9;

class Animal {
    protected int legs;
    
    Animal(int legs){
        this.legs = legs;
    }
    
    public void walk(){
        System.out.println("Hewan ini memakai " + legs + " kaki untuk berjalan");
    }
    
    public void eat(){
        System.out.println("Hewan butuh makan");
    }
}

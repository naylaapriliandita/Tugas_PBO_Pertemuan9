package pbo9;

class Spider extends Animal {

    public Spider(int legs) {
        super(8);  // jumlah legs
    }
    
    @Override
    public void eat(){
        System.out.println("Laba-laba sedang makan serangga");
    }
}
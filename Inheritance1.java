class Animal{
    void walking(){
        System.out.println("I am walking");

    }


}


class Bird extends Animal{
    void fly(){
        System.out.println("I am flying");
    }
    void singing(){
        System.out.println("I am singing");
    }


}




public class Inheritance1 {
    public static void main(String [] args){
        Bird bird = new Bird();
        bird.walking();
        bird.fly();
        bird.singing();



    }
}

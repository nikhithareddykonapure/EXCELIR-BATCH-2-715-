class main {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class demo extends main{
    void eat() {
        System.out.println("Dog is eating.");
    }

    void eat(String food) {
        System.out.println("Dog is eating " + food + ".");
    }
}
class demo2 extends demo{
    void seat(){
        System.out.println("dog seat in bench");
    }
    void seat(String food){
        System.out.println("dog seat in bench in my home");
    }

}
public class Demo054 {
    public static void main(String[] args) {
        demo2 dog = new demo2();
        dog.eat();
        dog.eat("bones");
        dog.seat();
        dog.seat();
        dog.seat("name");


}
}

    



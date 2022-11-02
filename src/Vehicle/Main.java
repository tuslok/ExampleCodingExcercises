package Vehicle;

public class Main {

    public static void main(String[] args) {
        Volvo volvo = new Volvo(24);
        volvo.steer(45);
        volvo.acceleration(30);
        volvo.acceleration(20);
        volvo.acceleration(-62);
    }
}

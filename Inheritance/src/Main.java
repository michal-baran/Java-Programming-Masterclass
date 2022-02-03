public class Main {

    public static void main(String[] args) {
        Ambulance ambulance = new Ambulance(36);
        ambulance.accelerate(30);
        ambulance.accelerate(20);
        ambulance.steer(45);
        ambulance.accelerate(-40);

    }
}

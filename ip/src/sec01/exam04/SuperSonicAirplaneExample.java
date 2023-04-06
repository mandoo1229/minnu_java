package sec01.exam04;

public class SuperSonicAirplaneExample {
    public static void main(String[] args) {
        SuperSonicAirplane superSonicAirplane = new SuperSonicAirplane();
        superSonicAirplane.takeOff();
        superSonicAirplane.fly();
        superSonicAirplane.flyMode = superSonicAirplane.SUPERSONIC;
        superSonicAirplane.fly();
        superSonicAirplane.flyMode = superSonicAirplane.NORMAL;
        superSonicAirplane.fly();
        superSonicAirplane.land();
    }
}

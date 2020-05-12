package dome10;

public class E260Factory implements BenzFactory{
    @Override
    public Benz createCar() {
        BenzE260 a = new BenzE260();
        return a;
    }
}

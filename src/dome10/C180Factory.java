package dome10;

public class C180Factory implements BenzFactory{
    @Override
    public Benz createCar() {
        BenzC180 a = new BenzC180();
        return a ;
    }
}

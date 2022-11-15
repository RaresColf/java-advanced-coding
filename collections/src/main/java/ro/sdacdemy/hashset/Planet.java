package ro.sdacdemy.hashset;

public class Planet extends HavenlyBody {


    protected Planet(double orbitalPeriod, String name) {
        super(orbitalPeriod, name, BodyType.PLANET);
    }

    @Override
    public boolean addSatellite(HavenlyBody item) {
        if(item.getKey().getBodyType() == BodyType.MOON){
            return super.addSatellite(item);
        }else{
            return false;
        }
    }
}

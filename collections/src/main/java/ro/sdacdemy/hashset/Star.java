package ro.sdacdemy.hashset;

public class Star extends HavenlyBody {


    protected Star(double orbitalPeriod, String name) {
        super(orbitalPeriod, name, BodyType.STAR);
    }

    @Override
    public boolean addSatellite(HavenlyBody item) {
        throw new RuntimeException("Stars cannot have satellites");
    }
}

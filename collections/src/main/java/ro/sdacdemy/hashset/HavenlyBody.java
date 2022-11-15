package ro.sdacdemy.hashset;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class HavenlyBody {

    private final Set<HavenlyBody> satellites = new HashSet<>();
    ;

    private final double orbitalPeriod;

    private final Key key;


    protected HavenlyBody(double orbitalPeriod, String name, BodyType bodyType) {
        this.orbitalPeriod = orbitalPeriod;
        this.key = new Key(name, bodyType);
    }

    public Set<HavenlyBody> getSatellites() {
        return satellites;
    }

    public double getOribitalPeriod() {
        return orbitalPeriod;
    }

    public Key getKey() {
        return key;
    }


    public boolean addSatellite(HavenlyBody item){
        return satellites.add(item);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HavenlyBody that = (HavenlyBody) o;
        return key.equals(that.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }

    @Override
    public String toString() {
        return this.key.name + ": " + this.key.bodyType + ", " + this.orbitalPeriod;
    }




    public static class Key {
        private String name;
        private BodyType bodyType;

        public Key(String name, BodyType bodyType) {
            this.name = name;
            this.bodyType = bodyType;
        }

        public String getName() {
            return name;
        }

        public BodyType getBodyType() {
            return bodyType;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Key key = (Key) o;
            return name.equals(key.name) && bodyType == key.bodyType;
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, bodyType);
        }

        @Override
        public String toString() {
            return this.name + ": " + this.bodyType;
        }
    }
}

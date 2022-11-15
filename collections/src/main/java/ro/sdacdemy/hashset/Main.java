package ro.sdacdemy.hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *         Create an enum called BodyType which has the following values: STAR, PLANET, MOON, DWARF_PLANET;
 *
 *         Create an abstract class HeavenlyBody which would be our base class that every celestial body will implement
 *         The class should have the following instance variables:
 *         - a Set of HeavenlyBody objects called satellites set
 *         - orbitalPeriod which is a double
 *         - Key (which is another class, a static nested class in the HeavenlyBody)
 *             For this Key class, it should be a nested static class in the HeavenlyBody and should have the following fields:
 *             - String name;
 *             - BodyType bodyType;
 *             The following methods should be also included in the Key class:
 *             - a constructor which initialize both fields
 *             - getName() - getter for the name
 *             - getBodyType() - getter for the bodyType
 *             - hashCode() - method should be overridden
 *             - equals() - method should be overridden
 *             - toString() - should be also overridden
 *
 *         The following methods should be also included in the HeavenlyBody class:
 *         - a constructor which takes as parameters a name(String), orbitalPeriod(double), and bodyType(BodyType) -
 *         creates a new Key by calling Key's constructor and initialize the satellites set with a new HashSet<>();
 *         - getKey() - getter for the key
 *         - getOrbitalPeriod() - getter for orbitalPeriod
 *         - getSatellites() - getter for satellites set (use Collections.unmodifiableSet(this.satellites))
 *         - boolean addSatellite(HeavenlyBody moon) - add a new item to the satellites set (return true or false if the operation succeeded)
 *         - override equals() - it should only use keys for comparing objects
 *         - override hashcode() - it should only use key hashcode method
 *         - override toString() - print key name, bodyType and orbitalPeriod
 *         - create a static method called makeKey(String name, BodyType bodyType) which returns a new Key created using Key class constructor
 *
 *
 *         For each of the types that you support, subclass the HeavenlyBody class
 *         so that your program can create objects of the appropriate type.
 *
 *         Example:
 *
 *         public class Moon extends HeavenlyBody {
 *             public Moon(String name, double orbitalPeriod) {
 *                 super(name, orbitalPeriod, BodyType.MOON);
 *             }
 *         }
 *
 *         NOTE: You can override the addSatellites method in the above example and throw a custom Exception
 *         NOTE: For the Planet class override the addSatellites method and check if the satellite received as parameter is a moon, if is not a moon do not add it as a satellite
 *
 *
 *         In main create:
 *         - a static Map<HeavenlyBody.Key, HeavenlyBody> solarSystem - which will contain all the bodies in the solar system
 *         - a static Set<HeavenlyBody> planets - which will contain only planets from the solar system
 *         - a static Set<HeavenlyBody> start - which will contain the stars from a solar system
 *
 *       */

public class Main {
    public static Map<HavenlyBody.Key, HavenlyBody> solarSystem = new HashMap<>();

    public static Set<HavenlyBody> planets = new HashSet<>();

    public static Set<HavenlyBody> stars = new HashSet<>();

    public static void main(String[] args) {

        HavenlyBody mercury = new Planet(88,"Mercury");
        solarSystem.put(mercury.getKey(), mercury);
        planets.add(mercury);

        HavenlyBody venus = new Planet(225,"Venus");
        solarSystem.put(venus.getKey(), venus);
        planets.add(venus);

        HavenlyBody earth = new Planet(365,"Earth");
        solarSystem.put(earth.getKey(), earth);
        planets.add(earth);

        HavenlyBody moon = new Moon(27, "Moon");
        solarSystem.put(moon.getKey(), moon);
        earth.addSatellite(moon);


        HavenlyBody saturn = new Planet(123,"Saturn");
        solarSystem.put(saturn.getKey(), saturn);
        planets.add(saturn);

        // moons of saturn
        HavenlyBody moon1 = new Moon(16, "Titan" );
        solarSystem.put(moon1.getKey(), moon1);
        saturn.addSatellite(moon1);

        HavenlyBody moon2 = new Moon(4.5, "Rhea" );
        solarSystem.put(moon2.getKey(), moon2);
        saturn.addSatellite(moon2);

        Star tempStar = new Star(0,"Sun" );
        solarSystem.put(tempStar.getKey(), tempStar);
        stars.add(tempStar);


        System.out.println("Planets:");
        for (HavenlyBody planet : planets) {
            System.out.println(planet);
        }

        System.out.println();

        System.out.println("Stars:");
        for (HavenlyBody star : stars) {
            System.out.println(star);
        }

        System.out.println();

        Set<HavenlyBody> moons = new HashSet<>();
        for (HavenlyBody planet : planets) {
            moons.addAll(planet.getSatellites());
        }

        System.out.println("All Moons:");
        for (HavenlyBody m : moons) {
            System.out.println(m);
        }

    }

}

/**
 * In this exercise you will add properties to the provided Planet class and
 * then use that class in the main method, as instructed below.
 * <p>
 * You should first follow the instructions in the Planet class.
 */
public class Main {

    public static void main(String[] args) {

        Planet plant1= new Planet();
        // todo: create a new variable "planet1" and set it to a new instance of the Planet class
        plant1.name="Mercury";
        plant1.distanceFromSun=.04;
        plant1.satellites=0;
        plant1.supportsLife=false;
        // todo: set all four properties of the Planet class on the planet1 instance: name, distanceFromSun, satellites, and supportsLife.
        Planet plant2= new Planet();
        // todo: create another new variable named "planet2" and set it to a new instance of the Planet class
        plant2.name="Mars";
        plant2.distanceFromSun=.08;
        plant2.satellites=2;
        plant2.supportsLife=true;
        // todo: set all four properties of the Planet class on the planet2 instance
        System.out.println("Name: "+plant1.name+" distanceFromSun: "+plant1.distanceFromSun+" satellites: "+plant1.satellites+" supportsLife: "+plant1.supportsLife);
        // todo: Use println() to print a String description of planet1 using string concatenation
        /*
            Example output: "Name: Earth, Distance from Sun: 1 AU, Satellites: 1 moon(s), Supports Life: true"
         */
        System.out.println("Name: "+plant2.name+" distanceFromSun: "+plant2.distanceFromSun+" satellites: "+plant2.satellites+" supportsLife: "+plant2.supportsLife);
        // todo: Use println() to print a String description of planet2, just like above

        /*
            Next, we're going to demonstrate that properties of an object can be
            changed. This change impacts only that one property on that one
            instance of the object.
         */
        plant1.satellites=3;
        // todo: change a single property on your planet1 instance
        plant2.supportsLife=false;
        // todo: change a different property on your planet2 instance
        System.out.println("Name: "+plant1.name+" distanceFromSun: "+plant1.distanceFromSun+" satellites: "+plant1.satellites+" supportsLife: "+plant1.supportsLife);
        // todo: Use println() to print a String description of planet1 again.
        /*
            Note that the property you changed on planet1 is reflected in the
            output. The property you changed on planet2 is NOT reflected. This
            shows that these two instances are distinct and separate from each
            other.
         */
        System.out.println("Name: " +plant2.name+" distanceFromSun: "+plant2.distanceFromSun+" satellites: "+plant2.satellites+" supportsLife: "+plant2.supportsLife);
        // todo: Use println() to print a String description of planet2, again.  Note that the property you changed on planet2 is reflected in the output.

    }

}

public class CelestialObject {
    private double x;
    private double y;
    private double z;
    private String name;

    public CelestialObject() {
        x = 0.0;
        y = 0.0;
        z = 0.0;
        name = "Soleil";
    }

    public CelestialObject(double x, double y, double z, String name) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
    }

    public CelestialObject(String name, double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
    }

    public double getX() { 
        return x;
    }

    public void setX(double x) { 
        this.x = x;
    }

    public double getY() { 
        return y;
    }

    public void setY(double y) { 
        this.y = y;
    }

    public double getZ() { 
        return z;
    }

    public void setZ(double z) { 
        this.z = z;
    }

    public String getName() { 
        return name;
    }

    public void setName(String name) { 
        this.name = name;
    }

}

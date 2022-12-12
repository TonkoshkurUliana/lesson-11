public class Handlebar extends Engine{
    int DiametrWheel;
    String Material;

    public Handlebar(int qcilinders, int diametrWheel, String material) {
        super(qcilinders);
        DiametrWheel = diametrWheel;
        Material = material;
    }

    public double DiametrWheel() {
        return DiametrWheel;
    }

    public Handlebar setDiametrWheel(int diametrWheel) {
        DiametrWheel = diametrWheel;
        return this;
    }

    public String Material() {
        return Material;
    }

    public Handlebar setMaterial(String material) {
        Material = material;
        return this;
    }
}

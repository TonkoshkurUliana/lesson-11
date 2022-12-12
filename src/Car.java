public class Car extends Handlebar{
    int year;
    int power;

    public Car(int qcilinders, int diametrWheel, String material, int year, int power) {
        super(qcilinders, diametrWheel, material);
        this.year = year;
        this.power = power;
    }

    public int year() {
        return year;
    }

    public Car setYear(int year) {
        this.year = year;
        return this;
    }

    public int power() {
        return power;
    }

    public Car setPower(int power) {
        this.power = power;
        return this;
    }

    @Override
    public String toString() {
        return "Car {" +
                "year=" + year +
                ", power=" + power +
                ", DiametrWheel=" + DiametrWheel +
                ", Material='" + Material + '\'' +
                ", qcilinders=" + qcilinders + '}' + "\n";
    }
}

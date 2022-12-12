public class Engine {
    int qcilinders;

    public Engine(int qcilinders) {
        this.qcilinders = qcilinders;
    }

    public int qcilinders() {
        return qcilinders;
    }

    public Engine setQcilinders(int qcilinders) {
        this.qcilinders = qcilinders;
        return this;
    }
}

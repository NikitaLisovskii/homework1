package homework2;

public class Computer implements IComputer{

    private Ram ram;
    private Hdd hdd;

    public Computer(Ram ram, Hdd hdd) {
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }

    @Override
    public void reset() {

    }

    @Override
    public void work() {

    }

    public Ram getRam() {
        return ram;
    }

    public Hdd getHdd() {
        return hdd;
    }
}

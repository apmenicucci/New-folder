public class Computer {
    private String operatingSystem;
    private boolean turnedOn;
    private int cores;
    private int storage;
    private String storageType;

    public Computer() {
        operatingSystem = "";
        turnedOn = true;
        cores = 0;
        storage = 0;
        storageType = "";
    }

    public Computer(String operatingSystem, boolean turnedOn, int cores, int storage, String storageType) {
        this.operatingSystem = operatingSystem;
        this.turnedOn = turnedOn;
        this.cores = cores;
        this.storage = storage;
        this.storageType = storageType;
    }

    public int getCores() {
        return this.cores;
    }

    public int addCores(int add) {
        cores += add;
        return this.cores;
    }

    public void setStorage(int add, String type) {
        storage += add;
        storageType += type;
    }

    public String getStorage() {
        String storageAmount = Integer.toString(storage);
        return storageAmount + "GB " + storageType;
    }

    public static void main(String[] args) {
        Computer dellComputer = new Computer("Windows", true, 8, 256, "SSD");
        System.out.println(dellComputer.getCores());
        dellComputer.addCores(2);
        System.out.println(dellComputer.getCores());

    }
}
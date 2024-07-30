public class Computer {
    private String CPU;
    private int RAM;
    private int Storage;
    private String processor;
    private int battery;

    public Computer(String CPU, int RAM, int storage, String processor, int battery) {
        this.CPU = CPU;
        this.RAM = RAM;
        Storage = storage;
        this.processor = processor;
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM=" + RAM +
                ", Storage=" + Storage +
                ", processor='" + processor + '\'' +
                ", battery=" + battery +
                '}';
    }
}

    class builder {
        private String CPU;
        private int RAM;
        private int Storage;
        private String processor;
        private int battery;

        public builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public builder setRAM(int RAM) {
            this.RAM = RAM;
            return this;
        }

        public builder setStorage(int storage) {
            Storage = storage;
            return this;
        }

        public builder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public builder setBattery(int battery) {
            this.battery = battery;
            return this;
        }

        public Computer build(){
            return new Computer(CPU,RAM,Storage,processor,battery);
        }
    }



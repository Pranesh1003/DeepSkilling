package BuilderPatternExample;

public class BuilderPatternExample {

    static class Computer {
        private String cpu;
        private String ram;
        private String storage;
        private String graphicsCard;

        private Computer(Builder builder) {
            this.cpu = builder.cpu;
            this.ram = builder.ram;
            this.storage = builder.storage;
            this.graphicsCard = builder.graphicsCard;
        }

        public static class Builder {
            private String cpu;
            private String ram;
            private String storage;
            private String graphicsCard;

            public Builder setCPU(String cpu) {
                this.cpu = cpu;
                return this;
            }

            public Builder setRAM(String ram) {
                this.ram = ram;
                return this;
            }

            public Builder setStorage(String storage) {
                this.storage = storage;
                return this;
            }

            public Builder setGraphicsCard(String graphicsCard) {
                this.graphicsCard = graphicsCard;
                return this;
            }

            public Computer build() {
                return new Computer(this);
            }
        }

        public void showSpecs() {
            System.out.println("CPU: " + cpu);
            System.out.println("RAM: " + ram);
            System.out.println("Storage: " + storage);
            System.out.println("Graphics Card: " + graphicsCard);
            System.out.println("------------------------");
        }
    }

    public static void main(String[] args) {
        Computer basic = new Computer.Builder()
            .setCPU("Intel i5")
            .setRAM("8GB")
            .setStorage("256GB SSD")
            .build();

        Computer gaming = new Computer.Builder()
            .setCPU("Intel i9")
            .setRAM("32GB")
            .setStorage("1TB SSD")
            .setGraphicsCard("NVIDIA RTX 4080")
            .build();

        Computer workstation = new Computer.Builder()
            .setCPU("AMD Ryzen 9")
            .setRAM("64GB")
            .setStorage("2TB NVMe")
            .setGraphicsCard("NVIDIA Quadro")
            .build();

        System.out.println("Basic Computer:");
        basic.showSpecs();

        System.out.println("Gaming Computer:");
        gaming.showSpecs();

        System.out.println("Workstation Computer:");
        workstation.showSpecs();
    }
}

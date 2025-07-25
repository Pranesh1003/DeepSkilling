package BuilderPatternExample;

public class BuilderPatternExample {

    static class Computer {
        private String cpu;
        private String ram;
        private String storage;
        private String graphicsCard;  

        private Computer(Builder bldr) {
            this.cpu = bldr.cpu;
            this.ram = bldr.ram;
            this.storage = bldr.storage;
            this.graphicsCard = bldr.graphicsCard;
        }

        public static class Builder {
            private String cpu;
            private String ram;
            private String storage;
            private String graphicsCard; // not always needed, so can leave null

            public Builder setCPU(String cpu) {
                this.cpu = cpu;
                return this;  // chaining
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
            if (graphicsCard != null) {
                System.out.println("Graphics Card: " + graphicsCard);
            } else {
                System.out.println("Graphics Card: Not included");
            }
            System.out.println("-----------------------------");
        }
    }

    public static void main(String[] args) {
        Computer entryLevelPC = new Computer.Builder()
            .setCPU("Intel Core i3") 
            .setRAM("4GB")           
            .setStorage("128GB SSD") 
            .build();

        Computer midRangePC = new Computer.Builder()
            .setCPU("Intel i5")
            .setRAM("16GB")
            .setStorage("512GB SSD")
            .setGraphicsCard("NVIDIA GTX 1660")  
            .build();

        Computer beastRig = new Computer.Builder()
            .setCPU("AMD Ryzen 9")
            .setRAM("64GB")
            .setStorage("2TB NVMe")
            .setGraphicsCard("RTX 4090")
            .build();

        System.out.println("Entry-Level PC Specs:");
        entryLevelPC.showSpecs();

        System.out.println("Mid-Range PC Specs:");
        midRangePC.showSpecs();

        System.out.println("Ultimate Rig Specs:");
        beastRig.showSpecs();
    }
}

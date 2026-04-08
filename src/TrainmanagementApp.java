public class TrainmanagementApp {
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }
    static class GoodsBogie {
        String type;
        String cargo;
        public GoodsBogie(String type) {
            this.type = type;
        }
        public void assignCargo(String cargo) {
            try {
                if (type.equals("Rectangular") && cargo.equals("Petroleum")) {
                    throw new CargoSafetyException("Unsafe cargo assignment!");
                }
                this.cargo = cargo;
                System.out.println("Cargo assigned: " + cargo + " to " + type + " bogie");
            } catch (CargoSafetyException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                System.out.println("Assignment attempt completed\n");
            }
        }
    }
    public static void main(String[] args) {
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        b1.assignCargo("Petroleum");
        GoodsBogie b2 = new GoodsBogie("Rectangular");
        b2.assignCargo("Petroleum");
        GoodsBogie b3 = new GoodsBogie("Rectangular");
        b3.assignCargo("Grains");
        System.out.println("Program continues safely...");
    }
}
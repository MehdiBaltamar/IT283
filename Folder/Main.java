public class Main {
    public static void main(String[] args) {
        // Step 1: Create Equipment objects
        Equipment laptop = new Equipment("EQ101", "Laptop");
        Equipment projector = new Equipment("EQ102", "Projector");
        Equipment tablet = new Equipment("EQ103", "Tablet");

        // Step 2: Create EquipmentInventory and add items
        EquipmentInventory inventory = new EquipmentInventory();
        inventory.addEquipment(laptop);
        inventory.addEquipment(projector);
        inventory.addEquipment(tablet);

        // Step 3: Test checkout operations
        System.out.println("Checkout EQ101 to Alex: " + inventory.checkOutById("EQ101", "Alex"));
        System.out.println("Checkout EQ101 to Mina: " + inventory.checkOutById("EQ101", "Mina"));
        System.out.println("Checkout EQ103 to Mina: " + inventory.checkOutById("EQ103", "Mina"));

        // Step 4: Test return operations
        System.out.println("Return EQ101: " + inventory.checkInById("EQ101"));

        // Step 5: Display inventory and available count
        System.out.println("\n--- Current Inventory ---");
        inventory.printAll();
        System.out.println("Available items: " + inventory.getAvailableCount());

        // Step 6: Test searching
        System.out.println("\nSearch EQ103 index: " + inventory.findIndexById("EQ103"));
        System.out.println("Search EQ999 index: " + inventory.findIndexById("EQ999"));

        // Step 7: Test ArrayList update at index 1
        Equipment camera = new Equipment("EQ104", "Camera");
        boolean replaced = inventory.replaceEquipment(1, camera);
        System.out.println("\nReplace index 1 with EQ104 (Camera): " + replaced);

        // Step 8: Display final results and verify count unchanged
        System.out.println("\n--- Final Inventory ---");
        inventory.printAll();
        System.out.println("Total equipment items: " + inventory.getCount());
        System.out.println("Available items: " + inventory.getAvailableCount());
    }
}
package Week5;


public class Main {
    public static void main(String[] args) {

        // Step 1 - Create Equipment objects
        Equipment laptop = new Equipment("EQ101", "Laptop");
        Equipment projector = new Equipment("EQ102", "Projector");
        Equipment tablet = new Equipment("EQ103", "Tablet");

        // Step 2 - Create inventory and add equipment
        EquipmentInventory inventory = new EquipmentInventory();

        inventory.addEquipment(laptop);
        inventory.addEquipment(projector);
        inventory.addEquipment(tablet);

        System.out.println("===== EQUIPMENT INVENTORY SYSTEM =====");

        // Step 3 - Test checkout operations
        System.out.println("\n===== CHECKOUT OPERATIONS =====");

        System.out.println("Checkout Laptop to Alex: "
                + inventory.checkOutById("EQ101", "Alex"));

        System.out.println("Checkout Laptop to Mina: "
                + inventory.checkOutById("EQ101", "Mina"));

        System.out.println("Checkout Tablet to Mina: "
                + inventory.checkOutById("EQ103", "Mina"));

        // Step 4 - Test return operations
        System.out.println("\n===== RETURN OPERATIONS =====");

        System.out.println("Return Laptop: "
                + inventory.checkInById("EQ101"));

        // Step 5 - Display inventory
        System.out.println("\n===== CURRENT INVENTORY =====");

        inventory.printAll();

        System.out.println("Total Equipment: " + inventory.getCount());

        System.out.println("Available Equipment: "
                + inventory.getAvailableCount());

        // Step 6 - Test searching
        System.out.println("\n===== SEARCH OPERATIONS =====");

        int search1 = inventory.findIndexById("EQ103");

        if (search1 != -1) {
            System.out.println("EQ103 found at index: " + search1);
        } else {
            System.out.println("EQ103 not found.");
        }

        int search2 = inventory.findIndexById("EQ999");

        if (search2 != -1) {
            System.out.println("EQ999 found at index: " + search2);
        } else {
            System.out.println("EQ999 not found.");
        }

        // Step 7 - Test ArrayList update
        System.out.println("\n===== REPLACE EQUIPMENT =====");

        Equipment camera = new Equipment("EQ104", "Camera");

        System.out.println("Replacement successful: "
                + inventory.replaceEquipment(1, camera));

        // Step 8 - Display final results
        System.out.println("\n===== FINAL INVENTORY =====");

        inventory.printAll();

        System.out.println("Final Equipment Count: "
                + inventory.getCount());

        System.out.println("Final Available Count: "
                + inventory.getAvailableCount());
    }
}


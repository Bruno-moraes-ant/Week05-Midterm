package Week5;


import java.util.ArrayList;

public class EquipmentInventory {

    // Private field
    private ArrayList<Equipment> items;

    // Constructor
    public EquipmentInventory() {
        items = new ArrayList<Equipment>();
    }

    // Adds equipment to the inventory
    public void addEquipment(Equipment item) {
        items.add(item);
    }

    // Returns the total number of equipment items
    public int getCount() {
        return items.size();
    }

    // Searches for equipment using its asset ID
    public int findIndexById(String assetId) {
        int index = 0;

        while (index < items.size()) {
            if (items.get(index).getAssetId().equals(assetId)) {
                return index;
            }

            index++;
        }

        return -1;
    }

    // Checks out equipment by asset ID
    public boolean checkOutById(String assetId, String studentName) {
        int index = findIndexById(assetId);

        if (index == -1) {
            return false;
        }

        return items.get(index).checkOut(studentName);
    }

    // Checks in equipment by asset ID
    public boolean checkInById(String assetId) {
        int index = findIndexById(assetId);

        if (index == -1) {
            return false;
        }

        return items.get(index).checkIn();
    }

    // Counts available equipment using a for-each loop
    public int getAvailableCount() {
        int count = 0;

        for (Equipment item : items) {
            if (!item.isCheckedOut()) {
                count++;
            }
        }

        return count;
    }

    // Displays all equipment details
    public void printAll() {
        for (Equipment item : items) {
            item.printDetails();
            System.out.println();
        }
    }

    // Replaces equipment at a valid index
    public boolean replaceEquipment(int index, Equipment replacement) {
        if (index < 0 || index >= items.size()) {
            return false;
        }

        items.set(index, replacement);
        return true;
    }
}

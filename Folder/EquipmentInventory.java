import java.util.ArrayList;

public class EquipmentInventory {
    private ArrayList<Equipment> items;

    public EquipmentInventory() {
        this.items = new ArrayList<>();
    }

    public void addEquipment(Equipment item) {
        items.add(item);
    }

    public int getCount() {
        return items.size();
    }

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

    public boolean checkOutById(String assetId, String studentName) {
        int index = findIndexById(assetId);
        if (index == -1) {
            return false;
        }
        return items.get(index).checkOut(studentName);
    }

    public boolean checkInById(String assetId) {
        int index = findIndexById(assetId);
        if (index == -1) {
            return false;
        }
        return items.get(index).checkIn();
    }

    public int getAvailableCount() {
        int available = 0;
        for (Equipment item : items) {
            if (!item.isCheckedOut()) {
                available++;
            }
        }
        return available;
    }

    public void printAll() {
        for (Equipment item : items) {
            item.printDetails();
        }
    }

    public boolean replaceEquipment(int index, Equipment replacement) {
        if (index < 0 || index >= items.size()) {
            return false;
        }
        items.set(index, replacement);
        return true;
    }
}
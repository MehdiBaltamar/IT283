public class Equipment {
    private String assetId;
    private String name;
    private boolean checkedOut;
    private String borrower;

    public Equipment(String assetId, String name) {
        this.assetId = assetId;
        this.name = name;
        this.checkedOut = false;
        this.borrower = "";
    }

    public String getAssetId() {
        return assetId;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public boolean checkOut(String studentName) {
        if (checkedOut) {
            return false;
        }
        this.checkedOut = true;
        this.borrower = studentName;
        return true;
    }

    public boolean checkIn() {
        if (!checkedOut) {
            return false;
        }
        this.checkedOut = false;
        this.borrower = "";
        return true;
    }

    public void printDetails() {
        if (checkedOut) {
            System.out.println("ID: " + assetId + " | Name: " + name + " | Status: Checked Out | Borrower: " + borrower);
        } else {
            System.out.println("ID: " + assetId + " | Name: " + name + " | Status: Available");
        }
    }
}
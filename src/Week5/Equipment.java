package Week5;


public class Equipment {

    // Private fields
    private String assetId;
    private String name;
    private boolean checkedOut;
    private String borrower;

    // Constructor
    public Equipment(String assetId, String name) {
        this.assetId = assetId;
        this.name = name;
        this.checkedOut = false;
        this.borrower = "";
    }

    // Returns the equipment's asset ID
    public String getAssetId() {
        return assetId;
    }

    // Returns whether the equipment is checked out
    public boolean isCheckedOut() {
        return checkedOut;
    }

    // Checks out the equipment
    public boolean checkOut(String studentName) {
        if (checkedOut) {
            return false;
        }

        checkedOut = true;
        borrower = studentName;
        return true;
    }

    // Checks in the equipment
    public boolean checkIn() {
        if (!checkedOut) {
            return false;
        }

        checkedOut = false;
        borrower = "";
        return true;
    }

    // Displays equipment details
    public void printDetails() {
        System.out.println("Asset ID: " + assetId);
        System.out.println("Equipment Name: " + name);

        if (checkedOut) {
            System.out.println("Status: Checked Out");
            System.out.println("Borrower: " + borrower);
        } else {
            System.out.println("Status: Available");
        }
    }
}

public class IdCard {

    String name;
    int booksIssued;

    // Constructor
    IdCard(String name, int booksIssued) {
        this.name = name;
        this.booksIssued = booksIssued;
    }

    public static void main(String[] args) {

        // Create one object
        IdCard ravi = new IdCard("Ravi", 0);

        // Second variable points to the SAME object
        IdCard duplicate = ravi;

        // Change through second variable
        duplicate.booksIssued = 3;

        // Create a separate object
        IdCard separate = new IdCard("Ravi", 3);

        System.out.println(
            "Ravi's booksIssued (via first variable): "
            + ravi.booksIssued
        );

        System.out.println(
            "duplicate == ravi: "
            + (duplicate == ravi)
        );

        System.out.println(
            "separate == ravi: "
            + (separate == ravi)
        );
    }
}

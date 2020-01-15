
public class Main {
    public static void main(String[] args) {

        Visitor alice = new Visitor("Alice Cooper", 54, "20/03/2020", "15h00", "No comments", "Victoria");
        alice.save();
        alice.load("Alice Cooper");

    }
}

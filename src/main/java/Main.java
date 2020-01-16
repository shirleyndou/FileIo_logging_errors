
public class Main {
    public static void main(String[] args) {

        //class object
        Visitor alice = new Visitor("Alice Cooper", 54, "20/03/2020", "15h00", "No comments", "Victoria Secrets");
       //invoking the save method
        alice.save();
        //invoking the load method
        alice.load("Alice Cooper");

    }
}

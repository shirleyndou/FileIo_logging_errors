
public class Main {
    public static void main(String[] args) {

        //class object
        Visitor alice = new Visitor("Alice Copper", 54, "20/03/2020", "15h00", "No comments", "Victoria Secrets");
       //invoking the save method
        alice.save();
        //invoking the load method
        alice.load("Alice Cooper");

        System.out.println("=======================================================================================================================================================");

        //class object
        Visitor Bob = new Visitor("Bob", 44, "30/11/2020", "13h00", "No comments", "Miss Mops");
        //invoking the save method
        Bob.save();
        //invoking the load method
        Bob.load("Alice Cooper");

    }
}

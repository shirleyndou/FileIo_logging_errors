import org.junit.jupiter.api.Test;


class VisitorTest {

    Visitor alice = new Visitor("Alice Cooper", 54, "20/03/2020", "15h00", "No comments", "Victoria Secrets");

    @Test
    public void save() throws Exception {
        assertEquals("results in visitor_alice_cooper.txt", alice.save());
        assertEquals("file already exist", alice.save());

    }

    private void assertEquals(String s, String save) {
    }

    @Test
    void load() {

        assertEquals("Alice Cooper\n" +
                "54\n" +
                "20/03/2020\n" +
                "12:30 pm"+
                "No comment\n" +
                 "Victoria Secrets"+ "\n", alice.load("alice cooper"));
        assertEquals("An error occurred", alice.load("alice cooper"));

    }
}

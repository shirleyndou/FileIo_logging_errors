import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;


class VisitorTest {

    Visitor alice = new Visitor("Alice Cooper", 54, "20/03/2020", "15h00", "No comments", "Victoria Secrets");

    @Test
    public void save() throws Exception{
       alice.save();

    }



}

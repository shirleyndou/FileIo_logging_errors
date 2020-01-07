import java.io.File;
import java.io.IOException;

public class Visitor {

    public void save() {
        try {
            File visitor = new File("visitor_alice.txt");

            if(visitor.createNewFile())
            {
                System.out.println("File successfully created: " + visitor.getName()); //logger.info
            }
            else{
                System.out.println(visitor.getName() + " file already exists or was not successfully created "); //logger.error
            }
        } catch (IOException e) {
            System.out.println("An error occurred"); //logger.error
            e.printStackTrace();
        }
    }

}

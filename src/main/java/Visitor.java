import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Visitor {
private static final Logger logger = LogManager.getLogger(Main.class.getName());
    public void save() {
        try {
            File visitor = new File("visitor_alice.txt");

            if(visitor.createNewFile())
            {
                logger.info("File successfully created: " + visitor.getName());
                //System.out.println("File successfully created: " + visitor.getName()); //logger.info
            }
            else{
                logger.error(visitor.getName() + " file already exists");
                //System.out.println(visitor.getName() + " file already exists or was not successfully created "); //logger.error
            }
        } catch (IOException e) {
            logger.error("An error occurred");
            //System.out.println("An error occurred"); //logger.error
            e.printStackTrace();
        }
    }

    public void load(String name)
    {
        try {
            File read = new File("visitor_alice.txt");
            Scanner reader = new Scanner(read);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }

}

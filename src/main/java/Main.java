import ch.qos.logback.classic.util.ContextInitializer;
import org.slf4j.LoggerFactory;
import search.SimpleSearch;
import sort.SimpleSort;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.*;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        // java.util.logging
        LogManager.getLogManager().readConfiguration(new FileInputStream("jul.properties"));
        Logger logger = Logger.getLogger(Main.class.getName());


        // logback
        System.setProperty(ContextInitializer.CONFIG_FILE_PROPERTY, "logback.xml");
        org.slf4j.Logger logger2 = LoggerFactory.getLogger(Main.class);
        logger2.debug("foo");


        while (true) {
            Thread.sleep(2500);
            ArrayList list = new ArrayList(Arrays.asList("Foo", "Bar", 3));
            new SimpleSearch().search(list, "Bar"); // info
            new SimpleSearch().search(list, 4); // severe
            new SimpleSort().sort(list.subList(0, 1)); // info
            new SimpleSort().sort(list); // severe
        }

    }
}

package search;

import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.logging.Logger;

public class SimpleSearch {
    public int search(List list, Object object) {
        Logger logger = Logger.getLogger(SimpleSearch.class.getName());
        org.slf4j.Logger logger2 = LoggerFactory.getLogger(SimpleSearch.class);
        for (int i = 0; i < list.size(); i++)
            if (list.get(i).equals(object)) {
                logger.info("Found object " + object + " in List");
                logger2.info("Found object " + object + " in List");
                return i;
            }
        logger.severe("Did not find object " + object + " in List");
        logger2.error("Did not find object " + object + " in List");
        return -1;
    }
}

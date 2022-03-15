package sort;

import org.slf4j.LoggerFactory;
import search.SimpleSearch;

import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class SimpleSort {
    public List sort(List list) {
        Logger logger = Logger.getLogger(SimpleSearch.class.getName());
        org.slf4j.Logger logger2 = LoggerFactory.getLogger(SimpleSort.class);
        try {
            Collections.sort(list);
            logger.info("SimpleSort sorted List");
            logger2.info("SimpleSort sorted List");
        } catch (ClassCastException e) {
            logger.severe("SimpleSort can't sort List");
            logger2.error("SimpleSort can't sort List");
        }

        return list;
    }
}

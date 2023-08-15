package org;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    private int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();

        for (Integer number : source) {
            if (number >= this.treshold) {
                logger.log("Элемент " + number + " подходит");
                result.add(number);
            } else {
                logger.log("Элемент " + number + " не подходит");

            }
        }

        logger.log("Прошло " + result.size() + " элемента из " + source.size());

        return result;
    }
}
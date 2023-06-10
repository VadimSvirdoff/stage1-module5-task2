package com.epam.mjc;

import java.util.ArrayList;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return arg -> {
            ArrayList<Integer> result = new ArrayList<>();
            for (Integer value : arg) {
                result.add(value / divider);
            }
            return result;
        };
    }
}

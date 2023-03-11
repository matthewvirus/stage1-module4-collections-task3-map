package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {

    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        boolean isValuePresent = false;
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        for (Integer integer : functionMap.values()) {
            isValuePresent = integer == requiredValue;
            if (isValuePresent) {
                break;
            }
        }
        return isValuePresent;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> calculatedMap = new HashMap<>();
        sourceList.forEach(v -> calculatedMap.put(v, 5*v+2));
        return calculatedMap;
    }

    public static void main(String[] args) {
        System.out.println(new FunctionValueFinder().isFunctionValuePresent(List.of(2, -6, 10, 19, 55, 11), 52));
    }
}

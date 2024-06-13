package com.project;

import java.util.HashMap;
import java.util.Map;

public class StatesCacheProxyUtil implements States {

    StatesUtil statesUtil = new StatesUtil();
    Map<String, String> capitalsCache = new HashMap<>();

    @Override
    public String getCapital(String state) {
        if (capitalsCache.containsKey(state)) {
            System.out.println("Getting capital from cache");
            return capitalsCache.get(state);
        }

        String capital = statesUtil.getCapital(state);
        capitalsCache.put(state, capital);
        return capital;
    }
}

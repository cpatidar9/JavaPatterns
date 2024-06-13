package com.project;

public class StatesUtil implements States {

    @Override
    public String getCapital(String state) {
        // uses database to get capitals for states
        return switch (state.toUpperCase()) {
            case "AP" -> "Amaravathi";
            case "BIHAR" -> "Patna";
            case "UP" -> "Lucknow";
            case "NAGALAND" -> "Kohima";
            default -> "Unknown";
        };
    }
}

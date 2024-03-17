package org.example;

public class StringManipulationAkseli {
    public String reverse(String input){
        return new StringBuilder(input).reverse().toString();
    }

    public String capitalize(String input) {
        return input.toUpperCase();
    }
}

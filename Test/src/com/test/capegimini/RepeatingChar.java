package com.test.capegimini;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatingChar {
    public static void main(String[] args) {
        String input = "Capegimini";
        Set<Character> se1= new HashSet<>();
        Optional<Character> firstRepeating= input.chars().mapToObj(c->(char)c).filter(c-> ! se1.add(c)).findFirst();
        System.out.println(firstRepeating.orElse(null));

    }
}

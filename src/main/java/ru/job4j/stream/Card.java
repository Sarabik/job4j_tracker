package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Card {
    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public static void main(String[] args) {
        List<Suit> suitsList = Arrays.asList(Suit.values());
        List<Value> valuesList = Arrays.asList(Value.values());
        List<Card> deck = suitsList.stream()
                .flatMap(s -> valuesList.stream()
                        .map(v -> new Card(s, v)))
                .collect(Collectors.toList());
    }
}
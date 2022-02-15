package com.example.hue12.arithmeticutils;

import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class PostfixCalculator {
    private List<String> expression = new ArrayList<>();
    private Deque<Double> stack = new ArrayDeque<>();

    public PostfixCalculator(List<String> postfix) {
        this.expression = postfix;
    }

    public BigDecimal getResult() {

    }
}

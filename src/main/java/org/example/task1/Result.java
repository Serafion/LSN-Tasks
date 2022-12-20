package org.example.task1;

import java.util.List;

public record Result(Integer count, List<Integer> numbers, Integer distinct, Integer min, Integer max) {
}

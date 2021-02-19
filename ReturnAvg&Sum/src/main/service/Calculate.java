package main.service;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Calculate {

    public int calculateSum(List<Number> numbers) {
        return calculate(numbers);
    }

    public int calculateAverage(List<Number> numbers) {
        int average;
        int sum;
        sum = calculate(numbers);
        average = sum / numbers.size();
        return average;
    }

    int calculate(List<Number> numbers) {
        int sum = 0;
        for (Number num : numbers) {
            sum += num.intValue();
        }
        return sum;
    }
}

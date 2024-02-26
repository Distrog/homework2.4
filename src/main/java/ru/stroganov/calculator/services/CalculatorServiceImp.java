package ru.stroganov.calculator.services;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class CalculatorServiceImp implements CalculatorService {
    @Override
    public String plus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "введите оба числа";
        }

        return num1 + " + " + " " + num2 + " = " + (num1 + num2);
    }

    @Override
    public String minus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "введите оба числа";
        }

        return num1 + " - " + " " + num2 + " = " + (num1 - num2);
    }

    @Override
    public String multiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "введите оба числа";
        }

        return num1 + " * " + " " + num2 + " = " + (num1 * num2);
    }

    @Override
    public String divide(Integer num1, Integer num2) {
        if(num2==0){
            return "на 0 делить нельзя";
        }
        if (num1 == null || num2 == null) {
            return "введите оба числа";
        }
        float result = (float) num1/num2;
        return num1 + " / " + " " + num2 + " = " + result;
    }
}

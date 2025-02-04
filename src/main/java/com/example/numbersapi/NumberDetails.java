package com.example.numbersapi;

import java.util.ArrayList;
import java.util.List;

public record NumberDetails(
        Integer number,
        Boolean is_prime,
        Boolean is_perfect,
        ArrayList<String> properties,
        Integer digit_sum,
        String fun_fact
        )
{

}

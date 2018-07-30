package com.thoughtworks.training.springbootapp;

import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@Profile("add")
@Order(1)
public class AddProcessor implements Processer{

    @Override
    public List<Integer> process(List<Integer> input, int number) {
        return input.stream().map(item -> item + number).collect(Collectors.toList());
    }
}

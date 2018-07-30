package com.thoughtworks.training.springbootapp;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@Profile("odd")
public class OddProcesser implements Processer{

    @Override
    public List<Integer> process(List<Integer> input, int number) {
        return input.stream().filter(item->item % 2 == 0).collect(Collectors.toList());
    }
}

package com.example.exercise.service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class listService {

    List<String> getList() {
        return List.of("Apple", "Banana", "Cherry","Pineapple","Banana","Mango");
    }

    public void displayList() {
        List<String> items = getList();
        // for (String item : items) {
        //     System.out.println(item);
        // }
         Map<String,Long> countItems = items.stream()
         .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
         countItems.forEach((item,count) -> System.out.println(item + ": " + count));
    }
   
}

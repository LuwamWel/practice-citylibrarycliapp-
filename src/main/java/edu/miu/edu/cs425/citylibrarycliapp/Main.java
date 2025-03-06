package edu.miu.edu.cs425.citylibrarycliapp;


import edu.miu.edu.cs425.citylibrarycliapp.model.Publisher;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to cs425 city library!");

        var publishers = List.of(
                new Publisher(101, "McGraw-hill", "mcgraw.com",null ),
                new Publisher(102, "Apress", "apress.com","123-456-7899" ),
                new Publisher(103, "penguine", "penguine.com",null ),
                new Publisher(104, "Addison-wesley", "Addison-wesley.com","124-865-9754" )
        );

        publishers.forEach(System.out::println);
    }
}

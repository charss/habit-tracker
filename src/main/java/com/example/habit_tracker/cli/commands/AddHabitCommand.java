package com.example.habit_tracker.cli.commands;

import org.yaml.snakeyaml.nodes.ScalarNode;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import java.util.Scanner;

@Command(
        name = "add",
        description = "Add a new habit"
)
public class AddHabitCommand implements Runnable {
    @Option(names = {"-n", "--name"})
    private String name;

    @Option(names = {"-d", "--description"}, description = "Optional description")
    private String description;

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);

        if (name == null) {
            System.out.println("Enter name: ");
            name = scanner.nextLine();
        }

        System.out.printf("Habit added: %s%n", name);
    }
}

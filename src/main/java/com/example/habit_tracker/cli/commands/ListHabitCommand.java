package com.example.habit_tracker.cli.commands;

import picocli.CommandLine.Command;

@Command(
        name = "list",
        description = "List all habits"
)
public class ListHabitCommand implements Runnable {
    @Override
    public void run() {
        System.out.printf("Listing all habits");
    }
}

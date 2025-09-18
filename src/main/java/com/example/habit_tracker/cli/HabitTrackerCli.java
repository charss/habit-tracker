package com.example.habit_tracker.cli;

import com.example.habit_tracker.cli.commands.AddHabitCommand;
import com.example.habit_tracker.cli.commands.ListHabitCommand;
import picocli.CommandLine;

public class HabitTrackerCli {
    public static void run(String[] args) {
        int exitCode = new CommandLine(new RootCommand())
                .execute(args);
        System.exit(exitCode);
    }
}

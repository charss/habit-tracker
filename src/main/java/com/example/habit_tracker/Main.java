package com.example.habit_tracker;

import com.example.habit_tracker.cli.HabitTrackerCli;
import com.example.habit_tracker.web.HabitTrackerApplication;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println();
            System.out.println("Usage: habit [command] [options]");
            System.out.println();
            System.out.println("Commands:");
            System.out.println("  add, list, ...    Default CLI mode");
            System.out.println("  web               Start the web server");
            System.out.println();
            System.out.println("Use 'habit [command] --help' to see detailed options for a command.");
            System.out.println();
            return;
        }

        HabitTrackerCli.run(args);
    }
}

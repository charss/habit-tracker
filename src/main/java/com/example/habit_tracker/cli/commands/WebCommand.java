package com.example.habit_tracker.cli.commands;

import com.example.habit_tracker.web.HabitTrackerApplication;
import picocli.CommandLine.Command;

@Command(
        name = "web",
        description = "Start the web server"
)
public class WebCommand implements Runnable {
    @Override
    public void run() {
        System.out.println("Starting web server...");
        HabitTrackerApplication.run(new String[]{});
    }
}

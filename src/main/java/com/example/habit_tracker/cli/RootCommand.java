package com.example.habit_tracker.cli;

import com.example.habit_tracker.cli.commands.AddHabitCommand;
import com.example.habit_tracker.cli.commands.ListHabitCommand;
import com.example.habit_tracker.cli.commands.WebCommand;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.IVersionProvider;

import java.util.Properties;


@Command(
        name = "habit",
        mixinStandardHelpOptions = true,
        description = "HabitCLI - Manage your habits",
        versionProvider = RootCommand.VersionProvider.class,
        subcommands = {
                AddHabitCommand.class,
                ListHabitCommand.class,
                WebCommand.class
        }
)
public class RootCommand implements Runnable {
    @Override
    public void run() {
        new CommandLine(this).usage(System.out);
    }

    static class VersionProvider implements IVersionProvider {
        @Override
        public String[] getVersion() throws Exception {
            Properties props = new Properties();
            try (var stream = RootCommand.class.getClassLoader().getResourceAsStream("/version.properties")) {
                if (stream != null) {
                    props.load(stream);
                    return new String[] { "Habit Tracker " + props.getProperty("app.version") };
                }
            }
            return new String[] { "Habit Tracker (version unknown)" };
        }
    }
}

package com.tm.bank;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class App {

    public static void main(String[] args) throws ParseException {
        Options options = new Options();
        options.addOption("f", "file", true, "Path to csv file");
        options.addOption("h", "help", false, "Show help");

        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, args);
        
        if(cmd.hasOption("help")) {
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp( "bank-csv", options );
            return;
        }
        if(!cmd.hasOption("f")) {
            System.out.println("Missing input file");
            return;
        }
    }
}

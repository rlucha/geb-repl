package shell;

import org.codehaus.groovy.tools.shell.Main;
import org.fusesource.jansi.AnsiConsole;

public class ShellMain {
    public static void main(String[] args) {
        AnsiConsole.systemUninstall();
        Main.main(args);
    }
}


// RUN this on the shell

//import groovy.grape.Grape
//Grape.grab(group:"org.gebish", module:"geb-core", version:"3.4")
//Grape.grab(group:"org.seleniumhq.selenium", module:"selenium-firefox-driver", version:"3.14.0")
//Grape.grab(autoDownload: true, group : 'org.seleniumhq.selenium', module : 'selenium-chrome-driver', version : '3.14.0')
//Grape.grab(group:"org.seleniumhq.selenium", module:"selenium-chrome-driver", version:"3.14.0")
//import geb.Browser
//browser = new Browser()
//browser.drive { go "http://www.google.com" }

// also check https://github.com/geb/geb-example-gradle/blob/master/build.gradle
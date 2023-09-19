package com.lukaspatrnciak.eventsystem;

import com.lukaspatrnciak.eventsystem.demo.domain.User;
import com.lukaspatrnciak.eventsystem.demo.services.ConsoleUserService;
import com.lukaspatrnciak.eventsystem.demo.services.Slf4jUserService;
import com.lukaspatrnciak.eventsystem.demo.services.UserService;
import com.lukaspatrnciak.eventsystem.demo.web.UserInterface;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Main {
    public static final User users[] = {
            new User("Lukas", "Patrnciak", "lukaspatrnciakk@gmail.com"),
            new User("Meno", "Priezvisko", "email@email.com")
    };

    public static void main(String[] args) throws InterruptedException {
        UserService slf4jService = new Slf4jUserService();
        UserService consoleService = new ConsoleUserService();
        UserInterface userInterface = new UserInterface();

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        userInterface.addListener(slf4jService);
        userInterface.addListener(consoleService);

        System.out.println("Zadajte pocet opakovani: ");
        int userInput = input.nextInt();

        // Viacero pouzivatelov vyvolava eventy
        for(int i = 0; i < userInput; i++) {
            int index = Math.abs(random.nextInt()) % users.length;

            userInterface.userInput(users[index]);

            sleep(4000);
        }
    }
}

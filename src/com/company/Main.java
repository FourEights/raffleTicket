package com.company;


import com.sun.deploy.net.MessageHeader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ticketGenerator();

    }

    public static void ticketGenerator() {

        ArrayList<Integer> ticketNumbers = new ArrayList<>();

        for (int i = 1; i <= 500; i++) {

            ticketNumbers.add(i);

        }

        Random ticketSelector = new Random();
        int ticketSelected = ticketSelector.nextInt(500);
        System.out.println(ticketSelected);
        ticketNumbers.get(ticketSelected);

    }
}

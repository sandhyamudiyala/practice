package com.designpattern.builder;

import java.util.logging.Logger;

public class CreateBicycle {

    public static final Logger logger= Logger.getLogger(CreateBicycle.class.getName());
    public static void main(String[] args) {
        BiCycle.Builder biCycle=new BiCycle.Builder().gears("Gears Fitted").doubleSeats("Double seats Fixed").doubleStands("DoubleStands Fixed").carrier("Carrier fitted");
        logger.info("BiCycle1 is  manufactured with all gadgets possible");
        biCycle.build();
        BiCycle.Builder cycle=new BiCycle.Builder().gears("Gears Fitted").carrier("Carrier fitted");
        logger.info("Bicycle2 with only Gears and Carrier manufactured");
        cycle.build();
    }
}

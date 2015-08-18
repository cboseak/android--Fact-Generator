package com.example.twoffice.funfacts;

import java.util.Random;

/**
 * Created by TWoffice on 8/15/2015.
 */
public class FactBook {
    //Member variables

    //Methods/functions
    public String getFact(){

        // the button was clicked, so update the colors label with a new colors


        String[] fact = {"Most streets in Japan do not have names.",
                "It costs more than double what a penny is worth to produce it.",
                "Bubble wrap was originally designed to be used as wallpaper.",
                "Post-it notes were invented by accident.",
                "Every possible state of a Rubik's Cube can be solved in 20 moves or less.",
                "Lighters were invented before the match.",
                "Coca-Cola would be green if the food colorant wasn't added.",
                "A Ten Gallon Hat will only hold 3/4 of a Gallon.",
                "One fourth of the bones in your body are in your feet",
                "It takes more calories to eat a piece of celery than the celery has in it.",
                "When hippos are upset, their sweat turns red.",
                "Human saliva has a boiling point three times that of regular water.",
                "If you lift a kangaroo’s tail off the ground it can’t hop.",
                "The person who invented the Frisbee was cremated and made into frisbees after he died!",
                "During your lifetime, you will produce enough saliva to fill two swimming pools.",
                "King Henry VIII slept with a gigantic axe beside him.",
                "If Pinokio says “My Noes Will Grow Now”, it would cause a paradox",
                "Heart attacks are more likely to happen on a Monday.",
                "A toaster uses almost half as much energy as a full-sized oven.",
                "A baby spider is called a spiderling.",
                "You cannot snore and dream at the same time.",
                "The following can be read forward and backwards: Do geese see God?",
                "A baby octopus is about the size of a flea when it is born.",
                "A sheep, a duck and a rooster were the first passengers in a hot air balloon.",
                "In Uganda, 50% of the population is under 15 years of age.",
                "Recycling one glass jar saves enough energy to watch TV for 3 hours.",
                "Catfish are the only animals that naturally have an odd number of whiskers.",
                "The Titanic was the first ship to use the SOS signal.",
                "About 8,000 Americans are injured by musical instruments each year.",
                "Sea otters hold hands when they sleep so they don’t drift away from each other.",
                "A small child could swim through the veins of a blue whale.",
                "A Whip makes a cracking sound because its tip moves faster than the speed of sound. ",
                "It cost 7 million dollars to build the Titanic and 200 million to make a film about it. ",
                "Your left lung is smaller than your right lung to make room for your heart. ",
                "Chewing gum while peeling onions will keep you from crying. ",
                "The Boeing 747 is capable of flying upside-down if it weren’t for the fact that the wings would shear off when trying to roll it over. ",
                "You can actually sharpen the blades on a pencil sharpener by wrapping your pencils in aluminum foil before inserting them. ",
                "A company in Taiwan makes dinnerware out of wheat, so you can eat your plate. ",
                "A dime has 118 ridges around the edge. ",
                "A giraffe can go without water longer than a camel can. ",
                "A shark is the only fish that can blink with both eyes. ",
                "America once issued a 5-cent bill. ",
                "An iguana can stay under water for 28 minutes. ",
                "Bats always turn left when exiting a cave. ",
                "An ostrich’s eye is bigger than its brain. ",
                "More Monopoly money is printed in a year, than real money printed throughout the world. "
                };
            Random randNum = new Random();
            int passThrough = randNum.nextInt(fact.length);
            return fact[passThrough];
    }
}

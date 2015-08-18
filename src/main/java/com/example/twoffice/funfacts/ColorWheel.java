package com.example.twoffice.funfacts;

import android.graphics.Color;
import android.widget.RelativeLayout;

import java.util.Random;


public class ColorWheel {

    // the button was clicked, so update the colors label with a new colors

        public String[] colors = {"#39add1", // light blue
                "#3079ab", // dark blue
                "#c25975", // mauve
                "#e15258", // red
                "#f9845b", // orange
                "#838cc7", // lavender
                "#7d669e", // purple
                "#53bbb4", // aqua
                "#51b46d", // green
                "#e0ab18", // mustard
                "#637a91", // dark gray
                "#f092b0", // pink
                "#b7c0c7"  // light gray
        };

        public int getColor() {

            Random randNum = new Random();
            int passThrough = randNum.nextInt(colors.length);

            String color = colors[passThrough];

            int colorAsInt = Color.parseColor(color);


            return colorAsInt;
        }




}


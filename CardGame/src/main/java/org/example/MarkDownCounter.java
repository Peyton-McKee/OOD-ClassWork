package org.example;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

class MarkDownCounter {
    public static void main(String[] args) {
        File file = new File(args[0]);
        double mean = 0;
        int median = 0;
        double std = 0;
        if (file.exists()) {
            // Accumulate the data of the text file into one string
            Scanner sc = null;
            try {
                sc = new Scanner(file);
            } catch (IOException e) {
                e.printStackTrace();
                System.exit(1);
            }
            StringBuilder content = new StringBuilder();
            while (sc.hasNextLine()) {
                content.append(sc.nextLine()).append("\n");
            }
            String fileText = content.toString();
            ArrayList<Integer> nums = new ArrayList<>();
            int counter = 0;
            //Calculate the mean, median and standard deviation. ArrayList<Integer> nums = new ArrayList<Integer>(); int counter = 0; int currentNum = 0;
            for (String str: fileText.split(" ")) {
                int currentNum = Integer.parseInt(str);
                nums.add(currentNum);
                mean += currentNum;
                counter++;
            }
            median = nums.get(counter / 2); mean = mean / counter; for (int num: nums) { std += Math.pow(mean - num, 2);
            }
            std = Math.sqrt(std);
        } else {
            throw new IllegalArgumentException("File does not exist at given path");
        }
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println(df.format(mean));
        System.out.println(df.format(median));
        System.out.println(df.format(std));
    }
}

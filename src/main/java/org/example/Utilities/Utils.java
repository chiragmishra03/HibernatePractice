package org.example.Utilities;

import org.example.entities.Student;

public class Utils {

    private static String randomNameGenerator() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int length = (int)(Math.random() * 5) + 4; // length between 4 and 8
        StringBuilder name = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = (int)(Math.random() * alphabet.length());
            name.append(alphabet.charAt(index));
        }

        return name.toString();
    }

    private static int randomAgeGenerator(){
        return ((int)(Math.random() * 10) + 8);
    }

    public static Student createStudent(){
        Student student = new Student();
        student.setName(randomNameGenerator());
        student.setsAge(randomAgeGenerator());
        student.setRollNo(randomAgeGenerator() * randomAgeGenerator());
        return student;
    }

}

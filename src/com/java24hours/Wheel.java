package com.java24hours;
/*program show how two nested for loops can be used to cycle through a group
of phrases one letter at a time.
*/
class Wheel {
    public static void main(String[] arguments) {
        //pharses are stored in string array
        String phrase[] ={
            "A STITCH IN TIME SAVES NINE",
            "DON'T EAT YELLOW SNOW",
            "JUST DO IT",
            "EVERY GOOD BOY DOES FINE",
            "I WANT MY MTV",
            "PLAY IT AGAIN, SAM",
            "FROSTY THE SNOWMAN",
            "ONE MORE FOR THE ROAD",
            "HOME FIELD ADVANTAGE",
            "VALENTINE'S DAY MASSACRE",
            "GROVER CLEVLAND OHIO",
            "SPAGHETTI WESTERN",
            "AQUA TEEN HUNGER FORCE",
            "IT'S A WONDERFUL LIFE"
            
        };
       //array uses to stor the numbr of times each letter appears
        int[] letterCount = new int[26];
        for (int count = 0; count < phrase.length; count ++) {
            String current = phrase[count];
            char[] letters = current.toCharArray();
            for (int count2 = 0; count2 < letters.length; count2++) {
                char lett = letters[count2];
                if ( ( lett >= 'A') & (lett <= 'Z') ) {
                    letterCount[lett - 'A']++;
                }
            }
        }
        for (char count = 'A'; count <= 'Z'; count ++) {
            System.out.print(count +": " +
                    letterCount[count - 'A'] +
                    " ");
            if (count == 'M') {
                System.out.println();
            }
        }
    System.out.println();
}
}
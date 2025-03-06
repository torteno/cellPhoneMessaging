// CCC '06 J3 - Cell-Phone Messaging
// 2025-02-26
// tortenotorteno


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class cellphonemessaging {
    public static void main(String[] args) throws IOException {

        // Creates a buffered reader to take input from the user
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        
        String input;
        int time; 
        int lastPicked;


        // Creates a 2D array with each character key in an array that corrosponds to the button it is on, and is in the position to be time to press -1 due to how arrays work. 
        char[][] values = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}, {'j', 'k', 'l'}, {'m', 'n', 'o'}, {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};
      
      
        //takes the input initially for the first iteration so it dosent get over ruled if I put it at the front of the while loop
        input = reader.readLine();

        // while loop only works if the characters do not equal "halt"
        while(!input.equals("halt")) {
            lastPicked = -1;
            time = 0;


            //converts the string to an array for easier processing
            char[] chararray = input.toCharArray();


            // sets the length here to make sure that it only needs to be calculated once(faster).
            int arraylength = chararray.length;


            // 3 loops to read each individual character(outmost loop), goes through each array within the 2D array(middle loop), and goes through each character in those arrays(inner most loop).
            for(int i = 0; i < arraylength; i++) {
                for(int k = 0; k < values.length; k++) {
                 for(int j = 0; j < values[k].length; j++) {

                    // checks if the variables above(representing a specific character in the arrays) are equal to the current character in the string and if found applies an increase of time dpending on where it is, and saves what array/button it is in. 
                    if(chararray[i] == values[k][j]) {
                        time += j + 1;
                        if(lastPicked == k) {
                            time += 2; 
                        }
                        lastPicked = k; 

                        // exits the innermost loop if the character is found - more resource efficent 
                        break;
                    }
                }
            }
            }
            System.out.println(time);


            // takes the next input at the end to make sure nothing gets overruled. 

            input = reader.readLine();
        }
    }
}

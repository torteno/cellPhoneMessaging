import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class cellphonemessaging {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        int time; 
        int lastPicked;
        char[][] values = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}, {'j', 'k', 'l'}, {'m', 'n', 'o'}, {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};
        input = reader.readLine();
        while(!input.equals("halt")) {
            lastPicked = -1;
            time = 0;
            char[] chararray = input.toCharArray();
            int arraylength = chararray.length;
            for(int i = 0; i < arraylength; i++) {
                for(int k = 0; k < values.length; k++) {
                 for(int j = 0; j < values[k].length; j++) {
                    if(chararray[i] == values[k][j]) {
                        time += j + 1;
                        if(lastPicked == k) {
                            time += 2; 
                        }
                        lastPicked = k; 
                        break;
                    }
                }
            }
            }
            System.out.println(time);
            input = reader.readLine();
        }
    }
}

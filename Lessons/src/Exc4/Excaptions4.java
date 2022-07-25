package Exc4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Excaptions4 {
    public static void main(String[] args) {
  /*      try {
            run();
        } catch (IOException | ParseException e) {  ///MULTICATCH
            e.printStackTrace();
  //      } catch (ParseException e) {
   //         e.printStackTrace();
        }
    }*/
        try {
            run();
        } catch (Exception e) {

        }
    }


    public static void run() throws IOException, FileNotFoundException, IllegalArgumentException, ParseException {

    }
}

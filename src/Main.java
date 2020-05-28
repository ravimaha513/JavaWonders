import com.info.interfaces.AmericanTranslator;
import com.info.interfaces.ITranslator;
import com.info.interfaces.IndianTranslator;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Which translator you need");

        //Oracle/Cassandra
        //IDatabaseOperations:
        //add(), delete(), update()
        //IDatabaseOperations dboperations = new Oracle
        // new Cassandra

        //FACTORY DESIGN PATTERN
        if(scan.next().equals("English")){
            ITranslator americantranslator = new AmericanTranslator();
            System.out.println(americantranslator.translate().getFromLanguage());
            System.out.println(americantranslator.writeNotes().getConvHindi());
        }
        else if(scan.next().equals("Hindi")){

            ITranslator translator = new IndianTranslator();
            System.out.println(translator.translate().getFromLanguage());
            System.out.println(translator.writeNotes().getConvEnglish());
        }




    }


}

/*

Interface


interact with (another system, person, organization, etc.).

//American
Translator:
    translate what Mr.Modi is saying to American President
    listen(); // listen in English
    translate(); // to hindi
    writingNotes(); //hindi

//Indian
Translator:

 translate what Mr.President is saying to Mr.Modi
    listen(); //to hindi
    translate(); // to english
    writingNotes(); // english
 */


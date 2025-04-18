import javax.xml.namespace.QName;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {


    }

    //for loop iteration through an array
    static void loopsAndArrays() {
        int[] integerArray = new int[5];
        String[] stringArray = {"Izel", "Victoria", "Noah", "Sujan"};

        for (int i = 0; i < 3; i++) {
            System.out.println("string at " + i + ":" + stringArray[i]);
        }


        //for each is just for w/o iterator management
        //do not need to initialize the iterator,
        //in this case "name"
        for (String name : stringArray) {
            System.out.println("Here is the name: " + name);
        }
    }
}

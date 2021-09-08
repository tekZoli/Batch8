package String;

public class Methods2 {

    public static void main(String[] args) {

       String name = "Diana";

       name.indexOf('D');
       name.indexOf("D"); // both work because of single charachters, but it will also take String value
       name.indexOf("Di");

        System.out.println(name.indexOf('D'));
        System.out.println(name.indexOf("Di")); //----> 0, once you provide more than charachter its looking for the first matching sequence, ----> 0, and it returns the first char index nr
        System.out.println(name.indexOf("ana")); //  ---> 2
        System.out.println(name.indexOf("ina")); // =-1, there is no matching char sequence//// it is not an error
        System.out.println(name.indexOf("k")); //


        name.concat(" Bejan");
        System.out.println(name.concat(" Bejan")); //
        System.out.println(name);

        name = name.concat(" Bejan"); //this is correct

        System.out.println(name);


        name.indexOf("a"); //--> it will start looking for that char from given index

        name.indexOf("B",name.indexOf(" "));


        System.out.println(name.indexOf("B",name.indexOf(" "))); // Arzu Beril Sen, letter after the second space

        name = "Arzu Beril Sen";

        System.out.println(name.indexOf("e",name.indexOf(" ")+3)); //should be +2

        name.indexOf(2); //values given inside of the method parentheses are called
                        // some methods take no parameters some take single or multiple parameters

        name.length();  // no parameters
                name.charAt(3); // single parameter
                name.indexOf("e",4); // you can pass either one or two parameters by separating them with comma
        System.out.println(name.indexOf("e",4));

    }
}

/**
 * Examples of Primitive datatype
 *
 * @Author Aleksandr Kozemjakov
 */
public class DataType {
    //Primitive Data types
    // Numbers
    int a = 1;
    byte byteNumber =120;
    long longNumber = 5454545465L;
    short shortNumber = -32000;
    float decimalNumber = 2.45f;
    double doubleDecimalNumber = 3.456d;

    //Character
    char alpha = 'F';

    //True/False
    boolean hadLunch = true; // had lunch?
    boolean isHoliday = false;

    /* Multi-line
    comment
     */

    int i; // 0

    float x; // 0.00f

    char animal; //''

    boolean isClassTomorrow; //false
    
    //Non-primitive data types
    String word ="I'm a developer";
    
    Character random = 'u';
    
    Integer number =5;
    
    Float numberSecond = 2.45F;
    
    Integer randomNumber; // null

    // Multi-declaration

    int numberOne , numberTwo , numberThree;

    String fruit = "apple" , vegetable = "pumpkin";

    // Scope of class variables
    private static String Car = "Volkswagen";

    public static String Food = "Cake";

    public static void main(String[] args) {
        int k = 0;
        Integer y = null;
        System.out.println(k);
        System.out.println(y);

        String _color = "black";

        int $hexaNumber = 0x2A;

        float exam12_mark = 100.10f;

        String className = "sda";

        int a = 100;
        int b = 0;

        int c = a + b;

        System.out.println(Car);
        System.out.println(Food);


    }
}

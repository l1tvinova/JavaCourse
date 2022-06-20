
public class fizzBuzz {

    public static void main(String[] args) {
//        System.out.println("start");
//        System.out.println(SimpleUnit.assertEquals("Hello", "Hello"));

        System.out.println(SimpleUnit.assertNotEquals(fizzBuzz(300), "Fizz"));
        System.out.println(SimpleUnit.assertNotEquals(fizzBuzz(5), "Fizz"));
        System.out.println(SimpleUnit.assertEquals(fizzBuzz(1), "1"));
        System.out.println(SimpleUnit.assertEquals(fizzBuzz(15), "FizzBuzz"));
        System.out.println(SimpleUnit.assertNotEquals(fizzBuzz(15), "15"));
    }

    public static String fizzBuzz(int i) {
        String result = "";

        if (i % 3 == 0) {
            result += "Fizz";
        }
        if (i % 5 == 0) {
            result += "Buzz";
        }
        return result.equals("") ? Integer.toString(i) : result;
    }
}

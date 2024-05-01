public class pri {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            int result = arr[4];
             int divisionResult = 10 / 0;
             String str = null;
             int length = str.length();
             String invalidNumber = "abc";
             int parsedNumber = Integer.parseInt(invalidNumber);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught generic Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}

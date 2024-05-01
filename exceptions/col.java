package exceptions;
public class col {

    public void displayColor(char alphabet) {
        if (!Character.isLetter(alphabet)) {
            throw new IllegalArgumentException("Input must be an alphabet.");
        }

        char lowerCaseAlphabet = Character.toLowerCase(alphabet);

        switch (lowerCaseAlphabet) {
            case 'r':
                System.out.println("Red");
                break;
            case 'o':
                System.out.println("Orange");
                break;
            case 'y':
                System.out.println("Yellow");
                break;
            case 'g':
                System.out.println("Green");
                break;
            case 'b':
                System.out.println("Blue");
                break;
            case 'i':
                System.out.println("Indigo");
                break;
            case 'v':
                System.out.println("Violet");
                break;
            default:
                throw new IllegalArgumentException("Invalid alphabet. Not a color of the rainbow.");
        }
    }

    public static void main(String[] args) {
        col rainbowColorDisplay = new col();

        try {
            rainbowColorDisplay.displayColor('b');
            rainbowColorDisplay.displayColor('x'); // This will raise an exception
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

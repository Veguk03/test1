public class Tank {
    private int position;

    public void goForward(int distance) {
        position += distance;
    }

    public void goBackward(int distance) {
        position -= distance;
    }

    public void printPosition() {
        System.out.println("The Tank is at " + position + " now.");
    }
}

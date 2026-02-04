public class Prism {
    private int length;
    private int width;
    private int height;


    public Prism(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Prism(int side) {
        this.length = side;
        this.width = side;
        this.height = side;
    }

    public Prism() {
        this.length = (int) (Math.random() * 91) + 10;
        this.width = (int) (Math.random() * 91) + 10;
        this.height = (int) (Math.random() * 91) + 10;
    }


    public void setLength(int newLength) {
        length = newLength;
    }


    public void setWidth(int newWidth) {
        width = newWidth;
    }


    public void setHeight(int newHeight) {
        height = newHeight;
    }


    public int volume() {
        return length * width * height;
    }


    public int surfaceArea() {
        int bottomTom = length * width;
        int leftRight = length * height;
        int frontBack = width * height;
        int sa = 2 * bottomTom + 2 * leftRight + 2 * frontBack;
        return sa;
    }


    public String dimensions() {
        String str = "Length = " + length + "\n";
        str += "Width = " + width + "\n";
        str += "Height = " + height;
        return str;
    }
}

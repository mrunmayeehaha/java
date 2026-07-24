class Volume {
    int length;
    int breadth;
    int height;

    Volume(int b, int h) {
        length = 5;
        breadth = b;
        height = h;
    }

    void display() {
        int volume = length * breadth * height;
        System.out.println("Volume: " + volume);
    }

    public static void main(String[] args) {
     
        Volume obj = new Volume(4, 3);
        obj.display();
    }
}
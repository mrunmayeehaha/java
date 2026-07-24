class Mobile {
    float screen_size;
    String company_name;

    Mobile(String cn) {
        screen_size = 50.9f; // 'f' indicates a float literal
        company_name = cn;
    }

    void display() {
        System.out.println("Company name: " + company_name + "Screen Size: " + screen_size);
    }

    public static void main(String[] args) {
        Mobile obj = new Mobile("ABCDE");
        obj.display();
    }
}
interface Message{
    void display();
    }

    public class LambdaNoPara{
        public static void main(String[] args) {
            Message m = () -> {
                System.out.println("HELLO");
            };
            m.display();
        }}
    

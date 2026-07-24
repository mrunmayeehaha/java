class Area{
int length;
int breadth;
int side;
int radius;

Area(int l, int b){
length = l;
breadth = b;  }

Area(){
int radius = 7;

 }

Area(int s){
side = s;  }

Area(Area obj1){
side = obj1.side;  }     

void formula(){
 }
 
public static void main(String[] args){
Area obj3 = new Area();
Area obj1 = new Area(5, 5);
Area obj2 = new Area(obj1);
double circle = 3.14 * obj3.radius * obj3.radius;
int rect = obj1.length * obj1.breadth;
int square = obj2.side * obj2.side;  

System.out.println("Area of circle: " + circle);
System.out.println("Area of rect: " + rect);
System.out.println("Area of square: " + square);
}}


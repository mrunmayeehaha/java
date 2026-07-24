class Student{
String name; int roll; String dept;

Student(String n, int r, String d){
name = n;
roll = r;
dept = d;
}

Student(){
name = "Mrunmayee";
roll = 23;
dept = "CSE";
}
Student(Student obj){
name = obj.name;
roll = obj.roll;
dept = obj.dept;
}

void display(){
System.out.println("Name: " + name + " " + "Roll no.: " + roll + " " + "Department: " + dept);
}
public static void main(String[] args){
Student obj1 = new Student("ABC", 01, "Mechanical");
Student obj2 = new Student(obj1);
obj2.display();
} }

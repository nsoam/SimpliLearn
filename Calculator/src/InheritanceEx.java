//Covers Section 2.5 - Constructors

class Shape {
    private int edges;

    //default constructor
    public Shape(){
        System.out.println("Shape class default constructor \n");
    }

    //parametrized  constructor
    public Shape(int edges){
        System.out.println("Shape class parametrized constructor");
        System.out.println("Total Edges:"+ edges +"\n");
    }

    //super class method
    public void area(String n) {
        System.out.println("This is the area of:" + n);
    }

    //getter-setters for the private variable of super class
    public int getEdges() {
        return edges;
    }

    public void setEdges(int edges) {
        this.edges = edges;
    }
}

//child class
class InheritShapes extends Shape {
    //different implementations of super class method area
    public void circle() {
        area("circle");
        System.out.println("Setting edges to 0");
        setEdges(0);
        System.out.println("Print no.of edges:" + getEdges()+"\n");
        new Shape(0);
    }

    public void square() {
        area("square");
        System.out.println("Setting edges to 4");
        setEdges(4);
        System.out.println("Print no.of edges:" + getEdges()+"\n");
        new Shape(4);
    }

    public void pentagon() {
        area("pentagon");
        System.out.println("Setting edges to 5");
        setEdges(5);
        System.out.println("Print no.of edges:" + getEdges()+"\n");
        new Shape(5);
    }
}

public class InheritanceEx {
    public static void main(String[] args) {
        InheritShapes inShapes = new InheritShapes();
        inShapes.circle();
        inShapes.square();
        inShapes.pentagon();

    }
}

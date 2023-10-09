package com.example.tiang3;

public class Triangle {

    Point A, B, C;

    public Triangle(Point a, Point b, Point c) {
        this.A = a;
        this.B = b;
        this.C = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + A +
                ", b=" + B +
                ", c=" + C +
                '}';
    }

    double getArea(){
        return (B.x - A.x)*(C.y - A.y)-(C.x-A.x)*(B.y- A.y)*0.5;

    }
    public static Triangle parseTr(String s){
        s = s.replace("{", "").replace("}", "");
        String[] trgl = s.split(", ");
        Point p1 = Point.parsePoint(trgl[0]);
        Point p2 = Point.parsePoint(trgl[1]);
        Point p3 = Point.parsePoint(trgl[2]);
        Triangle tr = new Triangle(p1, p2, p3);
        return tr;
    }

//    double getPath(String pathO) throws FileNotFoundException {
////        String inputFile = "inputOne.txt";
//        Scanner sc = new Scanner(new File(pathO));
//        String s;
//        s = sc.nextLine();
//        Triangle t = Triangle.parseTr(s);
//
////        System.out.println(t.getArea());
//        return t.getArea();
//    }


}

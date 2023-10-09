package com.example.tiang3;

public class Point {
    double x, y;

    public String toString() {
        return "(" + x + " ; " + y +")";
    }

    public Point(double a, double b){
        x = a;
        y = b;

    }
    public static Point parsePoint(String s){
        s = s.replace("(","").replace(")","");
        String[] cc = s.split(";");
        double x = Double.parseDouble(cc[0]);
        double y = Double.parseDouble(cc[1]);
        return new Point(x, y);
    }
}

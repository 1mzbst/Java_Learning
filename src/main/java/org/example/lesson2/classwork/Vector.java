package org.example.lesson2.classwork;

public class Vector {
    public double x;
    public double y;
    public double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector() {
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    /**
     *
     * @return длину вектора
     */
    public double vectorLength(){
        return math.sqrt(x*x + y*y + z*z);
    }

    public double scalar(Vector vector2){
        return x*vector2.x + y*vector2.y + z*vector2.z;
    }

}

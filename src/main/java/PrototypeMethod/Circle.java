package PrototypeMethod;

import java.util.Objects;

public class Circle extends Shape{
    public int radius;

    public Circle(){

    }

    public Circle(Circle circle){
        super(circle);
        if(circle!=null){
            this.radius = circle.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Circle circle)) return false;
        if (!super.equals(object)) return false;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(),radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}

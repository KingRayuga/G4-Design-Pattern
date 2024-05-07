package PrototypeMethod;

import java.util.Objects;

public abstract class Shape {
    public int x;
    public int y;
    public String color;

    public Shape(){

    }

    public Shape(Shape target){
        if(target!=null){
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object object){
        if(object instanceof Shape shape){
            return (this.x==shape.x && this.y==shape.y && this.color.equals(shape.color));
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, color);
    }

    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }
}

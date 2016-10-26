package question2;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Created by Ray on 2016/10/25.
 * 陈枭磊
 * Java programing Autumn 2016
 * Lab 6
 */
public class Circle extends GeometricObject implements Comparable {

    private BigDecimal radius;

    Circle(double r){
        radius = new BigDecimal(r);
    }

    public BigDecimal getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = new BigDecimal(radius);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof  Circle){
            Circle circle = (Circle)obj;
            return circle.getRadius().compareTo(radius) == 0;
        }
        else {
            return false;
        }
    }

    @Override
    public double getArea() {
        double r = radius.doubleValue();
        return Math.PI * r * r;
    }

    @Override
    public double getPerimeter() {
        return 2.0 * Math.PI * radius.doubleValue();
    }

    @Override
    public int compareTo(Object o) {
        Circle circle = (Circle)o;
        return radius.compareTo(circle.getRadius());
    }
}

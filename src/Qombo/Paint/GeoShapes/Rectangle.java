/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Qombo.Paint.GeoShapes;

import java.awt.Point;
import static java.lang.Math.*;

/**
 *
 * @author lo2ay
 */
public class Rectangle extends java.awt.Rectangle {
    
    private Point leftUp;
    private Point rightDown;
    public Rectangle (Point p1, Point p2){
        super();
        int width = abs(p1.x - p2.x);
        int height = abs(p1.y - p2.y);
        int x = min(p1.x,p2.x);
        int y = min(p1.y,p2.y);
        this.leftUp = new Point(x,y);
        this.rightDown = new Point (x+width,y+height);
        this.setRect(leftUp.x, leftUp.y, width, height);
    }
}

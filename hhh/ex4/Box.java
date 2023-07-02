package hhh.ex4;

public class Box {
    private String color;
    private int length;
    private int width;
    private int height;


    public Box(String color, int length, int width, int height) {
        this.color = color;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(String color){

        this.color = "black";
        this.height =20 + (int) (Math.random()*80) + 20;
        this.width =20 + (int) (Math.random()*80) + 20;
        this.length =20 + (int) (Math.random()*80) + 20;


    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

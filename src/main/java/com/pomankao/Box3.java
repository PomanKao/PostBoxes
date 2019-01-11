package com.pomankao;

public class Box3 extends Box implements PrintBoxInfo{
    public Box3() {
        super(23f,14f,13);
    }

    @Override
    protected boolean validate(float length, float width, int height) {
        return (this.bLength > length) && (this.bWidth > width) && (this.bHeight > height);
    }

    @Override
    public void printBoxInfo() {
        System.out.println(Box3.class.getName() + "長為" + this.bLength + "公分，寬為" + this.bWidth +
                "公分，高為" + this.bHeight + "公分");
    }
}

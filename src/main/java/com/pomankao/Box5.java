package com.pomankao;

public class Box5 extends Box implements PrintBoxInfo {
    public Box5() {
        super(39.5f,27.5f,23);
    }

    @Override
    protected boolean validate(float length, float width, int height) {
        return (this.bLength > length) && (this.bWidth > width) && (this.bHeight > height);
    }

    @Override
    public void printBoxInfo() {
        System.out.println(Box5.class.getName() + "長為" + this.bLength + "公分，寬為" + this.bWidth +
                "公分，高為" + this.bHeight + "公分");
    }
}

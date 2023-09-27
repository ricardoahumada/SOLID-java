package com.enmotion.lsp.si.shape;

public class ClientAreas {
	public boolean areaVerifier(Rectangle r) {
        r.setWidth(5);
        r.setHeight(4);

        if(r.area() != 20) {
            return false;
        }

        return true;
    }
	
	public boolean areaVerifier(Shape s) {
		int[] sides={5,4};
        s.setSides(sides);
 
        if(s.area() <= 0) {
            return false;
        }
 
        return true;
    }
}

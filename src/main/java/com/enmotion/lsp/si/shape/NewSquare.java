package com.enmotion.lsp.si.shape;

public class NewSquare extends Shape{

    public int area(){
    	int area=0;
    	if(sides!=null && sides.length>0)area=sides[0]*sides[0];
    	
    	return area;
    }
	
	
}

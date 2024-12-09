package com.klef;
interface i{
	void Area(float l,float w);
}
abstract class Rectangle implements i{
	float length;
      float width;
  @SuppressWarnings("unused")
Rectangle(float length,float width) {
	float len = length;
	float wid = width;
	  System.out.println("Arear of Rectangle is"+0.05);

	}
}

public class Demo {
	Rectangle r = new Rectangle(0, 0) {
        @Override
        public void area(float l, float w) {
            float area = l * w;
            System.out.println("Area of Rectangle is: " + area);
            r.area(10,20);
        }
	}
}

	
	

        
    



package today;

enum ShirtMaterial {
    cotton,linen,polyster;
}
public class Shirt {
	float collarSize;
	float length;
	String material;

	    public Shirt () {
//	    	collarSize = 0f;
//	    	length = 0;
//	    	material ="";
//	      
	    }
	    public Shirt(float collarSize, float length, String material) {
	        this.collarSize = collarSize;
	        this.length = length;
	        this.material = material;
	    }
	    public float getCollarSize() {
	        return collarSize;
	    }
	    public void setCollarSize(float collarSize) {
	        this.collarSize = collarSize;
	    }
	    public float getLength() {
	        return length;
	    }
	    public void setLength(float length) {
	        this.length = length;
	    }
	    public String getMaterial() {
	        return material;
	    }
	    public void setMaterial(String material) {
	        this.material = material;
	    }
	    
	    public String displaydetails() {
	        return "Shirt [collarSize=" + collarSize + ", length=" + length + ", material=" + material + "]";
	    }
	    
}

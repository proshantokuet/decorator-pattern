package proshantp.com.decorator;

public class WhiteCircle extends ShapeDecorator{

	public WhiteCircle(Shape shape) {
		super(shape);
		
	}
	
	public void draw() {
		shape.draw();
		setBorder(shape);
	}
	
	public void setBorder(Shape s){
		
		System.err.println("set border white of");
		s.draw();
	}

}

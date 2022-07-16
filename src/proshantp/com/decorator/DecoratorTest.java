package proshantp.com.decorator;


public class DecoratorTest {
	
	public static void main(String[] args) {
		Shape circle = new Circle();
		circle.draw();
		Shape whiteShape = new WhiteCircle(circle);
		whiteShape.draw();
		
	}
}
	

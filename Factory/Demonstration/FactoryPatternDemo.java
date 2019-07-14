package Factory.Demonstration;

public class FactoryPatternDemo {

	public static void main(String[] args) {
 
		ShapeFactory shapefactory=new ShapeFactory();
		Shape shape1=shapefactory.getShape("Circle");
		shape1.draw();
		Shape shape2=shapefactory.getShape("Rectangle");
		shape2.draw();
		//Shape shape3=shapefactory.getShape("Square");
		//shape3.draw();
	}

}

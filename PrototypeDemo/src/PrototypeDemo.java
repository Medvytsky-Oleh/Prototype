
public class PrototypeDemo {
	
public static void main(String[] args) {
	ShapeCache.loadCashe();
	Shape clonedShape = (Shape)ShapeCache.getShape("1");
	System.out.println(clonedShape.getType());
}
}

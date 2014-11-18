import java.util.Hashtable;
public class ShapeCache {

	private static Hashtable<String, Shape> shapeMap
	=new Hashtable<String, Shape>();
	
	public static Shape getShape(String shapeId){
		Shape cashedShape = shapeMap.get(shapeId);
		return (Shape)cashedShape.clone();
	}
	
	public static void loadCashe(){
		Rectangle rec = new Rectangle();
		rec.setId("1");
		shapeMap.put(rec.getId(),rec);
	}
}

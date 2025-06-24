public class ShapeFactory {
    public Shape getShapeObject(String shape){
        if(shape == "RECTANGLE")
            return new Rectangle();
        return new Circle();
    }
}

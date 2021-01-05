package Shapes;

public class AgeOfVillagers {
	
	public static void createHouse()
    {
		System.out.println("\n-------------------------------");
		System.out.println("House Intialized");
		Shapes Roof = new Triangle();
        Shapes Body = new Rectangle();
        Shapes Windows = new Square();



        Create house = new Create();
        house.add(Roof);
        house.add(Body);
        house.add(Windows);
        
        house.draw("House");
        System.out.println("House Creation Complete");
        System.out.println("\n-------------------------------");
    }	

	public static void createTree()
    {
		System.out.println("Tree Intialized");
		Shapes Trunk = new Cylinder();
        Shapes Crown = new Circle();
        Shapes Leaves = new Triangle();


        Create tree = new Create();
        tree.add(Trunk);
        tree.add(Crown);
        tree.add(Leaves);

        tree.draw("Tree");
        System.out.println("Tree Creation Complete");
        System.out.println("\n-------------------------------");

    }
	
    public static void createWaterSource()
    {
    	System.out.println("Water Source Intialized");
    	Shapes Pipe = new Cylinder();
        Shapes Top = new Circle();
        Shapes Bottom = new Circle();

        Create waterSource = new Create();
        waterSource.add(Pipe);
        waterSource.add(Top);
        waterSource.add(Bottom);

        waterSource.draw("Water Source");
        System.out.println("Water Source Creation Complete");
        System.out.println("\n-------------------------------");

    }
    
    public static void main(String[] args) {

        createHouse();
        createTree();
        createWaterSource();
    }
    
	
	
}

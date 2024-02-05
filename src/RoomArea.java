
public class RoomArea {
	float length;
	float breadth;
	float area;

	void area(float a, float b) {
		length=a;
		breadth=b;
		area = (length*breadth);
	}
	}
	class Roomarea123{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RoomArea room1=new RoomArea();
		room1.area(14,10);
		System.out.println("The class room area is "+ room1.area);

	}

}

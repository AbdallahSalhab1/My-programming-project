package oop;

public class TheMain {

	public static void main(String[] args) {
		
		Room room1 = new Room();
		Room room2 = new Room();
		
		room1.roomNum = 24;
		room1.roomType = "lab";
		room1.roomBuilding = "num 7";
		
		room2.roomNum = 13;
		room2.roomType = "class";
		room2.roomBuilding = "num3";
		
		System.out.println(room1.roomNum);

	}

}

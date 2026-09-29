public class RunHotel {
    public static void main(String[] args) {

        HotelRoom roomA = new HotelRoom();

        roomA.setRoomNumber(200);
        roomA.setRoomType("Single ");
        roomA.setOccupied(1);
        roomA.setRate(100);

        HotelRoom roomB = new HotelRoom();

        roomB.setRoomNumber(201);
        roomB.setRoomType("Double ");
        roomB.setOccupied(0);
        roomB.setRate(80);

        HotelRoom roomC = new HotelRoom(202, "Single", 0, 90);

        System.out.println("Room A");
        System.out.println("Room Number: " + roomA.getRoomNumber());
        System.out.println("Room Type: " + roomA.getRoomType());
        System.out.println("Occupied: " + roomA.getOccupied());
        System.out.println("Rate: " + roomA.getRate());

        System.out.println();

        System.out.println("Room B ");
        System.out.println("Room Number: " + roomB.getRoomNumber());
        System.out.println("Room Type: " + roomB.getRoomType());
        System.out.println("Occupied: " + roomB.getOccupied());
        System.out.println("Rate: " + roomB.getRate());

        System.out.println();

        System.out.println("Room C ");
        System.out.println("Room Number: " + roomC.getRoomNumber());
        System.out.println("Room Type: " + roomC.getRoomType());
        System.out.println("Occupied: " + roomC.getOccupied());
        System.out.println("Rate: " + roomC.getRate());

        System.out.println();

        if (!roomB.isOccupied()) {
            roomB.setOccupied(1);
            System.out.println("Room B has been occupied. ");
        } else {
            System.out.println("Room B is already occupied. ");
        }

        if (!roomB.isOccupied()) {
            roomB.setOccupied(1);
            System.out.println("Room B has been occupied. ");
        } else {
            System.out.println("Room B is already occupied. Double booking is not allowed. ");
        }
    }
}

class ParkingSystem {

    int[] parking;

    public ParkingSystem(int big, int medium, int small) {
        parking = new int[]{0, big, medium, small};
    }

    public boolean addCar(int carType) {
        if (parking[carType] > 0) {
            parking[carType]--;
            return true;
        }

        return false;
    }
}

OUTPUT

Input
["ParkingSystem","addCar","addCar","addCar","addCar"]
[[1,1,0],[1],[2],[3],[1]]
Output
[null,true,true,false,false]

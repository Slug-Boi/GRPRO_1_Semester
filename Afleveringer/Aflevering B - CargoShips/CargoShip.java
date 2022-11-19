import java.util.ArrayList;

public class CargoShip {
    private String model;
    private Container[][] containers;
    private ArrayList<Booking> bookings;

    public CargoShip(String model, int coloumns, int rowsPerColoumn) {
        this.model = model;
        containers = buildCargoShip(coloumns, rowsPerColoumn);
        bookings = new ArrayList<>();
    }

    /* Tilføjer en ny booking til listen bookings. */
    public void addBooking(String bookingId, int kg, boolean flammableGoods, int requestedColoumn, int requestedRowNo) {
        try {
            Container requestedContainer = containers[requestedColoumn][requestedRowNo];
            bookings.add(new Booking(bookingId, kg, flammableGoods, requestedContainer));
            requestedContainer.setBooked();
        } catch(ArrayIndexOutOfBoundsException oobe) {
            System.out.println("Fejl: " + oobe);
        } catch(InvalidKgException ike) {
            System.out.println(ike.getMessage());
        }
    }

    /* Udregner det gennemsnitlige antal kilo per booking. */
    public double avgKg() {
        int sum = 0;
        for (Booking b : bookings) {
            sum += b.getKgs();
        }
        try {
            return sum / bookings.size();
        } catch(ArithmeticException ae) {
            System.out.println("Fejl: " + ae);
        }
        return sum;
    }

    /* Hjælpemetode til constructoren.
    Opretter Container-objekter, som den tilføjer til containers. */
    private Container[][] buildCargoShip(int coloumns, int rowsPerColoumn) {
        Container[][] cargoShip = new Container[coloumns][rowsPerColoumn];
        for (int i = 0; i < cargoShip.length; i++) {
            for (int j = 0; j < cargoShip[i].length; j++) {
                cargoShip[i][j] = new Container(i, j);
            }
        }
        return cargoShip;
    }

    /** SKRIV DIN KODE HERUNDER */
    void checkAddBooking(String bookingId, int kg, boolean flammableGoods, int requestedColoumn, int requestedRowNo) throws ContainerAlreadyBookedException {
        Container c = containers[requestedColoumn][requestedRowNo];
        if(c.getBooked() == false) {
            addBooking(bookingId, kg,flammableGoods, requestedColoumn, requestedRowNo);  
        } else {
            throw new ContainerAlreadyBookedException(requestedColoumn, requestedRowNo);
        }
    }

    void showCargoShip() {
        for(int i = 0 ; i < containers.length ; i++) {
            for(int j = 0 ; j < containers[j].length ; j++) {
                if(j % containers[j].length == 0) {
                    System.out.println();
                    if(containers[i][j].getBooked() == false) {
                        System.out.print("[ ] ");
                    } else {
                        System.out.print("[X] ");
                    }
                } else {
                    if(containers[i][j].getBooked() == false) {
                        System.out.print("[ ] ");
                    } else {
                        System.out.print("[X] ");
                    }
                }
            }
        }
        System.out.println();
    }

    double flammableGoodsFactor() {
        //Booking has get flammable goods get method
        double number = 0;
        for(Booking booking : bookings) {
            if(booking.getFlammableGoodsIncluded() == true) {
                number++;
            }
        }
        
        double re = number / (containers.length * containers[1].length);
        return re;
    }
}

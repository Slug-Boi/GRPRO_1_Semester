
public class ContainerAlreadyBookedException extends Exception{
    int column;
    int row;
    
    ContainerAlreadyBookedException(int requestedColumn, int requestedRow) {
        super("Cotainer is already booked");
        column = requestedColumn;
        row = requestedRow;
    }
    
    String requestedContainer() {
        return "Requested container: column " + column + ",row " + row;
    }
}

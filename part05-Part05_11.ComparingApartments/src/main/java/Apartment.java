
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        return this.squares * this.rooms > compared.squares * compared.rooms;
    }
    
    public int priceDifference(Apartment compared) {
        int diff = this.princePerSquare * this.squares - compared.princePerSquare * compared.squares;
        return Math.abs(diff);
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        return this.princePerSquare * this.squares > compared.princePerSquare * compared.squares;
    }
}

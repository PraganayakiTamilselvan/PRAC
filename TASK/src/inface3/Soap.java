package inface3;

public class Soap implements Clean, Fragnant { //USED MULTIPLE INTERFACE 
    private boolean cleanStatus = false; 
    private String scent = "";
    private int price;
   
    @Override
    public void wash(String item) {
        System.out.println("Washing " + item + " with soap.");
        cleanStatus = true; 
    }

    @Override
    public boolean isClean() {
        return cleanStatus;
    }

    @Override
    public void addFragnance(String scent) {
        this.scent = scent;
        System.out.println("Added fragrance: " + scent);
    }

    @Override
    public void Price(int price) {
        this.price = price;
        System.out.println("Price set to: " + price);
    }
    public static void main(String[] args) {
		Soap s = new Soap();
		s.wash("Plates");
		s.isClean();
		s.addFragnance("jasmine");
		s.Price(50);
	}
}
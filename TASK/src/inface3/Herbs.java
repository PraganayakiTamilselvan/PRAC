package inface3;

public class Herbs extends Soap {
    private String herbType;

    public Herbs(String herbType) {
        this.herbType = herbType;
    }

    public void displayHerbType() {
        System.out.println("Herbal soap with: " + herbType);
    }
    public static void main(String[] args) {
    	Herbs herbalSoap = new Herbs("Neem");
        herbalSoap.wash("hands");
        herbalSoap.addFragnance("Lavender");
        herbalSoap.Price(50);
        herbalSoap.displayHerbType();
        System.out.println("Is clean? " + herbalSoap.isClean());


	}
}
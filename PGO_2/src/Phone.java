public class Phone {
    String Brand;
    Double screenResolution;
    int number;

    public Phone (String Brand, Double screenResolution, int number) {
        this.Brand = Brand;
        this.screenResolution = screenResolution;
        this.number = number;
    }

    public void sendMessage (String X, int y){
        System.out.println("Sending the message "+ X +" to the number "+ y);
    }
}

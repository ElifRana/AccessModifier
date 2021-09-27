public class Main {

    private String name;

    //getter method
    public String getName() {
        return this.name;
    }

    //setter method
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Main d = new Main();

        d.setName("Rana");
        System.out.println(d.getName());

    }
}

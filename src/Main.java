public class Main {
    public static void main(String[] args) {


        AbstractHandler abstractHandler = new DOCHandler();
        Print(abstractHandler);

        abstractHandler = new TXTHandler();
        Print(abstractHandler);

        abstractHandler = new XMLHandler();
        Print(abstractHandler);

    }
    public static void Print(AbstractHandler abstractHandler) {
        abstractHandler.change();
        abstractHandler.create();
        abstractHandler.open();
        abstractHandler.save();
        System.out.println();
    }
}
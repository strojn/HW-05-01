public class TXTHandler extends AbstractHandler {
    public void open() {
        System.out.println("TXTHandler opens a document");
    }
    public void create() {
        System.out.println("TXTHandler create a document");
    }
    public void change() {
        System.out.println("TXTHandler change a document");
    }
    public void save() {
        System.out.println("TXTHandler save a document");
    }
}

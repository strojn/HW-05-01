public class DOCHandler extends AbstractHandler {
    public void open() {
        System.out.println("DOCHandler opens a document");
    }
    public void create() {
        System.out.println("DOCHandler create a document");
    }
    public void change() {
        System.out.println("DOCHandler change a document");
    }
    public void save() {
        System.out.println("DOCHandler save a document");
    }
}

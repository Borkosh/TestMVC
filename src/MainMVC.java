public class MainMVC {
    public static void main(String[] args) {
        View view = new View();
        A a = new A(view);
        a.start();
        view.activate(a);

    }
}

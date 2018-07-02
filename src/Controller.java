public class Controller {

    Model model;

    public Controller(View view) {

        model = new Model(view);

    }

    public void activateNext(A a) {
        model.setALink(a);
    }
}

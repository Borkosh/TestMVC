public class View {

    Controller controller;

    public View() {
        controller = new Controller(this);
        display();
    }

    public void activate(A a){
        controller.activateNext(a);
    }

    public void display(){
        System.out.println("Display View");
    }
}

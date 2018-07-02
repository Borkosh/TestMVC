public class Model {

    View view;
    A a;

    public Model(View viev) {

        this.view = viev;
        doSome();
        //view.display();
    }

    public void doSome() {
        view.display();
    }

    public void displayOnA(){
        a.start();
    }

    public void setALink(A a) {
        this.a = a;
        displayOnA();
    }


}

package garb_collect;

public class Main {

    Bar doBar() {
        Bar b = new Bar(1);
        return b;
    }
    public static void main(String[] args) {
        Main m = new Main();
        Bar newBar = m.doBar();
        System.err.println("newBar");
        System.gc();
        System.err.println("nothing to collect");
        newBar = new Bar(2);
        System.gc();
        System.err.println("finishing");
        newBar = new Bar(3);
        Bar nnBar = newBar;
        newBar = null;
        nnBar = null;
        System.gc();
        return;
    }
}

class Bar{
int num = 0;

    Bar(int n){
        this.num = n;
    }

    @Override
    protected void finalize() throws Throwable {
        System.err.println("im garbage collected" + num);
    }
}

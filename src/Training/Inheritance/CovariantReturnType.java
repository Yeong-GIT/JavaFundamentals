package Training.Inheritance;

public class CovariantReturnType {
    public static void main(String[] args) {
        Superclass superClassObj = new Superclass();
        Superclass subclassObj = new Subclass();

        superClassObj.get();
        subclassObj.get();
    }
}

class Superclass {
    Superclass get() {
        System.out.println("Superclass get()");
        return this;
    }
}

class Subclass extends Superclass {
    @Override
    Subclass get() { // Covariant return type
        System.out.println("Subclass get()");
        return this;
    }
}



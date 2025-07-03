interface Worker {
    void performDuties();
}

class PersonRS {
    protected String name;
    protected int id;

    public PersonRS(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Chef extends PersonRS implements Worker {
    public Chef(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println("Chef " + name + " is cooking.");
    }
}

class Waiter extends PersonRS implements Worker {
    public Waiter(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println("Waiter " + name + " is serving food.");
    }

    public static void main(String[] args) {
        Chef c = new Chef("Raj", 101);
        Waiter w = new Waiter("Amit", 202);
        c.performDuties();
        w.performDuties();
    }
}
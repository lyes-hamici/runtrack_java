package Jour07.Job05p0p1p2;

class ABCDEF {
    public static void main(String[] args) {
        A[] as = new A[10];
        as[0] = new A();
        as[1] = new B();
        as[2] = new D(2);
        as[3] = new E();
        as[4] = new C();
        as[5] = new D();
        as[6] = new B();

        rechercher(as);

        additionner(as);
    }

    private static void rechercher(A[] as) {
        int count = 0;
        for (A a : as) {
            if (a instanceof B) {
                count++;
            }
        }
        System.out.println("Il y a " + count + " instances de la classe B");
    }

    private static void additionner(A[] as) {
        int somme = 0;
        for (A a : as) {
            if (a instanceof D) {
                D dObject = (D) a;
                somme += dObject.d;
            }
        }
        System.out.println("Somme des variables d : " + somme);
    }

    static class A {
        public A() { }
    }

    static class B extends A {
        public B() {
            super();
        }
    }

    static class C extends B {
        public C() {
            super();
        }
    }

    static class D extends A {
        protected int d = 1;

        public D(int x) {
            super();
            d = x;
        }

        public D() {
            super();
        }
    }

    static class E extends D {
        public E() {
            super();
        }
    }

    static class F extends D {
        public F() {
            super();
        }
    }
}
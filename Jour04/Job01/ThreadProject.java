package Jour04.Job01;

public class ThreadProject {
    public static void main(String[] args) {
        // Instancier la classe MyThread
        MyThread myThread = new MyThread();
        
        // Lancer l'exécution du thread
        myThread.start();
    }
}

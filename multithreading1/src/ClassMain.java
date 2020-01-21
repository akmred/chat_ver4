/*
* 1. Создать три потока, каждый из которых выводит определенную букву (A, B и C) 5 раз (порядок – ABСABСABС).
* Используйте wait/notify/notifyAll.
* */
public class ClassMain{

    public static void main(String[] args) {

        OutLetter outLetter = new OutLetter();

        Thread t1 = new Thread(() -> outLetter.printA());
        Thread t2 = new Thread(() -> outLetter.printB());
        Thread t3 = new Thread(() -> outLetter.printC());

        t1.start();
        t2.start();
        t3.start();


    }
}

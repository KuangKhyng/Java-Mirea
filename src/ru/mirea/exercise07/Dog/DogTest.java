package ru.mirea.exercise07.Dog;

public class DogTest {
    public static void main(String[] args) {
        Shibalnu si = new Shibalnu(3, 100);
        System.out.println(si);
        si.shibaMethod();
        si.goEatBigBeef();
        si.cmdVoice();
        Bulldog bd = new Bulldog(7, 52);
        System.out.println(bd.yearsToAge());
        bd.cmdLay();
        bd.bulldog();
    }
}

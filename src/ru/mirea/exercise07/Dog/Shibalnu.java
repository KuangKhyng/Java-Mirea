package ru.mirea.exercise07.Dog;

public class Shibalnu extends Dog {
    protected String breed = "ShibaInu";

    public Shibalnu(int years, int IQ) {
        super(years, IQ);
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return "ShibaInu{" +
                "years=" + years +
                ", IQ=" + IQ +
                ", mood=" + mood +
                ", breed='" + breed + '\'' +
                '}';
    }

    void shibaMethod() {
        System.out.println("Собачье харакири");
    }

    @Override
    int yearsToAge() {
        return years * 5;
    }
}
package com.company;

public class Famaly3 implements Livesable{

    private String address3;
    private int people3;

    public Famaly3(String address3, int people3) {
        this.address3 = address3;
        this.people3 = people3;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public int getPeople3() {
        return people3;
    }

    public void setPeople3(int people3) {
        this.people3 = people3;
    }

    @Override
    public String toString() {
        return "адрес " + address3 + "\n" +
                "кол-во людей " +  people3;
    }

    @Override
    public void lives() {
        System.out.println("Живут в гостинице");
    }

    @Override
    public void pay() {
        System.out.println("Платят за аренду");

    }
}

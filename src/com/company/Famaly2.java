package com.company;

public class Famaly2 implements Livesable{

    private String address2;
    private int people2;

    public Famaly2(String address2, int people2) {
        this.address2 = address2;
        this.people2 = people2;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public int getPeople2() {
        return people2;
    }

    public void setPeople2(int people2) {
        this.people2 = people2;
    }

    @Override
    public String toString() {
        return "адрес " + address2 + "\n" +
                "кол-во людей " +  people2;
    }

    @Override
    public void lives() {
        System.out.println("Живут в общежитии");
    }

    @Override
    public void pay() {
        System.out.println("Платят за аренду");
    }
}

package com.company;

public class Famaly1 implements Livesable{

    private String address1;
    private int people1;

    public Famaly1(String address1, int people1) {
        this.address1 = address1;
        this.people1 = people1;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public int getPeople1() {
        return people1;
    }

    public void setPeople1(int people1) {
        this.people1 = people1;
    }

    @Override
    public String toString() {
        return "адрес " + address1 + "\n" +
                "кол-во людей " +  people1;
    }

    @Override
    public void lives() {
        System.out.println("Живут в квартире");
    }

    @Override
    public void pay() {
        System.out.println("Платят за ком услуги");

    }
}

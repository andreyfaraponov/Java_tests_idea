package com.company;

public class Inheritance {
    public static void main(String[] args) {
        Doctor doc = new Doctor();
        Surgeon sur = new Surgeon();
        FamilyDoctor fDoc = new FamilyDoctor();
        doc.treatPatient();
        sur.makeIncision();
        sur.treatPatient();
        fDoc.giveAdvice();
    }
}

class Doctor
{
    boolean worksAtHospital;

    void    treatPatient()
    {
        System.out.println("Доктор делаем проверку.");
    }
}

class FamilyDoctor extends Doctor
{
    boolean makesHouseCalls;
    void giveAdvice()
    {
        System.out.println("Дает простой совет.");
    }
}

class Surgeon extends Doctor
{
    @Override
    void treatPatient()
    {
        System.out.println("Surgeon Дулает проверку.");
    }

    void makeIncision()
    {
        System.out.println("Делаем надрез.");
    }
}
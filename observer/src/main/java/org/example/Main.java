package org.example;

public class Main {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("First Java Position");
        jobSite.addVacancy("Second Java Position");

        Observer firstSub = new Subscriber("Dima");
        Observer secondSub = new Subscriber("Roma");

        jobSite.addObserver(firstSub);
        jobSite.addObserver(secondSub);

        jobSite.addVacancy("Third JavaPosition");
    }
}
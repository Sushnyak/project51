package ru.netology.services;

public class restService {

    public int vacationCalc(int income, int expenses, int threshold) {
        int cash = 0;
        int monthsOfRest = 0;
        for (int i = 1; i <= 12; i++) {

            if (cash < threshold) {
                System.out.println("Месяц " + i + ". Денег " + cash + ". Придется работать. Заработал +" + income + ", потратил -" + expenses);
                cash = cash + income;
                cash = cash - expenses;

            }
            else {
                System.out.println("Месяц " + i + ". Денег " + cash + ". Буду отдыхать. Потратил -" + expenses + ", затем еще -" + ((cash - expenses)/3*2));
                cash = cash - expenses;
                int vacationExpenses = cash - (cash / 3);
                cash = cash - vacationExpenses;
                monthsOfRest++;

            }

        }
        return (monthsOfRest);
    }

}

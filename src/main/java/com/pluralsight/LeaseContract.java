package com.pluralsight;

public class LeaseContract extends Contract {

    private double originalPrice;
    private double expectedEndingValue;
    private double leaseFee;

    public LeaseContract(String date, String name, String email, Vehicle vehicleSold, double originalPrice, double expectedEndingValue, double leaseFee) {
        super(date, name, email, vehicleSold);
        this.originalPrice = originalPrice;
        this.expectedEndingValue = originalPrice / 2;
        this.leaseFee = originalPrice * 0.07;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    @Override
    public double getTotalPrice() {
        return (getVehicleSold().getPrice() - expectedEndingValue) + leaseFee;
    }

    @Override
    public double getMonthlyPayment() {
        int numberOfPayments = 36;
        double interestRate = 4.0 / 1200;
        double monthlyPayment = getTotalPrice() * (interestRate * Math.pow(1 + interestRate, numberOfPayments)) / (Math.pow(1 + interestRate, numberOfPayments) - 1);
        monthlyPayment = Math.round(monthlyPayment * 100);
        monthlyPayment /= 100;
        return monthlyPayment;
    }
}
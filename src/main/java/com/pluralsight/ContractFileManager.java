package com.pluralsight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class ContractFileManager {

    public void saveContract(Contract contract) {

        String contractType = contract instanceof SalesContract ? "Sales" : "Lease";
        String date = contract.getDate();
        String customerName = contract.getName();
        String customerEmail = contract.getEmail();
        Vehicle vehicleSold = contract.getVehicleSold();
        int vin = vehicleSold.getVin();
        int year = vehicleSold.getYear();
        String make = vehicleSold.getMake();
        String model = vehicleSold.getModel();
        String vehicleType = vehicleSold.getVehicleType();
        String color = vehicleSold.getColor();
        int odometer = vehicleSold.getOdometer();
        double price = vehicleSold.getPrice();
        double monthlyPayment = contract.getMonthlyPayment();
        double totalPrice = contract.getTotalPrice();
        double salesTaxAmount = 0;
        double recordingFee = 0;
        double processingFee = 0;
        boolean finance = false;
        double expectedEndingValue = 0;
        double leaseFee = 0;
        double totalCost = 0;

        if (contractType.equalsIgnoreCase("Sales")) {
            SalesContract sales = (SalesContract) contract;
            salesTaxAmount = sales.getSalesTaxAmount();
            recordingFee = sales.getRecordingFee;


        }

    }

}

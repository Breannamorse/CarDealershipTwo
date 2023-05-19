package com.learntocode;

public class SalesContract extends Contract {
    private double salesTaxAmount;
    private double RecordingFee;
    private double processingFee;
    private boolean financeOption;
    private boolean monthlyFinancedPayment;
    private double recordingFee;

    public SalesContract(String customerName, String customerEmail, Vehicle vehicleSold, double salesTaxAmount, double recordingFee, double processingFee, boolean financeOption) {
        super(customerName, customerEmail, vehicleSold);
        this.salesTaxAmount = salesTaxAmount;
        RecordingFee = recordingFee;
        this.processingFee = processingFee;
        this.financeOption = financeOption;
    }


    public double getSalesTaxAmount() {
        return salesTaxAmount;
    }

    public void setSalesTaxAmount(double salesTaxAmount) {
        this.salesTaxAmount = salesTaxAmount;
    }

    public double getRecordingFee() {
        return RecordingFee;
    }

    public void setRecordingFee(double recordingFee) {
        RecordingFee = recordingFee;
    }

    public double getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(double processingFee) {
        this.processingFee = processingFee;
    }


    public double getTotalPrice() {

        return getVehicleSold().getPrice() + salesTaxAmount + recordingFee + processingFee;
    }


    public double getMonthlyPayment() {
        int numberOfPayments = 0;
        double interestRate = 0;
        if (financeOption) {
            if (getVehicleSold().getPrice() >= 10000) {
                numberOfPayments = 48;
                interestRate = 4.25 / 1200;
            } else {
                numberOfPayments = 24;
                interestRate = 5.25 / 1200;
            }

            double monthlyPayment = getTotalPrice() * (interestRate * Math.pow(1 + interestRate, numberOfPayments)) / (Math.pow(1 + interestRate, numberOfPayments) - 1);
            monthlyPayment = Math.round(monthlyPayment * 100);
            monthlyPayment /= 100;
            return monthlyPayment;
        } else {
            return 0.0;
        }
    }
}


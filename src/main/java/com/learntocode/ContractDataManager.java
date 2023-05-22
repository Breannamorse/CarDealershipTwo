package com.learntocode;

import java.io.FileWriter;
import java.io.*;

public class ContractDataManager {

    public void saveContract (Contract contract) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Contract.csv",true))) {
            if (contract instanceof SalesContract){
                bw.write("SALES" + "|" + contract.getDate() + "|" + contract.getCustomerName() + "|" + contract.getCustomerEmail() + "|" +
                        contract.getVehicleSold().getVin() + "|" + contract.getVehicleSold().getYear() + "|" + contract.getVehicleSold().getMake()
                        + "|" + contract.getVehicleSold().getModel() + "|" + contract.getVehicleSold().getVehicleType() + "|" + contract.getVehicleSold()
                        .getColor() + "|" + contract.getVehicleSold().getOdometer() + "|" + contract.getVehicleSold().getPrice() + "|" + ((SalesContract) contract).getSalesTaxAmount() +
                        "|" + ((SalesContract) contract).getRecordingFee() + "|" + ((SalesContract) contract).getProcessingFee() + "|" + contract.getTotalPrice() + "|" + ((SalesContract) contract).isFinancing()
                        + "|" + contract.getMonthlyPayment());
            } else if (contract instanceof LeasingContract) {
                bw.write("LEASE" + "|" + contract.getDate() + "|" + contract.getCustomerName() + "|" + contract.getCustomerEmail() + "|" +
                        contract.getVehicleSold().getVin() + "|" + contract.getVehicleSold().getYear() + "|" + contract.getVehicleSold().getMake()
                        + "|" + contract.getVehicleSold().getModel() + "|" + contract.getVehicleSold().getVehicleType() + "|" + contract.getVehicleSold()
                        .getColor() + "|" + contract.getVehicleSold().getOdometer() + "|" + contract.getVehicleSold().getPrice() + "|" + ((LeasingContract) contract).getExpectedEndingValue() + "|"
                        + ((LeasingContract) contract).getLeaseFee() + "|" + contract.getTotalPrice() + "|" + contract.getMonthlyPayment());
            }
            bw.newLine();


        } catch (IOException e) {
            e.printStackTrace();


        }
    }}

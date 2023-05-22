package com.learntocode;

import java.io.FileWriter;

public class ContractDataManager {
    String filePath;

    public ContractDataManager(String filePath);
        this.filePath = filePath;

    public void saveContract(Contract contract) {
        try (FileWriter = new FileWriter("Contract.csv")){
    if (contract instanceof SalesContract) {
        SalesContract salesContract = (SalesContract) contract;
        writer.write("Sales Contract:\n");
        writer.write("Buyer: " + salesContract.getBuyer() + "\n");
        writer.write("Seller: " + salesContract.getSeller() + "\n");
        writer.write("Amount: " + salesContract.getAmount() + "\n");
    }

        }
    }
}



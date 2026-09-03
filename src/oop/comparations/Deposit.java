package oop.comparations;

import java.util.Comparator;

public class Deposit implements Comparator<Deposit> {
    boolean isActive;
    double toTransfer;
    double budget;

    public Deposit(boolean isActive,double toTransfer, double budget) {
        this.isActive = isActive;
        this.toTransfer = toTransfer;
        this.budget = budget;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public double getToTransfer() {
        return toTransfer;
    }

    public void setToTransfer(double toTransfer) {
        this.toTransfer = toTransfer;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Deposit{");
        sb.append("isActive=").append(isActive);
        sb.append(", toTransfer=").append(toTransfer);
        sb.append(", budget=").append(budget);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compare(Deposit o1, Deposit o2) {
        if (o2.isActive() != o1.isActive()){
            return 1;
        }
        else if (o2.isActive() == o1.isActive()){
            return -1;
        }
        return 0;
    }
}

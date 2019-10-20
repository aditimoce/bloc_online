package bloconline.user;

import javax.persistence.*;

@Entity
public class Apt {

    public Apt(double coldWater, double hotWater, double elevator, double cleaning, double trash, double lighting, double totalCost) {
        this.coldWater = coldWater;
        this.hotWater = hotWater;
        this.elevator = elevator;
        this.cleaning = cleaning;
        this.trash = trash;
        this.lighting = lighting;
        this.totalCost = totalCost;
    }

    @Id
    @GeneratedValue
    private int number;

    private double coldWater;

    private double hotWater;

    private double elevator;

    private double cleaning;

    private double trash;

    private double lighting;

    private double totalCost;

    @ManyToOne
    @JoinColumn
    private User user;

    public User getUser() {
        return user;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getColdWater() {
        return coldWater;
    }

    public void setColdWater(Integer coldWater) {
        this.coldWater = coldWater;
    }

    public double getHotWater() {
        return hotWater;
    }

    public void setHotWater(Integer hotWater) {
        this.hotWater = hotWater;
    }

    public double getElevator() {
        return elevator;
    }

    public void setElevator(Integer elevator) {
        this.elevator = elevator;
    }

    public double getCleaning() {
        return cleaning;
    }

    public void setCleaning(Integer cleaning) {
        this.cleaning = cleaning;
    }

    public double getTrash() {
        return trash;
    }

    public void setTrash(Integer trash) {
        this.trash = trash;
    }

    public double getLighting() {
        return lighting;
    }

    public void setLighting(Integer lighting) {
        this.lighting = lighting;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Integer totalCost) {
        this.totalCost = totalCost;
    }
}

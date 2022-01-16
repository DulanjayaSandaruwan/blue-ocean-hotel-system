package controller;

/**
 * @author : D.D.Sandaruwan <dulanjayasandaruwan1998@gmail.com>
 * @Since : 06/07/2021
 **/
public class MealPackage {
    private String newMealPackage;
    private String modifyMealPackage;

    public MealPackage() {
    }

    public MealPackage(String newMealPackage, String modifyMealPackage) {
        this.newMealPackage = newMealPackage;
        this.modifyMealPackage = modifyMealPackage;
    }

    public String getNewMealPackage() {
        return newMealPackage;
    }

    public void setNewMealPackage(String newMealPackage) {
        this.newMealPackage = newMealPackage;
    }

    public String getModifyMealPackage() {
        return modifyMealPackage;
    }

    public void setModifyMealPackage(String modifyMealPackage) {
        this.modifyMealPackage = modifyMealPackage;
    }

    @Override
    public String toString() {
        return "MealPackage{" +
                "newMealPackage='" + newMealPackage + '\'' +
                ", modifyMealPackage='" + modifyMealPackage + '\'' +
                '}';
    }
}

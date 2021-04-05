package tuto.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Client {

    // StringProperty => prévenu quand variables modifiées
    private final StringProperty firstName;
    private final StringProperty lastName;
    private final StringProperty land;
    private final StringProperty city;
    private final StringProperty street;
    private final StringProperty number;
    private final IntegerProperty cp;

    //region constructeur
    public Client(String firstName, String lastName) {
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
        this.land = new SimpleStringProperty("belgium");
        this.city = new SimpleStringProperty("mignault");
        this.street = new SimpleStringProperty("rue francois onckelet");
        this.number = new SimpleStringProperty("17");
        this.cp = new SimpleIntegerProperty(7070);
    }
    //endregion
    //region getter String
    public String getFirstName(){
        return firstName.get();
    }
    public String getLastName(){
        return lastName.get();
    }
    public String getLand(){
        return land.get();
    }
    public String getCity(){
        return city.get();
    }
    public String getStreet(){
        return street.get();
    }
    public String getNumber(){
        return number.get();
    }
    public int getCp(){
        return cp.get();
    }
    //endregion

    //region getter StringProperty
    public StringProperty firstNameProperty() {
        return firstName;
    }
    public StringProperty lastNameProperty() {
        return lastName;
    }
    public StringProperty landProperty() {
        return land;
    }
    public StringProperty cityProperty() {
        return city;
    }
    public StringProperty streetProperty() {
        return street;
    }
    public StringProperty numberProperty() {
        return number;
    }
    public IntegerProperty cpProperty() {
        return cp;
    }
    //endregion
    //region setter
    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }
    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }
    public void setLand(String land) {
        this.land.set(land);
    }
    public void setCity(String city) {
        this.city.set(city);
    }
    public void setStreet(String street) {
        this.street.set(street);
    }
    public void setNumber(String number) {
        this.number.set(number);
    }
    public void setCp(int cp) {
        this.cp.set(cp);
    }
    //endregion
}

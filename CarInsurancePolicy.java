public class CarInsurancePolicy {
    int policyNumber;
    int numPayments;
String residentCity;
public CarInsurancePolicy(int policyNumber, int numPayments, String residentCity) {
    this.policyNumber = policyNumber;
    this.numPayments = numPayments;
    this.residentCity = residentCity;
}
public CarInsurancePolicy(int pn, int np){
    policyNumber = pn;
    numPayments = np;
    residentCity="Manama";
}
public CarInsurancePolicy(int pn){
    policyNumber = pn;
    numPayments=2;
    residentCity="Manama";
}
public void Display(){
    System.out.println("Policy Number: " + policyNumber);
    System.out.println("Number of Payments: " + numPayments);
    System.out.println("Resident City: " + residentCity);
}
}
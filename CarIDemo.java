public class CarIDemo {
    public static void main(String[] args) {
        CarInsurancePolicy car1=new CarInsurancePolicy(123);
        CarInsurancePolicy car2=new CarInsurancePolicy(456,4 );
        CarInsurancePolicy car3=new CarInsurancePolicy(789,12,"Muharraq");
        car1.Display();
        car2.Display();
        car3.Display();
    }
}

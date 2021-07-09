public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("SBI");
        bank.addBranch("Naktala");
        bank.addCustomer("Naktala","Sayak",55.09);
        bank.addCustomer("Naktala","Nilesh",345.05);

        bank.addBranch("Ruby");
        bank.addCustomer("Ruby","Ashish",45.44);

        bank.addCustomerTransaction("Naktala","Sayak",44.0);
        bank.addCustomerTransaction("Ruby","Ashish",14.0);

    }
}

public class Main {
    public static void main(String[] args) {
        ITelephone glysPhone;
        glysPhone = new DeskPhone(123456);
        glysPhone.powerOn();
        glysPhone.callPhone(123456);
        glysPhone.answer();

        glysPhone = new MobilePhone(884534);
        glysPhone.callPhone(884534);
        glysPhone.answer();
    }
}

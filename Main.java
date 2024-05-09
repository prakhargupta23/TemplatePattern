public class Main {
    public static void main(String[] args) {
        PhoneOrderTemp offlineStore = new OfflineStore();
        offlineStore.createOrder();

        PhoneOrderTemp onlineStore = new OnlineStore();
        // onlineStore.createOrder();
    }
}
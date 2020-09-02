public class Test {
    public static void main (String[] args) {
        User user1 = new User("Sahand", "Seifi");
        String userId = user1.generateUserId();
        if(userId.substring(0, 13).equals("Sahand_Seifi_")) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        User user2 = new User("Mehrzad", "Babaei");
        String userId2 = user2.generateUserId();
        if(userId2.substring(0, 13).equals("Mehrzad_Babaei_")) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }

}

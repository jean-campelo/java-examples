public class User {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv is on? " + smartTv.activated);
        System.out.println("The current channel: " + smartTv.channel);
        System.out.println("The sound is: " + smartTv.soundVolum);

    }
}
public class User {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv is on? " + smartTv.activated);
        System.out.println("The current channel: " + smartTv.channel);
        System.out.println("The sound is: " + smartTv.soundVolum + "\n");

        System.out.println("====== User actions ======");

        smartTv.changeStatusEnergy();
        System.out.println("Tv is on? " + smartTv.activated);

        smartTv.upSound();
        smartTv.upSound();
        smartTv.upSound();
        smartTv.downSound();
        System.out.println("The sound is: " + smartTv.soundVolum);

        smartTv.upChannel();
        System.out.println("The current channel: " + smartTv.channel);
        smartTv.downChannel();
        System.out.println("The current channel: " + smartTv.channel);

        smartTv.changeChannel(50);
        System.out.println("The current channel: " + smartTv.channel);

    }
}
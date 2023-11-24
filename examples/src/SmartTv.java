public class SmartTv {
    boolean activated = false;
    int channel = 1;
    int soundVolum = 10;

    public void changeStatusEnergy() {
        activated = !activated;
    }

    public void upSound() {
        soundVolum++;
    }

    public void downSound() {
        soundVolum--;
    }

    public void upChannel() {
        channel++;
    }

    public void downChannel() {
        channel--;
    }

    public void changeChannel(int num) {
        channel = num;
    }
}

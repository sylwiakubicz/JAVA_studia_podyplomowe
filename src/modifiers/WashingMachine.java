package modifiers;

public class WashingMachine {
    private int temperature;
    private int spining;

    void modeForSensitiveClothes() {
        temperature = 30;
        spining = 800;
    }

    void modeForTowelsAndBedLinen() {
        temperature = 90;
        spining = 1200;
    }
}

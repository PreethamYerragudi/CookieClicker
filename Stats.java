package code;


public class Stats{

    private int grandmas = 0;
    public int getGrandmas() {
        return grandmas;
    }

    public void setGrandmas(int grandmas) {
        this.grandmas = grandmas;
    }

    public int getGreatGrandmas() {
        return greatGrandmas;
    }

    public void setGreatGrandmas(int greatGrandmas) {
        this.greatGrandmas = greatGrandmas;
    }

    public int getMoms() {
        return moms;
    }

    public void setMoms(int moms) {
        this.moms = moms;
    }

    public int getRollingPins() {
        return rollingPins;
    }

    public void setRollingPins(int rollingPins) {
        this.rollingPins = rollingPins;
    }

    public int getUltimateRollingPins() {
        return ultimateRollingPins;
    }

    public void setUltimateRollingPins(int ultimateRollingPins) {
        this.ultimateRollingPins = ultimateRollingPins;
    }

    public int getAutoRoller() {
        return autoRoller;
    }

    public void setAutoRoller(int autoRoller) {
        this.autoRoller = autoRoller;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    private int greatGrandmas =0;
    private int moms =0;
    private int rollingPins =0;
    private int ultimateRollingPins = 0;
    private int autoRoller =0;
    private int score =100000;

    public void increaseScore(){
        score+= grandmas+ultimateRollingPins*grandmas;
        score+= greatGrandmas*200+ultimateRollingPins*grandmas;

    }
    public void increaseGrandma(){
        grandmas += moms;
    }
    
}
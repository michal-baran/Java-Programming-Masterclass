public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        boolean catPlaying = false;
        if ((summer == false) && (temperature >= 25 && temperature <= 35)) {
            catPlaying = true;
        } else {
            if ((summer == true) && (temperature >= 25 && temperature <= 45)) {
                catPlaying = true;
            }
        }
        return catPlaying;
    }
}
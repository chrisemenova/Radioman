public class Radio {

    private int currentRadioStation;
    private int currentSoundVolume;

    public int getCurrentRadioStation() {          
        return currentRadioStation;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {                
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setCurrentSoundVolume(int newCurrentSoundVolume) {
        if (newCurrentSoundVolume < 0) {
            return;
        }
        if (newCurrentSoundVolume > 10) {
            return;
        }
        currentSoundVolume = newCurrentSoundVolume;
    }

    protected void next() {
        if (currentRadioStation == 9) {
            currentRadioStation = 0;
        } else {
            currentRadioStation++;
        }
    }

    protected void prev() {
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        } else {
            currentRadioStation--;
        }
    }

    protected void increaseVolume() {
        if (currentSoundVolume <= 9) {
            currentSoundVolume++;
        }
    }

    protected void decreaseVolume() {
        if (currentSoundVolume > 0) {
            currentSoundVolume--;
        } else {
            currentSoundVolume= 0;
        }


    }
}

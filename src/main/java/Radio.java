public class Radio {

    private int currentRadioStation;
    private int currentSoundVolume;
    private int amountStation;

    public Radio() {
        amountStation = 10;
    }

    public Radio(int amountStation) {
        this.amountStation = amountStation;
    }

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
        if (newCurrentRadioStation > amountStation - 1) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setCurrentSoundVolume(int newCurrentSoundVolume) {
        if (newCurrentSoundVolume < 0) {
            return;
        }
        if (newCurrentSoundVolume > 100) {
            return;
        }
        currentSoundVolume = newCurrentSoundVolume;
    }

    protected void next() {
        if (currentRadioStation == amountStation - 1) {
            currentRadioStation = 0;
        } else {
            currentRadioStation++;
        }
    }

    protected void prev() {
        if (currentRadioStation == 0) {
            currentRadioStation = amountStation - 1;
        } else {
            currentRadioStation--;
        }
    }

    protected void increaseVolume() {
        currentSoundVolume++;
    }

    protected void decreaseVolume() {
        if (currentSoundVolume > 0) {
            currentSoundVolume--;
        } else {
            currentSoundVolume = 0;
        }


    }
}

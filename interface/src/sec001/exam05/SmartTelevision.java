package sec001.exam05;

public class SmartTelevision implements RemoteControl, Searchable{
    private int volume;

    public void turnOn() {
        System.out.println("TV를 켭니다");
    }

    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    public void setVolume(int volume) {
        if (volume > sec001.exam04.RemoteControl.MAX_VOLUME) {
            this.volume = sec001.exam04.RemoteControl.MAX_VOLUME;
        } else if (volume < sec001.exam04.RemoteControl.MAX_VOLUME) {
            this.volume = sec001.exam04.RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨 : " + this.volume);
    }

    @Override
    public void search(String url) {
        System.out.println(url + "을 검색합니다.");
    }
}

package sec01.exam01;

public class DmbCellPhoneExample {
    public static void main(String[] args) {
        // DmbCellPhone 객체 생성
        DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);

        //CellPhone으로부터 상속받은 필드
        System.out.println("모델 : " + dmbCellPhone.model);
        System.out.println("색상 : " + dmbCellPhone.color);


        System.out.println("채널 : " + dmbCellPhone.channel);

        dmbCellPhone.powerOn();
        dmbCellPhone.powerOff();
        dmbCellPhone.sendVoice("여보세요.");
        dmbCellPhone.receiveVoice("저는 남민우입니다.");
        dmbCellPhone.sendVoice("아~ 예 반갑습니다.");
        dmbCellPhone.hangUp();

        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannelDmb(12);
        dmbCellPhone.turnOffDmb();

    }
}

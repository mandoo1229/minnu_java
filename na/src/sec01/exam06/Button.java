package sec01.exam06;

public class Button {
    OnClickListener listener;
    //메소드
    void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }
    void touch() {
        listener.onClick();
    }

    static interface OnClickListener {
        void onClick();
    }

}

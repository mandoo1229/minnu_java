package sec02.exam01.exam99;

public class Anonymous {
    Worker field = new Worker(){
        @Override
        public void start() {
            System.out.println("디자인을 합니다.");
        }
    };


    void method1() {
        Worker localVer = new Worker(){
            @Override
            public void start() {
                System.out.println("개발을 합니다.");
            }
        };

        localVer.start();
    }

    void method2(Worker worker) {
        worker.start();
    }



}

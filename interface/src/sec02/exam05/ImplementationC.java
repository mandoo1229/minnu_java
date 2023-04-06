package sec02.exam05;

public class ImplementationC implements InterfaceC{
    @Override
    public void methodA() {
        System.out.println("implementationA - methodC() 실행");
    }

    @Override
    public void methodB() {
        System.out.println("implementationB - methodC() 실행");
    }

    @Override
    public void methodC() {
        System.out.println("implementationC - methodC() 실행");
    }
}

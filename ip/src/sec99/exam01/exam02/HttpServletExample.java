package sec99.exam01.exam02;

public class HttpServletExample {
    public static void main(String[] args) {
        method(new LoginServlet());
        method(new FileDownloadServlet());
    }

    public static void method(HttpServlet servlet) {
        servlet.service();
    }
}

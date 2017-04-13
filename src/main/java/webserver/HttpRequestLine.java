package webserver;

public class HttpRequestLine {
    
    public static String getHttpMethod(String requestLine) {
        return requestLine.split(" ")[0];
    }
    
    public static String getPath(String requestLine) {
        return requestLine.split(" ")[1];
    }
}

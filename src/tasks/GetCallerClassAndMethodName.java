package tasks;

public class GetCallerClassAndMethodName {
    public static String getCallerClassAndMethodName() {
        StackTraceElement[] stackTraceElements = new Throwable().getStackTrace();
        if (stackTraceElements.length > 2) {
            StackTraceElement stackTraceElement = stackTraceElements[2];
            return stackTraceElement.getClassName() + "#" + stackTraceElement.getMethodName();
        }
        return null;
    }
}

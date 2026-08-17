public class LogLevels {
    
    public static String message(String logLine) {
        return logLine.split(":")[1].trim();
    }

    public static String logLevel(String logLine) {
        String[] logLineSplit = logLine.split("]");
        String logLevel = logLineSplit[0].substring(1);
        String logLevelLowerCase = logLevel.toLowerCase();
        return logLevelLowerCase;
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}

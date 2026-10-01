public class LogLevels {

    public static String message(String logLine) {
        //":" hariç sonrasını alır. "trim" ile baştaki ve sondaki boşlukları kaldırır."
        return logLine.substring(logLine.indexOf(":") + 1).trim();
    }

    public static String logLevel(String logLine) {
        //"[" hariç sonrasını al ta ki "]" buraya kadar, sonra küçük harfe çevir.
        return logLine.substring(logLine.indexOf("[")+1, logLine.indexOf("]")). toLowerCase();
    }

    public static String reformat(String logLine) {
        //önce message fonksiyonunu kullanır, araya boşluk ve parantez açar, sonra logLevel foksiyonunu kullanır ve ardından parantezi kapatır)
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }

    public static void main(String[] args) {
        System.out.println(LogLevels.message("[ERROR]: Invalid operation"));
        System.out.println(LogLevels.message("[WARNING]:  Disk almost full\r\n"));
        System.out.println(LogLevels.logLevel("[ERROR]: Invalid operation"));
        System.out.println(LogLevels.reformat("[INFO]: Operation completed"));
    }
}

/*
-Task1 (Get message from a log line)
Implement the (static) LogLevels.message() method to return a log line's message:

LogLevels.message("[ERROR]: Invalid operation")
// => "Invalid operation"

-Task2 (Get log level from a log line)
Implement the (static) LogLevels.logLevel() method to return a log line's log level, which should be returned in lowercase:

LogLevels.logLevel("[ERROR]: Invalid operation")
// => "error"

-Task3 (Reformat a log line)
Implement the (static) LogLevels.reformat() method that reformats the log line, putting the message first and the log level after it in parentheses:

LogLevels.reformat("[INFO]: Operation completed")
// => "Operation completed (info)"


Notes: 

"logLine.substring( 
    logLine.indexOf("[") + 1, 
    logLine.indexOf("]") "


substring(1, 6)
= “1'den başla, 6'ya kadar kes.”
En önemli detay: başlangıç dahil, bitiş hariç.

 */

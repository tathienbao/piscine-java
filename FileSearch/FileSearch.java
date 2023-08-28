import java.io.File;
import java.io.IOException;

public class FileSearch {
    public static String searchFile(String fileName) {
        return searchInDirectory(new File("documents"), fileName);
    }

    private static String searchInDirectory(File directory, String fileName) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile() && file.getName().equals(fileName)) {
                    return file.getPath();
                } else if (file.isDirectory()) {
                    String result = searchInDirectory(file, fileName);
                    if (result != null) {
                        return result;
                    }
                }
            }
        }
        return null;
    }
}



// import java.io.File;

// public class FileSearch {
//     public static String searchFile(String fileName) {
//         return searchInDirectory(new File("documents"), fileName);
//     }

//     private static String searchInDirectory(File directory, String fileName) {
//         File[] files = directory.listFiles();
//         if (files != null) {
//             for (File file : files) {
//                 if (file.isFile() && file.getName().equals(fileName)) {
//                     return file.getPath();
//                 } else if (file.isDirectory()) {
//                     String result = searchInDirectory(file, fileName);
//                     if (result != null) {
//                         return result;
//                     }
//                 }
//             }
//         }
//         return null;
//     }
// }
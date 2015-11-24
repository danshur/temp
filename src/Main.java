import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    String pathToRefFile;
    String pathToCompareFile;
    HashSet reports;
    ArrayList<String> diff;
    ArrayList<String> extraReports;
    ArrayList<String> missingReports;

    Main(String ref , String compare){
        pathToRefFile = ref;
        pathToCompareFile = compare;
        reports = new HashSet();
        diff = new ArrayList<String>();
        extraReports = new ArrayList<String>();
        missingReports = new ArrayList<String>();
    }

    private Scanner inputFile(String pathToFile){
        File file = new File(pathToFile);
        Scanner inputScanner = null;
        try {
            inputScanner = new Scanner(file);
        }catch (FileNotFoundException e){
            System.out.println(file + " not found");
        }
        return inputScanner;
    }

    private HashSet<String> buildHashset(String path){
       Scanner input = inputFile( path );
        HashSet<String> reportSet = new HashSet<String>();
        while(input.hasNext()) {
            String nextLine = input.nextLine();
            reportSet.add(nextLine);
        }

        input.close();
        return reportSet;

    }

    private void process(String pathToFirstFile, String pathToSecondFile){
        HashSet<String> firstFile = buildHashset(pathToFirstFile);
        HashSet<String> secondFile = buildHashset(pathToSecondFile);

        if (firstFile.size() != secondFile.size()){
            if( firstFile.size() > secondFile.size()){
                extraReports.addAll( getDiff( firstFile ,secondFile));
                missingReports.addAll( getDiff(secondFile , firstFile));
            }else{
                extraReports.addAll( getDiff( secondFile , firstFile));
                missingReports.addAll( getDiff( firstFile , secondFile));
            }
        }  else {
            missingReports.addAll( getDiff( secondFile , firstFile));
            missingReports.addAll( getDiff( firstFile , secondFile));
        }

    }

    private ArrayList<String> getDiff( HashSet<String> ref , HashSet<String> comp){
        ArrayList<String> diff = new ArrayList<String>();
        for( String report : ref){
            if( !comp.contains( report)){
                diff.add(report);
            }
        }
        return diff;
    }

    public static void main(String[] args) {
        //Main n = new Main("C:\\temp\\CompareReports\\src\\Java8_9280_reportList.txt" , "C:\\temp\\CompareReports\\src\\Java7_9180_reportList.txt");
        Main n = new Main(args[0] , args[1]);
        n.process( n.pathToRefFile , n.pathToCompareFile );
        System.out.println("****** Printing Extra Reports ******");
        for(String s : n.extraReports){

            System.out.println(s);
        }
        System.out.println("****** Printing Missing Reports ******");
        for(String s : n.missingReports){

            System.out.println(s);
        }
    }
}

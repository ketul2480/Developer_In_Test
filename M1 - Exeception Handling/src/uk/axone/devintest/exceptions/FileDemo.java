package uk.axone.devintest.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileDemo {

    private FileInputStream fis ;

    //Handling the exceptions in the code/method
    public void readFileHandleExceptions(){

        try {
            fis = new FileInputStream("read.txt");
            fis.read();
            fis.close();
        }

        catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }

        catch (IOException e) {
            e.printStackTrace();
        }

    }
    //propagating the exception
    public void readFilePropagateException() throws IOException {

        fis = new FileInputStream("readme.txt");
        fis.read();
        fis.close();
    }
}

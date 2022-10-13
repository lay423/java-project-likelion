package java1006.fileRead;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

    //한글자 읽는 메소드
    char readOneByte(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename), 16 * 2024);

        return (char)br.read();
    }

    //두글자 읽는 메소드
    String readTwoByte(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename), 16 * 2024);
        return (char) br.read() + "" + (char) br.read();
    }

    //n글자 읽는 메소드
    String readNByte(String filename, int n) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename), 16 * 2024);
        String result="";
        for (int i = 0; i < n; i++) {
            result += (char) br.read();
        }
        return result;
    }

    //라인 하나 읽어오는 메소드
    String readLine(String filename) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String result = br.readLine();
        return result;
    }

    //모든 라인 읽는 메소드
    String readAllLine(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String result = "";
        String temp;
        while ((temp = br.readLine()) != null) {
            result += temp;
            result += "\n";
        }
        return result;
    }
}

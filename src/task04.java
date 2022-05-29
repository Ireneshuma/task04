package task4.com;
import java.io.*;
public class task04 {
    String Shuma56633;
    void ReadDataShuma56633() throws IOException {
        BufferedReader tv = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Please Input Your Full Name");
        Shuma56633=tv.readLine();
    }
    void WriteDataToShuma56633File(){
        try(FileWriter ts = new FileWriter("task4.txt")) {
            ts.write(Shuma56633);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void readDataViaShuma56633File(){
        String result;
        try(BufferedReader br = new BufferedReader(new FileReader("task4.txt"))) {
            while((result=br.readLine()) !=null){
                System.out.println(result);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}





public class Task4 {
    public static void main(String []args) throws IOException {
        DataManagement obj = new DataManagement();
        obj.readDataViaShuma56633();
        obj.WriteDataToShuma56633File();
        System.out.println();
        obj.ReadDataShuma56633();
    }



}
}

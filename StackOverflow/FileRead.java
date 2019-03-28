import java.io.ObjectInputStream;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.FileSystems;

class FileRead {
    public static void main(String[] args) {
        try {
            String filePath = FileSystems.getDefault().getPath(".").toAbsolutePath()+"/Practice/Stack";
            File file = new File(filePath,"test.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st; 
            while ((st = br.readLine()) != null) {
                System.out.println(st); 
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }finally{

        }
    }
}


    

    

    

    
    
        
        
    

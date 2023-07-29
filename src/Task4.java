import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//Пользователю должно показаться сообщение, что пустые строки вводить нельзя
public class Task4 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            boolean isContinue = true;
            while (isContinue){
                try{
                    System.out.println("Type the line: ");
                    String text = getText(br);
                    System.out.println(text);
                    isContinue = false;
                } catch (RuntimeException e){
                    System.out.println(e.getMessage());
                }
            }
        } catch (IOException e){
            System.out.println("Error with the console");
        }
    }

    public static String getText(BufferedReader br) throws IOException{
        String text = br.readLine();
        if(text.isEmpty()){
            throw new RuntimeException("Empty line!");
        }
        return text;
    }
}

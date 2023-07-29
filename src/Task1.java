import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
//Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
public class Task1 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            float res = getFloat(br);
            br.close();
            System.out.println(res);
        } catch(IOException e){
            System.out.println("Type a float number: ");
            return;
        }

    }

    public static float getFloat(BufferedReader br){
        System.out.println("Type a float number: ");
        float res;
        try{
            res = Float.parseFloat(br.readLine());
        } catch (NumberFormatException e){
            System.out.println("Error. Not a float");
            return getFloat(br);
        } catch (Exception e){
            System.out.println("Error. Not a float");
            return getFloat(br);
        }
        return res;
    }
}
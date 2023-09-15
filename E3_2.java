public class E3_2 {
    public static void main(String[] args) {
        //Este fragmento de código se encarga de devolver la raiz cuadrada de los 9 primeros números enteros positivos
        int count = 1;
        do{
            System.out.println(count + " " + Math.sqrt(count));
            count++;
        }while(count < 10);
    }
}

public class E3_1 {

    public static void main(String[] args) {
        // EL SIGUIENTE CODIGO EJECUTA LO SOGUIENTE: 
        // Mientras que el contador i sea menor que 10 procede a ejecutarse la estructura do - while.
        // Luego pasara ingresar un valor a la variable x creada como entero en la que se multiplicara por 2 al contador i y se le restara 10.
        // Después se evaluara en un if, en el cual si el valor almacenado en x es menor que 0, sera multipliucado por -1 a el valor X.
        // Dentro del mismo if se ira imprimiendo el valor de x, asimismo una cadena con un carácter al igual que el valor de y, el cual dicho sea de paso no cumple ninguna  
        // función dentro del programa 
        // Culminada la impresión se le sumara 1 al contador i 
        // El código se continuara repitiendo mientras que el valor de i sea menor a 10. 
        // Lo que mostrara sera números como 10, 8, 6, 4, 2

        
        String y = " ";
        int x;
        int i = 0;
        do {
            x= 2 * i - 10; 
            if (x < 0){
                x= (-1) * x;
                System.out.println(x + " " + y);
            }
            i++;
        } while (i < 10);
    }
}

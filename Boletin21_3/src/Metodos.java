
import com.cristian.PedirDatos.PedirDatos;



/**
 *
 * @author crist
 */
public class Metodos {
  long num;
        num = PedirDatos.getLong("Teclee o numero do teu NIF");
        while(num < 10000000 || num > 100000000){
            num = PedirDatos.getLong("O numero do NIF ten que tener 8 digitos, siendo 10000000 la primera combinacion posible ");
        }
        float div = num%23;
        int resto = (int) div;
        char letra[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        for (int i = 0; i<letra.length; i++){
            if (resto == i){
                System.out.println("Tu letra es: " + letra[i]);
            }
        }
    }


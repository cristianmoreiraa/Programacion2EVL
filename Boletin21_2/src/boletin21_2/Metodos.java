/**
 2- Carga un array  de tipo int, cas notas no módulo de programación ,dos 30 alumnos da clase de DAM .

            •  Visualiza o numero de aprobados e o de suspensos  .
            •  Calcula e visualiza a nota media da clase
            •  Visualiza a nota mais alta 
 
 */
package boletin21_2;

import java.util.Arrays;

/**
 *
 * @author crist
 */
public class Metodos {
    
   public int [] notasAlumnos(){
       
       int aprobados=0;
       int suspensos=0;
       int suma=0;
       int media=0;
       int alta=0;
       
       System.out.println("***** NOTAS CLASE DAM1 ******");   
       
       int[] notas = new int[30];
            for(int i=0;i<notas.length;i++){
                notas[i]= (int) (Math.random()*10+1);  
                System.out.print(notas[i]+" ");
            }   
            
        for (int j=0; j<notas.length;j++){
            if(notas[j]>=5){
                aprobados++;  //número aprobados
            }
            
            suma+=notas[j];
        }   
        
        suspensos =  notas.length - aprobados;  //número suspensos
        media= suma/notas.length;  //nota media  
        
        Arrays.sort(notas);
        alta = notas[notas.length-1];
        
        
        System.out.println("\nNúmero aprobados--> " +aprobados+"\nSuspensos--> "+suspensos+ "\nMedia de la clase--> "+media+"\nLa nota más alta--> "+alta);
        
       return notas;
   }
    
        
    
    
    
}



package boletin24;

/**
 *
 * @author crist
 */
public class ExcepcionLibro extends Exception{
     public ExcepcionLibro(){
        super();
    }
    
    public ExcepcionLibro(String msg){
        super(msg);
    }
}

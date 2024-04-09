package fidanhykolli.u5d7work.exceptions;

public class NotFoundException extends RuntimeException{
    public NotFoundException(int id){
        super("Il blog con ID " + id + " non e' stato trovato, riprova con un altro ID");
    }
}

import java.util.List;
import java.util.ArrayList;
public class Gestion
{
    private ArrayList <Estudiante> estudiante;
    
    
    public Gestion (){
        this.estudiante = new ArrayList <>();
        
    }
    
    public void addEstudiante (Estudiante estudiante){
        this.estudiante.add(estudiante);
    }
    
    public void setEstudiante (ArrayList<Estudiante> estudiantes){
        this.estudiante = estudiante;
    }
    
    public void mostrarEstudiantes (){
        if (estudiante.isEmpty()){
            System.out.println ("No hay estudiantes registrados");
        }
        else {
            System.out.println ("Lista de estudiantes: ");
            for (Estudiante estudiante: estudiante){
                System.out.println ("Nombre: " + estudiante.getNombre() + " Apellido: " + estudiante.getApellido() + " Código: " + estudiante.getCodigo() + " Edad: " + estudiante.getEdad());
            }
        }
            }
            
    public Estudiante buscarEstudiante (String codigo){
        for (Estudiante estudiante : estudiante){
            if(estudiante.getCodigo() == codigo){
                return estudiante;
            }
            }
            return null;
        }
    }
    
    
        
    

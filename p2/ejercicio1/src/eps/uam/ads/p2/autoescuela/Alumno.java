package eps.uam.ads.p2.autoescuela;

/**
 * Clase alumno para la Autoescuela
 * @author Simon Valcarcel: simon.valcarcel@estudiante.uam.es
 * @author Lucia Asencio lucia.asencio@estudiante.uam.es
 *
 */



public class Alumno {

    private int mDni;
    private String mNombre;
    private String mApellidos;
    private String mDireccion;
    private int mTelefono;
    private Fecha mFechaMatricula;
    private Fecha mFechaSuperacionTeorico;
    private Fecha mFechaSuperacionPractico;


    
    // El Constructor 
    
    /**
     * Constructor
     * @param dni
     * @param nombre
     * @param apellidos
     * @param direccion
     * @param telefono
     * @param dia
     * @param mes
     * @param anyo
     */
    public Alumno(int dni, String nombre, String apellidos, String direccion, int telefono, int dia, int mes, int anyo) {
        mDni = dni;
        mNombre = nombre;
        mApellidos = apellidos;
        mDireccion = direccion;
        mTelefono = telefono;
        Fecha f1 = new Fecha(dia, mes, anyo);
        mFechaMatricula = f1;
        Fecha f2 = new Fecha(0, 0, 0);
        mFechaSuperacionTeorico = f2;
        Fecha f3 = new Fecha(0, 0, 0);
        mFechaSuperacionPractico = f3;
    }

    
    /**
     * @return dni
     */
    public int getDni(){
        return mDni;
    }

    /**
     * @return dir
     */
    public String getDireccion(){
        return mDireccion;
    }

    /**
     * @param direccion
     */
    public void setDireccion(String direccion){
        this.mDireccion = direccion;
    }

    /**
     * @return telf
     */
    public int getTelefono(){
        return mTelefono;
    }

    /**
     * @param telefono
     */
    public void setTelefono(int telefono){
        this.mTelefono = telefono;
    }

    /**
     * @return Fecha 
     */
    public Fecha getFechaMatricula() {
        return mFechaMatricula;
    }

    /**
     * @return Nombre y Apellidos
     */
    public String getNombreYApellidos() {
        String Nombre_y_Apellido = mNombre + " " + mApellidos;
        return Nombre_y_Apellido;
    }

    /**
     * @return Fecha superacion teorico
     */
    public Fecha getFechaSupTeorico() {
        return mFechaSuperacionTeorico;
    }

    /**
     * @param dia
     * @param mes
     * @param anyo
     */
    public void setFechaSupTeorico(int dia, int mes, int anyo) {
        mFechaSuperacionTeorico.setFecha(dia, mes, anyo);
    }

    /**
     * @return Fecha superacion Practico
     */
    public Fecha getFechaSupPractico() {
        return mFechaSuperacionPractico;
    }

    /**
     * @param dia
     * @param mes
     * @param anyo
     */
    public void setFechaSupPractico(int dia, int mes, int anyo) {
        mFechaSuperacionPractico.setFecha(dia, mes, anyo);
    }

    /**
     * @param f
     * @return boolean
     */
    public boolean isFechaValida(Fecha f) {
        return f.isFechaValida();
    }    
    
    
    //Un Override
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString(){
        String s = "<Dni: " + getDni() + "> \n" +
                "	Nombre y Apellidos: " + getNombreYApellidos() + "\n"+
                "	Direccion: " + getDireccion() + "\n" +
                "	Telefono: " + getTelefono() + "\n" +
                "	Fecha de matriculacion: " + getFechaMatricula().getFecha();

        return s;
    }
}


/**
 * @author lucia asencio
 */
package eps.uam.ads.p2.autoescuela.fecha;

/**
 * Clase contenedora de fechas
 * @author lucia
 *
 */
public class Fecha{

    private int mDia;
    private int mMes;
    private int mAnyo;

    /**
     * Constructor de fecha
     * @param dia
     * @param mes
     * @param anyo
     */
    public Fecha(int dia, int mes, int anyo) {
        mDia = dia;
        mMes = mes;
        mAnyo = anyo;
    }

    /**
     * getter del dia de fecha
     * @return dia
     */
    public int getDiaDeFecha(){
        return mDia;
    }
    
    /**
     * setter del dia de fecha
     * @param cdia
     */
    private void setDiaFecha(int cdia){
        mDia = cdia;
    }

    /**
     * getter del mes de fecha
     * @return mes
     */
    public int getMesDeFecha(){
        return mMes;
    }

    /**
     * setter del mes de fecha
     * @param cmes
     */
    private void setMesFecha(int cmes){
        mMes = cmes;
    }

    /**
     * getter del anyo de fecha
     * @return anyo
     */
    public int getAnyoDeFecha(){
        return mAnyo;
    }

    /**
     * setter del anyo de fecha
     * @param canyo
     */
    private void setAnyoFecha(int canyo){
        mAnyo = canyo;
    }

    /**
     * funcion que compone string con la fecha
     * @return string
     */
    public String getFecha(){
        String date = getDiaDeFecha() + "/" + getMesDeFecha() + "/" + getAnyoDeFecha();
        return date;
    }


    /**
     * funcion setter de fecha 
     * @param dia
     * @param mes
     * @param anyo
     */
    public void setFecha(int dia, int mes, int anyo){
        setDiaFecha(dia);
        setMesFecha(mes);
        setAnyoFecha(anyo);
    }

    /**
     * comprueba si la fecha es valida
     * @return boolean
     */
    public boolean isFechaValida(){
        int dia = getDiaDeFecha();
        int mes = getMesDeFecha();
        int anyo = getAnyoDeFecha();

        if(dia >= 1 && dia <= 31 && mes >= 1 && mes <= 12 && anyo > 0)
            return true;
        return false;

    }
    
    /**
     * funcion que devuelve si this es una fecha mas antigua que f
     * @param f
     * @return boolean
     */
    public boolean masAntiguaQue(Fecha f){
    	if (this.mAnyo < f.mAnyo){
    		return true;
    	}else if(this.mAnyo > f.mAnyo){
    		return false;
    	}else{
    		if (this.mMes < f.mMes){
    			return true;
    		}else if(this.mMes > f.mMes){
    			return false;
    		}else{
    			if(this.mDia < f.mDia){
    				return true;
    			}else{
    				return false;
    			}
    		}
    	}
    }

}
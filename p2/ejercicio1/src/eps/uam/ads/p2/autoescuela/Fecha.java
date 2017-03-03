package eps.uam.ads.p2.autoescuela;

/**
 * Clase fecha para la Autoescuela
 * @author Simon Valcarcel: simon.valcarcel@estudiante.uam.es
 * @author Lucia Asencio lucia.asencio@estudiante.uam.es
 *
 */

public class Fecha{
	

    private int mDia;
    private int mMes;
    private int mAnyo;

    //Constructor
    /**
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
     * @return Dia
     */
    public int getDiaDeFecha(){
        return mDia;
    }

    /**
     * @param cdia
     */
    private void setDiaFecha(int cdia){
        mDia = cdia;
    }

    /**
     * @return Mes
     */
    public int getMesDeFecha(){
        return mMes;
    }

    /**
     * @param cmes
     */
    private void setMesFecha(int cmes){
        mMes = cmes;
    }

    /**
     * @return Año
     */
    public int getAnyoDeFecha(){
        return mAnyo;
    }

    /**
     * @param canyo
     */
    private void setAnyoFecha(int canyo){
        mAnyo = canyo;
    }

    /**
     * @return String de la fecha
     */
    public String getFecha(){
        String date = getDiaDeFecha() + "/" + getMesDeFecha() + "/" + getAnyoDeFecha();
        return date;
    }



    /**
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
     * @return boolean: si la fecha es valida
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
     * @param fecha
     * @return boolean compara fechas
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

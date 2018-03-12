package lt.nevytas.big_organisation.entity.organisation;


public abstract class Organisation {

    public static final String VILNIUS_DEPARTAMENT_NAME = "Vilnius";
    public static final String KAUNAS_DEPARTAMENT_NAME = "Kaunas";
    public static final String KLAIPEDA_DEPARTAMENT_NAME = "Klaipėda";
    public static final String BIRZAI_DEPARTAMENT_NAME = "Biržai";
    public static final String PANEVEZYS_DEPARTAMENT_NAME = "Panevežys";

    private String departamentName;

    public Organisation(String departamentName) {
        this.departamentName = departamentName;
    }

    public String getDepartamentName() {
        return departamentName;
    }

    public void setDepartamentName(String departamentName) {
        this.departamentName = departamentName;
    }


}

package lt.nevytas.big_organisation.factory;

import lt.nevytas.big_organisation.entity.organisation.Organisation;
import lt.nevytas.big_organisation.entity.organisation.departament.Departament;

public class DepartamentFactory {

    public Organisation generateDepartament(String name){
        return new Departament(name);
    }

}

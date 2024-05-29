package subiectA.flywieght;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
   private Map<Integer, DatePacient> integerDatePacientMap = new HashMap<>();

    public DatePacient getPacient(Flyweight date){
        DatePacient datePacient = (DatePacient) date;
        if(!integerDatePacientMap.containsKey(datePacient.getCodPacient())){
            integerDatePacientMap.put(datePacient.getCodPacient(),datePacient);
        }
        return integerDatePacientMap.get(datePacient.getCodPacient());
    }
}

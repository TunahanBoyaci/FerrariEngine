package FerrariEngine;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        FerrariEngine leclercEngine = new FerrariEngine(1.6, 8, 200.0);
        FerrariEngine sainzEngine = new FerrariEngine(1.8, 6, 220.0);
        FerrariEngine vettelEngine = new FerrariEngine(2.4, 8, 300.0);
        FerrariEngine kimiEngine = new FerrariEngine(1.6, 8, 200.0);
        FerrariEngine schumacherEngine = new FerrariEngine(3.2, 8, 400.0);
        RenaultEngine alonsoEngine = new RenaultEngine(2.0, 8, 180.0, 600.0);
        RenaultEngine riccardoEngine = new RenaultEngine(1.6, 6, 180.0, 600.0);
        RenaultEngine verstappenEngine = new RenaultEngine(1.6, 8, 200.0, 600.0);
        RenaultEngine perezEngine = new RenaultEngine(1.8, 6, 200.0, 600.0);
        RenaultEngine webberEngine = new RenaultEngine(1.6, 6, 180.0, 600.0);
        ArrayList<Engine> engines = new ArrayList();
        engines.add(leclercEngine);
        engines.add(sainzEngine);
        engines.add(vettelEngine);
        engines.add(kimiEngine);
        engines.add(schumacherEngine);
        engines.add(alonsoEngine);
        engines.add(riccardoEngine);
        engines.add(verstappenEngine);
        engines.add(perezEngine);
        engines.add(webberEngine);
        Iterator var12 = engines.iterator();

        while(var12.hasNext()) {
            Engine e = (Engine)var12.next();
            System.out.println(e.getMaxSpeed() + " km/h");
        }

    }
}

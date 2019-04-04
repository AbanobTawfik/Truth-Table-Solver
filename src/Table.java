import java.util.ArrayList;
import java.util.HashMap;

public class Table {
    public int column_size;
    public HashMap<Proposition, ArrayList<Boolean>> proposition_table =
            new HashMap<Proposition, ArrayList<Boolean>>();

    public Table(ArrayList<Proposition> propositions) {
        for(Proposition p : propositions)
            proposition_table.put(p, new ArrayList<Boolean>());
    }

}

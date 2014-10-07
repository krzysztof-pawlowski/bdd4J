package bdd4J.test.fixtures;

import bdd4J.*;
import bdd4J.delegates.Because;
import bdd4J.delegates.Cleanup;
import bdd4J.delegates.Estabilish;
import bdd4J.delegates.It;
import org.junit.Assert;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mateusz on 10/4/2014.
 */

@RunWith(Bdd4J.class)
public class NotNestedPassingTest {

    public static List<Class> invokationOrder = new ArrayList<Class>();

    Estabilish that_var_estabilish_run_is_set_to_true = ()
            -> invokationOrder.add(Estabilish.class);

    Because of_changing_variable_value = () -> {
        invokationOrder.add(Because.class);
    };

    It passes_correct_assertion = () -> {
        invokationOrder.add(It.class);
        Assert.assertTrue(true);
    };

    Cleanup cleanup = () -> {
        invokationOrder.add(Cleanup.class);
    };
}

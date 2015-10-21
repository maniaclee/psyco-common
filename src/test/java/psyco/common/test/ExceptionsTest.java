package psyco.common.test;

import org.junit.Test;
import psyco.common.Exceptions;

/**
 * Created by lipeng on 15/10/21.
 */
public class ExceptionsTest {

    @Test
    public void sdfsdf(){
        System.out.println(Exceptions.supply(() -> Integer.parseInt("sdfsd"),3));
    }
}

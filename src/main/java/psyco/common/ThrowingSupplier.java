package psyco.common;

import java.util.function.Supplier;

@FunctionalInterface
public interface ThrowingSupplier<T> extends Supplier<T> {

    @Override
    default T get() {
        try {
            return getT();
        } catch (final Throwable e) {
            throw new RuntimeException(e);
        }
    }

    T getT() throws Exception;
}
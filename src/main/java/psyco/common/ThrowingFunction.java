package psyco.common;

@FunctionalInterface
public interface ThrowingFunction<T, R> {


    default T map() {
        try {
            return getT();
        } catch (final Throwable e) {
            throw new RuntimeException(e);
        }
    }

    T getT() throws Exception;
}
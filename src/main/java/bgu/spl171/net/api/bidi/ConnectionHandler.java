package bgu.spl171.net.api.bidi;

import java.io.Closeable;
import java.io.IOException;

public interface ConnectionHandler<T> {

    void send(T msg) ;
}

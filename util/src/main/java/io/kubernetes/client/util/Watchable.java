package io.kubernetes.client.util;

import java.util.Iterator;

public interface Watchable<T>
    extends Iterable<Watch.Response<T>>,
        Iterator<Watch.Response<T>>,
        java.io.Closeable,
        AutoCloseable {}

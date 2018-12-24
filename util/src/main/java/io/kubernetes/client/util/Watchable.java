package io.kubernetes.client.util;

import java.util.Iterator;

/**
 * @author zuoxiu.jm
 * @version $Id: Watchable.java, v 0.1 2019年02月25日 5:38 PM zuoxiu.jm Exp $
 */
public interface Watchable<T>
    extends Iterable<Watch.Response<T>>,
        Iterator<Watch.Response<T>>,
        java.io.Closeable,
        AutoCloseable {}

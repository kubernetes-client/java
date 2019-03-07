package io.kubernetes.client.informer.cache;

import java.util.List;

/** Indexer extends Store interface and adds index/de-index methods. */
public interface Indexer<ApiType> extends Store<ApiType> {

  /**
   * Retrieve list of objects that match on the named indexing function.
   *
   * @param indexName specific indexing function
   * @return matched objects
   */
  List<ApiType> index(String indexName, ApiType obj);

  /**
   * IndexKeys returns the set of keys that match on the named indexing function.
   *
   * @param indexName specific indexing function
   * @param indexKey specific index key
   * @return matched keys
   */
  List<String> indexKeys(String indexName, String indexKey);

  /**
   * ByIndex lists object that match on the named indexing function with the exact key.
   *
   * @param indexName specific indexing function
   * @param indexKey specific index key
   * @return matched objects
   */
  List<ApiType> byIndex(String indexName, String indexKey);
}

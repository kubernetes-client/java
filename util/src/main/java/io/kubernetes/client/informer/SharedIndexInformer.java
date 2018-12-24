package io.kubernetes.client.informer;

import io.kubernetes.client.informer.cache.Indexer;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/*
 * SharedIndexInformer extends SharedInformer and provides indexer operability additionally.
 */
public interface SharedIndexInformer<ApiType> extends SharedInformer<ApiType> {

  /**
   * Add indexers.
   *
   * @param indexers the indexers
   */
  void addIndexers(Map<String, Function<ApiType, List<String>>> indexers);

  /**
   * getIndexer returns the internal indexer store.
   *
   * @return the internal indexer store
   */
  Indexer<ApiType> getIndexer();
}

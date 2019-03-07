package io.kubernetes.client.informer.cache;

import com.google.common.base.Strings;
import java.util.List;

/** Lister interface is used to list cached items from a running informer. */
public class Lister<ApiType> {

  private String namespace;

  private String indexName;

  private Indexer<ApiType> indexer;

  public Lister(Indexer<ApiType> indexer) {
    this(indexer, null, Cache.NAMESPACE_INDEX);
  }

  public Lister(Indexer<ApiType> indexer, String namespace) {
    this(indexer, namespace, Cache.NAMESPACE_INDEX);
  }

  public Lister(Indexer<ApiType> indexer, String namespace, String indexName) {
    this.indexer = indexer;
    this.namespace = namespace;
    this.indexName = indexName;
  }

  public List<ApiType> list() {
    if (Strings.isNullOrEmpty(namespace)) {
      return indexer.list();
    } else {
      return indexer.byIndex(this.indexName, namespace);
    }
  }

  public ApiType get(String name) {
    String key = name;
    if (Strings.isNullOrEmpty(namespace)) {
      key = namespace + "/" + name;
    }
    return indexer.getByKey(key);
  }

  public Lister<ApiType> namespace(String namespace) {
    return new Lister<ApiType>(this.indexer, namespace, Cache.NAMESPACE_INDEX);
  }
}

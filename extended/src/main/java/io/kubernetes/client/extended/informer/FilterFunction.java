package io.kubernetes.client.extended.informer;

import static java.util.stream.Collectors.toList;
import static org.apache.commons.collections4.CollectionUtils.emptyIfNull;

import java.util.List;
import java.util.Objects;

/**
 * Created by 烛坤 on 2019/10/23.
 *
 * @author 烛坤
 * @date 2019/10/23
 */
@FunctionalInterface
public interface FilterFunction<T> {

  T apply(T t);

  default FilterFunction<T> compose(FilterFunction<T> before) {
    Objects.requireNonNull(before);
    return t -> apply(before.apply(t));
  }

  default FilterFunction<T> andThen(FilterFunction<T> after) {
    Objects.requireNonNull(after);
    return t -> after.apply(apply(t));
  }

  static <T> FilterFunction<T> identity() {
    return t -> t;
  }

  static <V> FilterFunction<V> init() {
    return identity();
  }

  static <V> V apply(V obj, FilterFunction<V> filterFunction) {
    return filterFunction.apply(obj);
  }

  static <V> List<V> apply(List<V> objList, FilterFunction<V> filterFunction) {
    return emptyIfNull(objList).stream().map(filterFunction::apply).collect(toList());
  }
}

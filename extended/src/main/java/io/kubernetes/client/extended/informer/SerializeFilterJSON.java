package io.kubernetes.client.extended.informer;

import static java.util.stream.Collectors.toList;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.JSON;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.function.BiPredicate;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.ListUtils;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;

/**
 * Created by 烛坤 on 2019/10/24.
 *
 * @author 烛坤
 * @date 2019/10/24
 */
public class SerializeFilterJSON extends JSON {

  private List<FilterField> filterFields;

  private final Map<Type, Object> typeAdapterMap =
      ImmutableMap.of(
          Date.class, new DateTypeAdapter(),
          java.sql.Date.class, new SqlDateTypeAdapter(),
          DateTime.class, new DateTimeTypeAdapter(),
          LocalDate.class, new LocalDateTypeAdapter(),
          byte[].class, new ByteArrayAdapter());

  public SerializeFilterJSON() {
    this(Lists.newArrayList());
  }

  public SerializeFilterJSON(List<FilterField> filterFields) {

    this.filterFields =
        ListUtils.emptyIfNull(filterFields)
            .stream()
            .filter(FilterField::isNotEmpty)
            .collect(toList());

    GsonBuilder builder = new GsonBuilder();

    getTypeAdapterMap().forEach(builder::registerTypeAdapter);

    ExclusionStrategy strategy = getStrategy(getFilterFields());

    if (strategy != null) {
      builder.addDeserializationExclusionStrategy(strategy);
    }

    setGson(builder.create());
  }

  private ExclusionStrategy getStrategy(List<FilterField> filterFields) {

    if (CollectionUtils.isEmpty(filterFields)) {
      return null;
    }

    return new ExclusionStrategy() {

      @Override
      public boolean shouldSkipField(FieldAttributes f) {

        SerializedName serialized = f.getAnnotation(SerializedName.class);

        FilterField filterField =
            new FilterField()
                .setName(f.getName())
                .setDeclaringClass(f.getDeclaringClass())
                .setSerializedName(serialized != null ? serialized.value() : null);

        return filterFields
                .stream()
                .filter(ff -> MATCH_PREDICATE.test(ff, filterField))
                .findFirst()
                .orElse(null)
            != null;
      }

      @Override
      public boolean shouldSkipClass(Class<?> clazz) {
        return false;
      }
    };
  }

  private static final BiPredicate<FilterField, FilterField> MATCH_PREDICATE =
      (customer, system) -> {
        if (!customer.isNotEmpty()) { // double check
          return false;
        }

        boolean isSameName =
            StringUtils.isEmpty(customer.getName())
                || StringUtils.equals(customer.getName(), system.getName());

        boolean isSameDeclaringClass =
            customer.getDeclaringClass() == null
                || customer.getDeclaringClass().equals(system.getDeclaringClass());

        boolean isSameSerializedName =
            StringUtils.isEmpty(customer.getSerializedName())
                || StringUtils.equals(customer.getSerializedName(), system.getSerializedName());

        return isSameName && isSameDeclaringClass && isSameSerializedName;
      };

  public Map<Type, Object> getTypeAdapterMap() {
    return typeAdapterMap;
  }

  public List<FilterField> getFilterFields() {
    return filterFields;
  }
}

package io.kubernetes.client.examples;

import static java.util.stream.Collectors.toList;

import com.google.common.collect.Sets;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.extended.informer.FilterField;
import io.kubernetes.client.extended.informer.PageSharedInformerFactory;
import io.kubernetes.client.extended.informer.PagerCallGeneratorParams;
import io.kubernetes.client.extended.informer.SerializeFilterJSON;
import io.kubernetes.client.informer.ResourceEventHandler;
import io.kubernetes.client.informer.SharedIndexInformer;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.GzipRequestInterceptor;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.models.V1Container;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1PodList;
import io.kubernetes.client.openapi.models.V1PodSpec;
import io.kubernetes.client.openapi.models.V1PodStatus;
import io.kubernetes.client.util.CallGenerator;
import io.kubernetes.client.util.Config;
import java.io.IOException;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.apache.commons.collections4.ListUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by 烛坤 on 2019/12/2.
 *
 * @author 烛坤
 * @date 2019/12/02
 */
public class FieldFilterPageInformerExample {

  private static final Logger log = LoggerFactory.getLogger(FieldFilterPageInformerExample.class);

  private static final Function<Class<?>, List<FilterField>> LIST_FILTER_FIELD_FUNCTION =
      clazz ->
          Arrays.stream(clazz.getDeclaredFields())
              .filter(f -> !Modifier.isStatic(f.getModifiers()))
              .map(
                  f ->
                      new FilterField()
                          .setSerializedName(f.getAnnotation(SerializedName.class).value())
                          .setDeclaringClass(clazz))
              .collect(toList());

  private static final List<FilterField> V1ObjectMeta_ALL_FILTER_FIELD =
      LIST_FILTER_FIELD_FUNCTION.apply(V1ObjectMeta.class);

  private static final List<FilterField> V1PodSpec_ALL_FILTER_FIELD =
      LIST_FILTER_FIELD_FUNCTION.apply(V1PodSpec.class);

  private static final List<FilterField> V1PodStatus_ALL_FILTER_FIELD =
      LIST_FILTER_FIELD_FUNCTION.apply(V1PodStatus.class);

  private static final List<FilterField> V1Container_ALL_FILTER_FIELD =
      LIST_FILTER_FIELD_FUNCTION.apply(V1Container.class);

  private static final ResourceEventHandler<V1Pod> FILTER_FIELD_EVENT_HANDLER =
      new ResourceEventHandler<V1Pod>() {

        @Override
        public void onAdd(V1Pod pod) {

          log.info("{} pod add!", pod.getMetadata().getName());
        }

        @Override
        public void onUpdate(V1Pod oldPod, V1Pod newPod) {

          log.info(
              "{} => {} pod updated!",
              oldPod.getMetadata().getName(),
              newPod.getMetadata().getName());
        }

        @Override
        public void onDelete(V1Pod pod, boolean deletedFinalStateUnknown) {

          log.info("{} pod deleted!", pod.getMetadata().getName());
        }
      };

  public static void main(String[] args) throws IOException, InterruptedException {

    ApiClient client = Config.defaultClient();

    client.setHttpClient(
        client
            .getHttpClient()
            .newBuilder()
            .readTimeout(0, TimeUnit.MINUTES)
            .addInterceptor(new GzipRequestInterceptor())
            .build());

    CoreV1Api coreV1Api = new CoreV1Api(client);

    CallGenerator<PagerCallGeneratorParams> callGenerator =
        params ->
            coreV1Api.listPodForAllNamespacesCall(
                null,
                params.getContinueToken(),
                null,
                null,
                params.getLimit(),
                null,
                params.resourceVersion,
                params.timeoutSeconds,
                params.watch,
                null);

    List<FilterField> filterFields = listFilterField();

    client.setJSON(new SerializeFilterJSON(filterFields));

    PageSharedInformerFactory factory = new PageSharedInformerFactory(client);

    SharedIndexInformer<V1Pod> podInformer =
        factory.sharedIndexInformerFor(callGenerator, V1Pod.class, V1PodList.class);

    podInformer.addEventHandler(FILTER_FIELD_EVENT_HANDLER);

    factory.startAllRegisteredInformers();

    while (!podInformer.hasSynced()) {
      TimeUnit.SECONDS.sleep(1);
    }

    System.out.println(podInformer.getIndexer().size());
  }

  private static List<FilterField> listFilterField() {

    Set<String> podMetaNeed =
        Sets.newHashSet(
            V1ObjectMeta.SERIALIZED_NAME_NAME,
            V1ObjectMeta.SERIALIZED_NAME_NAMESPACE,
            V1ObjectMeta.SERIALIZED_NAME_RESOURCE_VERSION,
            V1ObjectMeta.SERIALIZED_NAME_CREATION_TIMESTAMP,
            V1ObjectMeta.SERIALIZED_NAME_LABELS);

    List<FilterField> podMetaFilterFields =
        V1ObjectMeta_ALL_FILTER_FIELD.stream()
            .filter(f -> !podMetaNeed.contains(f.getSerializedName()))
            .collect(toList());

    Set<String> podSpecNeed =
        Sets.newHashSet(
            V1PodSpec.SERIALIZED_NAME_CONTAINERS,
            V1PodSpec.SERIALIZED_NAME_NODE_NAME,
            V1PodSpec.SERIALIZED_NAME_AFFINITY,
            V1PodSpec.SERIALIZED_NAME_TOLERATIONS);

    List<FilterField> podSpecFilterFields =
        V1PodSpec_ALL_FILTER_FIELD.stream()
            .filter(f -> !podSpecNeed.contains(f.getSerializedName()))
            .collect(toList());

    Set<String> podSpecV1ContainerNeed =
        Sets.newHashSet(V1Container.SERIALIZED_NAME_NAME, V1Container.SERIALIZED_NAME_RESOURCES);

    List<FilterField> podSpecV1ContainerFilterFields =
        V1Container_ALL_FILTER_FIELD.stream()
            .filter(f -> !podSpecV1ContainerNeed.contains(f.getSerializedName()))
            .collect(toList());

    Set<String> podStatusNeed =
        Sets.newHashSet(V1PodStatus.SERIALIZED_NAME_PHASE, V1PodStatus.SERIALIZED_NAME_CONDITIONS);

    List<FilterField> podStatusFilterFields =
        V1PodStatus_ALL_FILTER_FIELD.stream()
            .filter(f -> !podStatusNeed.contains(f.getSerializedName()))
            .collect(toList());

    return ListUtils.union(
        ListUtils.union(podMetaFilterFields, podSpecFilterFields),
        ListUtils.union(podSpecV1ContainerFilterFields, podStatusFilterFields));
  }
}

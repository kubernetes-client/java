package io.kubernetes.client.models;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class V1PodBuilderTest {

  @Test
  public void testBuilder() {
    V1Pod pod1 = new V1PodBuilder()
        .withNewMetadata()
        .withName("mypod")
        .endMetadata()
        .withNewSpec()
        .addNewContainer()
        .withName("cnt")
        .endContainer()
        .endSpec()
        .build();

    V1Pod pod2 = new V1Pod()
        .metadata(new V1ObjectMeta().name("mypod"))
        .spec(new V1PodSpec()
            .containers(Arrays.asList(
                new V1Container().name("cnt")
                )
            )
        );


    Assert.assertEquals(pod1, pod2);
  }
}

/*
Copyright 2020 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.spring.extended.network.annotation;

import io.kubernetes.client.extended.network.LoadBalanceStrategy;
import io.kubernetes.client.extended.network.RoundRobinLoadBalanceStrategy;
import io.kubernetes.client.spring.extended.network.endpoints.EndpointsGetter;
import io.kubernetes.client.spring.extended.network.endpoints.InformerEndpointsGetter;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface KubernetesEndpointsLoadBalanced {

  String namespace();

  String name();

  Class<? extends LoadBalanceStrategy> strategy() default RoundRobinLoadBalanceStrategy.class;

  Class<? extends EndpointsGetter> endpointsGetter() default InformerEndpointsGetter.class;
}

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
package io.kubernetes.client.examples;

import io.kubernetes.client.extended.network.EndpointsLoadBalancer;
import io.kubernetes.client.extended.network.LoadBalancer;
import io.kubernetes.client.extended.network.RoundRobinLoadBalanceStrategy;
import io.kubernetes.client.informer.SharedIndexInformer;
import io.kubernetes.client.informer.SharedInformerFactory;
import io.kubernetes.client.informer.cache.Lister;
import io.kubernetes.client.openapi.models.V1Endpoints;
import io.kubernetes.client.spring.extended.network.endpoints.InformerEndpointsGetter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class SpringLoadBalancerExample {

  public static void main(String[] args) {
    SpringApplication.run(SpringLoadBalancerExample.class, args);
  }

  @Configuration
  public static class AppConfig {

    @Bean
    public CommandLineRunner loadBalancerCommandLineRunner(
        SharedInformerFactory sharedInformerFactory, MyService myService) {
      return args -> {
        System.out.println("starting informers..");
        sharedInformerFactory.startAllRegisteredInformers();

        System.out.println("routing default/kubernetes:");
        System.out.println(myService.defaultKubernetesLoadBalancer.getTargetIP());
      };
    }

    @Bean
    public MyService myService(SharedIndexInformer<V1Endpoints> lister) {
      return new MyService(new Lister<>(lister.getIndexer()));
    }
  }

  public static class MyService {

    private LoadBalancer defaultKubernetesLoadBalancer;

    public MyService(Lister<V1Endpoints> lister) {
      InformerEndpointsGetter getter = new InformerEndpointsGetter(lister);
      RoundRobinLoadBalanceStrategy strategy = new RoundRobinLoadBalanceStrategy();
      defaultKubernetesLoadBalancer =
          new EndpointsLoadBalancer(() -> getter.get("default", "kubernetes"), strategy);
    }
  }
}

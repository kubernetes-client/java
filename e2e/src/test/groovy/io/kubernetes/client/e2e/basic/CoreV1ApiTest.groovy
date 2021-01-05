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

package io.kubernetes.client.e2e.basic

import com.google.gson.JsonSyntaxException
import io.kubernetes.client.openapi.ApiException
import io.kubernetes.client.openapi.Configuration
import io.kubernetes.client.openapi.apis.CoreV1Api
import io.kubernetes.client.openapi.models.V1Namespace
import io.kubernetes.client.openapi.models.V1ObjectMeta
import io.kubernetes.client.openapi.models.V1Status
import io.kubernetes.client.util.ClientBuilder
import spock.lang.Specification

class CoreV1ApiTest extends Specification {
    public deleteNamespace(CoreV1Api api, String namespace) {
        try {
            api.deleteNamespace(namespace, null, null, null, null, null, null);
        } catch (ApiException ex) {
            if (ex.getCode() != HttpURLConnection.HTTP_NOT_FOUND) {
                throw ex;
            }
        } catch (JsonSyntaxException ex) {
            // Delete returned v1Status, try again.
            deleteNamespace(api, namespace);
        }
    }

    def "Create Namespace then Delete should work"() {
        given:
        def apiClient = ClientBuilder.defaultClient()
        def corev1api = new CoreV1Api(apiClient)
        Configuration.setDefaultApiClient(apiClient)
        def namespaceFoo = new V1Namespace().metadata(new V1ObjectMeta().name("e2e-basic"))
        when:
        V1Namespace created = corev1api.createNamespace(namespaceFoo, null, null, null)
        then:
        created != null
        when:
        boolean deleted = deleteNamespace(corev1api, "e2e-basic");
        then:
        deleted == true
    }

}

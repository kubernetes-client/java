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
package io.kubernetes.client.apimachinery;

import io.kubernetes.client.util.Strings;
import java.util.regex.Pattern;
import okhttp3.Request;

public class KubernetesRequestDigest {

  public static final Pattern RESOURCE_URL_PATH_PATTERN =
      Pattern.compile("^/(api|apis)(/\\S+)?/v\\d\\w*/\\S+");

  KubernetesRequestDigest(
      String urlPath,
      boolean isNonResourceRequest,
      KubernetesResource resourceMeta,
      KubernetesVerb verb) {
    this.urlPath = urlPath;
    this.isNonResourceRequest = isNonResourceRequest;
    this.resourceMeta = resourceMeta;
    this.verb = verb;
  }

  public static KubernetesRequestDigest parse(Request request) {
    String urlPath = request.url().encodedPath();
    if (!isResourceRequest(urlPath)) {
      return nonResource(urlPath);
    }
    try {
      KubernetesResource resourceMeta;
      if (urlPath.startsWith("/api/v1")) {
        resourceMeta = KubernetesResource.parseCoreResource(urlPath);
      } else {
        resourceMeta = KubernetesResource.parseRegularResource(urlPath);
      }

      return new KubernetesRequestDigest(
          urlPath,
          false,
          resourceMeta,
          KubernetesVerb.of(
              request.method(), hasNamePathParameter(resourceMeta), hasWatchParameter(request)));
    } catch (ParseKubernetesResourceException e) {
      return nonResource(urlPath);
    }
  }

  private static KubernetesRequestDigest nonResource(String urlPath) {
    KubernetesRequestDigest digest = new KubernetesRequestDigest(urlPath, true, null, null);
    return digest;
  }

  public static boolean isResourceRequest(String urlPath) {
    return RESOURCE_URL_PATH_PATTERN.matcher(urlPath).matches();
  }

  private static boolean hasWatchParameter(Request request) {
    return !Strings.isNullOrEmpty(request.url().queryParameter("watch"));
  }

  private static boolean hasNamePathParameter(KubernetesResource resource) {
    return !Strings.isNullOrEmpty(resource.getName());
  }

  private final String urlPath;

  private final boolean isNonResourceRequest;

  private final KubernetesResource resourceMeta;

  private final KubernetesVerb verb;

  public String getUrlPath() {
    return urlPath;
  }

  public boolean isNonResourceRequest() {
    return isNonResourceRequest;
  }

  public KubernetesResource getResourceMeta() {
    return resourceMeta;
  }

  public KubernetesVerb getVerb() {
    return verb;
  }

  @Override
  public String toString() {
    if (isNonResourceRequest) {
      return new StringBuilder().append(verb).append(' ').append(urlPath).toString();
    }

    String groupVersion;
    if (Strings.isNullOrEmpty(resourceMeta.getGroupVersionResource().getGroup())) {
      // core resource
      groupVersion = "";
    } else {
      // regular resource
      groupVersion =
          resourceMeta.getGroupVersionResource().getGroup()
              + "/"
              + resourceMeta.getGroupVersionResource().getVersion();
    }

    String targetResourceName;
    if (Strings.isNullOrEmpty(resourceMeta.getSubResource())) {
      targetResourceName = resourceMeta.getGroupVersionResource().getResource();
    } else { // subresource
      targetResourceName =
          resourceMeta.getGroupVersionResource().getResource()
              + "/"
              + resourceMeta.getSubResource();
    }

    return new StringBuilder()
        .append(verb.value())
        .append(' ')
        .append(groupVersion)
        .append(' ')
        .append(targetResourceName)
        .toString();
  }
}

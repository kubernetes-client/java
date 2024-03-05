/*
Copyright 2024 The Kubernetes Authors.
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
package io.kubernetes.client.custom;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class IntOrStringJacksonSerializer extends StdSerializer<IntOrString> {

  public IntOrStringJacksonSerializer() {
    this(null);
  }

  public IntOrStringJacksonSerializer(Class<IntOrString> t) {
    super(IntOrString.class);
  }

  @Override
  public void serialize(IntOrString value, JsonGenerator jg, SerializerProvider provider) throws IOException {
    if (value.isInteger()) {
      jg.writeNumber(value.getIntValue());
    } else {
      jg.writeString(value.getStrValue());
    }
  }
}

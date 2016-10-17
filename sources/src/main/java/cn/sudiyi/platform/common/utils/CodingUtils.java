/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package cn.sudiyi.platform.common.utils;

import cn.sudiyi.platform.common.http.HttpResponse;
import cn.sudiyi.platform.internal.PlatformUtils;

public class CodingUtils {

    public static void assertParameterNotNull(Object param, String paramName) {
        if (param == null) {
            throw new NullPointerException(PlatformUtils.COMMON_RESOURCE_MANAGER.getFormattedString("ParameterIsNull", paramName));
        }
    }

    public static void assertStringNotNullOrEmpty(String param, String paramName) {
        assertParameterNotNull(param, paramName);
        if (StringUtils.isBlank(param)) {
            throw new IllegalArgumentException(PlatformUtils.COMMON_RESOURCE_MANAGER.getFormattedString("ParameterStringIsEmpty", paramName));
        }
    }

    public static String parseUnexpectedResponse(HttpResponse response) {
        return new StringBuilder().append("SDK未定义的响应,response status code:").append(response.getStatusCode().getStatusCode()).append(".response text:").append(response.getResponseText()).toString();
    }

}

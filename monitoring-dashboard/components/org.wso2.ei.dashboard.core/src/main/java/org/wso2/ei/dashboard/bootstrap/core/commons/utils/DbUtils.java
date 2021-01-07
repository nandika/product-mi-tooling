/*
 * Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 *
 */

package org.wso2.ei.dashboard.bootstrap.core.commons.utils;

import org.wso2.ei.dashboard.bootstrap.core.commons.Constants;

import java.net.URI;

public class DbUtils {

    public static String getDbType(String connectionUrl) {
        URI uri = URI.create(connectionUrl.substring(5));
        return uri.getScheme();
    }

    public static String getDBConnectionUrl() {
        String dashboardHome = System.getenv(Constants.DASHBOARD_HOME);
        return "jdbc:h2:" + dashboardHome + "/repository/database/WSO2_EI_DASHBOARD_DB";
    }

}

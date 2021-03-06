/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.iovcc.transform.v20180501;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iovcc.model.v20180501.ListClientSdksResponse;
import com.aliyuncs.iovcc.model.v20180501.ListClientSdksResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClientSdksResponseUnmarshaller {

	public static ListClientSdksResponse unmarshall(ListClientSdksResponse listClientSdksResponse, UnmarshallerContext _ctx) {
		
		listClientSdksResponse.setRequestId(_ctx.stringValue("ListClientSdksResponse.RequestId"));

		List<Result> clientSdks = new ArrayList<Result>();
		for (int i = 0; i < _ctx.lengthValue("ListClientSdksResponse.ClientSdks.Length"); i++) {
			Result result = new Result();
			result.setId(_ctx.longValue("ListClientSdksResponse.ClientSdks["+ i +"].Id"));
			result.setGmtCreate(_ctx.longValue("ListClientSdksResponse.ClientSdks["+ i +"].GmtCreate"));
			result.setGmtModified(_ctx.longValue("ListClientSdksResponse.ClientSdks["+ i +"].GmtModified"));
			result.setName(_ctx.stringValue("ListClientSdksResponse.ClientSdks["+ i +"].Name"));
			result.setPkgName(_ctx.stringValue("ListClientSdksResponse.ClientSdks["+ i +"].PkgName"));
			result.setPkgType(_ctx.integerValue("ListClientSdksResponse.ClientSdks["+ i +"].PkgType"));
			result.setOsType(_ctx.integerValue("ListClientSdksResponse.ClientSdks["+ i +"].OsType"));

			clientSdks.add(result);
		}
		listClientSdksResponse.setClientSdks(clientSdks);
	 
	 	return listClientSdksResponse;
	}
}
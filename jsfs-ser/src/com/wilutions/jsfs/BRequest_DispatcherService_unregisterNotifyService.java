package com.wilutions.jsfs;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenApiClass DO NOT MODIFY.
 */

import byps.*;
import java.io.Serializable;

/**
*/
@SuppressWarnings("all")
public final class BRequest_DispatcherService_unregisterNotifyService extends BMethodRequest implements Serializable {

	public java.lang.String token;
	
	public final static long serialVersionUID = 1366717454L;
	
	public int getRemoteId() { return 1153231042; }
	
	public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) throws Throwable {
		try {
			final DispatcherServiceAsync __byps__remoteT = (DispatcherServiceAsync)__byps__remote;			
			BAsyncResultSendMethod<Object> __byps__outerResult = new BAsyncResultSendMethod<Object>(__byps__asyncResult, new BResult_19());			
			__byps__remoteT.unregisterNotifyService(token, __byps__outerResult);
		} catch (Throwable e) {
			__byps__asyncResult.setAsyncResult(null, e);
			throw e;
		}
	}	
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[DispatcherService.unregisterNotifyService(");
		s.append(token);
		s.append(")]");
		return s.toString();
	}
	
}

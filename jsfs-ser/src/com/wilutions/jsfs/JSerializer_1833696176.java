package com.wilutions.jsfs;

/*
 * Serializer for com.wilutions.jsfs.BRequest_DispatcherService_registerService
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStructJson DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=2

// checkpoint byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class JSerializer_1833696176 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1833696176();
	
	public JSerializer_1833696176() {
		super(1833696176);
	}
	
	public JSerializer_1833696176(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_DispatcherService_registerService obj = (BRequest_DispatcherService_registerService)obj1;		
		bbuf.putString("token", obj.token);
		bout.writeObj("service",obj.service, false, null);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_DispatcherService_registerService obj = (BRequest_DispatcherService_registerService)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_DispatcherService_registerService()));
		
		final BJsonObject js = bin.currentObject;
		obj.token = js.getString("token");
		obj.service = (com.wilutions.jsfs.FileSystemService)bin.readObj("service", false, null);
		
		return obj;
	}
	
}

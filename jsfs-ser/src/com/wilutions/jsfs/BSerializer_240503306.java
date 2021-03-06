package com.wilutions.jsfs;

/*
 * Serializer for com.wilutions.jsfs.BRequest_FileSystemService_uploadFilesMultipartFormdata
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStruct DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=3

// checkpoint byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class BSerializer_240503306 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_240503306();
	
	public BSerializer_240503306() {
		super(240503306);
	}
	
	public BSerializer_240503306(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final BRequest_FileSystemService_uploadFilesMultipartFormdata obj = (BRequest_FileSystemService_uploadFilesMultipartFormdata)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bbuf.putString(obj.method);
		bbuf.putString(obj.url);
		bout.writeObj(obj.items, false, com.wilutions.jsfs.BSerializer_566696346.instance);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_FileSystemService_uploadFilesMultipartFormdata obj = (BRequest_FileSystemService_uploadFilesMultipartFormdata)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_FileSystemService_uploadFilesMultipartFormdata()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.method = bbuf.getString();
		obj.url = bbuf.getString();
		obj.items = (com.wilutions.jsfs.FormItem[])bin.readObj(false, com.wilutions.jsfs.BSerializer_566696346.instance);
		
		return obj;
	}
	
}

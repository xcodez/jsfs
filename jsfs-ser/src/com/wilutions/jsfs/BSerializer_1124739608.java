package com.wilutions.jsfs;

/*
 * Serializer for com.wilutions.jsfs.BRequest_FileSystemService_endWatchFolder
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStruct DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=1

// checkpoint byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class BSerializer_1124739608 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1124739608();
	
	public BSerializer_1124739608() {
		super(1124739608);
	}
	
	public BSerializer_1124739608(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final BRequest_FileSystemService_endWatchFolder obj = (BRequest_FileSystemService_endWatchFolder)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bbuf.putInt(obj.handle);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_FileSystemService_endWatchFolder obj = (BRequest_FileSystemService_endWatchFolder)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_FileSystemService_endWatchFolder()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.handle = bbuf.getInt();
		
		return obj;
	}
	
}

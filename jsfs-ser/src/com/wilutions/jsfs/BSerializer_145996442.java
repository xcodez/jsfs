package com.wilutions.jsfs;

/*
 * Serializer for com.wilutions.jsfs.BStub_FileSystemService
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStub DO NOT MODIFY.
 */

import byps.*;
@SuppressWarnings("all")
public class BSerializer_145996442 extends BSerializer_16 {
	
	public final static BSerializer instance = new BSerializer_145996442();
	
	public BSerializer_145996442() {
		super(145996442);
	}
	
	@Override
	public BRemote internalCreate(final BTransport transport) throws BException {
		return new BStub_FileSystemService(transport);
	}
	
}
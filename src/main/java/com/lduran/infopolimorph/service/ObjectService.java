package com.lduran.infopolimorph.service;

import java.util.List;

import com.lduran.infopolimorph.model.ObjectBI;

public interface ObjectService
{
	public List<? extends ObjectBI> getObjectList(List<String> fileContent);
	public String getObjectHeader();
	public String getObjectContent(ObjectBI obj);
}

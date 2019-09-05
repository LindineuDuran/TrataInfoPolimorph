package com.lduran.infopolimorph.util;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lduran.infopolimorph.model.ObjectBI;
import com.lduran.infopolimorph.service.BuildService;

@Component("lst")
public class ListHandler
{
	@Autowired
	BuildService bs;

	/**
	 * Format the report like CSV
	 * @param lstObjetosBI
	 * @return
	 */
	public List<String> formataRelatorio(List<ObjectBI> lstObjetosBI, String objectType)
	{
		List<String> relatorio = new LinkedList<>();

		if (!lstObjetosBI.isEmpty())
		{
			String header = this.bs.getObjectService(objectType).getObjectHeader();
			relatorio.add(header);

			for (ObjectBI line : lstObjetosBI)
			{
				relatorio.add(this.bs.getObjectService(objectType).getObjectContent(line));
			}
		}

		return relatorio;
	}

	/**
	 * displays the contents of the list on screen
	 *
	 * @param listagem
	 */
	public void imprimeLista(List<String> listagem)
	{
		for (String linha : listagem)
		{
			System.out.println(linha);
		}
	}
}

package com.lduran.infopolimorph.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.lduran.infopolimorph.model.ObjectBI;
import com.lduran.infopolimorph.model.Organizacao;

@Service
public class OrganizacaoServiceImpl implements ObjectService
{
	@Override
	public List<? extends ObjectBI> getObjectList(List<String> fileContent)
	{
		List<Organizacao> objectListOrganizacao = new LinkedList<>();

		for (String linha : fileContent)
		{
			Organizacao org = new Organizacao();

			if (!linha.contains("IdOrganizacao"))
			{
				String[] item = linha.replace(".", "").replace(",", ".").split(";");

				if ((item.length > 0) && (item[0] != null)) {org.setCnpj(item[0]);}
				if ((item.length > 1) && (item[1] != null)) {org.setCodigoIBGE(item[1]);}
				if ((item.length > 2) && (item[2] != null)) {org.setRazaoSocial(item[2]);}
				if ((item.length > 3) && (item[3] != null)) {org.setEndereco(item[3]);}
				if ((item.length > 4) && (item[4] != null)) {org.setBairro(item[4]);}
				if ((item.length > 5) && (item[5] != null)) {org.setCep(item[5]);}

				objectListOrganizacao.add(org);
			}
		}

		List<? extends ObjectBI> objectList = objectListOrganizacao;
		return objectList;
	}

	@Override
	public String getObjectHeader()
	{
		return "IdOrganizacao;IdCodigoIbge;Organizacao;Endereco;Bairro;Cep";
	}

	@Override
	public String getObjectContent(ObjectBI obj)
	{
		Organizacao org = (Organizacao) obj;
		return org.getCnpj() + ";" + org.getCodigoIBGE() + ";" + org.getRazaoSocial() + ";" + org.getEndereco() + ";" + org.getBairro() + ";" + org.getCep();
	}

}

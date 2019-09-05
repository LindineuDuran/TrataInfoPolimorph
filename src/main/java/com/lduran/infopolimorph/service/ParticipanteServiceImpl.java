package com.lduran.infopolimorph.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.lduran.infopolimorph.model.ObjectBI;
import com.lduran.infopolimorph.model.Participante;

@Service
public class ParticipanteServiceImpl implements ObjectService
{

	@Override
	public List<? extends ObjectBI> getObjectList(List<String> fileContent)
	{
		List<Participante> objectListParticipante = new LinkedList<>();

		for (String linha : fileContent)
		{
			Participante part = new Participante();

			if (!linha.contains("IdParticipante"))
			{
				String[] item = linha.replace(".", "").replace(",", ".").split(";");

				if ((item.length > 0) && (item[0] != null)) {part.setCnpj(item[0]);}
				if ((item.length > 1) && (item[1] != null)) {part.setCodigoIBGE(item[1]);}
				if ((item.length > 2) && (item[2] != null)) {part.setRazaoSocial(item[2]);}
				if ((item.length > 3) && (item[3] != null)) {part.setEndereco(item[3]);}
				if ((item.length > 4) && (item[4] != null)) {part.setBairro(item[4]);}
				if ((item.length > 5) && (item[5] != null)) {part.setPais(item[5]);}
				if ((item.length > 6) && (item[6] != null)) {part.setSegmento(item[6]);}
				if ((item.length > 7) && (item[7] != null)) {part.setCep(item[7]);}

				objectListParticipante.add(part);
			}
		}

		List<? extends ObjectBI> objectList = objectListParticipante;
		return objectList;
	}

	@Override
	public String getObjectHeader()
	{
		return "IdParticipante;IdCodigoIbge;Participante;Endereco;Bairro;Pais;Segmento;Cep";
	}

	@Override
	public String getObjectContent(ObjectBI obj)
	{
		Participante participante = (Participante) obj;
		return participante.getCnpj() + ";" + participante.getCodigoIBGE() + ";" + participante.getRazaoSocial() + ";" + participante.getEndereco() + ";" + participante.getBairro() + ";" + participante.getPais() + ";" + participante.getSegmento() + ";" + participante.getCep();
	}

}

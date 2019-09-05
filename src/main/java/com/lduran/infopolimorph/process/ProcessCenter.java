package com.lduran.infopolimorph.process;

import java.io.IOException;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.lduran.infopolimorph.model.*;
import com.lduran.infopolimorph.service.BuildService;
import com.lduran.infopolimorph.util.FileHandler;
import com.lduran.infopolimorph.util.ListHandler;

@Component
public class ProcessCenter
{
	@Autowired
	FileHandler fh;

	@Autowired
	BuildService bs;

	@Autowired
	ListHandler lst;

	// remember to change the file path
	private final String DIRETORIO = "C:\\GitHub\\TrataInfoPolimorph\\";

	@Bean
	public void start()
	{
		// ==============================
		// read the file ApuracaoICMS.csv
		// ==============================
		List<String> fileContent = new LinkedList<>();
		try
		{
			fileContent = this.fh.readFile(this.DIRETORIO + "ApuracaoICMS.csv");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		// =============================================
		// Make a List<ApuracaoICMS> from a List<String>
		// =============================================
		List<ApuracaoICMS> objectListApuracaoICMS = new ArrayList<>();
		if (fileContent.size() > 0)
		{
			objectListApuracaoICMS = (List<ApuracaoICMS>) this.bs.getObjectService("ApuracaoICMS")
					.getObjectList(fileContent);
		}

		// ==========================
		// Format the report like CSV
		// ==========================
		List<? extends ObjectBI> objectBI = objectListApuracaoICMS;
		List<String> lstResult = this.lst.formataRelatorio((List<ObjectBI>) objectBI, "ApuracaoICMS");
		this.lst.imprimeLista(lstResult);

		// ==========================
		// read the file Produtos.csv
		// ==========================
		fileContent = new LinkedList<>();
		try
		{
			fileContent = this.fh.readFile(this.DIRETORIO + "Produtos.csv");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		// ========================================
		// Make a List<Produto> from a List<String>
		// ========================================
		List<Produto> objectListProduto = new ArrayList<>();
		if (fileContent.size() > 0)
		{
			objectListProduto = (List<Produto>) this.bs.getObjectService("Produtos").getObjectList(fileContent);
		}

		// ==========================
		// Format the report like CSV
		// ==========================
		objectBI = objectListProduto;
		lstResult = this.lst.formataRelatorio((List<ObjectBI>) objectBI, "Produtos");
		this.lst.imprimeLista(lstResult);

		// ============================
		// read the file Inventario.csv
		// ============================
		fileContent = new LinkedList<>();
		try
		{
			fileContent = this.fh.readFile(this.DIRETORIO + "Inventario.csv");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		// ===========================================
		// Make a List<Inventario> from a List<String>
		// ===========================================
		List<Inventario> objectListInventario = new ArrayList<>();
		if (fileContent.size() > 0)
		{
			objectListInventario = (List<Inventario>) this.bs.getObjectService("Inventario").getObjectList(fileContent);
		}

		// ==========================
		// Format the report like CSV
		// ==========================
		objectBI = objectListInventario;
		lstResult = this.lst.formataRelatorio((List<ObjectBI>) objectBI, "Inventario");
		this.lst.imprimeLista(lstResult);

		// ==============================
		// read the file Organizacoes.csv
		// ==============================
		fileContent = new LinkedList<>();
		try
		{
			fileContent = this.fh.readFile(this.DIRETORIO + "Organizacoes.csv");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		// ============================================
		// Make a List<Organizacao> from a List<String>
		// ============================================
		List<Organizacao> objectListOrganizacao = new ArrayList<>();
		if (fileContent.size() > 0)
		{
			objectListOrganizacao = (List<Organizacao>) this.bs.getObjectService("Organizacoes")
					.getObjectList(fileContent);
		}

		// ==========================
		// Format the report like CSV
		// ==========================
		objectBI = objectListOrganizacao;
		lstResult = this.lst.formataRelatorio((List<ObjectBI>) objectBI, "Organizacoes");
		this.lst.imprimeLista(lstResult);

		// ===============================
		// read the file Participantes.csv
		// ===============================
		fileContent = new LinkedList<>();
		try
		{
			fileContent = this.fh.readFile(this.DIRETORIO + "Participantes.csv");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		// =============================================
		// Make a List<Participante> from a List<String>
		// =============================================
		List<Participante> objectListParticipante = new ArrayList<>();
		if (fileContent.size() > 0)
		{
			objectListParticipante = (List<Participante>) this.bs.getObjectService("Participantes")
					.getObjectList(fileContent);
		}

		// ==========================
		// Format the report like CSV
		// ==========================
		objectBI = objectListParticipante;
		lstResult = this.lst.formataRelatorio((List<ObjectBI>) objectBI, "Participantes");
		this.lst.imprimeLista(lstResult);

		System.out.println("Fim!!!");
	}
}

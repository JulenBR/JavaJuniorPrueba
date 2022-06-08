package com.coches.pdf;

import java.util.Map;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.query.criteria.internal.expression.function.AbsFunction;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.coches.model.*;
import com.coches.model.coches;
import com.lowagie.text.Document;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

@Component("/coches")
public class cochesPDF extends AbstractPdfView{

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		List<coches> listaCoches=(List<coches>) model.get("coches");
		
		PdfPTable tablaCoches=new PdfPTable(4);
		
		listaCoches.forEach(coche ->{
			tablaCoches.addCell(coches.getcodigo().toString());
			tablaCoches.addCell(coches.getmarca());
			tablaCoches.addCell(coches.getmodelo());
			tablaCoches.addCell(coches.getmatricula());
		});
		
		document.add(tablaCoches);
	}

}

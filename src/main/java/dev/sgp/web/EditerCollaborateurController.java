package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

public class EditerCollaborateurController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
					throws ServletException, IOException {
		
		req.getRequestDispatcher("/WEB-INF/views/collab/editerCollaborateur.jsp")
		.forward(req,  resp);
		
	}
	
	
	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		Collaborateur collab = new Collaborateur();
		collab.setNom(req.getParameter("name"));
		collab.setPrenom(req.getParameter("firstname"));
		collab.setDateNaissanceS(req.getParameter("birthday"));
		collab.setAdresse(req.getParameter("adress"));
		collab.setNumeroSecu(req.getParameter("socialcode"));
		collabService.sauvegarderCollaborateur(collab);

		req.setAttribute("collaborateurs", collabService.listerCollaborateurs());
		req.getRequestDispatcher("/WEB-INF/views/collab/listerCollaborateurs.jsp")
		.forward(req,  resp);
	}
	
}

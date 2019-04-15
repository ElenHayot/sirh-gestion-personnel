package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditerCollaborateurController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
					throws ServletException, IOException {
		
		String matricule = req.getParameter("matricule");
			
		if(matricule == null) {
			resp.sendError(400, "Un matricule est attendu");
		} else {
		resp.getWriter().write("<h1>Edition de collaborateur</h1>"
				+ "\n<h3>Matricule : " + matricule + "</h3>");
		}
		
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
					throws ServletException, IOException {
		
		String matricule = req.getParameter("matricule");
		String titre = req.getParameter("titre");
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		
		if(matricule == null) {
			resp.sendError(400, "Un matricule est attendu");
		}else if(titre == null) {
			resp.sendError(400, "Un titre est attendu");
		}else if(nom == null) {
			resp.sendError(400, "Un nom est attendu");
		}else if(prenom == null) {
			resp.sendError(400, "Un prenom est attendu");
		}else {
			resp.setStatus(201);
			resp.getWriter().write("<h1>Edition de collaborateur</h1>"
					+ "\n<h2>Creation d'un collaborateur avec les informations suivantes:</h2>"
					+ "<br /><h3>Matricule: " + matricule
					+ "<br />Titre: " + titre
					+ "<br />Nom: " + nom
					+ "<br />Prenom: " + prenom
					+ "</h3>");
		}
		
	}
	
}

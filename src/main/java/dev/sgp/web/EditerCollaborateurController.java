package dev.sgp.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditerCollaborateurController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
					throws ServletException, IOException {
		
		String matricule = req.getParameter("matricule");
			
		if(matricule == null || matricule.isEmpty()) {
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
		
		ArrayList<String> parameters = new ArrayList<>();
		parameters.addAll(Arrays.asList("matricule", "titre", "nom", "prenom"));
		
		for(String s: parameters){
			if(req.getParameter(s) == null || req.getParameter(s).isEmpty()) {
				resp.sendError(400, "Le paramètre suivant est attendu: " + s);
			}
		}
			
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

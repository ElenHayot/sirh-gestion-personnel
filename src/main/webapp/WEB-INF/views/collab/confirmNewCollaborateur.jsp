<%@ page import="dev.sgp.entite.Collaborateur" %>
<%@ page import="java.util.List" %>
<%@ page language="java" pageEncoding="UTF-8" %>
<!doctype html>

<head>
	<!-- Required meta tags -->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    
    <!-- Bootstrap CSS install --> 
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	

    <title>Confirm Collaborator</title>
</head>

<body>

<header class="border border-warning">
<div class="container">
	<div class="text-left">Création d'un collaborateur</div>
</div>
</header>

<section class="border border-warning">
<div class="container">
<br /><br />

<form method="post">

<div class="modal" tabindex="-1" role="dialog">
	<div class="modal-dialog" role="document">
   	 	<div class="modal-content">
     		<div class="modal-header">
     		
	<h5 class="modal-title">Vous êtes sur le point de créer un nouveau collaborateur</h5>
	<button type="button" class="close" data-dismiss="modal" aria-label="Close">
	<span aria-hidden="true">&times;</span>
	</button>
	
			</div>
			<div class="modal-body">
			
	<% List<Collaborateur> collaborateur = (List<Collaborateur>) request.getAttribute("collaborateurs"); 
	for(Collaborateur c:collaborateur) {
	%>
	<div class="form-group row">
		<label for="name" class="col-sm-3 col-form-label">Nom:</label>
		<div class="col-sm-9" class="text"><%= c.getNom() %></div>
	</div>
	<div class="form-group row">
		<label for="firstName" class="col-sm-3 col-form-label">Prénom:</label>
		<div class="col-sm-9" class="text"><%= c.getPrenom() %></div>
	</div>
	<div class="form-group row">
		<label for="birthday" class="col-sm-3 col-form-label">Date de naissance:</label>
		<div class="col-sm-9" class="text"><%= c.getDateNaissance() %></div>
	</div>
	<div class="form-group row">
		<label for="adress" class="col-sm-3 col-form-label">Adresse:</label>
		<div class="col-sm-9" class="text"><%= c.getAdresse() %></div>
	</div>
	<div class="form-group row">
		<label for="socialCode" class="col-sm-3 col-form-label">Numéro de sécurité sociale:</label>
		<div class="col-sm-9" class="text"><%= c.getNumeroSecu() %></div>
	</div>
	<% } %>
			</div>
		</div>
	</div>
</div>

</form>

<script>
// Example starter JavaScript for disabling form submissions if there are invalid fields
(function() {
  'use strict';
  window.addEventListener('load', function() {
    // Fetch all the forms we want to apply custom Bootstrap validation styles to
    var forms = document.getElementsByClassName('needs-validation');
    // Loop over them and prevent submission
    var validation = Array.prototype.filter.call(forms, function(form) {
      form.addEventListener('submit', function(event) {
        if (form.checkValidity() === false) {
          event.preventDefault();
          event.stopPropagation();
        }
        form.classList.add('was-validated');
      }, false);
    });
  }, false);
})();
</script>

</div>
</section>

<footer class="border border-warning">
<div class="container">
	<div class="row justify-content-end">
		<div class=""><button type="button" class="btn btn-outline-warning">Annuler</button></div>
		<div class=""><button type="button" class="btn btn-outline-success">Confirmer</button></div>
	</div>
</div>
</footer>

	<!-- Javascript integration -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

</body>

</html>
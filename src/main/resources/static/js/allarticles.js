
$('document').ready(function() {	
	$('.table #editButton').on('click',function(event){		
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(game, status){

			$('#idEdit').val(game.id);
			$('#typeEdit').val(game.type);
			$('#titleEdit').val(game.title);
			$('#priceEdit').val(game.price);
			$('#supplierIdEdit').val(game.supplierId);
			// $('#publisherEdit').val(game.publisher);
			// $('#minAgeEdit').val(game.minAge);
			// $('#gameGenreEdit').val(game.gameGenre);

		});			
		$('#editModal').modal();		
	});


	
	$('.table #detailsButton').on('click',function(event) {
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(article, status){
			$('#idDetails').val(article.id);
			$('#typeDetails').val(article.type);
			$('#titleDetails').val(article.title);
			$('#priceDetails').val(article.price);
			$('#supplierIdDetails').val(article.supplierId);
			// $('#publisherDetails').val(game.publisher);
			// $('#minAgeDetails').val(game.minAge);
			// $('#gameGenreDetails').val(game.gameGenre);

		});			
		$('#detailsModal').modal();		
	});	
	
	$('.table #deleteButton').on('click',function(event) {
		event.preventDefault();
		var href = $(this).attr('href');
		$('#deleteModal #delRef').attr('href', href);
		$('#deleteModal').modal();		
	});	
	


	$('.table #orderButton').on('click', function (event) {
		event.preventDefault();
		var href = $(this).attr('href');
		$.get(href, function (game, status) {
			console.log(game);
			$('#idOrder').val(game.id);
			$('#gameTitleOrder').val(game.title);
			$('#priceOrder').val(game.price);

		});
		$('#orderModal').modal();
	});

	$('.table #photoButton').on('click',function(event) {
		event.preventDefault();
		var href = $(this).attr('href');
		$('#photoModal #vehiclePhoto').attr('src', href);
		$('#photoModal').modal();
	});
});
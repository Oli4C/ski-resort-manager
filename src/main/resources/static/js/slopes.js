
$('document').ready(function() {	
	$('.table #editButton').on('click',function(event){		
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(slopes, status){

			$('#idEdit').val(slopes.id);

			$('#heightStartEdit').val(slopes.heightStart);
			$('#heightEndEdit').val(slopes.heightEnd);
			$('#difficultyEdit').val(slopes.difficulty);
			$('#isOpenEdit').val(slopes.open);
			$('#statusEdit').val(slopes.status);
			$('#nameEdit').val(slopes.name);



			$('#liftDownEdit').val(slopes.liftDown.id);
			$('#liftUpEdit').val(slopes.liftUp.id);
			$('#resortEdit').val(slopes.resort.id);

		});			
		$('#editModal').modal();		
	});




	
	$('.table #detailsButton').on('click',function(event) {
		event.preventDefault();		
		var href= $(this).attr('href');
		$.get(href, function(book, status){

			$('#idDetails').val(book.id);
			$('#typeDetails').val(book.type);
			$('#titleDetails').val(book.title);
			$('#priceDetails').val(book.price);
			$('#supplierIdDetails').val(book.supplierId);
			$('#authorDetails').val(book.author);
			$('#isbnDetails').val(book.isbn);
			$('#pagesDetails').val(book.pages);
			$('#bookGenreDetails').val(book.bookGenre);
			$('#descriptionDetails').val(book.description);

		});			
		$('#detailsModal').modal();		
	});





	$('.table #deleteButton').on('click',function(event) {
		event.preventDefault();
		var href = $(this).attr('href');
		$('#deleteModal #delRef').attr('href', href);
		$('#deleteModal').modal();		
	});	
	



});
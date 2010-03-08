function fillTable(table, serviceUrl) {
	$.ajax({
		// use relative url - refer to the same server.
		url : serviceUrl,
		success : function (obj) {
			var json = obj.json;
			var aDataSet = new Array();
			var inputdata = json.aaData instanceof Array ? json.aaData : [json.aaData];
			$.each(inputdata, function(index, value) {
				var row = new Array();
				$.each(json.aoColumns, function(index, col) {
					row.push(value[col.sTitle]);
				});
				aDataSet.push(row);
			});
			$(table).dataTable( {
				"aaData": aDataSet,
				"aoColumns": json.aoColumns
			} );
		},
			
		error : function (xhr, st, er) {
			alert(er);	
		}
	});
}
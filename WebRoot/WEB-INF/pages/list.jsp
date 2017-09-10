<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book List</title>
<style type="text/css">
	#bookTableDiv table {
		border-right:1px solid gray;border-bottom:1px solid gray;
	}
	
	#bookTableDiv table td,th {
		border-left:1px solid gray;border-top:1px solid gray
	}
	
	#bookTableDiv {margin:0 auto;width:80%;height:80%;} 
</style>

<script type="text/javascript" src="js/lib/jquery/jquery-3.2.1.js"></script>

<script type="text/javascript">
function getBooks() {
	var url = "/WebService/cxf/book";
	
	$.get(url, function(data, status) {
		var tbody = $("table#bookTable tbody");
		for(var i=0,len=data.length;i<len;i++) {
			tbody.append("<tr><td>"+data[i].name+"</td><td>"+data[i].isbn+"</td><td>"+data[i].price+"</td></tr>");
		}
	});
}
</script>

</head>
<body onload="javascript:getBooks();">
	<div id="bookTableDiv">
		<table id="bookTable">
			<thead>
				<tr>
					<th>Name</th><th>ISBN</th><th>Price</th>
				</tr>
			</thead>	
			<tbody>
			</tbody>
		</table>
	</div>
</body>
</html>
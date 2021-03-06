<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Admin</title>
<link href="dash.css" rel="stylesheet"/>
<link href="bootstrap.css" rel="stylesheet"/>
</head>
<body>
	<nav
		class="navbar navbar-dark fixed-top bg-dark flex-md-nowrap p-0 shadow">
		 <label class="navbar-brand col-sm-3 col-md-2 mr-0" >Admin Dashboard</label>
		<ul class="navbar-nav px-3">
			<li class="nav-item text-nowrap"><a class="nav-link" href="#">Sign
					out</a></li>
		</ul>
	</nav>

	<div class="container-fluid">
		<div class="row">
			<nav class="col-md-2 d-none d-md-block bg-light sidebar">
				<div class="sidebar-sticky">
					<ul class="nav flex-column">
						<li class="nav-item"><a class="nav-link active" href="#">
								<span data-feather="home"></span> Dashboard <span
								class="sr-only">(current)</span>
						</a></li>
						<li class="nav-item"><a class="nav-link" href="#go"> <span
								data-feather="users"></span> Customers
						</a></li>
					</ul>

					<h6
						class="sidebar-heading d-flex justify-content-between align-items-center px-3 mt-4 mb-1 text-muted">
						<span>Saved reports</span> <a
							class="d-flex align-items-center text-muted" href="#"> <span
							data-feather="plus-circle"></span>
						</a>
					</h6>
					
				</div>
			</nav>

			<main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-4">
			<div
				class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
				<h1 class="h2">Dashboard</h1>
				<div class="btn-toolbar mb-2 mb-md-0">
					
				</div>
			</div>

	<h2>Current Customer</h2>
	<table class="table table-striped table-sm">
					<thead>
						<tr>
							<th>Application Id</th>
							<th>Name Of Applicant</th>
							<th>Date Of Application</th>
							<th>Documents</th>
							<th>Action</th>
						</tr>
						<tr>
							<td/><!-- id -->
							<td/><!-- name -->
							<td/><!-- date -->
							<td/>
							<td> 
							<div class="container-fluid">
							<form action="#">
							    <label class="radio-inline">
							      <input type="radio" name="optradio" onclick="#" >Approve Loan
							    </label>
							    <label class="radio-inline">
							      <input type="radio" name="optradio" onclick="#">Deny Loan
							    </label>
							    </form>
							  </div>
							</td>
						</tr>
					</thead>
				</table>
	
	

			
			<h2>Pending Applications</h2>
			<form action="#">
			<div class="table-responsive">
				<a name="go"></a>
				<table class="table table-striped table-sm">
					<thead>
						<tr>
							<th>Application Id</th>
							<th>Name Of Applicant</th>
							<th>Date Of Application</th>
							<th>Documents</th>
						</tr>
					</thead>
					
					<tbody>
						<tr>
						
							<td><%= com.loan.controller.GetSome.getSdw() %></td>
							<td>1,001</td>
							<td>Lorem</td>
							<td>ipsum</td>
							<td>dolor</td>
							
						</tr>
<!-- 						<tr>
							<td>1,002</td>
							<td>amet</td>
							<td>consectetur</td>
							<td>adipiscing</td>
							
						</tr>
						<tr>
							<td>1,003</td>
							<td>Integer</td>
							<td>nec</td>
							<td>odio</td>
							
						</tr>
						<tr>
							<td>1,003</td>
							<td>libero</td>
							<td>Sed</td>
							<td>cursus</td>
							
						</tr> -->
					</tbody>
				</table>
				</form>
			</div>
			</main>
		</div>
	</div>

	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery-slim.min.js"><\/script>')</script>
	<script src="../../assets/js/vendor/popper.min.js"></script>
	<script src="../../dist/js/bootstrap.min.js"></script>

	<!-- Icons -->
	<script src="https://unpkg.com/feather-icons/dist/feather.min.js"></script>
	<script>
      feather.replace()
    </script>

	<!-- Graphs -->
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.1/Chart.min.js"></script>
	<script>
      var ctx = document.getElementById("myChart");
      var myChart = new Chart(ctx, {
        type: 'line',
        data: {
          labels: ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"],
          datasets: [{
            data: [15339, 21345, 18483, 24003, 23489, 24092, 12034],
            lineTension: 0,
            backgroundColor: 'transparent',
            borderColor: '#007bff',
            borderWidth: 4,
            pointBackgroundColor: '#007bff'
          }]
        },
        options: {
          scales: {
            yAxes: [{
              ticks: {
                beginAtZero: false
              }
            }]
          },
          legend: {
            display: false,
          }
        }
      });
    </script>

</body>
</html>